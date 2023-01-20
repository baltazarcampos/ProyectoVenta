/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_BD;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Balta
 */
public class Control_ProductosTest {
    
    public Control_ProductosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarProductos method, of class Control_Productos.
     */
    @org.junit.Test
    public void testAgregarProductos() {
        System.out.println("agregarProductos");
        String cedula = "";
        String nombre = "";
        String apellido = "";
        String direccion = "";
        String telefono = "";
        Control_Productos instance = new Control_Productos();
        instance.agregarProductos(cedula, nombre, apellido, direccion, telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CargarProductos method, of class Control_Productos.
     */
    @org.junit.Test
    public void testCargarProductos() {
        System.out.println("CargarProductos");
        Control_Productos instance = new Control_Productos();
        instance.CargarProductos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodosProductos method, of class Control_Productos.
     */
    @org.junit.Test
    public void testListarTodosProductos() {
        System.out.println("listarTodosProductos");
        Control_Productos instance = new Control_Productos();
        instance.listarTodosProductos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarConsultaTodaTabla method, of class Control_Productos.
     */
    @org.junit.Test
    public void testEjecutarConsultaTodaTabla() {
        System.out.println("ejecutarConsultaTodaTabla");
        Control_Productos instance = new Control_Productos();
        instance.ejecutarConsultaTodaTabla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProductos method, of class Control_Productos.
     */
    @org.junit.Test
    public void testBuscarProductos() {
        System.out.println("buscarProductos");
        String parametroBusqueda = "";
        Control_Productos instance = new Control_Productos();
        instance.buscarProductos(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRegistroProductos method, of class Control_Productos.
     */
    @org.junit.Test
    public void testBuscarRegistroProductos() {
        System.out.println("buscarRegistroProductos");
        String parametroBusqueda = "";
        Control_Productos instance = new Control_Productos();
        instance.buscarRegistroProductos(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarProductos method, of class Control_Productos.
     */
    @org.junit.Test
    public void testEliminarProductos() {
        System.out.println("EliminarProductos");
        String code = "";
        Control_Productos instance = new Control_Productos();
        instance.EliminarProductos(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModificarProductos method, of class Control_Productos.
     */
    @org.junit.Test
    public void testModificarProductos() {
        System.out.println("ModificarProductos");
        String code = "";
        String cod = "";
        String nombre = "";
        String precios = "";
        Control_Productos instance = new Control_Productos();
        instance.ModificarProductos(code, cod, nombre, precios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProductosparaVentas method, of class Control_Productos.
     */
    @org.junit.Test
    public void testBuscarProductosparaVentas() {
        System.out.println("buscarProductosparaVentas");
        String parametroBusqueda = "";
        Control_Productos instance = new Control_Productos();
        instance.buscarProductosparaVentas(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarRegistroProductoss method, of class Control_Productos.
     */
    @org.junit.Test
    public void testBuscarRegistroProductoss() {
        System.out.println("buscarRegistroProductoss");
        String parametroBusqueda = "";
        Control_Productos instance = new Control_Productos();
        instance.buscarRegistroProductoss(parametroBusqueda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
