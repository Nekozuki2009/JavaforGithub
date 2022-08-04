package vs_pc;
public class enemy {
    static int hp;
    static boolean sit = false;
    static boolean down = false;
    static boolean sleep = false;
    static boolean de = false;
    public enemy(){
        this.hp = 3000;
    }
    public void Instructions(player p){
        int a = new java.util.Random().nextInt(8)+1;
        if(a == 1||a == 2||a == 3||a == 7){
            attack(p);
        }else if(a == 4){
            sit();
        }else if(a == 5){
            down();
        }else if(a == 6){
            sleep();
        }else if(a == 8){
            de();
        }else{
            Instructions(p);
        }
    }
    public void attack(player p){
        System.out.println("敵の攻撃！！");
        int h = new java.util.Random().nextInt(2)+1;
        if(this.hp <= 500 && h == 1){
            System.out.println("敵はピンチになって攻撃力が10倍になった！！！");
            
            
                if(this.sleep == true){
                System.out.println("しかし敵は寝ていた！！");
            }else if(this.down == true){
                System.out.println("しかし敵は寝転がっていた！！");
            }else if(this.sit == true){
                System.out.println("しかし敵は座っていて攻撃が弱くなった！！");
                if(p.de == true){
                
                System.out.println("攻撃の威力が高すぎて" + p.name + "は守り切れなかった・・・");
                }
                int a = new java.util.Random().nextInt(5)+1;
                if(a == 1 || a == 2 || a == 3){
                    int b = new java.util.Random().nextInt(5)+1;
                    if(b == 1){
                        System.out.println("しかし" + p.name + "にはあたらなかった！！");
                    }else{
                        int c = new java.util.Random().nextInt(5)+1;
                        int d = new java.util.Random().nextInt(20)+90;
                        if(c == 1){
                            System.out.println("敵の攻撃は" + p.name + "の急所に当たった・・・");
                            int e = new java.util.Random().nextInt(30)+50;
                            d += e;
                            p.hp -= d * 2;
                            
                        }else{
                            p.hp -= d * 2; 
                        }
                        System.out.println(p.name + "は" + d * 2+ "ダメージ食らった・・・");
                    }
                }else{
                    
                    int f = new java.util.Random().nextInt(10)+10;
                    System.out.println("しかし敵はバランスを崩して倒れて" + f + "ダメージ食らった！！");
                    this.hp -= f;
                }
            }else{
                int a = new java.util.Random().nextInt(5)+1;
                if(a == 1 || a == 2 || a == 3){
                    int b = new java.util.Random().nextInt(5)+1;
                    if(b == 1){
                        System.out.println("しかし" + p.name + "にはあたらなかった！！");
                    }else{
                        int c = new java.util.Random().nextInt(3)+1;
                        int d = new java.util.Random().nextInt(20)+90;
                        if(c == 1){
                            System.out.println("敵の攻撃は" + p.name + "の急所に当たった・・・");
                            int e = new java.util.Random().nextInt(30)+50;
                            d += e;
                            p.hp -= d * 10;
                            
                        }else{
                            p.hp -= d * 10; 
                        }
                        System.out.println(p.name + "は" + d * 10 + "ダメージ食らった・・・");
                    }
                }else{
                    
                    int f = new java.util.Random().nextInt(10)+10;
                    System.out.println("しかし敵はバランスを崩して倒れて" + f + "ダメージ食らった！！");
                    this.hp -= f;
                }
            }
                
        }else{
            if(p.de == true){
                System.out.println("しかし" + p.name + "は守り切った！！");
            }else{
                if(this.sleep == true){
                    System.out.println("しかし敵は寝ていた！！");
                }else if(this.down == true){
                    System.out.println("しかし敵は寝転がっていた！！");
                }else if(this.sit == true){
                    System.out.println("しかし敵は座っていて攻撃が弱くなった！！");
                    int a = new java.util.Random().nextInt(5)+1;
                    if(a == 1 || a == 2 || a == 3){
                        int b = new java.util.Random().nextInt(5)+1;
                        if(b == 1){
                            System.out.println("しかし" + p.name + "にはあたらなかった！！");
                        }else{
                            int c = new java.util.Random().nextInt(5)+1;
                            int d = new java.util.Random().nextInt(20)+90;
                            if(c == 1){
                                System.out.println("敵の攻撃は" + p.name + "の急所に当たった・・・");
                                int e = new java.util.Random().nextInt(30)+50;
                                d += e;
                                p.hp -= d / 5;
                                
                            }else{
                                p.hp -= d / 5; 
                            }
                            System.out.println(p.name + "は" + d / 5 + "ダメージ食らった・・・");
                        }
                    }else{
                        
                        int f = new java.util.Random().nextInt(10)+10;
                        System.out.println("しかし敵はバランスを崩して倒れて" + f + "ダメージ食らった！！");
                        this.hp -= f;
                    }
                }else{
                    int a = new java.util.Random().nextInt(5)+1;
                    if(a == 1 || a == 2 || a == 3){
                        int b = new java.util.Random().nextInt(5)+1;
                        if(b == 1){
                            System.out.println("しかし" + p.name + "にはあたらなかった！！");
                        }else{
                            int c = new java.util.Random().nextInt(3)+1;
                            int d = new java.util.Random().nextInt(20)+90;
                            if(c == 1){
                                System.out.println("敵の攻撃は" + p.name + "の急所に当たった・・・");
                                int e = new java.util.Random().nextInt(30)+50;
                                d += e;
                                p.hp -= d;
                                
                            }else{
                                p.hp -= d; 
                            }
                            System.out.println(p.name + "は" + d + "ダメージ食らった・・・");
                        }
                    }else{
                        
                        int f = new java.util.Random().nextInt(10)+10;
                        System.out.println("しかし敵はバランスを崩して倒れて" + f + "ダメージ食らった！！");
                        this.hp -= f;
                    }
                }
            }
        }
    }
    public void sit(){
        
        if(this.sit == false){
            System.out.println("敵は座った");
            if(this.sleep == true){
                System.out.println("しかし敵は寝ていた");
            }else if(this.down == true){
                System.out.println("しかし敵は寝転がっていた");
            }else{
                this.sit = true;
                
            }
        }else{
            System.out.println("敵は立った");
            this.sit = false;
        }

    }
    public void down(){
        if(this.down == false){
            System.out.println("敵は寝転がった");
            if(this.sleep == true){
                System.out.println("しかし敵は寝ていた");
            }else if(this.sit == true){
                System.out.println("しかし敵は座っていた");
            }else{
                this.down = true;
                
            }
        }else{
            System.out.println("敵は立った");
            this.down = false;
        }
    }
    public void sleep(){
        if(this.sleep == false){
            System.out.println("敵は寝た");
            if(this.down == true){
                System.out.println("しかし敵は寝転がっていた");
            }else if(this.sit == true){
                System.out.println("しかし敵は座っていた");
            }else{
                this.sleep = true;
                
            }
        }
    }
    public void de(){
        int a = new java.util.Random().nextInt(3)+1;
        System.out.println("敵は守りの体制になった・・・");
        if(this.down == true){
            System.out.println("しかし敵は寝転がっていた！！");
        }else if(this.sleep == true){
            System.out.println("しかし敵は寝ていた！！");
        }else if(a == 1){
            System.out.println("しかしうまくいかなかった！！");
        }else{
            this.de = true;
        }
    }
}