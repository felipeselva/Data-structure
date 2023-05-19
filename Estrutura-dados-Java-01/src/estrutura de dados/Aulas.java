/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estrutura.dados.java.pkg01;

/**
 *
 * @author Meu Computador
 */
public class Aula03 {
    
    public static void main(String[] args) {
        Vetor vetor = new Vetor (10);
        
        vetor.adicionar("elemento1");
        vetor.adicionar ("elemento2");
        vetor.adicionar("elemento3");
        
        System.out.println(vetor.busca("elemento1"));
        
        
    }
}
