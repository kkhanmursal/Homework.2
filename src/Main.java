import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int age = generateRandomAge();
        System.out.println("Generated random number: "+ age);
    System.out.println(permission(10, 15));
    System.out.println(permission(generateRandomAge(), 35));
    System.out.println(permission(generateRandomAge(), -2));
    System.out.println(permission(generateRandomAge(), -45));
    System.out.println(permission(generateRandomAge(), 50));


    }
    public static String permission(int age, double temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        }
        else if (age < 20 && temperature > 0 && temperature <28) {
            return "Можно идти гулять";
        }
        else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }
        }
        public static int generateRandomAge(){
            Random random = new Random();
            int randomAge = random.nextInt(100) + 1;
            return randomAge;


        }
    }

