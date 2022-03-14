package paquete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.Vector;

public class Agenda {

    private int idPais;
    private String pais;

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String toString() {
        return this.pais;
    }

    public Vector<Agenda> mostrarPaises() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Vector<Agenda> vectorPaises = new Vector<Agenda>();
        Agenda pais = null;

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("select * from pais ");
            rs = ps.executeQuery();

            pais = new Agenda();
            pais.setIdPais(0);
            pais.setPais("Seleccione País ...");
            vectorPaises.add(pais);

            while (rs.next()) {
                pais = new Agenda();
                pais.setIdPais(rs.getInt("idpais"));
                pais.setPais(rs.getString("pais"));
                vectorPaises.add(pais);
            }

            rs.close();

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }

        return vectorPaises;

    }

}
