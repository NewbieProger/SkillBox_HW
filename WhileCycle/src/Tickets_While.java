public class Tickets_While {
    public static void main(String[] args) {

        int i = 200000;
        while (i <= 235000) {
            System.out.println(i);
            i++;
            if (i == 210001) {
                i = 220000;
            }

        }
    }
}

