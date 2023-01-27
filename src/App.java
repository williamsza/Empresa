import java.io.IOException;

public class App {

    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        limparTela();
        Empregado empregado = new Empregado();
        empregado.getFirstName("Fulano");
        empregado.getFirstName("De Tal");
        empregado.setSalary( 1);
        empregado.calcularSalarioAnunal();
        //empregado.mostrarDaDodos();

        Empregado empregado2 = new Empregado();
        empregado2.getFirstName("Ciclano");
        empregado2.getLastName("De Tal");
        empregado2.setSalary(2);
        empregado2.calcularSalarioAnunal();
       //empregado2.mostrarDaDodos();

        Empregado empregado3 = new Empregado();
        empregado3.getFirstName("Beltrano");
        empregado3.getLastName("De Tal");
        empregado3.setSalary(-3);
        empregado3.calcularSalarioAnunal();
        //empregado3.mostrarDaDodos();

        
    }
}
