/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;


public class Arbol {
    private FormaGeneral raiz;
    String temp = "";
    
    public Arbol() {
        raiz = new FormaGeneral();
    }

    public Arbol(FormaGeneral raiz) {
        this.raiz = raiz;
    }

    public FormaGeneral getRaiz() {
        return raiz;
    }

    public void setRaiz(FormaGeneral raiz) {
        this.raiz = raiz;
    }
    
    public void agregar (FormaGeneral n, FormaGeneral nh2){   
        if (n.getIndices().equals(nh2.getIndices().substring(0, nh2.getIndices().length()-2))) {
                n.setHijo(nh2);
                
        }
        for (FormaGeneral hijo : n.getHijos()) {
            if (hijo.getHijos().isEmpty() ) { 
                if (n.getHijos().indexOf(hijo) == n.getHijos().size()-1 ) {
                    if ( hijo.getIndices().equals(nh2.getIndices().substring(0, nh2.getIndices().length()-2))) {
                        hijo.setHijo(nh2);
                    }
                } else {
                    if ( hijo.getIndices().equals((nh2.getIndices().substring(0, nh2.getIndices().length()-2)))) {
                        hijo.setHijo(nh2);
                    }  
                }                    
            } else { 
                agregar(hijo, nh2);
            }
        }
    }
    
    public String recorrer (FormaGeneral n){
        temp+=n+"[";
        for (FormaGeneral hijo : n.getHijos()) {
            if (hijo.getHijos().isEmpty() ) { 
                if (n.getHijos().indexOf(hijo) == n.getHijos().size()-1 ) {
                    temp+=hijo+" "; 
                } else {
                    temp+=hijo+", "; 
                }
            } else { 
                recorrer(hijo);
            }
        }
       temp+="], ";
       return temp;
    }
    
    
    public String genif(Rombo r){
        String ifgen = "";
        ifgen+= "if "+(r.getText().getText());
        return ifgen;
    }
    
    public String genelse(Rombo r){
        String elsegen = "";
        
        return elsegen;
    }

    public String genprocess(Proceso p){
        String processgen = "";
        
        return processgen;
    }
    
    public String genciclo(circulo c){
        String ciclogen = "";
        
        return ciclogen;
    }
    
    public String gendata (Paralelogramo d){
        String datagen = "";
        
        return datagen;
    }
    
}
