package beans;
/***********************************************************************
 * Module:  Account.java
 * Author:  HP
 * Purpose: Defines the Class Account
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
/** @pdOid e2cc7e66-ab07-4b47-85d7-db98beae25d4 */
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/** @pdOid b5e10798-28c7-4f1a-8fbf-da23410520ea */
   public long accountID;
   /** @pdOid 5c5598ce-25c0-4380-9f1e-0367ad02fa7e */
   public java.lang.String pseudo;
   /** @pdOid 1af2932f-25e2-4a4f-8bd7-f3b934da1ef7 */
   private java.lang.String passwordhash;
   /** @pdOid de6c34d1-2293-47f4-8707-99c66e249387 */
   private java.lang.String accounttypehash;
   
   @OneToOne
   public Person accountindet;

public long getAccountID() {
	return accountID;
}

public void setAccountID(long accountID) {
	this.accountID = accountID;
}

public java.lang.String getPseudo() {
	return pseudo;
}

public void setPseudo(java.lang.String pseudo) {
	this.pseudo = pseudo;
}

public java.lang.String getPasswordhash() {
	return passwordhash;
}

public void setPasswordhash(java.lang.String passwordhash) {
	this.passwordhash = passwordhash;
}

public java.lang.String getAccounttypehash() {
	return accounttypehash;
}

public void setAccounttypehash(java.lang.String accounttypehash) {
	this.accounttypehash = accounttypehash;
}

public Person getAccountindet() {
	return accountindet;
}

public void setAccountindet(Person accountindet) {
	this.accountindet = accountindet;
}
   
   
}