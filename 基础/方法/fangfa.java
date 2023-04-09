// 实现一个方法返回多个值——————返回一个数组
public class fangfa {
    public static void main(String[] args)
    {
        int n1 = 25,n2 = 22;
        p p1 = new p();
        int arr[] = p1.res(n1,n2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

class p{
    public int[] res(int n1,int n2)
    {
        int[] arr = new int[2];
        arr[0] = n1-n2;
        arr[1] = n1+n2;
        return arr;
    }
}



