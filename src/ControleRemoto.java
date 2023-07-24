public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("--------MENU--------");
        System.out.println("está ligado? " + this.getLigado());
        System.out.println("está tocando? " + this.getTocando());
        System.out.println("em qual volume está? " + this.getVolume());
        for (int i= 0; i <= this.getVolume(); i+= 10) {
            System.out.print("|");
        }

    }
    @Override
    public void fecharMenu() {
        System.out.println("fechando Menu...");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 10);
        }
        else {
            System.out.println("impossível realizar ação");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() - 10);
        }
        else  {
            System.out.println("impossível realizar ação");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("O volume já está no 0.");
            
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if(this.getLigado() && this.getTocando() == false) {
        this.setTocando(true);
        } else {
            System.out.println("já está tocando.");
        }
    }
    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando() == true) {
        this.setTocando(false);
        } else {
            System.out.println("já está pausado.");
        }
    }
}
