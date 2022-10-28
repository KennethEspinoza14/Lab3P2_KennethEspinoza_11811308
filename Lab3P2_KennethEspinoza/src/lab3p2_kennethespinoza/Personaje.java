
package lab3p2_kennethespinoza;

public class Personaje {
    
    private int edad;
    private String nombre, raza, nacionalidad, tipo_p, descripcion;
    private double altura, peso;

    public Personaje( int edad, String nombre, String raza, String nacionalidad, String tipo_p,String descripcion, double altura, double peso) {
      
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.nacionalidad = nacionalidad;
        this.tipo_p = tipo_p;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        
        
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipo_p() {
        return tipo_p;
    }

    public void setTipo_p(String tipo_p) {
        this.tipo_p = tipo_p;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
