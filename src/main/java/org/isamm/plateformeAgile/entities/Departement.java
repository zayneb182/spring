/***********************************************************************
 * Module:  Departement.java
 * Author:  Zayneb
 * Purpose: Defines the Class Departement
 ***********************************************************************/

import java.util.*;

/** @pdOid 49b39a03-1527-471b-8fe6-f614147c19b1 */
public class Departement {
   /** @pdOid fb5bbd12-b5e5-4388-a60a-eff2272ca86c */
   private int idDep;
   /** @pdOid fcc368ae-0fa6-40f5-a1ba-cbc9d72dcf5f */
   private String libDep;
   /** @pdOid e8f7d017-20c9-42bc-9516-879a1a7f3043 */
   private int nombreEmp;
   
   /** @pdRoleInfo migr=no name=Projet assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Projet> projet;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Projet> getProjet() {
      if (projet == null)
         projet = new java.util.HashSet<Projet>();
      return projet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProjet() {
      if (projet == null)
         projet = new java.util.HashSet<Projet>();
      return projet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProjet */
   public void setProjet(java.util.Collection<Projet> newProjet) {
      removeAllProjet();
      for (java.util.Iterator iter = newProjet.iterator(); iter.hasNext();)
         addProjet((Projet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProjet */
   public void addProjet(Projet newProjet) {
      if (newProjet == null)
         return;
      if (this.projet == null)
         this.projet = new java.util.HashSet<Projet>();
      if (!this.projet.contains(newProjet))
         this.projet.add(newProjet);
   }
   
   /** @pdGenerated default remove
     * @param oldProjet */
   public void removeProjet(Projet oldProjet) {
      if (oldProjet == null)
         return;
      if (this.projet != null)
         if (this.projet.contains(oldProjet))
            this.projet.remove(oldProjet);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProjet() {
      if (projet != null)
         projet.clear();
   }

}