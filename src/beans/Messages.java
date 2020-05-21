package beans;
/***********************************************************************

 * Module:  Messages.java
 * Author:  HP
 * Purpose: Defines the Class Messages
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
/** @pdOid e84bf9f4-dc4a-44c6-8506-c8aa8138e794 */
public class Messages {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/** @pdOid bc93f1c2-1e7d-40da-a542-630772b8a7f3 */
   public long messageID;
   /** @pdOid 2e15150d-ad6c-4f27-ad31-5d2e267d2c86 */
   public java.lang.String massage;
   
   @Temporal(TemporalType.TIMESTAMP)
   public Date messgedate;
   
   
   
   @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((messgedate == null) ? 0 : messgedate.hashCode());
	return result;
}

public Date getMessgedate() {
	return messgedate;
}
public void setMessgedate(Date messgedate) {
	this.messgedate = messgedate;
}
public Boolean lastmessge = true;
   public Boolean getLastmessge() {
	return lastmessge;
}
public void setLastmessge(Boolean lastmessge) {
	this.lastmessge = lastmessge;
}
@ManyToOne
   public Interaction messagesender;
public long getMessageID() {
	return messageID;
}
public void setMessageID(long messageID) {
	this.messageID = messageID;
}
public java.lang.String getMassage() {
	return massage;
}
public void setMassage(java.lang.String massage) {
	this.massage = massage;
}
public Interaction getMessagesender() {
	return messagesender;
}
public void setMessagesender(Interaction messagesender) {
	this.messagesender = messagesender;
}

   
   
}