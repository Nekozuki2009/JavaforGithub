public class Main {
	public static void main(String[] args) {
		
        System.out.println(2);
        sub(2);
        
	}
    public static void sub(long a){

        for(long i = 1;i <= a;i++){
            if(a == i){
                System.out.println(a);
                a++;
                i = 1;
            }else if(a % i == 0){
                a++;
                i = 1;
            }else if(!(a % i == 0)){
            }
            
        }
    }
}