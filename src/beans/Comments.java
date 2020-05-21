package beans;
/***********************************************************************

 * Module:  Comments.java
 * Author:  HP
 * Purpose: Defines the Class Comments
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
/** @pdOid 132ad572-1605-4b98-b1fd-119f02275f8d */
public class Comments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   /** @pdOid c614e117-af67-4331-86fe-d85422b7eaad */
   public long commentID;
   /** @pdOid 58e82d04-8d57-4a1d-9281-984d4a60c03d */
   public java.lang.String content;
   
   public long getCommentID() {
	return commentID;
}

public void setCommentID(long commentID) {
	this.commentID = commentID;
}

public java.lang.String getContent() {
	return content;
}

public void setContent(java.lang.String content) {
	this.content = content;
}

public Person getCommentcreator() {
	return commentcreator;
}

public void setCommentcreator(Person commentcreator) {
	this.commentcreator = commentcreator;
}

public Posts getPostcommented() {
	return postcommented;
}

public void setPostcommented(Posts postcommented) {
	this.postcommented = postcommented;
}

@ManyToOne
public Person commentcreator;

   @ManyToOne
   public Posts postcommented;

}