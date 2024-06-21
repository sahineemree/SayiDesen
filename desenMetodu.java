import java.util.Scanner;
public class desenMetodu {

        static void metot(int num){
            System.out.print(num + " ");
            if(num<=0){
                return;
            }
            metot(num-5);
            System.out.print(num+ " ");
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num;

            System.out.println("Sayıyı giriniz:");
            num = input.nextInt();
            metot(num);
        }
    }