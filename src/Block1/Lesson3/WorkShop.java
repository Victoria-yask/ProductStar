package Block1.Lesson3;

public class WorkShop {
    static void main() {
        Friend[] friends = {
                new Friend("Иван", 25, true,2.5f),
                new Friend("Мария", 22, false, 3),
                new Friend("Петр", 30, true, 5)
        };

        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }

    static class Friend{
        private String name;
        private int age;
        private boolean isFriendFromSchool;
        private float hoursSpentTogetherLastWeek;


        public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
            this.name = name;
            this.age = age;
            this.isFriendFromSchool = isFriendFromSchool;
            this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
        }

        @Override
        public String toString() {
            return "Friend{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", isFriendFromSchool=" + isFriendFromSchool +
                    ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek +
                    '}';
        }
    }

}
