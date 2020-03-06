/***********************************************************************
 * Module:  Reunion.java
 * Author:  Zayneb
 * Purpose: Defines the Class Reunion
 ***********************************************************************/

import java.util.*;

/** @pdOid e444a26a-21ed-4773-a33b-63ffe37cfa65 */
public class Reunion {
   /** @pdOid 3457225b-c2ac-4d6d-87b4-89c102d610f6 */
   private int idR;
   /** @pdOid 7cae6064-6edc-4d40-bcc1-accbb9d17dcd */
   private String nomR;
   /** @pdOid d154c41e-eeda-4d29-b828-8b223090720a */
   private Date datedebR;
   /** @pdOid 881bc064-b022-48ad-8c33-ccbac8e8a11a */
   private Date datefinR;
   
   /** @pdRoleInfo migr=no name=Personne assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Personne> personne;
   /** @pdRoleInfo migr=no name=Sprint assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Sprint> sprint;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Personne> getPersonne() {
      if (personne == null)
         personne = new java.util.HashSet<Personne>();
      return personne;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPersonne() {
      if (personne == null)
         personne = new java.util.HashSet<Personne>();
      return personne.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPersonne */
   public void setPersonne(java.util.Collection<Personne> newPersonne) {
      removeAllPersonne();
      for (java.util.Iterator iter = newPersonne.iterator(); iter.hasNext();)
         addPersonne((Personne)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPersonne */
   public void addPersonne(Personne newPersonne) {
      if (newPersonne == null)
         return;
      if (this.personne == null)
         this.personne = new java.util.HashSet<Personne>();
      if (!this.personne.contains(newPersonne))
         this.personne.add(newPersonne);
   }
   
   /** @pdGenerated default remove
     * @param oldPersonne */
   public void removePersonne(Personne oldPersonne) {
      if (oldPersonne == null)
         return;
      if (this.personne != null)
         if (this.personne.contains(oldPersonne))
            this.personne.remove(oldPersonne);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPersonne() {
      if (personne != null)
         personne.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Sprint> getSprint() {
      if (sprint == null)
         sprint = new java.util.HashSet<Sprint>();
      return sprint;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSprint() {
      if (sprint == null)
         sprint = new java.util.HashSet<Sprint>();
      return sprint.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSprint */
   public void setSprint(java.util.Collection<Sprint> newSprint) {
      removeAllSprint();
      for (java.util.Iterator iter = newSprint.iterator(); iter.hasNext();)
         addSprint((Sprint)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSprint */
   public void addSprint(Sprint newSprint) {
      if (newSprint == null)
         return;
      if (this.sprint == null)
         this.sprint = new java.util.HashSet<Sprint>();
      if (!this.sprint.contains(newSprint))
         this.sprint.add(newSprint);
   }
   
   /** @pdGenerated default remove
     * @param oldSprint */
   public void removeSprint(Sprint oldSprint) {
      if (oldSprint == null)
         return;
      if (this.sprint != null)
         if (this.sprint.contains(oldSprint))
            this.sprint.remove(oldSprint);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSprint() {
      if (sprint != null)
         sprint.clear();
   }

}