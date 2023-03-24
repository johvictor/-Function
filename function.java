package Lambdas;

import java.util.function.Function;


//Reutilização de função
public class function {
    
    
    public static void main(String[] args) {
        
        //Funação que recebe int e retorna uma String
        Function<Integer,String> ParOuimpar = 
                numero -> numero % 2 == 0 ? "Par":"Impar";
        
        
        //FORMA SIMPLES E EXIBIR NO CONSOLE
            // System.out.println(ParOuimpar.apply(21));
        
        //Função que recebe String e retorna uma String
         Function<String,String> OResultadoE =
                 resultado -> "O resultado é " + resultado;
         
         
        //Função que recebe String e retorna uma String 
        Function<String,String> Empolgado =
                OResultadoe -> OResultadoe + "!!!";
        
    /**
    * Como as funções terminam em String é possivel
    *combinar o retorno de uma função com a entrada de outro. 
    */
        String ResultadoFinal = ParOuimpar
                .andThen(OResultadoE) // e então...
                .andThen(Empolgado)
                .apply(32);
        
        
            System.out.println(ResultadoFinal);
        
    }
    
    
}

