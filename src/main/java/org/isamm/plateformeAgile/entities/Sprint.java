/***********************************************************************
 * Module:  Sprint.java
 * Author:  Zayneb
 * Purpose: Defines the Class Sprint
 ***********************************************************************/

import java.util.*;

/** @pdOid 29d66754-355b-47cc-a8b2-d09afb4540d9 */
public class Sprint {
   /** @pdOid 8b595e2b-c5b2-4471-ac7f-2904de90c228 */
   private int idSp;
   /** @pdOid b5d72dad-5585-48c9-a36f-0031fc80166b */
   private String nomSp;
   /** @pdOid 9edbebc6-d7ed-4a0c-bf19-d55bf68f8031 */
   private Double dureSp;
   /** @pdOid 0bcfb85a-1d0b-4a44-9601-f5346fd77e3f */
   private Date dateSp;
   /** @pdOid 458fb867-add9-4010-adf9-402c82f552a7 */
   private short objectif;
   /** @pdOid bdf3a5d2-c96b-406e-ad43-5a25e19da36f */
   private String planification;
   
   /** @pdRoleInfo migr=no name=UserStory assc=association15 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<UserStory> userStory;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<UserStory> getUserStory() {
      if (userStory == null)
         userStory = new java.util.HashSet<UserStory>();
      return userStory;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUserStory() {
      if (userStory == null)
         userStory = new java.util.HashSet<UserStory>();
      return userStory.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUserStory */
   public void setUserStory(java.util.Collection<UserStory> newUserStory) {
      removeAllUserStory();
      for (java.util.Iterator iter = newUserStory.iterator(); iter.hasNext();)
         addUserStory((UserStory)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUserStory */
   public void addUserStory(UserStory newUserStory) {
      if (newUserStory == null)
         return;
      if (this.userStory == null)
         this.userStory = new java.util.HashSet<UserStory>();
      if (!this.userStory.contains(newUserStory))
         this.userStory.add(newUserStory);
   }
   
   /** @pdGenerated default remove
     * @param oldUserStory */
   public void removeUserStory(UserStory oldUserStory) {
      if (oldUserStory == null)
         return;
      if (this.userStory != null)
         if (this.userStory.contains(oldUserStory))
            this.userStory.remove(oldUserStory);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUserStory() {
      if (userStory != null)
         userStory.clear();
   }

}