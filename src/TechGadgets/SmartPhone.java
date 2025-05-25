package TechGadgets;

public class SmartPhone extends Produto {
    private String memoria;
    private String camera;
    private String tela;

    public SmartPhone(String nomeProduto, String numeroSerie,
                      String marca, String modelo, double valorCompra,
                      String memoria, String camera, String tela) {
        super(nomeProduto, numeroSerie, marca, modelo, valorCompra);
        this.memoria = memoria;
        this.camera = camera;
        this.tela = tela;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    @Override
    public void cadastrarProduto() {
        super.cadastrarProduto();
        System.out.println(" Memória:");
        memoria = produto.nextLine();
        System.out.println(" Câmera:");
        camera = produto.nextLine();
        System.out.println(" Tela:");
        tela = produto.nextLine();
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println(" Memória:"+memoria);
        System.out.println(" Câmera:"+camera);
        System.out.println(" Tela:"+tela);

    }
}
