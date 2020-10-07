import java.util.Scanner;

class marks{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double score = 0;
        double average = 0;

        System.out.println("what was it out of?");
        total = sc.nextDouble();
        System.out.println("what did you get?");
        score = sc.nextDouble();

        average = (score/total) * 100;

        if(average > 100 || average < 0){
            System.out.println("that's not possible");
        }else if(average >= 86){
            System.out.println("ayyy that's pretty gud, you got" + average + "%" +"which is an A");
        } else if(average >= 73){
            System.out.println("cool, you got" + average + "%" +"which is a B");
        } else if(average >= 67){
            System.out.println("that's okie you got" + average + "%" +"which is a C+");
        } else if(average >= 60){
            System.out.println(" that's not too good, you got" + average + "%" +"which is a C");
        } else if(average >= 50){
            System.out.println("kinda bad you got" + average + "%" +"which is a C-");
        } else if(average >= 0){
            System.out.println("GG boi you got" + average + "%" +"which is an F");

        }
    }   
}
