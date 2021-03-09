package mx.unam.aragon.dp;

public class UsarEmpleado {
    
    public static void main (String[] args) {
        
        Empleado empl = new Empleado (1, "Sistemas", 45000.0f, 15);
        
        empl.setNombre("Juan José");
        empl.setApPaterno("García");
        empl.setApPaterno("Bolaños");
        empl.setEdad(24);
        empl.setCurp("GABJ121212HDFTR2");
        
        System.out.println("info: " + empl);
        
        
    }
}
