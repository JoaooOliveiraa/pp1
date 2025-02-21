//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro obj1 = new Carro();
        obj1.ano = 2024;
        obj1.velocidade = 0.0f;
        obj1.marca = "Fiat";
        obj1.modelo = "Mobi";
        obj1.exibirDetalhes();
        obj1.acelerar(60);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2018, 30.0f, "Volks", "Gol");
        obj2.exibirDetalhes();
        obj2.acelerar(50);
        obj2.exibirDetalhes();
        obj2.frear(25);
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}