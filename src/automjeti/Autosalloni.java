package automjeti;

public class Autosalloni {
    private int index = 0;
    private String emri;
    private Automjeti [] automjetet;
    
    public Autosalloni(String e, int size){
        emri = e;
        automjetet = new Automjeti[size];
    }
    
    private class Minibusi extends Automjeti{
        private int nrDyerve;
        public Minibusi(int nS, String p, int vP, int nD){
            super(nS, p, vP);
            nrDyerve = nD;
        }
        public boolean eshteAutomatik(){
            return true;
        }
        
        public String toString(){
            return super.toString() + " : " + nrDyerve;
        }
    }
    static class Coupe extends Automjeti{
        private int nrUlseve;
        public Coupe(int nS, String p, int vP, int nrU){
            super(nS, p, vP);
            nrUlseve = nrU;
        }
        public boolean eshteAutomatik(){
            return false;
        }
        public int getNrUlseve(){
            return nrUlseve;
        }
        
        public String toString(){
            return super.toString() + " - me " + nrUlseve + " ulese";
        }
    }
    
    public boolean ekziston(Automjeti a){
        for(int i = 0; i < index; i++){
            if(automjetet[i].equals(a))
                return true;
        }
        return false;
    }
    
    public void shtoAutomjetin(Automjeti a){
        if(a == null){
            System.out.println("Automjeti i painicializuar!");
            return;
        }
        if(ekziston(a)){
            System.out.println("Automjeti ekziston!");
            return;
        }
        if(index == automjetet.length){
            System.out.println("Ska vend ne varg!");
            return;
        }
        automjetet[index++] = a;
    }
    
    public void shtoNjeAutomjet(int nS, String p, int vP, boolean eshteAutomatik){
        for(int i = 0; i < index; i++){
            if(automjetet[i] instanceof Automjeti){
                Automjeti a = (Automjeti)automjetet[i];
                if(a.eshteAutomatik() == true){
                    automjetet[index++] = a;
                }
            }
        }
    }
    private boolean eshteAutomatik(){
        return true;
    }
    
    public void shtoPrototipin(int nS, String p){
        for(int i = 0; i < index; i++){
            Automjeti a = (Automjeti)automjetet[i];
            class PrototipiInner{
                public boolean eshteAutomatik(){
                    return false;
                }
            }
        }
    }
    

    
    public void shtypAutomatik(boolean eshteAutomatik){
        for(int i = 0; i < index; i++){
            Automjeti a = (Automjeti)automjetet[i];
            if(a.eshteAutomatik() == eshteAutomatik){
                System.out.println(a);
            }
        }
    }
    
    public void shtypTeGjithaAutomjetet(){
        for(int i = 0; i < index; i++){
            Automjeti a = (Automjeti) automjetet[i];
            System.out.println(a);
        }
    }
    
    public static void main(String args []){
        Autosalloni a = new Autosalloni("Salloni ABC",50);
        
        a.shtoAutomjetin(new Limuzina(123,"Kina",1999,"Kuqe"));
        a.shtoAutomjetin(new Limuzina(124,"Kina",1999,"Zeze"));
        a.shtoAutomjetin(new SUV(125,"Kosovo",2000,false));
        a.shtoAutomjetin(new SUV(126,"Germany",2005,true));
        
        System.out.println();
        a.shtypTeGjithaAutomjetet();
        
        System.out.println();
        System.out.println("Automjetet jo-automatike: ");
        a.shtypAutomatik(false);
    }
}
