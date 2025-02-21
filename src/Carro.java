import javax.swing.*;

public class Carro {
    // Variáveis
    // Vamos trabalhar com tipos de dados primitivos(letra minúscula) int, float
    public int ano;
    public float velocidade;
    // Tipo de dado é uma classe(letra maiúscula) String
    public String marca, modelo;

    // Metódo construtores
    // Sem parâmetro

    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metódos
    public void exibirDetalhes(){
        //this representa o objeto que se chama "Metodo"
        JOptionPane.showMessageDialog(null,"Marca: " + this.marca + " ; Modelo: " + this.modelo + " ; Ano: " + this.ano + " ; Velocidade: " + this.velocidade);
    }
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }
    public void frear(float x){
        if(this.velocidade >= 0) {
            this.velocidade -= x;
        }
        else{
            System.out.println("Frenagem não ocorreu");
        }
    }

}
