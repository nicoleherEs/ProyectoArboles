
package arbonariotexto;



public class nodoarbol {
String nombre;
String  sexo;
nodoarbol hizquierdo,hderecho;

public nodoarbol (String nom , String sex ){
    this.nombre= nom;
    this.hderecho= null;
    this.hizquierdo= null;
    this.sexo= sex;
    
}
public String  toString(){
    return "\n el nombre del nodo es : "+nombre;
}
}
