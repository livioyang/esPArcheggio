import java.util.ArrayList;




public class Parcheggio {

    ArrayList<Boolean> parcheggiOccupato = new ArrayList<>(4);
    int tWait = 0;
    
    

    public boolean isOccupata(int x) {
        return parcheggiOccupato.get(x);
    }

    public boolean isAllOccupata() {
        if(isOccupata(0)&&isOccupata(1)&&isOccupata(2)&&isOccupata(3)) return true;
        return false;
    }
    public synchronized void parcheggiaAuto(){
       
        String name = Thread.currentThread().getName();
        
        try {
            while(isAllOccupata()||tWait==10){
                tWait++;
                wait();
            } 
            tWait=0;    
            System.out.println(name + " ENTRA nel parcheggio...");
            for(boolean p : parcheggiOccupato){
                if(!p){ p=true; return;}
            }
        } catch (Exception e) {
            
        }
    }

    public synchronized void esciParcheggio(){
        for(boolean p : parcheggiOccupato) if(p){ p=false; return;}
        String name = Thread.currentThread().getName();
        System.out.println(name + " ESCE dal parcheggio.");
        notifyAll();
    }


}
