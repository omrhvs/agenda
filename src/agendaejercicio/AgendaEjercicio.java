package AgendaEjercicio;

import javax.swing.JOptionPane;

public class AgendaEjercicio 
{
    public static final String lines = "==============================";
    public static void main(String[] args) 
    {
        
        String nombre, telefono, direccion;
        
        nombre = JOptionPane.showInputDialog(lines + "\nIngrese su Nombre\n" + lines);
        direccion = JOptionPane.showInputDialog(lines + "\nIngrese su Direccion\n" + lines);
        telefono = JOptionPane.showInputDialog(lines + "\nIngrese su Numero Telefonico\n" + lines);
        
        persona app = new persona();
        
        app.setNombre(nombre);
        app.setDirec(direccion);
        app.setTel(telefono);
        
        JOptionPane.showMessageDialog(null,
                lines + "\nNombre: "+app.getNombre() +
                "\nDireccion: " + app.getDirec() + "\nTelefono: " + app.getTel() +
                lines
        );
        
        persona2 app2 = new persona2 ();
        
        app2.setNombre("Omar");
        app2.setDirec("Hernandez");
        app2.setTel("5517803328");
        JOptionPane.showMessageDialog(null,lines + "\n" +
                "Nombre: "+app2.getNombre() + "\n" +
                "Direccion: " + app2.getDirec() + "\n" + 
                "Telefono: " + app2.getTel() + "\n" +
                lines
        );        
    }
}

