import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String name="rohan";
////        name.replace("r","n");
//
//        System.out.println(name.substring(0,3));
//        System.out.println(name);
//2D Array
//        int[][] marks={{32,54,64},{23,232,42}};
//        System.out.println(marks[0][1]);

        //For Input
//        Scanner  sc=new Scanner(System.in);
//        System.out.println("Enter Your Value");
//        String value=sc.next();
//        System.out.println(value);

        //for 2's table
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter The Table You Want ");
//        int j=sc.nextInt();
////        System.out.println(j);
////        sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(j+"*"+i+"="+j*i);
//        }

        //use of break & continue statment
//        int i=1;
//        while(true){
//            System.out.println(i);
//            i++;
//            if(i==11){
//                break;
//            }
//
//        }

        // Game with pc
        System.out.println("Aaja game khelte hai");
        Scanner sc=new Scanner(System.in);
        int computer_number=(int)(Math.random()*100);
        int my_number=0;
        do {
            System.out.println("Fataak se number soch ke bata");
            my_number=sc.nextInt();
            if (my_number==computer_number){
                System.out.println("Ye hui na baat!!!");
                break;
            } else if (my_number>computer_number){
                System.out.println("Tu jyada number soch  raha hai bhai");
            }
            else {
                System.out.println("bahut kam soch rha hai");
            }
        }while (my_number!=computer_number);
        System.out.println("Tune sahi socha ye "+my_number);
    }
}