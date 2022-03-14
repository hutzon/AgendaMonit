package paquete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class AgendaUnidad {

    private int idUnidad;
    private int idpais;
    private String unidad;
    public int idRestDvr;

    public int getIdRestDvr() {
        System.out.println(idRestDvr + "Valor dentro del get");
        return idRestDvr;
    }

    public void setIdRestDvr(int idRestDvr) {
        System.out.println(idRestDvr + "Valor dentro del set");
        this.idRestDvr = idRestDvr;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String toString() {
        return this.unidad;
    }

    public Vector<AgendaUnidad> mostrarUnidad(Integer x) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Vector<AgendaUnidad> vectorUnidad = new Vector<AgendaUnidad>();
        AgendaUnidad unidad = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("select idunidad,unidad from unidadnegocio where idpais=" + x);
            rs = ps.executeQuery();


            unidad = new AgendaUnidad();
            unidad.setIdUnidad(0);
            unidad.setUnidad("Seleccione Unidad ...");
            vectorUnidad.add(unidad);

            while (rs.next()) {
                unidad = new AgendaUnidad();
                unidad.setIdUnidad(rs.getInt("idunidad"));
                unidad.setUnidad(rs.getString("unidad"));
                vectorUnidad.add(unidad);
            }

            rs.close();

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }

        return vectorUnidad;

    }

}
