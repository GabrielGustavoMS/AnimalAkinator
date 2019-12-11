/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressao;

import java.util.Scanner;
import akinator.NodeTree;
import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hight
 */
public class GerenciadorDeSaidaTerminal {
    
      boolean avaliaResposta(NodeTree no) {
       
           String respotaUsuario = capturaResposta(no);
        switch (respotaUsuario) {
            case "S":
                return true;
            case "s":
                return true;
            case "Sim":
                return true;
            case "sim":
                return true;
            case "sIm":
                return true;
            case "siM":
                return true;
            case "SIM":
                return true;
            case "si":
                return true;
            case "SI":
                return true;
            case "Yes":
                return true;
            case "yes":
                return true;
            case "YES":
                return true;          
            case "Y":
                return true;
            case "y":
                return true;
            case "true":
                return true;
            case "t":
                return true;            
            case "not":
                return false;
            case "n":
                return false;                                
           
            case "N":
                return false;
            case "nao":
                return false;                                 
            case "Nao":
                return false;
            case "nAo":
                return false;
            case "NAO":
                return false;
            case "nop":
                return false;
            case "no":
                return false;
            case "NO":
                return false;
            case "false":
                return false;
            case "f":
                return false;    
            case "NOT":
                return false;
            default:
                respotaUsuario = removeCaracters(respotaUsuario);
                if(respotaUsuario.compareToIgnoreCase("no") == 0){
                    return false;
                }
       }
          System.out.println("Entrada inválida. Por favor, Verifique a sua resposta e tente novamente ...");
        return avaliaResposta(no);
    }

    private String capturaResposta(NodeTree no) {        
        System.out.println(no.getValue());
        Scanner ler = new Scanner(System.in);        
        String entrada = ler.next();
        return entrada;
    }
    public void exibirResultado(NodeTree no){
        System.out.println(no.getValue()+"");
    }
    private static String removeCaracters(String entrada){
	     Pattern numericos = Pattern.compile("[0-9a-z]",Pattern.CASE_INSENSITIVE);
	     Matcher encaixe = numericos.matcher(entrada);
	     StringBuffer saida = new StringBuffer();
	     while(encaixe.find())
	        saida.append(encaixe.group());
	     return saida.toString();
    } 
}

