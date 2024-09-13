package game;
import java.util.*;
public class xo{
private static char[][] arr=new char[3][3];
private static char Player='O';
static int count=0;
public static void main(String[] args) {
    starting();
    printing();
    while(true){
        gettinginput();
        printing();
        boolean check=iswinning();
        if(check){
            System.out.println(Player + " Wins the game");
            break;
        }
        if(count==9){
            System.out.println("Board is full");
            break;
        }
        changeplayer();

    }
}
public static void starting(){
 for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        arr[i][j]='.';
    }
 }
}
 public static void printing(){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
     }
 }
 public static void gettinginput(){
    System.out.println("Enter value");
    Scanner sc=new Scanner(System.in);
    int row,col;
    while(true){
     row=sc.nextInt();
     col=sc.nextInt();
    if((row>=0 && row<3) &&(col>=0 && col<3)&& (arr[row][col] =='.') ){
        arr[row][col]= Player;
        count++;
        break;
    }
    else{
     System.out.println("Check input");
    }
}
    
 }
public static boolean iswinning(){
    if(isrow()||iscol()||isdia()){
        return true;
    }
    return false;
}
public static boolean isrow(){
    for(int i=0;i<3;i++){
        if(arr[i][0]== Player && arr[i][1] == Player && arr[i][2]== Player){
            return true;
        }
    }
    return false;
}
public static boolean iscol(){
    for(int j=0;j<3;j++){
        if(arr[0][j]== Player && arr[1][j] == Player && arr[2][j]== Player){
            return true;
        }
    }
    return false;
}
public static boolean isdia(){
    for(int j=0;j<3;j++){
        if((arr[0][0]== Player && arr[1][1] == Player && arr[2][2]== Player)||(arr[2][0]== Player && arr[1][1] == Player && arr[0][2]== Player)){
            return true;
        }
    }
    return false;
}
public static void changeplayer(){
    if(Player=='X'){
        Player='O';
    }
    else{
        Player='X';
    }
}
}