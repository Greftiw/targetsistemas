import java.util.ArrayList;
import java.util.Scanner;

public class Ativ {

    public void Ativ(){
        Ativ1();
        Ativ2();
        Ativ5();
    }

    public void Ativ1(){
        int i=13, soma=0, k=0;
        while(k<i){
            k++;
            soma+=k;

        }
        System.out.println("Atividade 1: " + soma);
    }

    public void Ativ2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Atividade 2: Informe um número.");
        int num = in.nextInt();
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        int val=0;
        for(int i=2; val<=num; i++){
            int val1= fibo.get(i-2);
            int val2= fibo.get(i-1);
            int val3 = val1+val2;
            if(val3<num){
                fibo.add(val1+val2);
            }
            else if(val3==num){
                System.out.println("Atividade 2: O número " + num + " pertence ao fibonacci.");
                break;
            }
            else{
                System.out.println("Atividade 2: O número " + num + " não pertence ao fibonacci.");
                break;
            }
        }
    }

    public void Ativ5(){
        char c;
        String newSt="";
        Scanner in = new Scanner(System.in);
        System.out.println("Atividade 5: Informe uma String.");
        String st = in.nextLine();
        for(int i=0;i<st.length();i++){
            c=st.charAt(i);
            newSt= c+newSt;
        }
        System.out.println("Atividade 5: String invertida: " + newSt);
    }
}
