package automjeti;

public class SUV extends Automjeti{
    private boolean eshte4x4;
    
    public SUV(int nS, String p, int vP, boolean eshte4x4){
        super(nS, p, vP);
        this.eshte4x4 = eshte4x4;
    }
    
    public boolean eshte4x4(){
        return eshte4x4;
    }
    public void setEshte4x4(boolean eshte4x4){
        this.eshte4x4 = eshte4x4;
    }
    
    public boolean eshteAutomatik(){
        return false;
    }
    
    public String toString(){
        String st1 = "4x4";
        String st2 = "jo-4x4";
        if(eshte4x4 == true){
            return "SUV: " + super.toString() + " : " + st1;
        }
        else if(eshte4x4 == false){
            return "SUV: " + super.toString() + " : " + st2;
        }
        else {
            return "SUV: " + super.toString() + " : " + eshte4x4;
        }
    }
}
