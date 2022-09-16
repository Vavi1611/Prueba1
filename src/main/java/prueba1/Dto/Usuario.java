
package prueba1.Dto;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Usuario {




    //variables
    private int id;
    private int rut;
    private String dv;
    private String nombreusuario;
    private String fechaNacimiento;
    private int telefono;
    private String correo;
    private String nombreUsuario;
    private String contrasena;

    public String getNombre() {
        return nombreusuario;
    }

    public void setNombre(String nombre) {
        this.nombreusuario = nombre;
    }

    //constructor
    public Usuario() {
        this.id = 0;
        this.rut = 0;
        this.dv = "";
        this.fechaNacimiento = "";
        this.telefono = 0;
        this.correo = "";
        this.nombreUsuario = "";
        this.contrasena = "";
    }

    public Usuario(int id, int rut, String dv, String fechaNacimiento, int telefono, String correo, String nombreUsuario, String contraseña) {
        this.id = id;
        this.rut = rut;
        this.dv = dv;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contraseña;
    }
    //GETTER and SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut, char dv) {
        if (this.validarRut(rut, dv)) {
            this.rut = rut;
            this.dv = dv + "";
        }
    }

    public String getDv() {
        return dv;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreol() {
        return correo;
    }

    public void setCorreo(String email) {
        this.correo = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    
    public String iniciarSesion(String nombreUsuario, String contrasenha) {
        if (nombreUsuario.equals(this.nombreUsuario) && contrasenha.equals(this.contrasena)) {
            return "Inicio de Sesion Correcto";
        } else {
            return "Usuario o Contraseña Incorrecta";
        }
    }
    //Contraseña
    public void setContrasena(String contrasenha) {
        int mayuscula = 0;
        int numero = 0;
        for (int i = 0; i < contrasenha.length(); i++) {
            if (Character.isUpperCase(contrasenha.charAt(i))) {
                mayuscula++;
            } else if (Character.isDigit(contrasenha.charAt(i))) {
                numero++;
            }
        }
        if (mayuscula > 0 && numero > 0 && contrasenha.length() > 6) {
            this.contrasena = contrasenha;
        }

    }

    //Reinicio 
    public String resetContraseña(String nombreUsuario, String contrasenhaNueva) {
        if (nombreUsuario.equals(this.nombreUsuario)) {
            int mayuscula = 0;
            int numero = 0;
            for (int i = 0; i < contrasenhaNueva.length(); i++) {
                if (Character.isUpperCase(contrasena.charAt(i))) {
                    mayuscula++;
                } else if (Character.isDigit(contrasena.charAt(i))) {
                    numero++;
                }
            }
            if (mayuscula > 0 && numero > 0 && contrasenhaNueva.length() > 6) {
                this.contrasena = contrasenhaNueva;
            } else {
                System.out.println("La contraseña no cumple los requisitos");
            }
        }
        return "Nombre de Usuario Incorrecto";
    }
    
    //EDAD
    public String edad(){
        LocalDate FechaActual = LocalDate.now();
        DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate FechaNacFormato = LocalDate.parse(fechaNacimiento, FormatoFecha);
        Period edad = Period.between(FechaNacFormato, FechaActual);
        return "La edad es: "+edad.getYears()+" años "+edad.getMonths()+" meses "+edad.getDays()+" dias.";
    }
}