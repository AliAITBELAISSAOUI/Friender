package beans;
/***********************************************************************

 * Module:  Posts.java
 * Author:  HP
 * Purpose: Defines the Class Posts
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
/** @pdOid ca624206-a6eb-422d-b852-68ac177d7269 */
public class Posts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   /** @pdOid 2572ff9f-166d-4da5-b0c7-b2a2373b9135 */
   public long postID;
   /** @pdOid 7c3b0c78-d890-4fc3-ad07-d114cc732e8f */
   public java.lang.String description;
   /** @pdOid 00d56d2f-a220-40ef-b17f-0b17da9179d0 */
   public java.lang.String image;
   /** @pdOid bb4a7265-a4d5-4eae-ba41-fc4cdb10e558 */
   public java.lang.String content;
   
   @OneToMany(mappedBy="postcommented",fetch=FetchType.LAZY)
   /** @pdRoleInfo migr=no name=Comments assc=postscomments coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   
   public java.util.Collection<Comments> comments;
   @ManyToOne
   /** @pdRoleInfo migr=no name=Person assc=personposts coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public Person postcreator;
   
   
   public long getPostID() {
	return postID;
}

public void setPostID(long postID) {
	this.postID = postID;
}

public java.lang.String getDescription() {
	return description;
}

public void setDescription(java.lang.String description) {
	this.description = description;
}

public java.lang.String getImage() {
	return image;
}

public void setImage(java.lang.String image) {
	this.image = image;
}

public java.lang.String getContent() {
	return content;
}

public void setContent(java.lang.String content) {
	this.content = content;
}

public Person getPostcreator() {
	return postcreator;
}

public void setPostcreator(Person postcreator) {
	this.postcreator = postcreator;
}

/** @pdGenerated default getter */
   public java.util.Collection<Comments> getComments() {
      if (comments == null)
         comments = new java.util.HashSet<Comments>();
      return comments;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorComments() {
      if (comments == null)
         comments = new java.util.HashSet<Comments>();
      return comments.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newComments */
   public void setComments(java.util.Collection<Comments> newComments) {
      removeAllComments();
      for (java.util.Iterator iter = newComments.iterator(); iter.hasNext();)
         addComments((Comments)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newComments */
   public void addComments(Comments newComments) {
      if (newComments == null)
         return;
      if (this.comments == null)
         this.comments = new java.util.HashSet<Comments>();
      if (!this.comments.contains(newComments))
         this.comments.add(newComments);
   }
   
   /** @pdGenerated default remove
     * @param oldComments */
   public void removeComments(Comments oldComments) {
      if (oldComments == null)
         return;
      if (this.comments != null)
         if (this.comments.contains(oldComments))
            this.comments.remove(oldComments);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllComments() {
      if (comments != null)
         comments.clear();
   }


}