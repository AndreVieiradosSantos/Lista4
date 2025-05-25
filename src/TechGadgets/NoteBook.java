package TechGadgets;

public class NoteBook extends Produto {
    private String sistemaOp;
    private String processador;
    private String hd;

    public NoteBook(String sistemaOp, String processador, String hd) {
        this.sistemaOp = sistemaOp;
        this.processador = processador;
        this.hd = hd;
    }

    public String getSistemaOp() {
        return sistemaOp;
    }

    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    @Override
    public void cadastrarProduto() {
        super.cadastrarProduto();
        System.out.println("Sistema Operacional:");
        sistemaOp = produto.nextLine();
        System.out.println("Processador:");
        processador = produto.nextLine();
        System.out.println("HD");
        hd = produto.nextLine();
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Sistema Operacional:"+sistemaOp);
        System.out.println("Processador:"+processador);
        System.out.println("HD:"+hd);
    }
}
