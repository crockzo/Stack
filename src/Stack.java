import java.util.Scanner;

public class Stack {
    private static final int MAX = 3;
    private static int[] a = new int[MAX];
    private static int TOP;
    static {
        System.out.println("\nSTACK IMPLEMENTATION");
        TOP = -1;
    }
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int choice ;
        boolean flag = true;
        while(flag){

            System.out.println("\n1 : INSERT ");
            System.out.println("2 : READ");
            System.out.println("3 : DELETE");
            System.out.println("4 : EXIT");
            System.out.print("\nENTER OPTION : ");
            choice = scan.nextInt();
            switch (choice){
                case 1: insertElement();
                    break;
                case 2: readStack();
                    break;
                case 3: deleteElement();
                    break;
                case 4:
                    System.out.println("** END OF STACK **");
                    flag = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
    private static void insertElement(){
        if(TOP==(MAX-1)){
            System.out.println("OVER FLOW");
        }else{
            ++TOP;
            System.out.print("\nENTER THE ELEMENT : ");
            a[TOP] = scan.nextInt();
        }
    }

    private static void readStack(){
        System.out.println("\n*** STACK ***");
        for(int i = 0 ; i <= TOP ; i++ ){
            System.out.print(a[i] + " \t");
        }
    }

    private static void deleteElement(){
        if(TOP == -1){
            System.out.println("UNDER FLOW");
        }else{
            System.out.println("\n" + a[TOP] + " IS DELETED FROM THE STACK");
            TOP = TOP - 1;
        }
    }

}
