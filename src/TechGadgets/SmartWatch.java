package TechGadgets;

public class SmartWatch extends Produto {
        private String gps;
        private String bpm;
        private String fusohorario;

        public SmartWatch(String gps, String bpm, String fusohorario) {
            this.gps = gps;
            this.bpm = bpm;
            this.fusohorario = fusohorario;
        }

        public String getGps() {
            return gps;
        }

        public void setGps(String gps) {
            this.gps = gps;
        }

        public String getBpm() {
            return bpm;
        }

        public void setBpm(String bpm) {
            this.bpm = bpm;
        }

        public String getFusohorario() {
            return fusohorario;
        }

        public void setFusohorario(String fusohorario) {
            this.fusohorario = fusohorario;
        }

        @Override
        public void cadastrarProduto() {
            super.cadastrarProduto();
            System.out.println("Gps:");
            gps = produto.nextLine();
            System.out.println("Bmp:");
            bpm = produto.nextLine();
            System.out.println("Fuso horário:");
            fusohorario = produto.nextLine();
        }

        @Override
        public void exibirProduto() {
            super.exibirProduto();
            System.out.println("Gps:"+gps);
            System.out.println("Bmp:"+bpm);
            System.out.println("Fuso horário:"+fusohorario);
        }
    }


