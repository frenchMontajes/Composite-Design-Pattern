public class UniversityClient {
    public static void main(String[] args) {

        Teacher csTeacher = new Teacher("Prof. Jackie", "Software Engineering", 60000);
        Teacher emcTeacher = new Teacher("Prof. Lolong", "Introduction to Programming", 50000);

        Student csStudent1 = new Student("Cuenca", "23-72561-221", 34000);
        Student csStudent2 = new Student("Cyrus", "23-16543-881", 34000);

        Student emcStudent1 = new Student("Paul", "23-56362-231", 35000);
        Student emcStudent2 = new Student("Lalay", "22-78431-234", 35000);

        Department cs = new Department("Department of Computer Science");
        cs.addUnit(csTeacher);
        cs.addUnit(csStudent1);
        cs.addUnit(csStudent2);

        Department emc = new Department("Department of Information Technology");
        emc.addUnit(emcTeacher);
        emc.addUnit(emcStudent1);
        emc.addUnit(emcStudent2);

        College cics = new College("College of Informatics and Computing Studies");
        cics.addUnit(cs);
        cics.addUnit(emc);

        cics.displayDetails();
        System.out.println("\nTotal number of students: " + cics.getNumberOfStudents());
        System.out.println("Total budget: ₱ " + cics.getBudget());
    }
}
