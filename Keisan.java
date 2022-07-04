public class Main {
    static double the_number_of_questions_n;
    static double right;
    static String name;
	public static void main(String[] args) {
		sub();
	}
	public static void sub(){
	    System.out.println("Welcome to math world!!");
		System.out.println("何法をしますか？やめる場合は「キャンセル」と入力してください");
		String Operation_symbol = new java.util.Scanner(System.in).nextLine();
		while(!(Operation_symbol.equals("加法")||Operation_symbol.equals("減法")||
		      Operation_symbol.equals("乗法")||Operation_symbol.equals("除法"))){
		          if(Operation_symbol.equals("キャンセル")){
		              sub();
		          }else{
		          System.out.println("条件に合いませんでした。もう一度入力してください");
		          Operation_symbol = new java.util.Scanner(System.in).nextLine();
		      }
		      }
		System.out.println("何項の計算をしますか？やめる場合は「キャンセル」と入力してください※最大５");
		String Number_of_terms = new java.util.Scanner(System.in).nextLine();
        if(Number_of_terms.equals("キャンセル")){
            sub();
        }
           
        int terms = confirmation_Number_of_terms(Number_of_terms);
        System.out.println("最大値はいくつにしますか？やめる場合は「キャンセル」と入力してください");
		String _max_ = new java.util.Scanner(System.in).nextLine();
        if(_max_.equals("キャンセル")){
            sub();
        }
        int max = confirmation_max(_max_);
        System.out.println("分かりました！次の式の答えを入力してください※整数までで割り切れない場合は分数で答えてください※やめる場合はstopと入力してください");
        befor_question(Operation_symbol,terms,max);
    }
    public static int confirmation_Number_of_terms(String confirmation){
        boolean result = false;
        int terms = 0;
      while(!(result)){
            try{
                terms = Integer.parseInt(confirmation);
            }catch(Exception e){
                System.out.println("条件に合いませんでした。もう一度入力してください");
                String Number_of_terms = new java.util.Scanner(System.in).nextLine();
                confirmation_Number_of_terms(Number_of_terms);
            }
            if(!(terms < 6 && terms > 1)){
                System.out.println("条件に合いませんでした。もう一度入力してください");
                String Number_of_terms = new java.util.Scanner(System.in).nextLine();
                confirmation_Number_of_terms(Number_of_terms);
            }
            result = true;
        }
        return terms;
    }    
    public static int confirmation_max(String confirmation){
        boolean result = false;
        int max = 0;
      while(!(result)){
            try{
                max = Integer.parseInt(confirmation);
            }catch(Exception e){
                System.out.println("条件に合いませんでした。もう一度入力してください");
                String Number_of_terms = new java.util.Scanner(System.in).nextLine();
                confirmation_Number_of_terms(Number_of_terms);
            }
            
            result = true;
        }
        return max;
    }
    public static void befor_question(String symbol,int terms,int max){
        
        while(true){
            int[] number = number(terms,max);
            befor_question(number,symbol);
        }
        
    }
    public static int[] number(int terms,int max){
        int[] n = new int [terms];
        for(int i = 0; i < terms; i++){
            
            n[i] = new java.util.Random().nextInt(max)+1; 
        }
        return n;
    }
    public static void befor_question(int[] number,String symbol){
        if(symbol.equals("加法")){
            Addition(number);
        }else if(symbol.equals("減法")){
            Subtraction(number);
        }else if(symbol.equals("乗法")){
            multiplicative(number);
        }else if(symbol.equals("除法")){
            division(number);
        }else{
            System.out.println("すみません。エラーが発生しました。ホーム画面に戻ります");
            sub();
        }
    }
    public static void Addition(int[] number){
        int a;
        if(number.length == 2){
            System.out.println(number[0] + "+" + number[1]);
            a = number[0] + number[1];
            question(a);
        }else if(number.length == 3){
            System.out.println(number[0] + "+" + number[1] + "+" + number[2]);
            a = number[0] + number[1] + number[2];
            question(a);
        }else if(number.length == 4){
            System.out.println(number[0] + "+" + number[1] + "+" + number[2] + "+" + number[3]);
            a = number[0] + number[1] + number[2] + number[3];
            question(a);
        }else if(number.length == 5){
            System.out.println(number[0] + "+" + number[1] + "+" + number[2] + "+" + number[3] + "+" + number[4]);
            a = number[0] + number[1] + number[2] + number[3] + number[4];
            question(a);
        }else{
            System.out.println("すみません。エラーが発生しました。ホーム画面に戻ります");
            sub();
        }
    }
    public static void Subtraction(int[] number){
        int a;
        if(number.length == 2){
            System.out.println(number[0] + "-" + number[1]);
            a = number[0] - number[1];
            question(a);
        }else if(number.length == 3){
            System.out.println(number[0] + "-" + number[1] + "-" + number[2]);
            a = number[0] - number[1] - number[2];
            question(a);
        }else if(number.length == 4){
            System.out.println(number[0] + "-" + number[1] + "-" + number[2] + "-" + number[3]);
            a = number[0] - number[1] - number[2] - number[3];
            question(a);
        }else if(number.length == 5){
            System.out.println(number[0] + "-" + number[1] + "-" + number[2] + "-" + number[3] + "-" + number[4]);
            a = number[0] - number[1] - number[2] - number[3] - number[4];
            question(a);
        }else{
            System.out.println("すみません。エラーが発生しました。ホーム画面に戻ります");
            sub();
        }
    }
    public static void multiplicative(int[] number){
        int a;
        if(number.length == 2){
            System.out.println(number[0] + "×" + number[1]);
            a = number[0] * number[1];
            question(a);
        }else if(number.length == 3){
            System.out.println(number[0] + "×" + number[1] + "×" + number[2]);
            a = number[0] * number[1] * number[2];
            question(a);
        }else if(number.length == 4){
            System.out.println(number[0] + "×" + number[1] + "×" + number[2] + "×" + number[3]);
            a = number[0] * number[1] * number[2] * number[3];
            question(a);
        }else if(number.length == 5){
            System.out.println(number[0] + "×" + number[1] + "×" + number[2] + "×" + number[3] + "×" + number[4]);
            a = number[0] * number[1] * number[2] * number[3] * number[4];
            question(a);
        }else{
            System.out.println("すみません。エラーが発生しました。ホーム画面に戻ります");
            sub();
        }
    }
    public static void division(int[] number){
        int a;
        String b;
        if(number.length == 2){
            System.out.println(number[0] + "÷" + number[1]);
            if(!(number[0] % number[1] == 0)){
                b = number[0] + "/" + number[1];
                question(b);
            }
            a = number[0] / number[1];
            question(a);
        }else if(number.length == 3){
            System.out.println(number[0] + "÷" + number[1] + "÷" + number[2]);
            if(!(number[0] % number[1] % number[2] == 0)){
                b = number[0] + "/" + number[1] + "/" + number[2];
                question(b);
            }
            a = number[0] / number[1] / number[2];
            question(a);
        }else if(number.length == 4){
            System.out.println(number[0] + "÷" + number[1] + "÷" + number[2] + "÷" + number[3]);
            if(!(number[0] % number[1] % number[2] % number[3] == 0)){
                b = number[0] + "/" + number[1] + "/" + number[2] + "/" + number[3];
                question(b);
            }
            a = number[0] / number[1] / number[2] / number[3];
            question(a);
        }else if(number.length == 5){
            System.out.println(number[0] + "÷" + number[1] + "÷" + number[2] + "÷" + number[3] + "÷" + number[4]);
            if(!(number[0] % number[1] % number[2] % number[3] % number[4] == 0)){
                b = number[0] + "/" + number[1] + "/" + number[2] + "/" + number[3] + "/" + number[4];
                question(b);
            }
            a = number[0] / number[1] / number[2] / number[3] / number[4];
            question(a);
        }else{
            System.out.println("すみません。エラーが発生しました。ホーム画面に戻ります");
            sub();
        }
    }
    public static void question(int a){
        String c_a = String.valueOf(a);
        String p_a = new java.util.Scanner(System.in).nextLine();
        if(p_a.equals("stop")){
            last();
           
        }
        the_number_of_questions_n++;
        if(p_a.equals(c_a)){
            System.out.println("正解！！");
        right++;
        }else{
           System.out.println("残念！！不正解・・・");
           System.out.println("答えは"+ c_a +"！でした！");
       }
    }
    public static void question(String b){
          
            String p_a = new java.util.Scanner(System.in).nextLine();
            if(p_a.equals("stop")){
            last();
           
            }
        
            the_number_of_questions_n++;
            if(p_a.equals(b)){
                System.out.println("正解！！");
                right++;
            }else{
                System.out.println("残念！！不正解・・・");
                System.out.println("答えは"+ b +"！でした！");
            }
    }
        public static void last(){
        System.out.println("あなたの結果は・・・！");
        double p = right / the_number_of_questions_n * 100;
        System.out.println(right + "/" + the_number_of_questions_n + "(" + p + "%)");
        System.out.println("でした！！");
        sub();
        }
       

    
}
 
                		      