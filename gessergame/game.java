package gessergame;
import java.util.*;

class gess{
	int gessnum;
	
	 public int gesserName(){
		//System.out.println("The gess the number ");
		Scanner scan = new Scanner(System.in);
		System.out.println("The gess the number ");
		gessnum = scan.nextInt();
		return gessnum;
		
	}
}

class  play{
	
	int gessnum;
	int player() {
	Scanner scan = new Scanner(System.in);
	System.out.println("player is kindly geuss the number");
	gessnum = scan.nextInt();
	return gessnum;
	}
}

class umpier{
	int  numFormGessuer ;
	int playernum1 ;
	int playernum2;
	int playernum3 ;
	//int playernum4;
	void colletnumberforgesser(){
	    	gess b = new gess();
	        numFormGessuer = b.gesserName();
	}
	
    void  colletnumberFormplayer(){
		play num1 = new play();
		play num2 = new play();
		play num3 = new play();
		playernum1=num1.player();
		playernum2=num2.player();
		playernum3=num3.player();
	}
    
   void comper(){
	   if(numFormGessuer==playernum1) {
		   if(numFormGessuer==playernum1 && numFormGessuer==playernum2) {
			   System.out.println("The wean of a game is player 1st and 2sed ");
		   }
		   else if(numFormGessuer==playernum1 && numFormGessuer==playernum3) {
			   System.out.println("The wean of a game is 1st and 3th ");
		   }
		   else {
		   System.out.println("The player 1st is weean");
		   }
	   }
	   else if(numFormGessuer==playernum2) {
		   if(numFormGessuer==playernum2&&numFormGessuer==playernum3) {
		     System.out.println("The player 2sed and 3 sed ");
		   }
		   else {
		   System.out.println("The player 2sed is weean");
		   }
   
	   }
	   else if(numFormGessuer==playernum3) {
		   if(numFormGessuer==playernum1&&numFormGessuer==playernum2&&numFormGessuer==playernum3) {
			   System.out.println("The weener is all member !");
		   }
		   else {
		   System.out.println("The player 3th is ween ");
		   }
	   }
	   else {
		   System.out.println("The number not gess! , loss of game ");
	   }
    	
    }
}

public class game {

	public static void main(String[] args) {
	System.out.println("start the game! ");
	  umpier n = new umpier();
	  n.colletnumberforgesser();
	  n.colletnumberFormplayer();
	  n.comper();

	}

}
