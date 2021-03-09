package mx.unam.aragon.dp;

//Martínez Jiménez María Fernanda 02/Marzo/2021

public class Direccion {
    String calle;
    String numero;
    String colonia;
    String delegacion;
    String estado;
    String cp;

    public Direccion() {
    }

    public Direccion(String calle, String numero, String colonia, String delegacion, String estado, String cp) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.estado = estado;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "direccion{" + "calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + ", delegacion=" + delegacion + ", estado=" + estado + ", cp=" + cp + '}';
    }
    
    
}
