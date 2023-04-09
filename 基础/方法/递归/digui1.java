public class digui1 {
    public static void main(String[] args){
        T1 t1 = new T1();
        //System.out.println(t1.fibonacci(10));
        System.out.println(t1.taozi(1));
    }
}

class T1{
    // 斐波那契数列
    public int fibonacci(int n){
        if(n==1||n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    /*
    * 猴子吃桃问题：
    * 有一堆桃子，猴子每天吃一半加一个
    * 第n天发现只有一个桃子了
    * 求一共有多少桃子
    */
    public int taozi(int n)
    {
        if(n==10){
            return 1;
        }
        else
            return (taozi(n+1)+1)*2;
    }
}



