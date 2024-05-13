
import javax.swing.JOptionPane;


public class Codigo_Vector {
    //declaramos variables
    public String carne[] =new String[3];
    public String alumno[] =new String[3];
    public int nota1[] =new int[3];
    public int nota2[] =new int[3];
    public double prom[] =new double[3];
    public String obs[] =new String[3];
    public int x=0;
    public String cadena="";

    public Codigo_Vector(){
    }
    
    public void ingreso(){
        //Codigo de ingreso de datos 
        for (x = 0; x < 3; x++) {//for para declarar
            carne[x]=JOptionPane.showInputDialog
            (null, "ingrese el carne");
            alumno[x]=JOptionPane.showInputDialog
            (null, "ingrese el nombre del alumno");
            nota1[x]=Integer.parseInt(JOptionPane.showInputDialog
            (null, "ingrese la nota 1:"));
            nota2[x]=Integer.parseInt(JOptionPane.showInputDialog
            (null, "ingrese la nota 2:"));
            prom[x]=(nota1[x]+nota2[x])/2;
            if (prom[x]>60){
                obs[x]="Aprobo";     
            }else{
                obs[x]="Reprobo";
            }
        }//cierre ciclo FOR
    }//CIERRE PROCEDIMIENTO
    public String impresion(){
        //Ciclo for para la impresion de datos 
        for (x=0; x<3; x++){
            cadena= cadena + carne[x]+"        "+alumno[x]+"       "+nota1[x]+
              "        " + nota2[x]+"         "+prom[x]+"         "+obs[x]+"\n";
        }
        return cadena;
    }
}

