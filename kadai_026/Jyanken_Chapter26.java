//じゃんけんクラス

package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26{
	
	
	public  String getMychoice() {
		
		Scanner scanner = new Scanner(System.in);
	   

//     頭に戻るときはwhile continue
	    
	   while(true) {
		   
		String myHands=scanner.nextLine();
	    
	    if(myHands.equals("r")|| myHands.equals("s") || myHands.equals("p")) {
    	scanner.close();
    	}
	    
     else {
    	 System.out.println("もう一度やりなおしてください");
         continue;
         
     }
	    return myHands;
	  
	   }
		
  
		
	}
	
	 public String getRandom() {
//		 じゃんけんの手生成 
		
//		 math,randomとfloor、配列を作って要素番号を取得  
		 String[]Hands = {"r","s","p"};
		 
		 int i =(int)( Math.round(Math.random()*2));
		 
		 String enemyHands=Hands[i];
		 
		 
		 
		 return enemyHands;
		   
	   }
	 
	 public void playGame() {
		 
		 HashMap<String,String>jyanken = new HashMap<String,String>();
		 jyanken.put("r","グー");
		 jyanken.put("s","チョキ");
		 jyanken.put("p","パー");
		 
//		 getでそれぞれの結果を出力、比較、出力
		 String myResault = getMychoice();
		 String enemyResault = getRandom();
		 
//      画面に出力
		 System.out.println("自分の手は"+jyanken.get(myResault)+",対戦相手の手は"+jyanken.get(enemyResault));
	
//		 比較
		 if(myResault.equals(enemyResault)) {
			 System.out.println("あいこです");
		 }else if(myResault.equals("r") && enemyResault.equals("s")) {
			 System.out.println("自分の勝ちです");
		 }else if(myResault.equals("s") && enemyResault.equals("p")) {
			 System.out.println("自分の勝ちです");
		 }else if(myResault.equals("p") && enemyResault.equals("r")) {
			 System.out.println("自分の勝ちです");
		 }else if(myResault.equals("r") && enemyResault.equals("p")) {
			 System.out.println("自分の負けです");
		 }else if(myResault.equals("s") && enemyResault.equals("r")) {
			 System.out.println("自分の負けです");
		 }else if(myResault.equals("p") && enemyResault.equals("s")) {
			 System.out.println("自分の負けです");
		 }
	 }
}

	


