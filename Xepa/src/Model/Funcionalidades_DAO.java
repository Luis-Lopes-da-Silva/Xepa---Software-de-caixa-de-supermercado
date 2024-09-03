/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static View.Login_GUI.senha;
import static View.Login_GUI.usuario;
import javax.swing.JOptionPane;


public class Funcionalidades_DAO {
  
    public static int qtde = Integer.parseInt (View.Caixa_GUI.qtde_pro.getText());
    public static double preco = Double.parseDouble (View.Caixa_GUI.unit_pro.getText());
    public static double total_pro;
    public static double total;
    public static String nomeP = View.Caixa_GUI.nome_pro.getText();
    public static String cpfC = View.Caixa_GUI.cpf_cli.getText();
    public static String nomeC = View.Caixa_GUI.nome_cli.getText();
    public static String[] opcoes = {"Pix", "Débito", "Crédito", "Dinheiro"};
    
        public static void totalizar_funcao(){
       
        
        total_pro = qtde * preco;
        
        View.Caixa_GUI.total_pro.setText(String.valueOf(total_pro));
        
        
    }
    public static void totalizar2_funcao(){
    
        total += total_pro;
        View.Caixa_GUI.total_TXT.setText(String.valueOf(total));
    
    }
    
    public static void finalizar_funcao(){
        
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha uma forma de pagamento:",
            "Opções de Pagamento",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        if (escolha >= 0) {
            JOptionPane.showMessageDialog(null, "Você escolheu: " + opcoes[escolha]);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
        }
        JOptionPane.showMessageDialog(null, "O cliente: "+nomeC+" do CPF: "+cpfC+"\n comprou o(s) produto(s):\n "+nomeP+" com valor unit.: "+preco+" Qtde: "+qtde+" Valor final "+total);
    
    }
    
}
