import java.util.*;

public class College implements EducationalUnit{
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void addUnit(EducationalUnit unit) {
        units.add(unit);
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails();
        }
    }
}
