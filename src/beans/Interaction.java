package beans;
/***********************************************************************
 * Module:  Interaction.java
 * Author:  HP
 * Purpose: Defines the Class Interaction
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
/** @pdOid 797a683f-9ac8-498e-858e-1c77830ea226 */
public class Interaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   /** @pdOid ed4cedaa-b106-4d51-bb86-5ccf98fee78e */
   public long interactionID;
   public long getInteractionID() {
		return interactionID;
	}

   
   public  Boolean containsLastMessage;
   
	public Boolean getContainsLastMessage() {
	return containsLastMessage;
}

public void setContainsLastMessage(Boolean containsLastMessage) {
	this.containsLastMessage = containsLastMessage;
}

	public void setInteractionID(long interactionID) {
		this.interactionID = interactionID;
	}

	public java.lang.String getComments() {
		return comments;
	}

	public void setComments(java.lang.String comments) {
		this.comments = comments;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Person getSender() {
		return sender;
	}

	public void setSender(Person sender) {
		this.sender = sender;
	}

	public Person getReceiver() {
		return receiver;
	}

	public void setReceiver(Person receiver) {
		this.receiver = receiver;
	}

/** @pdOid 0e237d5f-8776-4bee-815a-adbb248a3d47 */
   public java.lang.String comments;
   /** @pdOid f080ec71-59ec-4942-9e63-961d61bec1b9 */
   public int score;
   
   public Boolean conversationStarted = false;
   
   public Boolean getConversationStarted() {
	return conversationStarted;
}

public void setConversationStarted(Boolean conversationStarted) {
	this.conversationStarted = conversationStarted;
}

@ManyToOne
   /** @pdRoleInfo migr=no name=Person assc=INTERATIONLINK1 mult=0..1 side=A */
   public Person sender;
   
   @ManyToOne
   /** @pdRoleInfo migr=no name=Person assc=INTERATIONLINK2 mult=0..1 side=A */
   public Person receiver;
   
   
   @OneToMany(mappedBy="messagesender",fetch=FetchType.LAZY)
   /** @pdRoleInfo migr=no name=Messages assc=interactionsmesges coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Messages> messages;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Messages> getMessages() {
      if (messages == null)
         messages = new java.util.HashSet<Messages>();
      return messages;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMessages() {
      if (messages == null)
         messages = new java.util.HashSet<Messages>();
      return messages.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMessages */
   public void setMessages(java.util.Collection<Messages> newMessages) {
      removeAllMessages();
      for (java.util.Iterator iter = newMessages.iterator(); iter.hasNext();)
         addMessages((Messages)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMessages */
   public void addMessages(Messages newMessages) {
      if (newMessages == null)
         return;
      if (this.messages == null)
         this.messages = new java.util.HashSet<Messages>();
      if (!this.messages.contains(newMessages))
         this.messages.add(newMessages);
   }
   
   /** @pdGenerated default remove
     * @param oldMessages */
   public void removeMessages(Messages oldMessages) {
      if (oldMessages == null)
         return;
      if (this.messages != null)
         if (this.messages.contains(oldMessages))
            this.messages.remove(oldMessages);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMessages() {
      if (messages != null)
         messages.clear();
   }

}