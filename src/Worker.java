public class Worker {
    String name;
    double baseSalary;

    Worker(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    void showData()
    {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Samuel", 10000);
        worker.showData();
        System.out.println(" ");
        Manager manager = new Manager("Gustavo", 15000, 2000);
        manager.showData();
    }
}

class Manager extends Worker
{
    double managerBonus;
    Manager(String name, double baseSalary, double managerBonus)
    {
        super(name, baseSalary);
        this.managerBonus = managerBonus;

    }

    @Override
    void showData()
    {
        super.showData();
        System.out.println("Manager Bonus: " + managerBonus);

    }
}