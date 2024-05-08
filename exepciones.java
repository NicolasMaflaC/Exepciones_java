import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.net.BindException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.UnsupportedCharsetException;
import java.rmi.*;
import java.rmi.server.*;
import java.security.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.management.*;
import javax.net.ssl.*;
import javax.naming.*;
import javax.print.*;
import javax.script.*;
import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.kerberos.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.*;
import javax.security.auth.x500.*;
import javax.security.cert.*;
import javax.sound.sampled.*;
import javax.sql.*;
import javax.xml.crypto.*;
import javax.xml.parsers.*;
import javax.xml.stream.*;
import javax.xml.transform.*;
import javax.xml.validation.*;
import javax.xml.xpath.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Lanzar Excepción Verificada");
            System.out.println("2. Lanzar Excepción No Verificada");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int opcion = Integer.parseInt(reader.readLine());

                switch (opcion) {
                    case 0:
                        System.out.println("Saliendo del programa...");
                        return;
                    case 1:
                        lanzarExcepcionVerificada();
                        break;
                    case 2:
                        lanzarExcepcionNoVerificada();
                        break;
                    default:
                        System.out.println("Opción inválida, por favor intente de nuevo.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void lanzarExcepcionVerificada() throws RemoteException, NamingException, IOException, InterruptedException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, NoSuchProviderException, UnsupportedDataTypeException, AlreadyBoundException, FileNotFoundException, IOException, InvalidClassException, InvalidObjectException, NotActiveException, NotSerializableException, OptionalDataException, StreamCorruptedException, SyncFailedException, UTFDataFormatException, BindException, ConnectException, NoRouteToHostException, PortUnreachableException, ProtocolException, SocketException, SSLException, CharacterCodingException, UnsupportedCharsetException {
        while (true) {
            System.out.println("Seleccione una excepción verificada (1-50) o ingrese 0 para volver al menú principal:");
            System.out.println("1. ClassNotFoundException");
            System.out.println("2. CloneNotSupportedException");
            System.out.println("3. IllegalAccessException");
            System.out.println("4. InstantiationException");
            System.out.println("5. InterruptedException");
            System.out.println("6. NoSuchFieldException");
            System.out.println("7. NoSuchMethodException");
            System.out.println("8. NoSuchProviderException");
            System.out.println("9. RemoteException");
            System.out.println("10. UnsupportedDataTypeException");
            System.out.println("11. AlreadyBoundException");
            System.out.println("12. FileNotFoundException");
            System.out.println("13. IOException");
            System.out.println("14. InvalidClassException");
            System.out.println("15. InvalidObjectException");
            System.out.println("16. NotActiveException");
            System.out.println("17. NotSerializableException");
            System.out.println("18. OptionalDataException");
            System.out.println("19. StreamCorruptedException");
            System.out.println("20. SyncFailedException");
            System.out.println("21. UTFDataFormatException");
            System.out.println("22. BindException");
            System.out.println("23. ConnectException");
            System.out.println("24. NoRouteToHostException");
            System.out.println("25. PortUnreachableException");
            System.out.println("26. ProtocolException");
            System.out.println("27. SocketException");
            System.out.println("28. SSLException");
            System.out.println("29. CharacterCodingException");
            System.out.println("30. UnsupportedCharsetException");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int opcion = Integer.parseInt(reader.readLine());

                switch (opcion) {
                    case 0:
                        return;
                    case 1:
                        throw new ClassNotFoundException("Clase no encontrada");
                    case 2:
                        throw new CloneNotSupportedException("Clonación no soportada");
                    case 3:
                        throw new IllegalAccessException("Acceso ilegal");
                    case 4:
                        throw new InstantiationException("Instanciación ilegal");
                    case 5:
                        throw new InterruptedException("Interrupción de hilo");
                    case 6:
                        throw new NoSuchFieldException("Campo no encontrado");
                    case 7:
                        throw new NoSuchMethodException("Método no encontrado");
                    case 8:
                        throw new NoSuchProviderException("Proveedor no encontrado");
                    case 9:
                        throw new RemoteException("Error remoto");
                    case 10:
                        throw new UnsupportedDataTypeException("Tipo de dato no soportado");
                    case 11:
                        throw new AlreadyBoundException("Objeto ya enlazado");
                    case 12:
                        throw new FileNotFoundException("Archivo no encontrado");
                    case 13:
                        throw new IOException("Error de entrada/salida");
                    case 14:
                        throw new InvalidClassException("Clase no válida", "Main");
                    case 15:
                        throw new InvalidObjectException("Objeto no válido");
                    case 16:
                        throw new NotActiveException("Objeto no activo");
                    case 17:
                        throw new NotSerializableException("Objeto no serializable");
                    case 18:
                        throw new OptionalDataException(10);
                    case 19:
                        throw new StreamCorruptedException("Flujo de datos corrupto");
                    case 20:
                        throw new SyncFailedException("Fallo de sincronización");
                    case 21:
                        throw new UTFDataFormatException("Datos UTF-8 mal formateados");
                    case 22:
                        throw new BindException("Error de enlace");
                    case 23:
                        throw new ConnectException("Error de conexión");
                    case 24:
                        throw new NoRouteToHostException("No hay ruta al host");
                    case 25:
                        throw new PortUnreachableException("Puerto inalcanzable");
                    case 26:
                        throw new ProtocolException("Error de protocolo");
                    case 27:
                        throw new SocketException("Error de socket");
                    case 28:
                        throw new SSLException("Error de SSL");
                    case 29:
                        throw new CharacterCodingException();
                    case 30:
                        throw new UnsupportedCharsetException("Conjunto de caracteres no soportado");
                    default:
                        System.out.println("Opción inválida, por favor intente de nuevo.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void lanzarExcepcionNoVerificada() {
        while (true) {
            System.out.println("Seleccione una excepción no verificada (1-10) o ingrese 0 para volver al menú principal:");
            System.out.println("1. ArithmeticException");
            System.out.println("2. ArrayIndexOutOfBoundsException");
            System.out.println("3. ClassCastException");
            System.out.println("4. IllegalArgumentException");
            System.out.println("5. IllegalStateException");
            System.out.println("6. NullPointerException");
            System.out.println("7. NumberFormatException");
            System.out.println("8. AssertionError");
            System.out.println("9. ExceptionInInitializerError");
            System.out.println("10. UnsupportedOperationException");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int opcion = Integer.parseInt(reader.readLine());

                switch (opcion) {
                    case 0:
                        return;
                    case 1:
                        throw new ArithmeticException("Excepción aritmética");
                    case 2:
                        throw new ArrayIndexOutOfBoundsException("Índice fuera de límites del array");
                    case 3:
                        throw new ClassCastException("Casteo inválido");
                    case 4:
                        throw new IllegalArgumentException("Argumento ilegal");
                    case 5:
                        throw new IllegalStateException("Estado ilegal");
                    case 6:
                        throw new NullPointerException("Referencia nula");
                    case 7:
                        throw new NumberFormatException("Formato de número inválido");
                    case 8:
                        throw new AssertionError("Aserción fallida");
                    case 9:
                        throw new ExceptionInInitializerError("Error en inicializador estático");
                    case 10:
                        throw new UnsupportedOperationException("Operación no soportada");
                    default:
                        System.out.println("Opción inválida, por favor intente de nuevo.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
