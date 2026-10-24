
class Solution {
    private int getDay(String date) {
        int[] days = {
            0, 31, 28, 31, 30, 31,
            30, 31, 31, 30, 31, 30, 31
        };

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        for (int i = 1; i < month; i++) {
            day += days[i];
        }

        return day;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int aliceStart = getDay(arriveAlice);
        int aliceEnd = getDay(leaveAlice);
        int bobStart = getDay(arriveBob);
        int bobEnd = getDay(leaveBob);

        int count = 0;

       
        for (int day = 1; day <= 365; day++) {
            if (day >= aliceStart && day <= aliceEnd &&
                day >= bobStart && day <= bobEnd) {
                count++;
            }
        }

        return count;
    }
}
