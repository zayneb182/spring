/***********************************************************************
 * Module:  Projet.java
 * Author:  Zayneb
 * Purpose: Defines the Class Projet
 ***********************************************************************/

import java.util.*;

/** @pdOid 2c4c70c1-38d3-425a-ba65-168970b696a0 */
public class Projet {
   /** @pdOid 6021fd2f-7894-48e9-b969-c186ca980d68 */
   private int idP;
   /** @pdOid 8c9853a8-2e68-430e-894b-e59ad211f7a6 */
   private String nomP;
   /** @pdOid d262f28e-08c1-4a45-9f5b-67f249f590c0 */
   private Date dateCreation;
   /** @pdOid 76dcfd42-e11f-4146-84b2-3c208741d97b */
   private String typeP;
   
   /** @pdRoleInfo migr=no name=BacklogProduit assc=association9 mult=1..1 type=Composition */
   public BacklogProduit backlogProduit;

}