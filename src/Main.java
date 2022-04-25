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
    }
}