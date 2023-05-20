
package estrutura.dados.java;

import java.util.Arrays;


public class Aulas {
    
    private String [] elementos;
    private int tamanho;
    public Aulas( int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
        
    }
   
  /* public boolean adicionar (String elemento) {
    
      //metodo aula 05, intersecção aula01
        
         this.aumenteCapacidade();
         
        
        //AULA 01 SOBRE COMO ADICIONAR ELEMENTOS AO VETOR
        
        
        for ( int i=0; i < elementos.length; i++) {
           if (this.elementos[i] == null) {
               this.elementos[i] = elemento;
               break;}
        }
    }*/
        
        public boolean adicionar(String elemento) { 
            //metodo aula 05, intersecção aula 01
            this.aumenteCapacidade();
            
            if(this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            }
            return false;
        }
        
        
        //aula 02 tamanho do vetor 
        /*
        if ( tamanho < elementos.length){
             this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        return true;
           }
               return false;*/
         
  

    //Aula 03 obter elemento de um posicao 
    
    /*public String busca ( int posicao) {
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
    
    // aula 05 aumentar a capacidade do vetor 
    
    
        private void aumenteCapacidade() {
        if (tamanho == this.elementos.length) {
            String [] elementosNovos = new String [this.elementos.length * 2];
            for (int i=0; i< this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public int tamanho () {
        return this.tamanho;
        
    }

    @Override
    public String toString() {
        
        
        
        return Arrays.toString (elementos);
    }

    
    
    
    
   
       
            
        
        
    } 
    


