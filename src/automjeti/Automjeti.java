package automjeti;

public abstract class Automjeti{
	private int nrShasise;
	private String prodhuesi;
	private int vitiProdhimit;
	
	public Automjeti(int nS, String p, int vP){
		nrShasise = nS;
		prodhuesi = p;
		vitiProdhimit = vP;
	}
	
	public int getNrShasise(){
		return nrShasise;
	}
	public String getProdhuesi(){
		return prodhuesi;
	}
	public void setProdhuesi(String p){
		prodhuesi = p;
	}
	public int getVitiProdhimit(){
		return vitiProdhimit;
	}
	public void setVitiProdhimit(int vP){
		vitiProdhimit = vP;
	}
	
	public abstract boolean eshteAutomatik();
        
        public String toString(){
            return nrShasise + " : " + prodhuesi + " - " + vitiProdhimit;
        }	
        
        public boolean equals(Object obj){
            if(obj instanceof Automjeti){
                Automjeti a = (Automjeti)obj;
                if(a.getNrShasise() == nrShasise){
                    return true;
                }
            }
            return false;
        }
}
