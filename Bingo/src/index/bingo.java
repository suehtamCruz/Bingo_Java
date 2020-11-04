package Bingo.src.index;

import java.util.Random;
import java.util.Scanner;

public class bingo {
    public static void main(String[] args) {
      
        Random rand = new Random();
        Scanner scanf = new Scanner(System.in);

        int acertos=0;
        System.out.println("Serão soteados 10 números entre 0 e 100 e você terá 15 numeros á sua escolha;");
        int numbers[] = new int[10]; 
        for(int i = 0 ; i < 10 ; i++){
            numbers[i] = rand.nextInt(100);
        }

        int chutes[] = new int[15];
        for(int i = 0; i < 15 ; i++ ){
            chutes[i] = scanf.nextInt();
        }

        for(int i=0; i<15 ;i++){
            for(int j=0;j<10;j++){
                if(chutes[i] == numbers[j]){
                    acertos++;
                    break;
                }
            }
        }

        if(acertos == 10){
            System.out.println("Bingo, Parabéns!!");
        }else{
            System.out.print("NUMEROS SORTEADOS : { ");
            for(int i = 0; i < 10 ;i++ ){
                System.out.print(numbers[i]+" ");
            }
            System.out.println("}");
            System.out.println("Infelizmente não foi dessa vez, você obteve " + acertos + " acertos");
            
        }
        scanf.close();
    }    
}
