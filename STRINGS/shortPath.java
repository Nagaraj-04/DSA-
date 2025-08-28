public class shortPath{
    public static float getS(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
                if(ch=='N'){
                    y++;
                }
                else if(ch=='S'){
                    y--;
                }
                else if(ch=='W'){
                    x--;
                }
                else{
                    x++;
                }
        }
            int X2=x*x;
            int Y2=y*y;
            return (float)Math.sqrt(X2+Y2);
        }
    public static void main(String[]args){
        String path="WNEENESENNN";
        System.out.println(getS(path));
    }
    }