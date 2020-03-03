/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mx.com.gm.tiendaropa.Camisa;
import mx.com.gm.tiendaropa.CantidadCamisas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author silve
 */
public class CamisasPrueb {

    private static CantidadCamisas camisas;

    public CamisasPrueb() {
    }

    @BeforeAll
    public static void setUpClass() {
        camisas = new CantidadCamisas();

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void sinDescuento() {
          camisas = new CantidadCamisas();
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
        assertEquals(380 ,camisas.getPrecio(),0.1);
    }
    
    @Test
     public void conDescuento5() {
          camisas = new CantidadCamisas();
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
        assertEquals(541.5 ,camisas.getPrecio(),0.1);
     }
     @Test
      public void conDescuento5diff() {
          camisas = new CantidadCamisas();
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.LARGA));
        assertEquals(655.5 ,camisas.getPrecio(),0.1);
     }
    
      @Test
     public void conDescuento8() {
          camisas = new CantidadCamisas();
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
         camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
        camisas.add(new Camisa(Camisa.CORTA));
        assertEquals(1048.8 ,camisas.getPrecio(),0.1);
     }
    
}
