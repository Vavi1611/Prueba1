
package prueba1.Dto;

import java.util.Date;
public class Club {


    private String rolUnico;
    private String nombreClub;
    private String nombre;
    private String anhoFundacionClub;
    private String paisOrigen;
    private String lemaClub;
    private String colores;
    private int suscripcionClub;
    private String boletinInformacion;

    //Constructor
    public Club() {
        this.rolUnico = "";
        this.nombreClub = "";
        this.nombre = "";
        this.anhoFundacionClub = "";
        this.paisOrigen = "";
        this.lemaClub = "";
        this.colores = "";
        this.suscripcionClub = 0;
    }

    public Club(String rolUnico, String nombreClub, String nombre, String anhoFundacionClub, String paisOrigen, String lemaClub, String colores, int suscripcionClub, String boletinInformacion) {
        this.rolUnico = rolUnico;
        this.nombreClub = nombreClub;
        this.nombre = nombre;
        this.anhoFundacionClub = anhoFundacionClub;
        this.paisOrigen = paisOrigen;
        this.lemaClub = lemaClub;
        this.colores = colores;
        this.suscripcionClub = suscripcionClub;
        this.boletinInformacion = boletinInformacion;
    }
       
    //getter and setter
    public String getRolUnico() {
        return rolUnico;
    }

    public void setRolUnico(int correlativo) {
        this.rolUnico = (this.nombreClub.substring(0,2))+"H"+(correlativo);
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public String getNombreFundador() {
        return nombre;
    }

    public void setNombreFundador(String nombreFundador) {
        this.nombre = nombreFundador;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getLemaClub() {
        return lemaClub;
    }

    public void setLemaClub(String lemaClub) {
        this.lemaClub = lemaClub;
    }

    public String getColores() {
        return colores;
    }

    public String getAnhoFundacionClub() {
        return anhoFundacionClub;
    }

    public void setAnhoFundacionClub(String anhoFundacionClub) {
        this.anhoFundacionClub = anhoFundacionClub;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public int getSuscripcionClub() {
        return suscripcionClub;
    }

    public void setSuscripcionClub(int suscripcionClub) {
        this.suscripcionClub = suscripcionClub;
    }

    public String getBoletinInformacion() {
        return boletinInformacion;
    }

    public void setBoletinInformacion(String boletinInformacion) {
        this.boletinInformacion = boletinInformacion;
    }

    public String validarRolUnico() {
        for (int i = 0; i < this.nombreClub.length(); i++) {
            if (this.nombreClub.charAt(i) == ' ') {
                System.out.println(" ");
                
            }
        }

        System.out.println("");
        return null;
    }

    public String unionColores(Club c2){
        String union=colores+", "+c2.getColores();
        return union;
    }

    public void setAnhoFundacionClub(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
 
   

