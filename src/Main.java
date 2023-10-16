public class Main {
    public static void main(String[] args) {
        Student test = new Student(0,"test person",.1);
        int[] grades = new int[] {5,5,5,5,5,4};
        test.setCgpa(grades);
        System.out.println(test);
    }
}