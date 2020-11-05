
package var_cerra;

import javax.swing.JTextArea;

public class Hilo extends Thread{
    private JTextArea area;
    private Rcompartido rc;
    private final static int ini=195;
    private final static int fin=200;
    private boolean dead = false;
    
    Hilo(JTextArea area,Rcompartido rc){
        this.area=area;
        this.rc=rc;
       
    }
    
    public void run(){
         while(true){
                     try{
                        if(!rc.isCerradura()){
                            rc.setCerradura(true);
                            rc.setDatoCompartido(this.getName());
                            area.append(rc.getDatoCompartido() + "\n");
                            if(isDead()){
                                stop();
                            }
                            rc.setCerradura(false);
                        }else{
                            area.append("Esperando...\n");
                        }
                        Thread.sleep((int)(ini + Math.random() * fin));
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
    }
    
    public boolean isDead() {
        return dead;
    }
    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
