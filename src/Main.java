public class Main {
    public static void main(String[] args) {
        // Lesson 4 Task 1

        {
            int a = 0;
            while (a < 10) {
                a++;
                System.out.print(a + " ");
            }
            System.out.println();

            int i = 10;
            for (; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Lesson 4 Task 2
        {
            int firstFriday = 1;

            for (; firstFriday <= 31; firstFriday = firstFriday + 7) {

                System.out.println("Сегодня пятница  " + firstFriday + "-е число. Необходимо подготовить отчет.");

            }
        }

        // Lesson 4 Task 3
        int cometVisitUs = 0;
        int today = 2022;
        int returnPeriod = 79;
        int extraYears = 100;
        int pastYears;
        pastYears = today - (extraYears * 2);
        for (; cometVisitUs <= today + extraYears; cometVisitUs = cometVisitUs + returnPeriod) {
            if (cometVisitUs > pastYears) {
                System.out.println(cometVisitUs);
            }
        }

        //Lesson 4 Task 4
        String result;
        for (int x = 1; x < 31; x++) {
            result = (x + ":");
            if (x % 3 == 0)
                result = result + " ping";
            if (x % 5 == 0)
                result = result + " pong";
            System.out.println(result);
        }

        //Lesson 4 Task 5

        int i = 0;
        int j = 1;
        int temp;
        int k;
        System.out.print(i + " ");
        for (k = 0; k < 9; k++) {
            System.out.print(j + " ");
            temp = i ;
            i = j;
            j = temp + j;
        }

    }
}