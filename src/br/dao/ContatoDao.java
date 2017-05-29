/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.dao;

import br.model.Acessorio;
import java.sql.Connection;

/**
 *
 * @author vinicius caetano
 */
public class ContatoDao {
    
        private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
     public boolean inserir(Acessorio acessorio) {return false;
}
     
      public boolean alterar(Acessorio acessorio) {return false;
}
      
      public boolean remover(Acessorio acessorio) {return false;
}
      
      public Acessorio buscar(Acessorio acessorio) {return null;
}
   
    
}
