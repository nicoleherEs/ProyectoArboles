
package arbonariotexto;


public class arbolbin {
    nodoarbol raiz;
 
    public arbolbin (){
        raiz= null;
    }
    
    public boolean arbvacio(){
        return raiz == null;
    }
    public void agregaNodo( String nom, String sex){
         nodoarbol nuevo= new nodoarbol(nom , sex);
         if (raiz == null){
             raiz = nuevo;
              
         }else {
             nodoarbol auxiliar= raiz;
             nodoarbol padre;
             while(true){
                 padre= auxiliar;
                 if(nom.compareTo(auxiliar.nombre)<=0){
                      if( nuevo.sexo.compareTo("F")==0){
                         auxiliar = auxiliar.hizquierdo;
                         if(auxiliar == null   ){
                             padre.hizquierdo= nuevo;
                             return;
                         }
                      }else{
                         auxiliar = auxiliar.hderecho;
                          if(auxiliar == null){
                             padre.hderecho= nuevo;
                             return;     
                            } 
                        }
                     
                 }else{
                     if( nuevo.sexo.compareTo("F")==0){
                        auxiliar = auxiliar.hizquierdo;
                        if(auxiliar == null ){
                             padre.hizquierdo= nuevo;
                             return; 
                            }   
                     }else{
                         auxiliar = auxiliar.hderecho;
                          if(auxiliar == null){
                             padre.hderecho= nuevo;
                         return;     
                          }  
                       
                    }
                        
                 }
             }
         }
    }
            
  public void inOrden(nodoarbol r){
      if (r!= null){
          inOrden(r.hizquierdo);
          System.out.print(r.nombre +" , ");
          inOrden(r.hderecho);
          
      }
  }
   public void preOrden(nodoarbol r){
        if (r!= null){
            
            System.out.print(r.nombre +" , ");
            preOrden(r.hderecho);
            preOrden(r.hizquierdo); 
      }
   } 
    public void postOrden(nodoarbol r){
        if (r!= null){

            preOrden(r.hizquierdo); 
            preOrden(r.hderecho);
            System.out.print(r.nombre +" , ");
            
            
      }
   }
    public void Mujeres(nodoarbol r){
        if(r!= null){
            if(r.sexo.compareTo("F") == 0  ){
             System.out.print(r.nombre +" , ");
            
            }
            Mujeres(r.hizquierdo);      
            
            
        }
    }
}
