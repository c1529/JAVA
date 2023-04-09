public class fangfa3 {
    public static void main(String[] args){
        int a=23,b=99;
        BB bb1 = new BB();
        bb1.swap(a,b);
        System.out.println(a);
        System.out.println(b);
        person p = new person();
        p.age = 100;
        System.out.println("改变前的"+p.age);
        bb1.change(p);
        System.out.println("改变后的"+p.age);
    }
}

class person{
    String name;
    int age;
}

class BB{
    public void swap(int n,int m){
        int temp;
        temp = n;
        n = m;
        m = temp;
    }
    // 参数是类的话，通过改变形参可以改变实参
    public void change(person p){
        p.age=200;
    }
}






