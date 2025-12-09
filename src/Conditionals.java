public class Conditionals {

    String question;

    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    }

    public Conditionals() {
        question = "Should I get a haircut";
        System.out.println(question);
        int randomInt = (int) (Math.random() * 11);

        if (randomInt <= 2) {
            System.out.println("very doubtful");
        }
        else if (randomInt == 3) {
            System.out.println("Highly Unlikely");
        }
        else if (randomInt == 4) {
            System.out.println("Absolutely Not");
        }
        else if (randomInt == 5){
            System.out.println("Maybe");
        }
        else if (randomInt == 6){
            System.out.println("Probable");
        }
        else if (randomInt == 7){
            System.out.println("Theres a high chance");
        }
        else if (randomInt == 8){
            System.out.println("Don't count on it");
        }
        else if (randomInt == 9){
            System.out.println("Ask again later");
        }
        else if (randomInt == 10){
            System.out.println("Don't count on it");
        }

        }
    }
