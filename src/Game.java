import java.util.Scanner;

public class Game {
    public static void main(String[] arg){
        Scanner nn =new Scanner(System.in);
        String[][] a =new String[3][3];
        int x=0;
        int o=0;
        int d=0;
        for (int y=0;y<1000;y++){


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]="- ";
            }
        } boolean bx=false;
        boolean bo=false;
        int row;
        int col;
        int num=1;
        while (true){
            col=nn.nextInt();
            row=nn.nextInt();
            if(num%2==1){
                if(a[row][col]=="- ") {
                    a[row][col]="x ";
                }

                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.print(a[i][j]);
                    }System.out.println();
                }
                num++;
                if(a[2][0].equals("x ")&&a[2][1].equals("x ")&&a[2][2].equals("x ")){
                    bx=true;
                    break;
                }else if(a[1][0].equals("x ")&&a[1][1].equals("x ")&&a[1][2].equals("x ")){
                    bx=true;
                    break;
                }else if(a[0][0].equals("x ")&&a[0][1].equals("x ")&&a[0][2].equals("x ")){
                    bx=true;
                    break;
                }else if(a[0][0].equals("x ")&&a[1][0].equals("x ")&&a[2][0].equals("x ")){
                    bx=true;
                    break;
                }else if(a[0][1].equals("x ")&&a[1][1].equals("x ")&&a[2][1].equals("x ")){
                    bx=true;
                    break;
                }else if(a[0][2].equals("x ")&&a[1][2].equals("x ")&&a[2][2].equals("x ")){
                    bx=true;
                    break;
                }else if(a[0][0].equals("x ")&&a[1][1].equals("x ")&&a[2][2].equals("x ")){
                    bx=true;
                    break;
                }else if(a[2][0].equals("x ")&&a[1][1].equals("x ")&&a[0][2].equals("x ")){
                    bx=true;
                    break;
                }else if(num==9){
                    break;
                }
            }else if(num%2==0){
                if(a[row][col]=="- ") {
                    a[row][col]="o ";
                }
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.print(a[i][j]);
                    }System.out.println();
                }
                num++;
                if(a[2][0].equals("o ")&&a[2][1].equals("o ")&&a[2][2].equals("o ")){
                    bo=true;
                    break;
                }else if(a[1][0].equals("o ")&&a[1][1].equals("o ")&&a[1][2].equals("o ")){
                    bo=true;
                    break;
                }else if(a[0][0].equals("o ")&&a[0][1].equals("o ")&&a[0][2].equals("o ")){
                    bo=true;
                    break;
                }else if(a[0][0].equals("o ")&&a[1][0].equals("o ")&&a[2][0].equals("o ")){
                    bo=true;
                    break;
                }else if(a[0][1].equals("o ")&&a[1][1].equals("o ")&&a[2][1].equals("o ")){
                    bo=true;
                    break;
                }else if(a[0][2].equals("o ")&&a[1][2].equals("o ")&&a[2][2].equals("o ")){
                    bo=true;
                    break;
                }else if(a[0][0].equals("o ")&&a[1][1].equals("o ")&&a[2][2].equals("o ")){
                    bo=true;
                    break;
                }else if(a[2][0].equals("o ")&&a[1][1].equals("o ")&&a[0][2].equals("o ")){
                    bo=true;
                    break;
                }else if(num==9){
                    break;
                }
            }
        }if(bx==true) {
            x++;
            System.out.println("x win "+x);
            System.out.println("o win "+o);
            System.out.println("Draw "+d);
        }else if(bo==true) {
            o++;
            System.out.println("x win "+x);
            System.out.println("o win "+o);
            System.out.println("Draw "+d);
        }else if(num==9) {
            d++;
            System.out.println("x win "+x);
            System.out.println("o win "+o);
            System.out.println("Draw "+d);
        }}

    }
}