
package estrutura.dados.java;

import java.util.Arrays;


public class Aulas {
    
    private String [] elementos;
    private int tamanho;
    public Aulas( int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
        
    }
   
    
    
    //AULA 01 SOBRE COMO ADICIONAR ELEMENTOS AO VETOR
    
    
  /* public boolean adicionar (String elemento) {
    
      //metodo aula 05, INTERSECÇÃO aula01
        
         this.aumenteCapacidade();//
        
        
        for ( int i=0; i < elementos.length; i++) {
           if (this.elementos[i] == null) {
               this.elementos[i] = elemento;
               break;}
        }
    }*/
        
    
    //AULA 02 TAMANHO DO VETOR 
        public boolean adicionar(String elemento) { 
            
         //metodo aula 05, INTERSECÇÃO aula 02
         
            this.aumenteCapacidade();//
            
            if(this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            }
            return false;
        }
         
  

    //AULA 03 OBTER ELEMENTO DE UMA POSIÇÃO
    
    /*public String busca ( int posicao) {
        if (!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida"); 
        }
        return this.elementos[posicao];
    }*/
    
    
    // AULA 04  VERIFICAR SE ELEMENTO EXISTE NO VETOR 
    
    public int busca (String elemento) {
        for (int i=0; i < this.tamanho; i++) {
            if ( this.elementos[i].equals(elemento)) {
        
    return i; 
     
     }
    } 
        
     return -1;
       
    }
    
    // AULA 05 AUMENTAR A CAPACIDADE DO VETOR  
    
    
        private void aumenteCapacidade() {
        if (tamanho == this.elementos.length) {
            String [] elementosNovos = new String [this.elementos.length * 2];
            for (int i=0; i< this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    
    // AULA 06 REMOVER ELEMENTO
    // B G D E F -> POSIÇÃO A SER REMOVIDA É 1 (G)
    // 0 1 2 3 4 
    // VETOR [1] = VETOR [2]
    // VETOR [2] = VETOR [3]
    // VETOR [3] = VETOR [4]
        
        
    public void  remove (int posicao){
        if (!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição invalida"); 
        }
        for(int i = posicao; i < this.tamanho -1; i++) {
            this.elementos[i] = this.elementos[i+1];
            
        }
        this.tamanho--;
    } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public int tamanho () {
        return this.tamanho;
        
    }

    @Override
    public String toString() {
        
        
        
        return Arrays.toString (elementos);
    }

    
    
    
    
   
       
            
        
        
    } 
    


