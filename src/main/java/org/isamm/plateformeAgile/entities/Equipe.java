/***********************************************************************
 * Module:  Equipe.java
 * Author:  Zayneb
 * Purpose: Defines the Class Equipe
 ***********************************************************************/

import java.util.*;

/** @pdOid 6ee41147-d0d8-4111-b073-3f88b9c54ec0 */
public class Equipe {
   /** @pdOid d60106e4-f00a-4153-8df5-196c2fbf58f3 */
   private int idEq;
   /** @pdOid 1d118d8f-b007-4bd3-83d9-08ae87199808 */
   private String nomEq;
   
   /** @pdRoleInfo migr=no name=MmebreDeL_equipe assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation */
   public java.util.Collection<MmebreDeL_equipe> mmebreDeL_equipe;
   /** @pdRoleInfo migr=no name=ProductOwner assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation */
   public java.util.Collection<ProductOwner> productOwner;
   /** @pdRoleInfo migr=no name=ScrumMaster assc=association6 mult=1..1 type=Aggregation */
   public ScrumMaster scrumMaster;
   /** @pdRoleInfo migr=no name=Projet assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Projet> projet;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<MmebreDeL_equipe> getMmebreDeL_equipe() {
      if (mmebreDeL_equipe == null)
         mmebreDeL_equipe = new java.util.HashSet<MmebreDeL_equipe>();
      return mmebreDeL_equipe;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMmebreDeL_equipe() {
      if (mmebreDeL_equipe == null)
         mmebreDeL_equipe = new java.util.HashSet<MmebreDeL_equipe>();
      return mmebreDeL_equipe.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMmebreDeL_equipe */
   public void setMmebreDeL_equipe(java.util.Collection<MmebreDeL_equipe> newMmebreDeL_equipe) {
      removeAllMmebreDeL_equipe();
      for (java.util.Iterator iter = newMmebreDeL_equipe.iterator(); iter.hasNext();)
         addMmebreDeL_equipe((MmebreDeL_equipe)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMmebreDeL_equipe */
   public void addMmebreDeL_equipe(MmebreDeL_equipe newMmebreDeL_equipe) {
      if (newMmebreDeL_equipe == null)
         return;
      if (this.mmebreDeL_equipe == null)
         this.mmebreDeL_equipe = new java.util.HashSet<MmebreDeL_equipe>();
      if (!this.mmebreDeL_equipe.contains(newMmebreDeL_equipe))
         this.mmebreDeL_equipe.add(newMmebreDeL_equipe);
   }
   
   /** @pdGenerated default remove
     * @param oldMmebreDeL_equipe */
   public void removeMmebreDeL_equipe(MmebreDeL_equipe oldMmebreDeL_equipe) {
      if (oldMmebreDeL_equipe == null)
         return;
      if (this.mmebreDeL_equipe != null)
         if (this.mmebreDeL_equipe.contains(oldMmebreDeL_equipe))
            this.mmebreDeL_equipe.remove(oldMmebreDeL_equipe);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMmebreDeL_equipe() {
      if (mmebreDeL_equipe != null)
         mmebreDeL_equipe.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<ProductOwner> getProductOwner() {
      if (productOwner == null)
         productOwner = new java.util.HashSet<ProductOwner>();
      return productOwner;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProductOwner() {
      if (productOwner == null)
         productOwner = new java.util.HashSet<ProductOwner>();
      return productOwner.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProductOwner */
   public void setProductOwner(java.util.Collection<ProductOwner> newProductOwner) {
      removeAllProductOwner();
      for (java.util.Iterator iter = newProductOwner.iterator(); iter.hasNext();)
         addProductOwner((ProductOwner)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProductOwner */
   public void addProductOwner(ProductOwner newProductOwner) {
      if (newProductOwner == null)
         return;
      if (this.productOwner == null)
         this.productOwner = new java.util.HashSet<ProductOwner>();
      if (!this.productOwner.contains(newProductOwner))
         this.productOwner.add(newProductOwner);
   }
   
   /** @pdGenerated default remove
     * @param oldProductOwner */
   public void removeProductOwner(ProductOwner oldProductOwner) {
      if (oldProductOwner == null)
         return;
      if (this.productOwner != null)
         if (this.productOwner.contains(oldProductOwner))
            this.productOwner.remove(oldProductOwner);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProductOwner() {
      if (productOwner != null)
         productOwner.clear();
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