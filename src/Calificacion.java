/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author LAB08
 */
public class Calificacion
{

public static void main(String[] args)
{      
float nota1;
float nota2;
float nota3;
float promedio;


 nota1=Integer.parseInt(JOptionPane.showInputDialog("digite la nota 1"));
 nota2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese notas2"));
 nota3=Integer.parseInt(JOptionPane.showInputDialog("ingrese notas3"));
 promedio = (nota1 + nota2 + nota3)/3;
 
    if (promedio >4) 
    {
     JOptionPane.showMessageDialog(null, "su nota es mayor que 4");
    }
    else
    {
        JOptionPane.showMessageDialog(null, "usted reprobo");
  
    }
        }  
}