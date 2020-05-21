package beans;
/***********************************************************************

 * Module:  Relationlink.java
 * Author:  HP
 * Purpose: Defines the Class Relationlink
 ***********************************************************************/

import java.util.*;

/** @pdOid 6a5a4854-bc33-4393-ac22-2592b2358377 */
public class Relationlink {
   /** @pdRoleInfo migr=no name=Person assc=INTERATIONLINK1 mult=0..1 side=A */
   public Person sender;
   /** @pdRoleInfo migr=no name=Person assc=INTERATIONLINK2 mult=0..1 side=A */
   public Person receiver;
   /** @pdRoleInfo migr=no name=Interaction assc=INTERATIONLINKID mult=0..1 side=A */
   public Interaction interaction;

}