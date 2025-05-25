package TechGadgets;

import java.util.Scanner;

public class Produto {
    private String nomeProduto;
    private String numeroSerie;
    private String marca;
    private String modelo;
    private double valorCompra;

    public Produto(String nomeProduto, String numeroSerie, String marca, String modelo, double valorCompra) {
        this.nomeProduto = nomeProduto;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.valorCompra = valorCompra;
    }

    public Produto() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    Scanner produto = new Scanner(System.in);
    public void cadastrarProduto(){
        System.out.println(" Digite o nome do produto:");
        nomeProduto = produto.nextLine();
        System.out.println(" Número de série:");
        numeroSerie = produto.nextLine();
        System.out.println(" Marca:");
        marca = produto.nextLine();
        System.out.println(" Modelo:");
        modelo = produto.nextLine();
        System.out.println(" Valor de compra:");
        valorCompra = produto.nextDouble();
        produto.nextLine();
    }
    public void exibirProduto(){
        System.out.println(" Digite o nome do produto:"+nomeProduto);
        System.out.println(" Número de série:"+numeroSerie);
        System.out.println(" Marca:"+marca);
        System.out.println(" Modelo:"+modelo);
        System.out.println(" Valor de compra:"+valorCompra);
    }
}
