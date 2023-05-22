
package Aula;

import estrutura.dados.java.Aulas;


public class Aula06 {
    
    public static void main(String[] args) {
        
        
        Aulas vetor = new Aulas (3);
        
        vetor.adicionar("a");
        vetor.adicionar("b");
        vetor.adicionar("c");
        vetor.adicionar("d");
        vetor.adicionar("e");
        
        System.out.println(vetor);
        
     vetor.remove(1);
        
        System.out.println(vetor);
}
}
