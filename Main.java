import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque <String> ad=new ArrayDeque<>();
        ad.push("a");   //can also use ad.push()
        ad.push("b");
        ad.push("c");
        ad.pop();

        System.out.println(ad);


    }
}