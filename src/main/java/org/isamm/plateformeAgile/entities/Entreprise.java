/***********************************************************************
 * Module:  Entreprise.java
 * Author:  Zayneb
 * Purpose: Defines the Class Entreprise
 ***********************************************************************/

import java.util.*;

/** @pdOid e4388044-a79b-4b7b-8c7c-56cf9bfa903f */
public class Entreprise {
   /** @pdOid 6f425397-5d30-4db9-8cfa-22f1efdcb3e3 */
   private int idE;
   /** @pdOid 6a8690ec-957b-4bef-8a2b-e30ec11ee2a3 */
   private int nomE;
   /** @pdOid 7c83c804-8c03-4bb3-b02d-3e6c6d87de85 */
   private int adresseE;
   
   /** @pdRoleInfo migr=no name=ActeurEntreprise assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ActeurEntreprise> acteurEntreprise;
   /** @pdRoleInfo migr=no name=Projet assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Projet> projet;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ActeurEntreprise> getActeurEntreprise() {
      if (acteurEntreprise == null)
         acteurEntreprise = new java.util.HashSet<ActeurEntreprise>();
      return acteurEntreprise;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorActeurEntreprise() {
      if (acteurEntreprise == null)
         acteurEntreprise = new java.util.HashSet<ActeurEntreprise>();
      return acteurEntreprise.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newActeurEntreprise */
   public void setActeurEntreprise(java.util.Collection<ActeurEntreprise> newActeurEntreprise) {
      removeAllActeurEntreprise();
      for (java.util.Iterator iter = newActeurEntreprise.iterator(); iter.hasNext();)
         addActeurEntreprise((ActeurEntreprise)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newActeurEntreprise */
   public void addActeurEntreprise(ActeurEntreprise newActeurEntreprise) {
      if (newActeurEntreprise == null)
         return;
      if (this.acteurEntreprise == null)
         this.acteurEntreprise = new java.util.HashSet<ActeurEntreprise>();
      if (!this.acteurEntreprise.contains(newActeurEntreprise))
         this.acteurEntreprise.add(newActeurEntreprise);
   }
   
   /** @pdGenerated default remove
     * @param oldActeurEntreprise */
   public void removeActeurEntreprise(ActeurEntreprise oldActeurEntreprise) {
      if (oldActeurEntreprise == null)
         return;
      if (this.acteurEntreprise != null)
         if (this.acteurEntreprise.contains(oldActeurEntreprise))
            this.acteurEntreprise.remove(oldActeurEntreprise);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllActeurEntreprise() {
      if (acteurEntreprise != null)
         acteurEntreprise.clear();
   }
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