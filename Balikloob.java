public class Miguel {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        for(int x = 1; x<=num; x++){
            switch(x%2){
                case 1:
                    System.out.println(num + " Is odd number: ");
                    break;
                case 2:
                    System.out.println( num + "Is even number: ");
                    break;
                case 3:
                    System.out.println("Undefine Number: ");
                    break;
            }
            break;
        }
    }
    
}
