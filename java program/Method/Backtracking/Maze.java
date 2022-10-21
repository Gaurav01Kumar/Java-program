import java.util.ArrayList;
 
public class Maze{
     public static void main(String[] args){
        //System.out.println("No of ways to react 0,0 to 3,3  - " + count(3,3));
        //System.out.println(pathRet(" ", 3, 3));
        boolean [][]board={
            {true,true,true},
            {true,true,true},
            {true,false,true}
        };
       pathrestriction(" ",board,0,0); 
    }

    public static int count (int r, int c){
        if(r==1 || c== 1){
            return 1;
        }
        int left =count(r-1,c);
        int right=count(r,c-1);
        
        return left+right;
    }
    static ArrayList<String> pathRet(String p,int r, int c){
        if(r==1 || c==1){
            ArrayList <String> list=new ArrayList<>();
            list.add(p);
        }
         ArrayList <String> list=new ArrayList<>();
         if(r>1){
            list.addAll(pathRet("D" , r-1,c));
         }
           if(r>1){
            list.addAll(pathRet("D" , r,c-1));
         }
         return list;
    }
    static void pathrestriction(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathrestriction(p+ 'R',maze, r+1,c);
        }
        if(c<maze[0].length-1){
            pathrestriction(p+'D',maze,r,c+1);
        }
    }
}
   