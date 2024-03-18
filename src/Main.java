public class Main {
    public static class Student {

        protected final String studying;
        protected final String studying1;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }
    //a
    public static class LazyStudent extends Student{
        public LazyStudent() {


        }

        @ Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
            }
    }

    public static class JavaStudent extends Student {
        public  JavaStudent (){

            super("sa");
        }
    }
    public static void main(String[] args) {
        Student a = new LazyStudent();
        a.study();
        System.out.println();
    }
}