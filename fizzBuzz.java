public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input > ");

    String input = scanner.nextLine();

    System.out.println(input);
    scanner.close();
    int num = 0;

    FizzBuzz(num);
}

private String FizzBuzz(int num) {  
    if(num % 3 = 0 && num % 5 = 0){
        return System.out.println("fizzbuzz");
    }

    if(num % 3 = 0){
        return System.out.println("fizz");
    }

    if(num % 5 = 0){
        return System.out.println("buzz");
    }
}