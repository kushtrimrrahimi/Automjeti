package automjeti;
public class Limuzina extends Automjeti{
    private String ngjyra;
    
    public Limuzina(int nS, String p, int vP, String ngj){
        super(nS, p, vP);
        ngjyra = ngj;
    }
    
    public boolean eshteAutomatik(){
        return true;
    }
    
    public String getNgjyra(){
        return ngjyra;
    }
    public void setNgjyra(String ngj){
        ngjyra = ngj;
    }
    
    public String toString(){
        return "Limuzina: " + super.toString() + " : " + ngjyra;
    }
}
