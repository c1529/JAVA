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


