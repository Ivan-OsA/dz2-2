public class Main {

    public static void main(String[] args) {

        int check = 200;
        int transfer = 1500;
        if (transfer > 1000) {

            System.out.println(transfer / 100 + transfer + check);
            System.out.println("Количество бонучных рублей " + transfer / 100);
        } else {
            System.out.println(transfer + check);
        }


    }

}
