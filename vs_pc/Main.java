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
        int a = 0;
        String p_Instructions = "q";
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
                e.hp = e.hp + 5 - hp;
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
	    
	    if(e.hp <= 0){
	        System.out.println("敵は倒れた！！！");
	        System.out.println("ゲームクリア！！");
	        last();
	    }
	    if(p.hp <= 0){
	        System.out.println(p.name + "は倒れた・・・");
	        last();
	    }
	    System.out.println(p.name + "のhpは " + p.hp);
	    System.out.println("現在敵のhpは " + e.hp);
        
	    System.out.println("現在は" + turn + "ターン目");
	    p.de = false;
        e.de = false;
        if(e_sleepturn == 5 || e_sleepturn == 0){
            if(e_sleepturn == 5){
                System.out.println("敵は目を覚ました");
                e.sleep = false;
                e_sleepturn = 0;
            }
            int b = new java.util.Random().nextInt(2)+1;
		    if(b == 1){
		        a = e.Instructions();
		    }
        }
        
        if(p_sleepturn == 5 || p_sleepturn == 0){
            if(p_sleepturn == 5){
                System.out.println(p.name + "は目を覚ました");
                p_sleepturn = 0;
                p.sleep = false;
            }
            System.out.println(p.name + "はどうする？");
            p_Instructions = new java.util.Scanner(System.in).nextLine();
        }else{
            System.out.println(p.name + "は寝ている・・・");
        }
        
        if(a == 8||a == 12||a == 11){
            e.de();
        }
        if(p_sleepturn == 5 || p_sleepturn == 0){
            p_Instructions(p_Instructions);
        }
	    
        if(a == 1||a == 2||a == 3||a == 7||a == 9||a == 10){
            e.attack(p);
        }else if(a == 4){
            e.sit();
        }else if(a == 5){
            e.down();
        }else if(a == 6){
            e.sleep();
        
        
        }
		 turn++;  
    }
	}

	
    public static void p_Instructions(String p_Instructions){
        
            if(p_Instructions.equals("st")){
                last();
            }else if(p_Instructions.equals("a")){
                p.attack(e);
            }else if(p_Instructions.equals("si")){
                p.sit();
            }else if(p_Instructions.equals("do")){
                p.down();
            }else if(p_Instructions.equals("sl")){
                p.sleep();
            }else if(p_Instructions.equals("sp")){
                p.sp(e,turn);
            }else if(p_Instructions.equals("de")){
                p.de();
            }else{
                System.out.println("条件に合いませんでした。もう一度入力してください");
                
                System.out.println(p.name + "はどうする？");
                p_Instructions = new java.util.Scanner(System.in).nextLine();
                p_Instructions(p_Instructions);
                    
		    }
        
    }
	public static void last(){
	    System.out.println("あなたの結果は・・・");
	    int e_d = 3000 - e.hp;
        int turn_ = turn - 1;
	    System.out.println(e_d + "(1ターンあたり" + e_d / turn_ + ")");
	    System.out.println(p.name + "のhpは" + p.hp);
        System.out.println(turn_ + "ターン");
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
        p.sp = false;
        e.de = false;
        p.de = false;
	    sub();
	}
}
