import java.util.Scanner;
//约瑟夫环
public class ysf {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        int[] arr = new int[n];
        int i,j=1,k=0;
        for(i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        while(k<n-1) {
            for (i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    continue;
                }
                if (arr[i] != 0) {
                    if (j == 1) {
                        arr[i] = 0;
                        k++;
                        j = 4;
                    } else {
                        j--;
                    }
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]!=0)
                System.out.println(arr[i]);
        }
        //System.out.println(arr[0]);
    }
}

/*
假设有 n 件物品排成环形，编号依次为 1~n，从第 1 件开始，依照循环次序，每
间隔 3 件物品取走 1 件（空的不算，4 件取一件），（依次进行下去，10 件的顺序如 1、5、
9、4……），那么最后被取走（或剩下的）的物品编号是多少？
*/


