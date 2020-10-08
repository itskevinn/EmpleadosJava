package parcial;
public class Empleado {
    private String nombre;
    private String identidad;
    private String tipoEmpleado;
    private long prima;
    private long salario;

    public Empleado(String nombre, String identidad, String tipoEmpleado, long prima, long salario) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.tipoEmpleado = tipoEmpleado;
        this.prima = prima;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public long getPrima() {
        return prima;
    }

    public void setPrima(long prima) {
        this.prima = prima;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
    
}
