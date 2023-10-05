package edu.danilo.segundasemana;
public class MinhaClasse {
    
  public static void main(String[] args) {
    int ano = 2021;
    final String BR = "Brasil";
    String primeiroNome = "Danilo";
    String segundoNome = "Neves";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    System.out.println(ano);
  }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome); 
    


  }

}
