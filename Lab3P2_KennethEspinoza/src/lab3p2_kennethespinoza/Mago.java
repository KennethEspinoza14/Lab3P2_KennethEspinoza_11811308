
package lab3p2_kennethespinoza;


public class Mago extends Personaje{
    
    private int ac = 20;
    private int cs = 0;
    private String tipo_magia;

    public Mago(String tipo_magia, int edad, int hp, String nombre, String raza, String nacionalidad, String tipo_p, String descripcion, double altura, double peso) {
        super(edad, hp, nombre, raza, nacionalidad, tipo_p, descripcion, altura, peso);
        this.tipo_magia = tipo_magia;
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

    public String getTipo_magia() {
        return tipo_magia;
    }

    public void setTipo_magia(String tipo_magia) {
        this.tipo_magia = tipo_magia;
    }

    @Override
    public String toString() {
        return super.toString()+"Mago{" + "ac=" + ac + ", cs=" + cs + ", tipo_magia=" + tipo_magia + '}';
    }

    
    
   

    

    
    
    
    
}
