public class EvenNumber {
    public static void main(String[] args) {
        int number = 4;
        int finalNumber= 20;
        int count = 0;

        while (number <= finalNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even Number " + number);
            if (count == 5){
                break;
            }
        }
        System.out.println("Total even numbers is " + count);
    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
