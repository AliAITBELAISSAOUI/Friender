package beans;
/***********************************************************************
 * Module:  Preferences.java
 * Author:  HP
 * Purpose: Defines the Class Preferences
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
/** @pdOid 04384590-54f9-4039-9b16-b342c88c44f3 */
public class Preferences {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   /** @pdOid 2a964100-426b-45b3-8095-5192c82181a9 */
   public long preferenceID;
   /** @pdOid 2def2b3e-db35-4aaf-9268-73470941f234 */
   public java.lang.String title;
   /** @pdOid f59ddd3f-43e5-46b9-b5c6-723e78d8a30b */
   public java.lang.String content;
   @ManyToOne
   public Person  preferenceperson;
public long getPreferenceID() {
	return preferenceID;
}
public void setPreferenceID(long preferenceID) {
	this.preferenceID = preferenceID;
}
public java.lang.String getTitle() {
	return title;
}
public void setTitle(java.lang.String title) {
	this.title = title;
}
public java.lang.String getContent() {
	return content;
}
public void setContent(java.lang.String content) {
	this.content = content;
}
public Person getPreferenceperson() {
	return preferenceperson;
}
public void setPreferenceperson(Person preferenceperson) {
	this.preferenceperson = preferenceperson;
}

}