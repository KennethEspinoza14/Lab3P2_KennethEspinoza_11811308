package lab3p2_kennethespinoza;

public class Barbaro extends Personaje {
  
    private int ac = 65;
    private int cs = 93;

    public Barbaro(int edad, String nombre, String raza, String nacionalidad, String tipo_p, String descripcion, double altura, double peso) {
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
