// 1 to n all prime number 

class Main {
    public static void main(String[] args) {
         int n = 100;
        for(int i=2;i<=n;i++) {
            boolean isPrime=true;
            for (int j=2;j<=i/2;j++){
                if (i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            
        }
    }
}