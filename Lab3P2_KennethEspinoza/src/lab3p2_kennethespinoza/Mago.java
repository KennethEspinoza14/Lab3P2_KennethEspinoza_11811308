
package lab3p2_kennethespinoza;


public class Mago extends Personaje{
    
    private int ac = 20;
    private int cs = 0;

    public Mago(int edad, String nombre, String raza, String nacionalidad, String tipo_p, String descripcion, double altura, double peso) {
        super(edad, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
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

    
    
    
    
}
