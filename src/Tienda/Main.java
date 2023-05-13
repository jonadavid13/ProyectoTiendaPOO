
package Tienda;

import Tienda.Auxiliar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        //      CREACION DE LOS OBJETOS (PRODUCTOS)
        //Comida: Producto <nombre> = new Comida("FechaElaboracion","FechaVencimiento,"Nombre","Marca", precio);
        Producto harina = new Comida("15/05/2019","06/04/2020","Harina de Maíz","P.A.N",25000);
        Producto salsa = new Comida("20/05/2019","06/08/2021","Salsa de Tomate","HEINZ",28000);
        Producto leche = new Comida("12/07/2019","03/07/2020","Leche en Polvo","La Campesina",70000);
        Producto sal = new Comida("17/08/2019","23/07/2022","Sal","La Marina",21000);
        Producto azucar = new Comida("20/10/2019","06/06/2022","Azúcar Refinada","Mountblanck",22000);
        Producto aceite = new Comida("21/10/2019","17/09/2021","Aceite","Girasol",27000);
        Producto maizina = new Comida("25/11/2019","20/07/2020","Maizina","Americana",30000);
        Producto margarina =new Comida("24/11/2019","12/04/2021","Margarina","Mavesa",25000);
        
        //Papelería: Producto <nombre> = new Papeleria("Material","Nombre","Marca", precio);
        Producto lapiz = new Papeleria("Madera","Lapiz 2B","Mongol",5000);
        Producto sacapuntas = new Papeleria("Plastico","Sacapuntas","MAPED",6000);
        Producto hoja = new Papeleria("Papel","Resma de Hojas","Hammermill",35000);
        Producto portaminas = new Papeleria("Plastico","Portaminas","Astur",7000);
        Producto borrador = new Papeleria("Goma","Borrador","NATA",4000);
        Producto creyones = new Papeleria("Tiza","Caja de Creyones","Arcoiris",15000);
        Producto juegogeometrico = new Papeleria("Plastico","Juego Geometrico","Geometrius",12000);
        Producto compas = new Papeleria("Hierro","Compas de Precision","German I",10000);
                
        //Electronico: Producto <nombre> = new Electronico("Tipo de electronico","Nombre","Marca", precio);
        Producto television = new Electronico ("Television","Smart TV/UN60J6300","Samsung",7600000);
        Producto telefono = new Electronico ("Telefono inteligente","A20","Samsung",4600000);
        Producto microondas = new Electronico ("Microondas","Cecotec White","LG",1200000);
        Producto tablet = new Electronico ("Tablet","Nexus 7","LG",5800000);
        Producto aire = new Electronico ("Aire Acondicionado","1750 Condi","Samsung",8600000);
        Producto nevera = new Electronico ("Nevera","NA 45/G89","Freelooks",9800000);
        
        // Arreglos de almacenamiento de datos
        String[] almacenComida = new String[8];
        String[] almacenPapeleria = new String[8];
        String[] almacenElectronico = new String[6];
        String[] almacenProductos = new String[22];
        
        almacenComida[0] = harina.getNombre()+" "+harina.getMarca(); // ID:1
        almacenComida[1] = salsa.getNombre()+" "+salsa.getMarca(); // ID:2
        almacenComida[2] = leche.getNombre()+" "+leche.getMarca(); // ID:3
        almacenComida[3] = sal.getNombre()+" "+sal.getMarca(); // ID:4
        almacenComida[4] = azucar.getNombre()+" "+azucar.getMarca(); // ID:5
        almacenComida[5] = aceite.getNombre()+" "+aceite.getMarca(); // ID:6
        almacenComida[6] = maizina.getNombre()+" "+maizina.getMarca(); // ID:7
        almacenComida[7] = margarina.getNombre()+" "+margarina.getMarca(); // ID:8

        almacenPapeleria[0] = lapiz.getNombre()+" "+lapiz.getMarca(); // ID:9
        almacenPapeleria[1] = sacapuntas.getNombre()+" "+sacapuntas.getMarca(); // ID:10
        almacenPapeleria[2] = hoja.getNombre()+" "+hoja.getMarca(); // ID:11
        almacenPapeleria[3] = portaminas.getNombre()+" "+portaminas.getMarca(); // ID:12
        almacenPapeleria[4] = borrador.getNombre()+" "+borrador.getMarca(); // ID:13
        almacenPapeleria[5] = creyones.getNombre()+" "+creyones.getMarca(); // ID:14
        almacenPapeleria[6] = juegogeometrico.getNombre()+" "+juegogeometrico.getMarca(); // ID:15
        almacenPapeleria[7] = compas.getNombre()+" " +compas.getMarca(); // ID:16

        almacenElectronico[0] = television.getMarca()+" "+television.getNombre(); // ID : 17
        almacenElectronico[1] = telefono.getMarca()+" "+telefono.getNombre(); // ID : 18
        almacenElectronico[2] = microondas.getMarca()+" "+microondas.getNombre(); // ID : 19
        almacenElectronico[3] = tablet.getMarca()+" "+tablet.getNombre(); // ID : 20
        almacenElectronico[4] = aire.getMarca()+" "+aire.getNombre(); // ID : 21
        almacenElectronico[5] = nevera.getMarca()+" "+nevera.getNombre(); // ID : 22

        for(int i=0; i<8; i++){
            almacenProductos[i] = almacenComida[i];
        }
        int k=0;
        for(int i=8; i<16; i++){
            almacenProductos[i] = almacenPapeleria[k];
            k++;
        }
        k=0;
        for(int i=16; i<22; i++){
            almacenProductos[i] = almacenElectronico[k];
            k++;
        }
        
        /* IMPRIMIR PRODUCTOS
        for(int i=0; i<22; i++){
            System.out.println((i+1)+") "+almacenProductos[i]);
        } */
        
        //Arreglos con las cantidades que se pueden comprar de un producto
        String[] cantidadComida = {"1","2","3","4","5","6","7","8"};
        String[] cantidadPapeleria = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        String[] cantidadElectronico = {"1","2","3","4","5"};
        String[] cantidadElec2 = {"1","2","3"};
        
        // CARRITO DE COMPRA
        int[][] carrito = new int[2][22]; //La primera fila es para verificar si el usuario ha seleccionado ese producto dentro del carrito (1 para SÍ y 0 para NO) | La segunda dimensión es para el total de productos que el usuario puede comprar
        for(int i=0; i<2; i++){
            for(int j=0; j<22; j++){
                carrito[i][j] = 0;
            }
        }
        int cuenta=0; //Cuenta que se irá alterando dependiendo de la cantidad de productos que el usuario agregue al carrito
        int totalProductos=0; //Total de productos que el usuario quiere comprar
        String[] productosSeleccionados = new String[22];
        
        
        // RECURSOS
        Scanner entrada = new Scanner(System.in);
        String opciones[] = {"Ver productos","Ver carrito de compra","Comprar","Salir"};
        String categorias[] = {"Comida","Papelería","Electrónicos","Volver"};
        String botones[] = {"Agregar al carrito","Volver","Cancelar"}; //Cancelar lleva al usuario al menú principal
        String opcionesCarrito[] = {"Eliminar producto(s)","Volver"};
        String productos[] = {"Harina","Salsa","Leche","Azucar","Vino","Sal","Aceite","Queso","Lapiz","Papel","Papel Bond","Sacapuntas","Portaminas","Samsung A10","Sony Bravia","LG JK1"};
        boolean salirMenu = false;
        String respuesta; //Variable de control para entrar en alguna de las opciones del Menu Principal
        int respuesta2; //Variable de control para entrar en alguna de las opciones del menu de VER PRODUCTOS
        String respuesta3; //Variable de control para decidir retirar productos por totales o cantidades
        String seleccionado; //Variable que almacena el producto seleccionado por el usuario en el menú COMIDA/PAPELERIA/ELECTRONICO de VER PRODUCTOS
        int opcion;
        String cantidadStr; //Cantidad de productos que el usuario quiera comprar (De tipo STRING, debe ser convertida a INT para poder ser usada)
        int cantidad; //Cantidad numerica (int) de "x" productos que el usuario quiera agregar al carrito
        int precio; //Variable para almacenar el precio de un producto particular determinado
        int retirar=0; //Variable para confirmar el retiro de uno o más productos de la lista de compra o Carrito de compra
        int cantidadRetirar; //Variable para retirar cantidad específica de productos del Carrito
        int opcionRetirar; //Variable para elegir el producto que se retirará
        String opcionRetirarStr; //Variable para elegir el producto que se retirará (tipo STRING) debe ser convertida a INT para poder usarse
        int restaPago; //Variable para restar una cantidad del total a pagar
        String enter; //Funciona para presionar ENTER y seguir con el programa
        int confirmarCompra;
        
        //Variables para validar datos
        int disponible;
        int almacenado;
        boolean salirValido2 = true;
        boolean salirValidacion = true; //Validación de campos en la opción COMPRA
        boolean continuar = true; //Variable para continuar en la validación de datos
        
        //Datos del usuario
        String nombre="";
        String apellido="";
        String cedulaStr=""; //Debe ser convertida a INT al ser validada
        String claveStr=""; //Debe ser convertida a INT al ser validada
        int cedula;
        int clave;
        String[] tipoCuenta = {"CORRIENTE","AHORRO"};
        int cuentaOpcion;
        
        JOptionPane.showMessageDialog(null,"Bienvenido al supermercado! A continuación se le presentarán las opciones disponibles. ");
        do {            //MENÚ PRINCIPAL
            respuesta = (String) JOptionPane.showInputDialog(null,"Seleccione la opción que desea realizar","SUPERMERCADO D&J",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
            //RESPUESTA será la variable de control para el switch principal
            
            if(respuesta!=null){
                switch (respuesta){
                    case "Ver productos": //VER PRODUCTOS
                        boolean salir = false;
                        do {
                            respuesta2 = JOptionPane.showOptionDialog(null,"¿Cuáles productos desea ver?","VER PRODUCTOS",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,categorias,categorias[3]);
                            boolean salir2 = false;
                                    
                            do{
                                switch (respuesta2) {
                                    case 0: //COMIDA
                                        seleccionado = (String) JOptionPane.showInputDialog(null,"Seleccione un producto para ver su información","COMIDA",JOptionPane.INFORMATION_MESSAGE, null,almacenComida,almacenComida[0]);
                                        if(seleccionado!=null){
                                            switch(seleccionado){
                                                case "Harina de Maíz P.A.N": //ID: 1
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+harina.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][0] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][0];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*harina.getPrecio());

                                                                        carrito[1][0] = carrito[1][0]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Salsa de Tomate HEINZ": //ID: 2
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+salsa.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][1] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][1];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*salsa.getPrecio());

                                                                        carrito[1][1] = carrito[1][1]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Leche en Polvo La Campesina": //ID: 3
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+leche.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][2] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][2];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*leche.getPrecio());

                                                                        carrito[1][2] = carrito[1][2]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Sal La Marina": //ID: 4
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+sal.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][3] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][3];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*sal.getPrecio());

                                                                        carrito[1][3] = carrito[1][3]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Azúcar Refinada Mountblanck": //ID: 5
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+azucar.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][4] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][4];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*azucar.getPrecio());

                                                                        carrito[1][4] = carrito[1][4]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Aceite Girasol": //ID: 6
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+aceite.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][5] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][5];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*aceite.getPrecio());

                                                                        carrito[1][5] = carrito[1][5]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Maizina Americana": //ID: 7
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+maizina.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][6] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][6];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*maizina.getPrecio());

                                                                        carrito[1][6] = carrito[1][6]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Margarina Mavesa": //ID: 8
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+margarina.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][7] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][7];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*margarina.getPrecio());

                                                                        carrito[1][7] = carrito[1][7]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break; 
                                                default:
                                                    JOptionPane.showMessageDialog(null,"No se ha seleccionado una opción valida. Intente nuevamente","INFORMACIÓN",JOptionPane.WARNING_MESSAGE);
                                                    break;
                                            }
                                        }
                                        else { //Si presiona CANCELAR, el programa lo llevará al Menú de VER PRODUCTOS
                                            salir2 = true;
                                        }
                                        break;
                                    case 1: //PAPELERIA
                                        seleccionado = (String) JOptionPane.showInputDialog(null,"Seleccione un producto para ver su información","PAPELERIA",JOptionPane.INFORMATION_MESSAGE, null,almacenPapeleria,almacenPapeleria[0]);
                                        if(seleccionado!=null){
                                            switch(seleccionado){
                                                case "Lapiz 2B Mongol": //ID 9
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+lapiz.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][8] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][8];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*lapiz.getPrecio());

                                                                        carrito[1][8] = carrito[1][8]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Sacapuntas MAPED": //ID 10
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+sacapuntas.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][9] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][9];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*sacapuntas.getPrecio());

                                                                        carrito[1][9] = carrito[1][9]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Resma de Hojas Hammermill": //ID 11
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+hoja.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][10] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][10];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*hoja.getPrecio());

                                                                        carrito[1][10] = carrito[1][10]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Portaminas Astur": //ID 12
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+portaminas.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][11] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][11];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*portaminas.getPrecio());

                                                                        carrito[1][11] = carrito[1][11]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Borrador NATA": //ID 13
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+borrador.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][12] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][12];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*borrador.getPrecio());

                                                                        carrito[1][12] = carrito[1][12]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Caja de Creyones Arcoiris": //ID 14
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+creyones.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][13] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][13];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*creyones.getPrecio());

                                                                        carrito[1][13] = carrito[1][13]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Juego Geometrico Geometrius": //ID 15
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+juegogeometrico.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][14] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][14];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*juegogeometrico.getPrecio());

                                                                        carrito[1][14] = carrito[1][14]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Compas de Precision German I": //ID 16
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+compas.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][15] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][15];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*compas.getPrecio());

                                                                        carrito[1][15] = carrito[1][15]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                        else { //Si presiona CANCELAR, el programa lo llevará al Menú de VER PRODUCTOS
                                            salir2 = true;
                                        }
                                        break;
                                    case 2: //ELECTRONICO
                                        seleccionado = (String) JOptionPane.showInputDialog(null,"Seleccione un producto para ver su información","PAPELERIA",JOptionPane.INFORMATION_MESSAGE, null,almacenElectronico,almacenElectronico[0]);
                                        if(seleccionado!=null){
                                            switch(seleccionado){
                                                case "Samsung Smart TV/UN60J6300": //ID: 17
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+television.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][16] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][16];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*television.getPrecio());

                                                                        carrito[1][16] = carrito[1][16]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Samsung A20": //ID: 18
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+telefono.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][17] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][17];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*telefono.getPrecio());

                                                                        carrito[1][17] = carrito[1][17]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "LG Cecotec White": //ID: 19
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+microondas.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][18] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][18];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*microondas.getPrecio());

                                                                        carrito[1][18] = carrito[1][18]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "LG Nexus 7": //ID: 20
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+tablet.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][19] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][19];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*tablet.getPrecio());

                                                                        carrito[1][19] = carrito[1][19]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Samsung 1750 Condi": //ID: 21
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+aire.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][20] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][20];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*aire.getPrecio());

                                                                        carrito[1][20] = carrito[1][20]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                case "Freelooks NA 45/G89": //ID: 22
                                                    opcion = JOptionPane.showOptionDialog(null,"INFORMACIÓN: \n"+nevera.mostrarDatos(),"Información del producto",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[1]);
                                                    switch(opcion){
                                                        case 0: //Agregar al carrito
                                                            boolean valido = true;
                                                            do{
                                                                cantidadStr = (String) JOptionPane.showInputDialog(null,"Ingrese la cantidad de productos que desea agregar","CARRITO",JOptionPane.QUESTION_MESSAGE,null,cantidadComida,cantidadComida[0]);
                                                                if(cantidadStr!=null){
                                                                    cantidad = Integer.parseInt(cantidadStr);
                                                                    carrito[0][21] = 1; //El producto se ha seleccionado
                                                                    disponible = 8 - carrito[1][21];
                                                                    almacenado = 8 - disponible;
                                                                    if(disponible >= cantidad){
                                                                        cuenta = cuenta +(cantidad*nevera.getPrecio());

                                                                        carrito[1][21] = carrito[1][21]+cantidad;
                                                                        totalProductos = totalProductos + cantidad;
                                                                        valido = true;
                                                                    }
                                                                    else if(disponible==0){
                                                                        JOptionPane.showMessageDialog(null,"Se ha alcanzado el límite de productos de este tipo que se pueden agregar. ","LÍMITE ALCANZADO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                    else{
                                                                        JOptionPane.showMessageDialog(null,"Solo se pueden agregar hasta "+disponible+" productos más de este tipo","CARRITO",JOptionPane.WARNING_MESSAGE);
                                                                        valido = false;
                                                                    }
                                                                }
                                                                else{
                                                                    valido=true;
                                                                }
                                                            } while(valido!=true);    
                                                            break;
                                                        case 1: //Volver
                                                            break;
                                                        case 2: //Cancelar (ir al menú principal)
                                                            salir2 = true;
                                                            break;
                                                        default:
                                                            JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intentelo nuevamente. ","OPCIONES",JOptionPane.WARNING_MESSAGE);
                                                            break;
                                                    }
                                                    break;
                                                    
                                            }
                                        }
                                        else { //Si presiona CANCELAR, el programa lo llevará al Menú de VER PRODUCTOS
                                            salir2 = true;
                                        }
                                        break;
                                    case 3: // VOLVER
                                        salir2 = true;
                                        salir = true;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null,"No se ha ingresado una opción valida, intente nuevamente.");
                                        break;
                                } 
                                
                            } while(salir2!=true);

                        } while(salir!=true);


                        break;
                    case "Ver carrito de compra": //VER CARRITO DE COMPRA (productos agregados por cantidades, retirar objetos, ver total a pagar)
                        if(totalProductos>0){
                            JOptionPane.showMessageDialog(null,"A continuación se le mostrará la información con respecto a los productos que ha agregado a su carrito","CARRITO",JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("---------------------<LISTA DE COMPRA>---------------------\n");
                            for(int i=0; i<22;i++){
                                if(carrito[0][i]==1){
                                    switch(i){
                                        case 0: //Harina
                                            cantidad = carrito[1][0];
                                            precio = harina.getPrecio();
                                            System.out.println("> "+almacenComida[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 1: //Salsa
                                            cantidad = carrito[1][1];
                                            precio = salsa.getPrecio();
                                            System.out.println("> "+almacenComida[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 2:
                                            cantidad = carrito[1][2];
                                            precio = leche.getPrecio();
                                            System.out.println("> "+almacenComida[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 3:
                                            cantidad = carrito[1][3];
                                            precio = sal.getPrecio();
                                            System.out.println("> "+almacenComida[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 4:
                                            cantidad = carrito[1][4];
                                            precio = azucar.getPrecio();
                                            System.out.println("> "+almacenComida[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 5:
                                            cantidad = carrito[1][5];
                                            precio = aceite.getPrecio();
                                            System.out.println("> "+almacenComida[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 6:
                                            cantidad = carrito[1][6];
                                            precio = maizina.getPrecio();
                                            System.out.println("> "+almacenComida[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 7:
                                            cantidad = carrito[1][7];
                                            precio = margarina.getPrecio();
                                            System.out.println("> "+almacenComida[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 8:
                                            cantidad = carrito[1][8];
                                            precio = lapiz.getPrecio();
                                            System.out.println("> "+almacenPapeleria[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 9:
                                            cantidad = carrito[1][9];
                                            precio = sacapuntas.getPrecio();
                                            System.out.println("> "+almacenPapeleria[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 10:
                                            cantidad = carrito[1][10];
                                            precio = hoja.getPrecio();
                                            System.out.println("> "+almacenPapeleria[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 11:
                                            cantidad = carrito[1][11];
                                            precio = portaminas.getPrecio();
                                            System.out.println("> "+almacenPapeleria[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 12:
                                            cantidad = carrito[1][12];
                                            precio = borrador.getPrecio();
                                            System.out.println("> "+almacenPapeleria[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 13:
                                            cantidad = carrito[1][i];
                                            precio = creyones.getPrecio();
                                            System.out.println("> "+almacenPapeleria[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 14:
                                            cantidad = carrito[1][i];
                                            precio = juegogeometrico.getPrecio();
                                            System.out.println("> "+almacenPapeleria[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 15:
                                            cantidad = carrito[1][i];
                                            precio = compas.getPrecio();
                                            System.out.println("> "+almacenPapeleria[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 16:
                                            cantidad = carrito[1][i];
                                            precio = television.getPrecio();
                                            System.out.println("> "+almacenElectronico[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 17:
                                            cantidad = carrito[1][i];
                                            precio = telefono.getPrecio();
                                            System.out.println("> "+almacenElectronico[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 18:
                                            cantidad = carrito[1][i];
                                            precio = microondas.getPrecio();
                                            System.out.println("> "+almacenElectronico[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 19:
                                            cantidad = carrito[1][i];
                                            precio = tablet.getPrecio();
                                            System.out.println("> "+almacenElectronico[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 20:
                                            cantidad = carrito[1][i];
                                            precio = aire.getPrecio();
                                            System.out.println("> "+almacenElectronico[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 21:
                                            cantidad = carrito[1][i];
                                            precio = nevera.getPrecio();
                                            System.out.println("> "+almacenElectronico[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null,"No se ha ingresado un dato válido, intente nuevamente. ");
                                            break;
                                    }
                                }
                            }
                            System.out.println("------------------------------------------");
                            System.out.println("Total Artículos: "+totalProductos);
                            System.out.println("Total a Pagar: "+cuenta+" Bs. \n");
                            System.out.println(">> Ingrese ENTER para continuar...");
                            enter = entrada.nextLine();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No se han agregado elementos al carrito. Para poder visualizar esta opción, es necesario que agregue al menos (1) producto. ","CARRITO",JOptionPane.WARNING_MESSAGE);
                        }
                        if(totalProductos>0){ //        RETIRAR PRODUCTOS
                            retirar = JOptionPane.showConfirmDialog(null,"¿Desea retirar algún producto?","CONFIRMAR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        
                            if(retirar==0){
                                System.out.println("-------------------------------------------\n");
                                System.out.println("Seleccione el numero del producto que desea retirar. \n>>");
                                for(int i=0; i<22;i++){
                                    if(carrito[0][i]==1){
                                        switch(i){
                                            case 0: //Harina
                                                cantidad = carrito[1][0];
                                                precio = harina.getPrecio();
                                                System.out.println("(1) "+almacenComida[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 1: //Salsa
                                                cantidad = carrito[1][1];
                                                precio = salsa.getPrecio();
                                                System.out.println("(2) "+almacenComida[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 2:
                                                cantidad = carrito[1][2];
                                                precio = leche.getPrecio();
                                                System.out.println("(3) "+almacenComida[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 3:
                                                cantidad = carrito[1][3];
                                                precio = sal.getPrecio();
                                                System.out.println("(4) "+almacenComida[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 4:
                                                cantidad = carrito[1][4];
                                                precio = azucar.getPrecio();
                                                System.out.println("(5) "+almacenComida[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 5:
                                                cantidad = carrito[1][5];
                                                precio = aceite.getPrecio();
                                                System.out.println("(6) "+almacenComida[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break; 
                                            case 6:
                                                cantidad = carrito[1][6];
                                                precio = maizina.getPrecio();
                                                System.out.println("(7) "+almacenComida[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 7: 
                                                cantidad = carrito[1][7];
                                                precio = margarina.getPrecio();
                                                System.out.println("(8) "+almacenComida[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 8:
                                                cantidad = carrito[1][8];
                                                precio = lapiz.getPrecio();
                                                System.out.println("(9) "+almacenPapeleria[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 9:
                                                cantidad = carrito[1][9];
                                                precio = sacapuntas.getPrecio();
                                                System.out.println("(10) "+almacenPapeleria[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 10:
                                                cantidad = carrito[1][10];
                                                precio = hoja.getPrecio();
                                                System.out.println("(11) "+almacenPapeleria[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 11:
                                                cantidad = carrito[1][11];
                                                precio = portaminas.getPrecio();
                                                System.out.println("(12) "+almacenPapeleria[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 12:
                                                cantidad = carrito[1][12];
                                                precio = borrador.getPrecio();
                                                System.out.println("(13) "+almacenPapeleria[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 13:
                                                cantidad = carrito[1][i];
                                                precio = creyones.getPrecio();
                                                System.out.println("(14) "+almacenPapeleria[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 14:
                                                cantidad = carrito[1][i];
                                                precio = juegogeometrico.getPrecio();
                                                System.out.println("(15) "+almacenPapeleria[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 15:
                                                cantidad = carrito[1][i];
                                                precio = compas.getPrecio();
                                                System.out.println("(16) "+almacenPapeleria[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 16:
                                                cantidad = carrito[1][i];
                                                precio = television.getPrecio();
                                                System.out.println("(17) "+almacenElectronico[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 17:
                                                cantidad = carrito[1][i];
                                                precio = telefono.getPrecio();
                                                System.out.println("(18) "+almacenElectronico[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 18:
                                                cantidad = carrito[1][i];
                                                precio = microondas.getPrecio();
                                                System.out.println("(19) "+almacenElectronico[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 19:
                                                cantidad = carrito[1][i];
                                                precio = tablet.getPrecio();
                                                System.out.println("(20) "+almacenElectronico[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 20:
                                                cantidad = carrito[1][i];
                                                precio = aire.getPrecio();
                                                System.out.println("(21) "+almacenElectronico[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            case 21:
                                                cantidad = carrito[1][i];
                                                precio = nevera.getPrecio();
                                                System.out.println("(22)"+almacenElectronico[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                break;
                                            default:
                                                JOptionPane.showMessageDialog(null,"No se ha ingresado un dato válido, intente nuevamente. ");
                                                break;
                                            }
                                    }
                                }
                                System.out.println("(TOTAL: "+cuenta+" Bs. )");
                                System.out.println("------------------------------------------");
                                
                                
                                boolean salirValido = true;
                                do{
                                    System.out.print(">> Ingresa la opción: ");
                                    //entrada.nextLine();
                                    opcionRetirarStr = entrada.nextLine();
                                    
                                    if(Auxiliar.isNumeric(opcionRetirarStr)){
                                        opcionRetirar = Integer.parseInt(opcionRetirarStr);
                                        switch(opcionRetirar){
                                            case 1:
                                                disponible = 8 - carrito[1][0];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][0] = carrito[1][0] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*harina.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 2:
                                                disponible = 8 - carrito[1][1];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][1] = carrito[1][1] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*salsa.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 3:
                                                disponible = 8 - carrito[1][2];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][2] = carrito[1][2] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*leche.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 4:
                                                disponible = 8 - carrito[1][3];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][3] = carrito[1][3] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*sal.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 5:
                                                disponible = 8 - carrito[1][4];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][4] = carrito[1][4] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*azucar.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 6:
                                                disponible = 8 - carrito[1][5];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][5] = carrito[1][5] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*aceite.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 7:
                                                disponible = 8 - carrito[1][6];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][6] = carrito[1][6] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*maizina.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 8:
                                                disponible = 8 - carrito[1][7];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][7] = carrito[1][7] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*margarina.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 9:
                                                disponible = 8 - carrito[1][8];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][8] = carrito[1][8] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*lapiz.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 10:
                                                disponible = 8 - carrito[1][9];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][9] = carrito[1][9] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*sacapuntas.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 11:
                                                disponible = 8 - carrito[1][10];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][10] = carrito[1][10] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*hoja.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 12:
                                                disponible = 8 - carrito[1][11];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][11] = carrito[1][11] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*portaminas.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 13:
                                                disponible = 8 - carrito[1][12];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][12] = carrito[1][12] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*borrador.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 14:
                                                disponible = 8 - carrito[1][13];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][13] = carrito[1][13] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*creyones.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 15:
                                                disponible = 8 - carrito[1][14];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][14] = carrito[1][14] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*juegogeometrico.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 16:
                                                disponible = 8 - carrito[1][15];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][15] = carrito[1][15] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*compas.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 17:
                                                disponible = 8 - carrito[1][16];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][16] = carrito[1][16] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*television.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 18:
                                                disponible = 8 - carrito[1][17];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][17] = carrito[1][17] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*telefono.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 19:
                                                disponible = 8 - carrito[1][18];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][18] = carrito[1][18] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*microondas.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 20:
                                                disponible = 8 - carrito[1][19];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][19] = carrito[1][19] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*tablet.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 21:
                                                disponible = 8 - carrito[1][20];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][20] = carrito[1][20] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*aire.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            case 22:
                                                disponible = 8 - carrito[1][21];
                                                almacenado = 8 - disponible;
                                                //entrada.nextLine(); //Limpiar el Buffer
                                                do{
                                                    System.out.println("Desea retirar cantidades de este producto? ("+almacenado+") Ingrese (s/n)");
                                                    respuesta3 = entrada.nextLine();
                                                    if(respuesta3.equals("s")){
                                                        do{
                                                            System.out.println("Ingrese la cantidad de productos que desea retirar (Maximo "+almacenado+" para retirar): ");
                                                            cantidadRetirar = entrada.nextInt();
                                                            if(cantidadRetirar>almacenado){
                                                                JOptionPane.showMessageDialog(null,"Sólo puedes retirar hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else if(cantidadRetirar<1){
                                                                JOptionPane.showMessageDialog(null,"Ingresa un número valido. Sólo puedes retirar desde 1 hasta "+almacenado+" productos de este tipo. ","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                                salirValido = false;
                                                            }
                                                            else {
                                                                carrito[1][21] = carrito[1][21] - cantidadRetirar;
                                                                restaPago = cantidadRetirar*nevera.getPrecio();
                                                                cuenta = cuenta - restaPago;
                                                                totalProductos = totalProductos - cantidadRetirar;
                                                                salirValido=true;
                                                                salirValido2 = true;
                                                            }
                                                        } while(salirValido!=true);
                                                    }
                                                    else if(respuesta3.equals("n")){
                                                        System.out.println("No se harán modificaciones");
                                                        salirValido2 = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"No se ha seleccionado un caracter válido. Ingrese (s) o (n)","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValido2=false;
                                                    }
                                                } while(salirValido2!=true);
                                                break;
                                            
                                            default:
                                                JOptionPane.showMessageDialog(null,"No se ha ingresado una opción válida. Intente nuevamente según el indice del producto a retirar","RETIRAR PRODUCTOS",JOptionPane.WARNING_MESSAGE);
                                                salirValido = false;
                                                break;
                                        }
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null,"No se ha ingresado una opción valida. Intente nuevamente. ");
                                    }
                                } while(salirValido!=true);
                            }
                        }
                        
                        break;
                    case "Comprar": //COMPRAR (confirmar carrito de compra, pedir datos del usuario, generar factura)
                        if(totalProductos>=1){
                            JOptionPane.showMessageDialog(null,"A continuación se le mostrará la lista de compra","CARRITO DE COMPRA",JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("---------------------<LISTA DE COMPRA>---------------------\n");
                            for(int i=0; i<22;i++){
                                if(carrito[0][i]==1){
                                    switch(i){
                                        case 0: //Harina
                                            cantidad = carrito[1][0];
                                            precio = harina.getPrecio();
                                            System.out.println("> "+almacenComida[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 1: //Salsa
                                            cantidad = carrito[1][1];
                                            precio = salsa.getPrecio();
                                            System.out.println("> "+almacenComida[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 2:
                                            cantidad = carrito[1][2];
                                            precio = leche.getPrecio();
                                            System.out.println("> "+almacenComida[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 3:
                                            cantidad = carrito[1][3];
                                            precio = sal.getPrecio();
                                            System.out.println("> "+almacenComida[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 4:
                                            cantidad = carrito[1][4];
                                            precio = azucar.getPrecio();
                                            System.out.println("> "+almacenComida[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 5:
                                            cantidad = carrito[1][5];
                                            precio = aceite.getPrecio();
                                            System.out.println("> "+almacenComida[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 6:
                                            cantidad = carrito[1][6];
                                            precio = maizina.getPrecio();
                                            System.out.println("> "+almacenComida[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 7:
                                            cantidad = carrito[1][7];
                                            precio = margarina.getPrecio();
                                            System.out.println("> "+almacenComida[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 8:
                                            cantidad = carrito[1][8];
                                            precio = lapiz.getPrecio();
                                            System.out.println("> "+almacenPapeleria[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 9:
                                            cantidad = carrito[1][9];
                                            precio = sacapuntas.getPrecio();
                                            System.out.println("> "+almacenPapeleria[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 10:
                                            cantidad = carrito[1][10];
                                            precio = hoja.getPrecio();
                                            System.out.println("> "+almacenPapeleria[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 11:
                                            cantidad = carrito[1][11];
                                            precio = portaminas.getPrecio();
                                            System.out.println("> "+almacenPapeleria[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 12:
                                            cantidad = carrito[1][12];
                                            precio = borrador.getPrecio();
                                            System.out.println("> "+almacenPapeleria[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 13:
                                            cantidad = carrito[1][i];
                                            precio = creyones.getPrecio();
                                            System.out.println("> "+almacenPapeleria[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 14:
                                            cantidad = carrito[1][i];
                                            precio = juegogeometrico.getPrecio();
                                            System.out.println("> "+almacenPapeleria[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 15:
                                            cantidad = carrito[1][i];
                                            precio = compas.getPrecio();
                                            System.out.println("> "+almacenPapeleria[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 16:
                                            cantidad = carrito[1][i];
                                            precio = television.getPrecio();
                                            System.out.println("> "+almacenElectronico[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 17:
                                            cantidad = carrito[1][i];
                                            precio = telefono.getPrecio();
                                            System.out.println("> "+almacenElectronico[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 18:
                                            cantidad = carrito[1][i];
                                            precio = microondas.getPrecio();
                                            System.out.println("> "+almacenElectronico[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 19:
                                            cantidad = carrito[1][i];
                                            precio = tablet.getPrecio();
                                            System.out.println("> "+almacenElectronico[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 20:
                                            cantidad = carrito[1][i];
                                            precio = aire.getPrecio();
                                            System.out.println("> "+almacenElectronico[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        case 21:
                                            cantidad = carrito[1][i];
                                            precio = nevera.getPrecio();
                                            System.out.println("> "+almacenElectronico[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }
                            System.out.println("------------------------------------------");
                            System.out.println("Total Artículos: "+totalProductos);
                            System.out.println("Total a Pagar: "+cuenta+" Bs. \n");
                            System.out.println(">> Ingrese ENTER para continuar...");
                            enter = entrada.nextLine();
                            confirmarCompra = JOptionPane.showConfirmDialog(null,"¿Está seguro que desea proceder con la compra?","CONFIRMAR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                            if(confirmarCompra==0){ //PROCEDER CON LA COMPRA
                                    int cadenaCaracteres;
                                    do{ //Validación de Nombre
                                        nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre: ");
                                        if(nombre!=null){
                                            cadenaCaracteres = nombre.length();
                                            for(int i=0; i<cadenaCaracteres; i++){
                                                String comprobar = nombre.substring(i,i+1);
                                                if(Auxiliar.isNumeric(comprobar)){
                                                    JOptionPane.showMessageDialog(null,"El nombre solo debe contener LETRAS. Intente nuevamente","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                    salirValidacion = false;
                                                    i=cadenaCaracteres;
                                                }
                                                else{
                                                    salirValidacion=true;
                                                    i=cadenaCaracteres;
                                                }
                                            }

                                            if(nombre.length()<3){
                                                JOptionPane.showMessageDialog(null,"El nombre necesita tener al menos 3 carácteres. Intente nuevamente. ","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                salirValidacion = false;
                                            }
                                        }
                                        else{
                                            salirValidacion=true;
                                            continuar = false;
                                        }
                                    } while(salirValidacion!=true); 
                                    
                                    if(continuar==true){
                                        do{ //Validación de Apellido
                                            apellido = JOptionPane.showInputDialog(null,"Ingrese su apellido: ");
                                            if(apellido!=null){
                                                cadenaCaracteres = apellido.length();
                                                for(int i=0; i<cadenaCaracteres; i++){
                                                    String comprobar = apellido.substring(i,i+1);
                                                    if(Auxiliar.isNumeric(comprobar)){
                                                        JOptionPane.showMessageDialog(null,"El apellido solo debe contener LETRAS. Intente nuevamente","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValidacion = false;
                                                        i=cadenaCaracteres;
                                                    }
                                                    else{
                                                        salirValidacion=true;
                                                    }
                                                }

                                                if(apellido.length()<3){
                                                    JOptionPane.showMessageDialog(null,"El apellido necesita tener al menos 3 carácteres. Intente nuevamente. ","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                    salirValidacion = false;
                                                }
                                            }
                                            else{
                                                salirValidacion=true;
                                                continuar = false;
                                            }
                                        } while(salirValidacion!=true);
                                    }
                                    
                                    if(continuar==true){
                                        do{ //Validación de Cedula
                                            cedulaStr = JOptionPane.showInputDialog(null,"Ingrese su cedula de identidad: ");
                                            if(cedulaStr!=null){
                                                cadenaCaracteres = cedulaStr.length();
                                                for(int i=0; i<cadenaCaracteres; i++){
                                                    String comprobar = cedulaStr.substring(i,i+1);
                                                    if(Auxiliar.isNumeric(comprobar)){
                                                        salirValidacion = true;
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null,"La cedula solo debe contener NÚMEROS. Intente nuevamente","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValidacion=false;
                                                        i=cadenaCaracteres;
                                                    }
                                                }
                                            }
                                            else{
                                                salirValidacion=true;
                                                continuar = false;
                                            }
                                            if(cedulaStr.length()<5){
                                                JOptionPane.showMessageDialog(null,"La cédula necesita tener al menos 5 digitos. Intente nuevamente. ","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                salirValidacion = false;
                                            }
                                            if(cedulaStr.length()>8){
                                                JOptionPane.showMessageDialog(null,"La cédula ingresada excede el rango de validez, debe tener como máximo 8 dígitos. Intente nuevamente. ","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                salirValidacion = false; 
                                            }
                                        } while(salirValidacion!=true);
                                    }
                                    
                                    //  Tipo de CUENTA
                                    if(continuar==true){
                                        cuentaOpcion = JOptionPane.showOptionDialog(null,"Selecciona el tipo de cuenta","INGRESAR DATOS",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,tipoCuenta,tipoCuenta[0]);
                                    
                                        do{ //Validación de CLAVE
                                            claveStr = JOptionPane.showInputDialog(null,"Ingrese su clave: ");
                                            cadenaCaracteres = claveStr.length();
                                            for(int i=0; i<cadenaCaracteres; i++){
                                                String comprobar = claveStr.substring(i,i+1);
                                                if(Auxiliar.isNumeric(comprobar)){
                                                    if(claveStr.length()<4){
                                                        JOptionPane.showMessageDialog(null,"La clave debe tener 4 digitos como mínimo y 6 como máximo. Intente nuevamente","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValidacion = false;
                                                        i = cadenaCaracteres;
                                                    }
                                                    else if(claveStr.length()>6){
                                                        JOptionPane.showMessageDialog(null,"La clave debe tener 4 digitos como mínimo y 6 como máximo. Intente nuevamente","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                        salirValidacion = false;
                                                        i = cadenaCaracteres;
                                                    }
                                                    else {
                                                        salirValidacion = true;
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null,"El apellido solo debe contener LETRAS. Intente nuevamente","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                    salirValidacion = false;
                                                }
                                            }

                                            if(apellido.length()<3){
                                                JOptionPane.showInputDialog(null,"El apellido necesita tener al menos 3 carácteres. Intente nuevamente. ","INGRESAR DATOS",JOptionPane.WARNING_MESSAGE);
                                                salirValidacion = false;
                                            }
                                        } while(salirValidacion!=true);
                                    }
                                    
                                    if(continuar==true){
                                        //GENERAR FACTURA
                                        System.out.println("---------------------<FACTURA>---------------------");
                                        System.out.println("EMPRESA: Supermercado D&J");
                                        System.out.println("<DATOS DEL CLIENTE>\n");
                                        System.out.println("Cliente: "+nombre+" "+apellido+"\n"
                                                            +"Cédula: "+cedulaStr+"\n");
                                        System.out.println("---------------------<COMPRA>---------------------");
                                        for(int i=0; i<22;i++){
                                            if(carrito[0][i]==1){
                                                switch(i){
                                                    case 0: //Harina
                                                        cantidad = carrito[1][0];
                                                        precio = harina.getPrecio();
                                                        System.out.println("> "+almacenComida[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 1: //Salsa
                                                        cantidad = carrito[1][1];
                                                        precio = salsa.getPrecio();
                                                        System.out.println("> "+almacenComida[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 2:
                                                        cantidad = carrito[1][2];
                                                        precio = leche.getPrecio();
                                                        System.out.println("> "+almacenComida[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 3:
                                                        cantidad = carrito[1][3];
                                                        precio = sal.getPrecio();
                                                        System.out.println("> "+almacenComida[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 4:
                                                        cantidad = carrito[1][4];
                                                        precio = azucar.getPrecio();
                                                        System.out.println("> "+almacenComida[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 5:
                                                        cantidad = carrito[1][5];
                                                        precio = aceite.getPrecio();
                                                        System.out.println("> "+almacenComida[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 6:
                                                        cantidad = carrito[1][6];
                                                        precio = maizina.getPrecio();
                                                        System.out.println("> "+almacenComida[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 7:
                                                        cantidad = carrito[1][7];
                                                        precio = margarina.getPrecio();
                                                        System.out.println("> "+almacenComida[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 8:
                                                        cantidad = carrito[1][8];
                                                        precio = lapiz.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 9:
                                                        cantidad = carrito[1][9];
                                                        precio = sacapuntas.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 10:
                                                        cantidad = carrito[1][10];
                                                        precio = hoja.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 11:
                                                        cantidad = carrito[1][11];
                                                        precio = portaminas.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 12:
                                                        cantidad = carrito[1][12];
                                                        precio = borrador.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 13:
                                                        cantidad = carrito[1][i];
                                                        precio = creyones.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 14:
                                                        cantidad = carrito[1][i];
                                                        precio = juegogeometrico.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[6]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 15:
                                                        cantidad = carrito[1][i];
                                                        precio = compas.getPrecio();
                                                        System.out.println("> "+almacenPapeleria[7]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 16:
                                                        cantidad = carrito[1][i];
                                                        precio = television.getPrecio();
                                                        System.out.println("> "+almacenElectronico[0]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 17:
                                                        cantidad = carrito[1][i];
                                                        precio = telefono.getPrecio();
                                                        System.out.println("> "+almacenElectronico[1]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 18:
                                                        cantidad = carrito[1][i];
                                                        precio = microondas.getPrecio();
                                                        System.out.println("> "+almacenElectronico[2]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 19:
                                                        cantidad = carrito[1][i];
                                                        precio = tablet.getPrecio();
                                                        System.out.println("> "+almacenElectronico[3]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 20:
                                                        cantidad = carrito[1][i];
                                                        precio = aire.getPrecio();
                                                        System.out.println("> "+almacenElectronico[4]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                    case 21:
                                                        cantidad = carrito[1][i];
                                                        precio = nevera.getPrecio();
                                                        System.out.println("> "+almacenElectronico[5]+" ("+cantidad+" x "+precio+")      =  "+(cantidad*precio));
                                                        break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                        }        
                                    }
                                    
                                    if(continuar==true){
                                    System.out.println("------------------------------------------");
                                    System.out.println("Total Artículos: "+totalProductos);
                                    System.out.println("Total Pagado: "+cuenta+" Bs. \n");
                                    System.out.println(">> Ingrese ENTER para continuar...");
                                    enter = entrada.nextLine();
                                    
                                    JOptionPane.showMessageDialog(null,"Muchas gracias por su compra! Que tenga un buen día");
                                    salirMenu=true;
                                    }
                                    }
                        } 
                        else { //Si no se han agregado productos al carrito, se devolverá al menú principal
                            JOptionPane.showMessageDialog(null,"No se han agregado productos al carrito. Para realizar una compra necesita agregar al menos un (1) producto. ","COMPRA",JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case "Salir": //SALIR
                        int verificar = (int) JOptionPane.showConfirmDialog(null,"¿Está seguro que desea salir del programa?","CONFIRMAR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                        if(verificar==0){
                            salirMenu = true;
                        }
                        break;
                    default:
                        break;
                }
            }
            else { //Si el usuario presiona la tecla CANCELAR dentro del Menú Principal
                int verificar = (int) JOptionPane.showConfirmDialog(null,"¿Desea salir del programa?","CONFIRMAR",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                        if(verificar==0){
                            salirMenu = true;
                        }
            }
        } while (salirMenu!=true);
        
        JOptionPane.showMessageDialog(null,"Gracias por visitarnos!");
    }
    
}
