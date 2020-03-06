/***********************************************************************
 * Module:  MmebreDeL_equipe.java
 * Author:  Zayneb
 * Purpose: Defines the Class MmebreDeL_equipe
 ***********************************************************************/

import java.util.*;

/** @pdOid 22b341f4-eacf-4c97-9ad6-c27be87b77de */
public class MmebreDeL_equipe extends Personne {
   /** @pdRoleInfo migr=no name=Tache assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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