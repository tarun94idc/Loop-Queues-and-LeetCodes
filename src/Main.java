public class Main {
    public static void main(String[] args) {
        int i,j,k=8;
        //this loop work on the row
        for(i=0;i<5;i++)
        {
            //this loop work for spaces
            for(j=0;j<k;j++)
                System.out.print(" ");
            //decrement k for reduce the spaces in next row
            k=k-2;
            //this loop work for print the *
            for(j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}