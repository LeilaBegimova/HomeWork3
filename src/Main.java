 // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        double[] array1= {-0.3, 1.5, 0.8, 1.2, 4.6, -7.1, -8.1, 4.2, 2.7, 3.6, -1.8, 0.2, -7.9, -0.6, -9.1};
        double average = 0.0;
        int coint  =0;


        for (int a1 = 0; a1 < array1.length  ; a1++) {
            if (array1[a1] < 0 ){
                for (int a2 = a1 + 1; a2 <array1.length ; a2++) {
                       if (array1 [a2] > 0){
                           average = average + array1[a2];
                           coint++;
                       }

                }


                break;
            }

        }
        System.out.println(" average" + average);
        System.out.println("count" + coint);
        System.out.println("average/count" + average / coint);



       }




     }










 