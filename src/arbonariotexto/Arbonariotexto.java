/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbonariotexto;

import javax.swing.JOptionPane;


public class Arbonariotexto {

    
    public static void main(String[] args) {
        int opcion= 0;
        String nombre;
        String sexo;
        arbolbin arbcreado= new arbolbin();

        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar nodo \n "
                        +"2.Recorrer el arbol en inorden \n"
                        +"3.Recorrer el arbol en Preorden \n"
                        +"4.Recorrer el arbol en PostOrden \n"    
                        +"5.Imprimir Mujeres de la \n" 
                        +"6.salir"
                        
                        ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion ){
                    case 1:
                        nombre=JOptionPane.showInputDialog(null,"Ingresa el Nombre del nodo ...","Agregando nodo" 
                                ,JOptionPane.QUESTION_MESSAGE );
                        

                        sexo=JOptionPane.showInputDialog(null,"Ingresa el sexo de la persona ...","Agregando nodo" 
                                ,JOptionPane.QUESTION_MESSAGE );
                        arbcreado.agregaNodo(nombre , sexo);
                        
                        
                     break;
                     
                    case 2:
                        if(!arbcreado.arbvacio()){
                            System.out.println();
                            arbcreado.inOrden(arbcreado.raiz);
         
                        }else{
                            JOptionPane.showInputDialog(null, "el arbol est vacio", "cuiddado!"
                            ,JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                     break;
                      
                    case 3:
                        if(!arbcreado.arbvacio()){
                            System.out.println();
                            arbcreado.preOrden(arbcreado.raiz);
         
                        }else{
                            JOptionPane.showInputDialog(null, "el arbol est vacio", "cuiddado!"
                            ,JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                     break;
                    case 4:
                        if(!arbcreado.arbvacio()){
                            System.out.println();
                            arbcreado.postOrden(arbcreado.raiz);
         
                        }else{
                            JOptionPane.showInputDialog(null, "el arbol est vacio", "cuiddado!"
                            ,JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                     break;
                     case 5:
                        if(!arbcreado.arbvacio()){
                            System.out.println();
                            arbcreado.Mujeres(arbcreado.raiz);
                            break;
                        }
                    case 6:
                       JOptionPane.showMessageDialog(null, "aplicacion finalizada ", "fin" 
                               ,JOptionPane.INFORMATION_MESSAGE);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta", "Cuidado!",
                                JOptionPane.INFORMATION_MESSAGE);
                    break;    
                }
                
            }catch (NumberFormatException  n){
                if("null".equals(n.getMessage())){
                    break;
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                }
            }
        }while( opcion!= 6);
    }
                
}
    

