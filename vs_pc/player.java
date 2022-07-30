package vs_pc;

public class player {
    static String name;
    static int hp;
    static boolean sit = false;
    static boolean down = false;
    static boolean sleep = false;
    public player(){
        this.hp = 100;
    }
    public void attack(enemy e){
        System.out.println(this.name + "の攻撃！！");
        if(this.sleep == true){
            System.out.println("しかし" + this.name + "は寝ていた・・・");
        }else if(this.down == true){
            System.out.println("しかし" + this.name + "は寝転がっていた・・・");
        }else if(this.sit == true){
            System.out.println("しかし" + this.name + "は座っていて攻撃が弱くなった・・・");
            int a = new java.util.Random().nextInt(5)+1;
            if(a == 1 || a == 2 || a == 3){
                int b = new java.util.Random().nextInt(5)+1;
                if(b == 1){
                    System.out.println("しかし敵にはあたらなかった・・・");
                }else{
                    int c = new java.util.Random().nextInt(3)+1;
                    int d = new java.util.Random().nextInt(20)+10;
                    if(c == 1){
                        System.out.println(this.name + "の攻撃は敵の急所に当たった！！");
                        int f = new java.util.Random().nextInt(15)+10;
                        d += f;
                        e.hp -= d / 5;
                        
                    }else{
                        e.hp -= d / 5; 
                    }
                    System.out.println("敵は" + d / 5 + "ダメージ食らった!!");
                }
            }else{
                
                int g = new java.util.Random().nextInt(10)+1;
                System.out.println("しかし" + this.name + "はバランスを崩して倒れて" + g + "ダメージ食らった・・・");
                this.hp -= g;
            }
        }else{
            int a = new java.util.Random().nextInt(5)+1;
            if(a == 1 || a == 2 || a == 3 || a == 4){
                int b = new java.util.Random().nextInt(5)+1;
                if(b == 1){
                    System.out.println("しかし敵にはあたらなかった・・・");
                }else{
                    int c = new java.util.Random().nextInt(3)+1;
                    int d = new java.util.Random().nextInt(20)+10;
                    if(c == 1){
                        System.out.println(this.name + "の攻撃は敵の急所に当たった！！");
                        int f = new java.util.Random().nextInt(15)+10;
                        d += f;
                        e.hp -= d;
                        
                    }else{
                        e.hp -= d; 
                    }
                    System.out.println("敵は" + d + "ダメージ食らった!!");
                }
            }else{
                
                int g = new java.util.Random().nextInt(10)+1;
                System.out.println("しかし" + this.name + "はバランスを崩して倒れて" + g + "ダメージ食らった・・・");
                this.hp -= g;
            }
        }
    }
    public void sit(){
        
        if(this.sit == false){
            System.out.println(this.name + "は座った");
            if(this.sleep == true){
                System.out.println("しかし" + this.name + "は寝ていた・・・");
            }else if(this.down == true){
                System.out.println("しかし" + this.name + "は寝転がっていた・・・");
            }else{
                this.sit = true;
                
            }
        }else{
            System.out.println(this.name + "は立った");
            this.sit = false;
        }
    }
    public void down(){
        if(this.down == false){
            System.out.println(this.name + "は寝転がった");
            if(this.sleep == true){
                System.out.println("しかし" + this.name + "は寝ていた・・・");
            }else if(this.sit == true){
                System.out.println("しかし" + this.name + "は座っていた・・・");
            }else{
                this.down = true;
                
            }
        }else{
            System.out.println(this.name + "は立った");
            this.down = false;
        }
    }
    public void sleep(){
        if(this.sleep == false){
            System.out.println(this.name + "は寝た");
            if(this.down == true){
                System.out.println("しかし" + this.name + "は寝転がっていた");
            }else if(this.sit == true){
                System.out.println("しかし" + this.name + "は座っていた");
            }else{
                this.sleep = true;
                
            }
        }
    }
}
