package lab3p2_kennethespinoza;

public class Barbaro extends Personaje {
  
    private int ac = 65;
    private int cs = 93;
    private int exp;
    private String arma;

    public Barbaro(int exp, String arma, int edad, int hp, String nombre, String raza, String nacionalidad, String tipo_p, String descripcion, double altura, double peso) {
        super(edad, hp, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
        this.exp = exp;
        this.arma = arma;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return super.toString()+"Barbaro{" + "ac=" + ac + ", cs=" + cs + ", exp=" + exp + ", arma=" + arma + '}';
    }

    
    
    

}
