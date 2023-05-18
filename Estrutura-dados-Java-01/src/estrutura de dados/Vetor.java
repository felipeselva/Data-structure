
package estrutura.dados.java.pkg01;

import java.util.Arrays;


public class Vetor {
    
    private String [] elementos;
    private int tamanho;
    public Vetor( int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
        
    }
   
    
    
    
    
    
    
    
    
    public boolean adicionar (String elemento) {
    
        /*AULA 01 SOBRE COMO ADICIONAR ELEMENTOS AO VETOR 
        
        for ( int i=0; i < elementos.length; i++) {
           if (this.elementos[i] == null) {
               this.elementos[i] = elemento;
               break;}*/
               
        
        //aula 02 tamanho do vetor 
        
        if ( tamanho < elementos.length){
             this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
           }
               return false;
        }

    /*obter elemento de um posicao Aula 03 
    
    public String busca ( int posicao) {
        if (!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida"); 
        }
        return this.elementos[posicao];
    }*/
    
    
    // aula 04  Verificar se elemento existe no vetor 
    
    public int busca (String elemento) {
        for (int i=0; i < this.tamanho; i++) {
            if ( this.elementos[i].equals(elemento)) {
        
    return i; 
     
     }
    } 
        
     return -1;
       
    }
    
    
    
    public int tamanho () {
        return this.tamanho;
        
    }

    @Override
    public String toString() {
        
        
        
        return Arrays.toString (elementos);
    }

    
    
    
    
   
       
            
        
        
    } 
    


