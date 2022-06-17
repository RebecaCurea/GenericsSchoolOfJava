import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

    static <T> void exchangePosition(T[] inputArray, int i, int j){
        T temp;
        temp=inputArray[i];
        inputArray[i]=inputArray[j];
        inputArray[j]=temp;

    }

    public  static <T> void print(T[] inputArray){
        for (T t : inputArray) {
            System.out.print(t + " ");

        }
    }
  static  public boolean checkPrime(Integer t) {
        if(t<=1) return false;
        for (int i = 2; i <=t/2; i++) {
            if (t % i == 0) {
                return false;
            }
        }
        return true;
    }


   static <T> int numberOfPrime(List<T> list) {
       int count = 0;

       for (T type : list) {
           try {
               Integer nr = Integer.parseInt(type.toString());
               {
                   if (checkPrime(nr))
                       count++;

               }
           }catch (Exception e){}
       }
       return count;
   }



        public static void main(String[] args) {

            Integer[] integerArray = { 1, 2, 3, 4, 5,6 };
            System.out.println("Array before swap:" );
            print(integerArray);
            exchangePosition(integerArray, 1, 4);
            System.out.println("\nArray after swap:");
            print(integerArray);

            System.out.println("\n");
            String[] stringArray = { "Ana", "are", "mere", "si", "pere" };
            System.out.println("\nArray before swap:");
            print(stringArray);
            exchangePosition(stringArray, 2, 4);
            System.out.println("\nArray after swap:");
            print(stringArray);


            System.out.println("\n");
            Double[] doubleArray = { 1.5, 2.3, 17.8, 9.6, 1.3 };
            System.out.println("\nArray before swap:");
            print(doubleArray);
            exchangePosition(doubleArray, 0, 4);
            System.out.println("\nArray after swap:");
            print(doubleArray);

            List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11);
            List<String> myList=Arrays.asList("2","4","7","ana");

            System.out.println("\n\nNr of prime-list: "+ numberOfPrime(list));
            System.out.println("Nr of prime-myList: "+ numberOfPrime(myList));

        }
}


