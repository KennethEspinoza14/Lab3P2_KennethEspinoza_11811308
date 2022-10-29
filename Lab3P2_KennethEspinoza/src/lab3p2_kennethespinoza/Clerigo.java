package lab3p2_kennethespinoza;

public class Clerigo extends Personaje {

    private int ac = 40;
    private int cs = 97;
    String dios, invocacion;

    public Clerigo(String dios, String invocacion, int edad, int hp, String nombre, String raza, String nacionalidad, String tipo_p, String descripcion, double altura, double peso) {
        super(edad, hp, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
        this.dios = dios;
        this.invocacion = invocacion;
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

    public String getDios() {
        return dios;
    }

    public void setDios(String dios) {
        this.dios = dios;
    }

    public String getInvocacion() {
        return invocacion;
    }

    public void setInvocacion(String invocacion) {
        this.invocacion = invocacion;
    }

    @Override
    public String toString() {
        return "Clerigo{" + "ac=" + ac + ", cs=" + cs + ", dios=" + dios + ", invocacion=" + invocacion + '}';
    }
    
    

}
