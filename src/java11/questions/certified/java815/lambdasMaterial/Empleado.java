package java11.questions.certified.java815.lambdasMaterial;

public class Empleado extends Persona {
    private String empresaLabora;

    public Empleado(String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
    }

    void fly(){
        System.out.println("Fly");
    }

    public String getEmpresaLabora() {
        return empresaLabora;
    }

    public void setEmpresaLabora(String empresaLabora) {
        this.empresaLabora = empresaLabora;
    }
}