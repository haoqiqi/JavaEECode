import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("hqq", 10.0, 2020, 12, 5);
        staff[1] = new Employee("hww", 20.0, 2019, 10, 22);
        staff[2] = new Employee("hee", 30,  2018, 1, 30);
        for (Employee e:staff
             ) {
            e.raiseSalary(10);
            e.setId();
        }
        for (Employee e:staff
             ) {
            System.out.println("name:" + e.getName() +
                    ", salary:" + e.getSalary() +
                    "$, hireDay:" + e.getHireDay() +
                    "ID:" + e.getId());
        }

        System.out.println("==============");
        swap(staff[0], staff[1]);
        for (Employee e:staff
        ) {
            System.out.println("name:" + e.getName() +
                    ", salary:" + e.getSalary() +
                    "$, hireDay:" + e.getHireDay() +
                    "ID:" + e.getId());
        }
    }


    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("name:" + x.getName() +
                ", salary:" + x.getSalary() +
                "$, hireDay:" + x.getHireDay() +
                "ID:" + x.getId());
        System.out.println("name:" + y.getName() +
                ", salary:" + y.getSalary() +
                "$, hireDay:" + y.getHireDay() +
                "ID:" + y.getId());
    }
}



class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    LocalDate getHireDay() {
        return hireDay;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public void raiseSalary(double byPrecent) {
        double raise = salary * byPrecent / 100;
        salary += raise;
    }
}
