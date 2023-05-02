public class Macchina extends Thread {
    private String nome;
    private Parcheggio parcheggio;

    Macchina(String nome,Parcheggio s){
        super(nome);
        this.parcheggio = s;
    }
   public String getNome() {
       return nome;
   }
   @Override
   public void run(){

    long tempo = (int) (Math.random() * 5000) + 1;
    
    parcheggio.parcheggiaAuto();
    
    try{
        Thread.sleep(tempo);

    }catch(InterruptedException e) {
    }
    parcheggio.esciParcheggio();
   }

}