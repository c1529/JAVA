public class fangfa1 {
    public static void main(String[] args)
    {
        A aa = new A();
        aa.print(5);
        aa.sayOK(5);
        aa.m1();
    }
}

class A{
    //同一个类方法中直接调用
    public void print(int n)
    {
        System.out.println("print方法别调用:n="+n);
    }
    public void sayOK(int b)
    {
        int a1 = b*b;
        print(a1);
    }
    //跨类中
    public void m1(){
        B bb = new B();
        bb.hi();
    }
}

class B{

    public void hi()
    {
        System.out.println("B类中的hi方法被执行");
    }
}

