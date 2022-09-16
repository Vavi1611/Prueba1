
package prueba1.Dto;

import java.util.Date;
public class Suscripcion {
    
    private Usuario usuario; //cada usuario
    private Club club;//club suscrito, equipo al que se suscribio
    private Date inicioSuscripcion;//fecha inicio suscripcion
    private int numeroSuscripcion;//identificador de la suscripcion
    private int abonoTotal;//lo que ha pagado?
    private int idUnicoSuscripcion;//id unico suscripcion    
    
    
    public Suscripcion(){
        this.usuario = new Usuario();
        this.club = new Club();
        this.inicioSuscripcion =new Date();
        this.numeroSuscripcion = 0;
        this.abonoTotal = 0;
        this.idUnicoSuscripcion = 0;
    }

    public Suscripcion(Usuario usuario, Club club, Date inicioSuscripcion, int numeroSuscripcion, int abonoTotal, int idUnicoSuscripcion) {
        this.usuario = usuario;
        this.club = club;
        this.inicioSuscripcion = inicioSuscripcion;
        this.numeroSuscripcion = numeroSuscripcion;
        this.abonoTotal = abonoTotal;
        this.idUnicoSuscripcion = idUnicoSuscripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Date getInicioSuscripcion() {
        return inicioSuscripcion;
    }

    public void setInicioSuscripcion(Date inicioSuscripcion) {
        this.inicioSuscripcion = inicioSuscripcion;
    }

    public int getNumeroSuscripcion() {
        return numeroSuscripcion;
    }

    public void setNumeroSuscripcion(int numeroSuscripcion) {
        this.numeroSuscripcion = numeroSuscripcion;
    }

    public int getAbonoTotal() {
        return abonoTotal;
    }

    public void setAbonoTotal(int abonoTotal) {
        this.abonoTotal = abonoTotal;
    }

    public int getIdUnicoSuscripcion() {
        return idUnicoSuscripcion;
    }

    public void setIdUnicoSuscripcion(int idUnicoSuscripcion) {
        this.idUnicoSuscripcion = idUnicoSuscripcion;
    }
    
    
}


