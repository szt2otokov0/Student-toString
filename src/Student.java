public class Student {
    private final int id;
    private final String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(int[] grades){
        int avg = 0;
        for (int grade : grades) {
            avg += grade;
        }
        avg /= grades.length;
        cgpa = avg;
    }

    public String toString(){
        return "Student: id:" + id + ", name:" + name + ", cgpa:" + cgpa;
    }
}
