/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.dao;


import br.model.Estado;
import br.model.Pagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius caetano
 */
public class PagamentoDao {
    
private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(Estado estado) {
        String sql = "INSERT INTO estado(estado) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, estado.getEstado());
    
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterar(Estado estado) {
        String sql = "UPDATE estado SET estado=?  WHERE codigo=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, estado.getEstado());

            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(Estado estado) {
        String sql = "DELETE FROM estado WHERE codigo=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, (int) estado.getCodigo());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Estado> listar() {
        String sql = "select * from estado";
        List<Estado> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Estado estado = new Estado();
                estado.setCodigo(resultado.getInt("codigo"));
                estado.setEstado(resultado.getString("estado"));
 
                retorno.add(estado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public Estado buscar(Estado estado) {
        String sql = "SELECT * FROM estado WHERE codigo=?";
        Estado retorno = new Estado();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, (int) estado.getCodigo());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                estado.setCodigo(resultado.getInt("Codigo"));
                estado.setEstado(resultado.getString("Estado"));
    
                retorno = estado;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
