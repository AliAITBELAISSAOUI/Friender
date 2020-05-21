package beans;
/***********************************************************************

 * Module:  Person.java
 * Author:  HP
 * Purpose: Defines the Class Person
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
/** @pdOid bf9d3510-930a-40b8-9499-fc4e2f053902 */
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   /** @pdOid ae636aa5-2b38-44c7-aab7-f331e3380088 */
   public long personID;
   /** @pdOid b3b684f3-c6d0-4bb0-be8f-f31f7f2b8b85 */
   public java.lang.String firstname;
   /** @pdOid 5dacb19f-1183-42bf-925e-145981124ed9 */
   public java.lang.String lastname;
   /** @pdOid 1afe3466-4fa0-4196-911e-6c14447cbb85 */
   public java.lang.String profileimage;
   /** @pdOid 07e1021e-afc4-4c49-bd05-16323e86fdb8 */
   public java.lang.String listinfo;
   
   /** @pdRoleInfo migr=no name=Posts assc=personposts coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   @OneToMany(mappedBy="postcreator",fetch=FetchType.LAZY) 
   public java.util.Collection<Posts> posts;
   
   @OneToMany(mappedBy="preferenceperson",fetch=FetchType.LAZY)
   /** @pdRoleInfo migr=no name=Preferences assc=personpref coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Preferences> preferences;
   
   @OneToMany(mappedBy="commentcreator",fetch=FetchType.LAZY)
   public java.util.Collection<Comments> comments;
   
   @OneToOne(mappedBy="accountindet")
   public Account account;
   
   @OneToMany(mappedBy="receiver",fetch=FetchType.LAZY)
   public java.util.Collection<Interaction> personreceivedfrom;
   
   @OneToMany(mappedBy="sender",fetch=FetchType.LAZY)
   public java.util.Collection<Interaction> personsentto;
   
   public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public long getPersonID() {
	return personID;
}

public void setPersonID(long personID) {
	this.personID = personID;
}

public java.lang.String getFirstname() {
	return firstname;
}

public void setFirstname(java.lang.String firstname) {
	this.firstname = firstname;
}

public java.lang.String getLastname() {
	return lastname;
}

public void setLastname(java.lang.String lastname) {
	this.lastname = lastname;
}

public java.lang.String getProfileimage() {
	return profileimage;
}

public void setProfileimage(java.lang.String profileimage) {
	this.profileimage = profileimage;
}

public java.lang.String getListinfo() {
	return listinfo;
}

public void setListinfo(java.lang.String listinfo) {
	this.listinfo = listinfo;
}

/** @pdGenerated default getter */
   public java.util.Collection<Posts> getPosts() {
      if (posts == null)
         posts = new java.util.HashSet<Posts>();
      return posts;
   }
   
   /** @pdGenerated default getter */
   public java.util.Collection<Comments> getComments() {
      if (comments == null)
         comments = new java.util.HashSet<Comments>();
      return comments;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPosts() {
      if (posts == null)
         posts = new java.util.HashSet<Posts>();
      return posts.iterator();
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorComments() {
      if (comments == null)
         comments = new java.util.HashSet<Comments>();
      return comments.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPosts */
   public void setPosts(java.util.Collection<Posts> newPosts) {
      removeAllPosts();
      for (java.util.Iterator iter = newPosts.iterator(); iter.hasNext();)
         addPosts((Posts)iter.next());
   }
   
   public void setComments(java.util.Collection<Comments> newComments) {
	      removeAllComments();
	      for (java.util.Iterator iter = newComments.iterator(); iter.hasNext();)
	         addComments((Comments)iter.next());
	   }
   
   /** @pdGenerated default add
     * @param newPosts */
   public void addPosts(Posts newPosts) {
      if (newPosts == null)
         return;
      if (this.posts == null)
         this.posts = new java.util.HashSet<Posts>();
      if (!this.posts.contains(newPosts))
      {
         this.posts.add(newPosts);
         
         newPosts.setPostcreator(this);      
      }
   }
   
   
   /** @pdGenerated default add
    * @param newComments */
  public void addComments(Comments newComments) {
     if (newComments == null)
        return;
     if (this.comments == null)
        this.comments = new java.util.HashSet<Comments>();
     if (!this.posts.contains(newComments))
     {
        this.comments.add(newComments);
        
        newComments.setCommentcreator(this);      
     }
  }
   
   /** @pdGenerated default remove
     * @param oldPosts */
   public void removePosts(Posts oldPosts) {
      if (oldPosts == null)
         return;
      if (this.posts != null)
         if (this.posts.contains(oldPosts))
         {
            this.posts.remove(oldPosts);
            oldPosts.setPostcreator(null);      

         }
   }
   
   /** @pdGenerated default remove
    * @param oldcomments */
  public void removeComments(Posts oldComments) {
     if (oldComments == null)
        return;
     if (this.comments != null)
        if (this.posts.contains(oldComments))
        {
           this.comments.remove(oldComments);
           oldComments.setPostcreator(null);      

        }
  }
   
   
   /** @pdGenerated default removeAll */
   public void removeAllPosts() {
      if (posts != null)
      {
         Posts oldPosts;
         for (java.util.Iterator iter = getIteratorPosts(); iter.hasNext();)
         {
            oldPosts = (Posts)iter.next();
            iter.remove();
            oldPosts.setPostcreator(null);  
         }
      }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComments() {
      if (comments != null)
      {
         Comments oldComments;
         for (java.util.Iterator iter = getIteratorComments(); iter.hasNext();)
         {
            oldComments = (Comments)iter.next();
            iter.remove();
            oldComments.setCommentcreator(null);  
         }
      }
   }
   
   /** @pdGenerated default getter */
   public java.util.Collection<Preferences> getPreferences() {
      if (preferences == null)
         preferences = new java.util.HashSet<Preferences>();
      return preferences;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPreferences() {
      if (preferences == null)
         preferences = new java.util.HashSet<Preferences>();
      return preferences.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPreferences */
   public void setPreferences(java.util.Collection<Preferences> newPreferences) {
      removeAllPreferences();
      for (java.util.Iterator iter = newPreferences.iterator(); iter.hasNext();)
         addPreferences((Preferences)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPreferences */
   public void addPreferences(Preferences newPreferences) {
      if (newPreferences == null)
         return;
      if (this.preferences == null)
         this.preferences = new java.util.HashSet<Preferences>();
      if (!this.preferences.contains(newPreferences))
         this.preferences.add(newPreferences);
   }
   
   /** @pdGenerated default remove
     * @param oldPreferences */
   public void removePreferences(Preferences oldPreferences) {
      if (oldPreferences == null)
         return;
      if (this.preferences != null)
         if (this.preferences.contains(oldPreferences))
            this.preferences.remove(oldPreferences);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPreferences() {
      if (preferences != null)
         preferences.clear();
   }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Interaction> getPersonreceivedfrom() {
      if (personreceivedfrom == null)
    	  personreceivedfrom = new java.util.HashSet<Interaction>();
      return personreceivedfrom;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPersonreceivedfrom() {
      if (personreceivedfrom == null)
    	  personreceivedfrom = new java.util.HashSet<Interaction>();
      return personreceivedfrom.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPersonreceivedfrom */
   public void setPersonreceivedfrom(java.util.Collection<Interaction> newPersonreceivedfrom) {
	   removeAllPersonreceivedfrom();
      for (java.util.Iterator iter = newPersonreceivedfrom.iterator(); iter.hasNext();)
         addPersonreceivedfrom((Interaction)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPersonreceivedfrom */
   public void addPersonreceivedfrom(Interaction newPersonreceivedfrom) {
      if (newPersonreceivedfrom == null)
         return;
      if (this.personreceivedfrom == null)
         this.personreceivedfrom = new java.util.HashSet<Interaction>();
      if (!this.personreceivedfrom.contains(newPersonreceivedfrom))
         this.personreceivedfrom.add(newPersonreceivedfrom);
   }
   
   /** @pdGenerated default remove
     * @param oldPersonreceivedfrom */
   public void removePersonreceivedfrom(Interaction oldPersonreceivedfrom) {
      if (oldPersonreceivedfrom == null)
         return;
      if (this.personreceivedfrom != null)
         if (this.personreceivedfrom.contains(oldPersonreceivedfrom))
         { 
            this.personreceivedfrom.remove(oldPersonreceivedfrom);
            oldPersonreceivedfrom.setReceiver(null); 
      	}

   }
   
  
   public void removeAllPersonreceivedfrom() {
	      if (personreceivedfrom != null)
	      {
	         Interaction oldPersonreceivedfrom;
	         for (java.util.Iterator iter = getIteratorPersonreceivedfrom(); iter.hasNext();)
	         {
	        	oldPersonreceivedfrom = (Interaction)iter.next();
	            iter.remove();
	            oldPersonreceivedfrom.setReceiver(null); 
	         }
	      }
	   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

   
   /** @pdGenerated default getter */
   public java.util.Collection<Interaction> getPersonsentto() {
      if (personsentto == null)
    	  personsentto = new java.util.HashSet<Interaction>();
      return personsentto;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPersonsentto() {
      if (personsentto == null)
    	  personsentto = new java.util.HashSet<Interaction>();
      return personsentto.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPersonsentto */
   public void setPersonsentto(java.util.Collection<Interaction> newPersonsentto) {
	   removeAllPersonreceivedfrom();
      for (java.util.Iterator iter = newPersonsentto.iterator(); iter.hasNext();)
         addPersonsentto((Interaction)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPersonsentto */
   public void addPersonsentto(Interaction newPersonsentto) {
      if (newPersonsentto == null)
         return;
      if (this.personsentto == null)
         this.personsentto = new java.util.HashSet<Interaction>();
      if (!this.personsentto.contains(newPersonsentto))
         this.personsentto.add(newPersonsentto);
   }
   
   /** @pdGenerated default remove
     * @param oldPersonsentto */
   public void removePersonsentto(Interaction oldPersonsentto) {
      if (oldPersonsentto == null)
         return;
      if (this.personsentto != null)
         if (this.personsentto.contains(oldPersonsentto))
         { 
            this.personsentto.remove(oldPersonsentto);
            oldPersonsentto.setReceiver(null); 
      	}

   }
   
  
   public void removeAllPersonsentto() {
	      if (personsentto != null)
	      {
	         Interaction oldPersonsentto;
	         for (java.util.Iterator iter = getIteratorPersonsentto(); iter.hasNext();)
	         {
	        	oldPersonsentto = (Interaction)iter.next();
	            iter.remove();
	            oldPersonsentto.setReceiver(null); 
	         }
	      }
	   }
   
   
   
   
   
}