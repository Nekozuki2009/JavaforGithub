package vs_pc;
public class Main {
    static int p_hp_max = 250;
    static int e_hp_max = 3000;
    static int turn = 1;
    static int p_sleepturn = 0;
    static int e_sleepturn = 0;
    static player p = new player();
    static enemy e = new enemy();
	public static void main(String[] args) {
	    sub();
		
	}
	public static void sub(){
	 
		System.out.println("welcome to my game!!");
		System.out.println("では最初にゲームの説明をします");
		System.out.println("名前を入力してください");
		p.name = new java.util.Scanner(System.in).nextLine();
		System.out.println("わかりました！！ではゲームスタート！！");
		
		
		game();   
	}
	public static void game(){
	while(true){
        if(p.sit == true){
            System.out.println(p.name + "は5回復した！！");
            
            if(p.hp + 5 > p_hp_max){
                int hp = p.hp + 5 - p_hp_max;
                p.hp = p.hp + 5 - hp;
            }else{
                p.hp += 5;
            }
        }
        if(p.down == true){
            System.out.println(p.name + "10回復した！！");
            if(p.hp + 10 > p_hp_max){
                int hp = p.hp + 10 - p_hp_max;
                p.hp = p.hp + 10 - hp;
            }else{
                p.hp += 10;
            }
        }
        if(p.sleep == true){
            System.out.println(p.name + "は20回復した！！");
            if(p.hp + 20 > p_hp_max){
                p_hp_max = p.hp + 20;
                
            }
            p.hp = p.hp + 20;
            p_sleepturn ++;
        }
        if(e.sit == true){
            System.out.println("敵は5回復した・・・");
            if(e.hp + 5 > e_hp_max){
                int hp = e.hp + 5 - e_hp_max;
                e.hp = p.hp + 5 - hp;
            }else{
                e.hp += 5;
            }
        }
        if(e.down == true){
            System.out.println("敵は10回復した・・・");
            if(e.hp + 10 > e_hp_max){
                int hp = e.hp + 10 - e_hp_max;
                e.hp = e.hp + 10 - hp;
            }else{
                e.hp += 10;
            }
        }
        if(e.sleep == true){
            System.out.println("敵は20回復した・・・");
            if(e.hp + 20 > e_hp_max){
                e_hp_max = e.hp + 20; 
            }
            e.hp += 20;
            e_sleepturn ++;
        }
	    if(p.hp <= 0){
	        System.out.println(p.name + "は倒れた・・・");
	        last();
	    }
	    if(e.hp <= 0){
	        System.out.println("敵は倒れた！！！");
	        System.out.println("ゲームクリア！！");
	        last();
	    }
	    System.out.println(p.name + "のhpは " + p.hp);
	    System.out.println("現在敵のhpは " + e.hp);
	    System.out.println("現在は" + turn + "ターン目");
	    p_Instructions();
        if(e_sleepturn == 5 || e_sleepturn == 0){
            if(e_sleepturn == 5){
                System.out.println("敵は目を覚ました");
                e.sleep = false;
                e_sleepturn = 0;
            }
            int a = new java.util.Random().nextInt(2)+1;
		    if(a == 1){
		            e.Instructions(p);
		    }
        }
		 turn++;   
	}
	}
    public static void p_Instructions(){
        if(p_sleepturn == 5 || p_sleepturn == 0){
            if(p_sleepturn == 5){
                System.out.println(p.name + "は目を覚ました");
                p_sleepturn = 0;
                p.sleep = false;
            }
            String p_Instructions = new java.util.Scanner(System.in).nextLine();
            if(p_Instructions.equals("stop")){
                last();
            }else if(p_Instructions.equals("a")){
            p.attack(e);
            }else if(p_Instructions.equals("si")){
                p.sit();
            }else if(p_Instructions.equals("d")){
                p.down();
            }else if(p_Instructions.equals("sl")){
                p.sleep();
            }else{
                System.out.println("条件に合いませんでした。もう一度入力してください");
                p_Instructions();
                    
		    }
        }else{
            System.out.println(p.name + "は寝ている・・・");
        }
    }
	public static void last(){
	    System.out.println("あなたの結果は・・・");
	    int e_d = 3000 - e.hp;
	    System.out.println(e_d + "(1ターンあたり" + e_d / turn + ")");
	    System.out.println(p.name + "のhpは" + p.hp);
	    System.out.println("でした！！");
	    turn = 1;
        p_sleepturn = 0;
        e_sleepturn = 0;
	    p.hp = 250;
	    e.hp = 3000;
	    p.sit = false;
        p.down = false;
        p.sleep = false;
        e.sit = false;
        e.down = false;
        e.sleep = false;
        p_hp_max = 250;
        e_hp_max = 3000;
	    sub();
	}
}
