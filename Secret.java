import java.util.Scanner;

class Secret{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = " ";

        System.out.println("Tell Me Your Secret");
        answer = sc.nextLine();
        if("dragon".equals(answer)){
            System.out.println("Ayyyy That's Pretty Good");       
        }else{
            System.out.println("Nooooooooooo");
        }

    }
}

