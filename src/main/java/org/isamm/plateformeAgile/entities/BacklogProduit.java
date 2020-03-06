/***********************************************************************
 * Module:  BacklogProduit.java
 * Author:  Zayneb
 * Purpose: Defines the Class BacklogProduit
 ***********************************************************************/

import java.util.*;

/** @pdOid f51d5a0b-c7b1-4b82-82f6-a4710fb9de62 */
public class BacklogProduit {
   /** @pdOid d574d603-56af-4d79-bf8b-cfece40932d2 */
   private int idBL;
   /** @pdOid 50b45e60-5eed-44d1-bd26-6897441ab87e */
   private int nomBL;
   
   /** @pdRoleInfo migr=no name=UserStory assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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