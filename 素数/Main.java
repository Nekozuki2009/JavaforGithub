public class Main {
	public static void main(String[] args) {
		int a = 2;
        sub(a);
        
	}
    public static void sub(int a){

        for(int i = 2;i <= a;i++){
            if(a % i == 0 || !(a == i)){
                System.out.print(a);
                System.out.print("\n");
                a++;
                //sub(a);
            } if(i == a){
                System.out.print("second");
                System.out.println(a);
                a++;
                //sub(a);
            }
        }
    }
}