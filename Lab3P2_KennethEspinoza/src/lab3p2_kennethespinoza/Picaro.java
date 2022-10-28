
package lab3p2_kennethespinoza;


public class Picaro extends Personaje{
    
    private int ac = 50;
    private int cs = 80;
    private int robos;
    private String instrumento;

    public Picaro(int robos, String instrumento, int edad, int hp, String nombre, String raza, String nacionalidad, String tipo_p, String descripcion, double altura, double peso) {
        super(edad, hp, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
        this.robos = robos;
        this.instrumento = instrumento;
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

    public int getRobos() {
        return robos;
    }

    public void setRobos(int robos) {
        this.robos = robos;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        return "Picaro{" + "ac=" + ac + ", cs=" + cs + ", robos=" + robos + ", instrumento=" + instrumento + '}';
    }
    
    

    
    
    
    
    
}
