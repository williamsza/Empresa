import java.io.PrintStream;

public class Empregado {

    private String firstName;
    private String lastName;
    private double salary;

    Empregado() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    public double calcularSalarioAnunal() {

        if (salary < 0) {
            System.out.printf("Salario não pode ser negativo. Salário anual: %s. \n",
                    this.salary = 0);
        } else {

            this.salary = salary * 12;
            System.out.printf("O %s Salário anual: %s\n",
                    this.firstName + this.lastName, this.salary);

            // System.out.printf(firstName, null)("Salário anual:\n",
            // getFirstName(),getLastName() , getSalary());

        }

        return this.salary;

    }

    public String getFirstName(String string) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String string) {
        return lastName;
    }

    public void setLastName(String lastName) {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getFirstName() {
    }

    public void getLastName() {
    }

}
