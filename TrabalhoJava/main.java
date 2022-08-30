public class main {
    public static void main(String[] args) {


int vetor [] = new int [6];
    vetor[0] = 45;
    vetor[1] = 12;
    vetor[2] = 2;
    vetor[3] = 8;
    vetor[4] = 37;
    vetor[5] = 98;

int total = 0;

    for (int i = 0; i < vetor.length; i++ ) {
     total = total + vetor[i];


    };
        System.out.println(total);
   }
}
