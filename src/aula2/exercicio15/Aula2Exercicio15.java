/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2.exercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author jwern
 */
public class Aula2Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	       String nome;
	       int idade;
	       
	       nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		   idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

           if((idade > 15) && (idade < 25)){
		       JOptionPane.showMessageDialog(null,nome + " ACEITA! ");
           }else{
               JOptionPane.showMessageDialog(null,nome + " NÃO ACEITA! ");
           }
           
    }

}
