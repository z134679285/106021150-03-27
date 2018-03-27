import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner scn= new Scanner(System.in);
        ArrayList<book>bookList= new ArrayList<book>();
        String title,author,publisher,ISBN;
        int price;
        boolean flag =true;
        int a= Integer.parseInt(scn.nextLine());
        while (flag)
        switch (a){
            case 0:
                flag=false;
                break;
            case 1:
                System.out.println("書名:");
                title=scn.nextLine();
                System.out.println("作者:");
                author=scn.nextLine();
                System.out.println("出版社:");
                publisher=scn.nextLine();
                System.out.println("條碼:");
                ISBN=scn.nextLine();
                System.out.println("價格");
                price=Integer.parseInt(scn.nextLine());

        }
    }
}
