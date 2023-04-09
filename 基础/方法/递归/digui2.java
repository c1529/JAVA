public class digui2 {
    public static void main(String[] args){
        // 迷宫问题
        // 1. 先用二维数组表示迷宫，8行7列
        // 2. 用1表示障碍物，0表示可以走的路
        int i,j;
        int[][] map = new int [8][7];
        for(i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        for(i=1;i<7;i++){
            for(j=0;j<7;j++){
                if(j==0||j==6){
                    map[i][j]=1;
                }
                else
                    map[i][j]=0;
            }
        }
        map[3][1]=1;
        map[3][2]=1;
        for(i=0;i<8;i++){
            for(j=0;j<7;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
        T3 tt3 = new T3();

        /*
        for(i=0;i<7;i++)
        {
            map[2][i]=1;
        }
        map[1][2]=1;
        */

        tt3.findway(map,1,1);




        System.out.println("====找到路后的情况====");
        for(i=0;i<8;i++){
            for(j=0;j<7;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }

    }
}

class T3{
    // 采用递归回溯的方法
    // map代表迷宫，i,j代表当前小球的位置
    // 起始位置(1,1).初始位置(6,5)
    // 2表示可以走的路，3表示走过但不行的路
    //优先级：下、右、上、左
    public boolean findway(int[][] map,int i,int j)
    {
        if(map[6][5]==2)
        {
            return true;
        }
        else if(map[i][j]==0)
            {
                map[i][j]=2;
                if(findway(map,i+1,j))
                {
                    return true;
                } else if (findway(map,i,j+1))
                {
                    return true;
                }
                else if(findway(map,i-1,j))
                {
                    return true;
                }
                else if(findway(map,i,j-1))
                {
                    return true;
                }
                else
                {
                    map[i][j]=3;
                    return false;
                }
            }
            else
                return false;

    }
}


