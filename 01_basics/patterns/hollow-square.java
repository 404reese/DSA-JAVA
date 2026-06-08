// star will print only when  it is in first row or last row or first column or last column

class Main {
    public static void main(String[] args) {
        int n = 6;
        for (int i=0; i<n;i++){
            
            for (int j=0; j<n; j++){
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            } 
            System.out.println("");
            
        }
        
    }
}