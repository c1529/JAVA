public class HanoiTower {
    public static void main(String[] args)
    {
        T1 t1 = new T1();
        t1.move(3,'a','b','c');
    }
}

class T1{
    // nums 表示移动盘子的个数，a,b,c分别表示各个柱子

    public void move(int nums, char a, char b, char c)
    {
        // 如果只有一个盘，nums==1
        if(nums==1)
            System.out.println(a+"->"+c);
        else
        {
            // 如果有多个盘子，可以看成两个盘子，最上面所有的和最下面
            // (1) 先移动上面所有的盘子到b,借助c
            move(nums-1,a,c,b);
            // (2) 把最下面的盘子移动到c
            System.out.println(a+"->"+c);
            // (3) 把b塔的所有盘子移动到c塔
            move(nums-1,b,a,c);
        }
    }
}

