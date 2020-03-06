/***********************************************************************
 * Module:  UserStory.java
 * Author:  Zayneb
 * Purpose: Defines the Class UserStory
 ***********************************************************************/

import java.util.*;

/** @pdOid 02d94c54-c7e0-409b-baac-5ff74a1bf2dc */
public class UserStory {
   /** @pdOid 6d816cdd-0670-4502-b7a8-cdecee6f21af */
   private int idUS;
   /** @pdOid b2e5da8f-deac-4b71-9382-f0a76f21fba6 */
   private String nomUS;
   
   /** @pdRoleInfo migr=no name=Tache assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Tache> tache;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Tache> getTache() {
      if (tache == null)
         tache = new java.util.HashSet<Tache>();
      return tache;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTache() {
      if (tache == null)
         tache = new java.util.HashSet<Tache>();
      return tache.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTache */
   public void setTache(java.util.Collection<Tache> newTache) {
      removeAllTache();
      for (java.util.Iterator iter = newTache.iterator(); iter.hasNext();)
         addTache((Tache)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTache */
   public void addTache(Tache newTache) {
      if (newTache == null)
         return;
      if (this.tache == null)
         this.tache = new java.util.HashSet<Tache>();
      if (!this.tache.contains(newTache))
         this.tache.add(newTache);
   }
   
   /** @pdGenerated default remove
     * @param oldTache */
   public void removeTache(Tache oldTache) {
      if (oldTache == null)
         return;
      if (this.tache != null)
         if (this.tache.contains(oldTache))
            this.tache.remove(oldTache);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTache() {
      if (tache != null)
         tache.clear();
   }

}