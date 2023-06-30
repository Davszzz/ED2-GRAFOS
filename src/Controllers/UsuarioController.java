/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Models.Usuario;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Davs
 */
public class UsuarioController {
    
    private ArrayList<Usuario> lstusu ;
    
    public UsuarioController()
    {
        lstusu = new ArrayList<>();
        cargar();
    }
    
    public Usuario get(int pos)
    {
        return lstusu.get(pos);
    }
    
    public int size()
    {
        return lstusu.size();
    }
    
    public void add(Usuario usu)
    {
        lstusu.add(usu);
    }
    
    public int getCorrelativo()
    {
        if(lstusu.isEmpty())
        {
            return 1;
        }
        else
        {
            return lstusu.get(size()-1).getCod();
        }
    }
    
    public void cargar()
    {
        try
        {
            BufferedReader br;
            String linea = null;
            String[] array = null;
            br = new BufferedReader(new FileReader("Usuarios.csv"));
       
            while((linea = br.readLine())!= null)
            {
                array = linea.split(";");
                Usuario a = new Usuario (Integer.parseInt(array[0].trim()),
                               array[1].trim(),
                               array[2].trim(),
                               Integer.parseInt(array[3].trim()));
                add(a);
            }
            br.close();
         }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void grabar()
    {
        try
        {  
            PrintWriter pw;
            String linea;
            pw = new PrintWriter(new FileWriter("Usuarios.csv"));         
            for(int i=0;i<size();i++)
            {
                linea = (lstusu.get(i).getCod() + ";" +
                        get(i).getUsuario() + ";" +
                        get(i).getContra() + ";" +
                        get(i).getCodc() + ";");
                pw.println(linea); 
            }  
            pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }     
      
    }
    public boolean Credenciales(String usu, String contra )
    {
         for(int i=0; i<lstusu.size();i++)
        {
            if(lstusu.get(i).getUsuario().equals(usu) && lstusu.get(i).getContra().equals(contra))
            {
                return true;
            }
        }
        return false;//No lo encontro
    }
    
    public Usuario obtenerObjeto(String usu, String contra )
    {
        for(Usuario x: lstusu)
        {
            if(x.getUsuario().equals(usu) && x.getContra().equals(contra))
            {
                return x;
            } 
        }
        return null;//No lo encontro
    }
    
}
