/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Automovil extends Transporte implements ISistemaElectrico{
    
    private double gas = 0;
	
    @Override
    public String encender(double gas){
        String msg;
	this.gas = gas;
        if (this.gas > 1)
            msg = "Automovil Encendido";
        else
            msg = "Sin gasolina";
        
        return msg;
    }
    
    @Override
    public void apagar(){
	System.out.println("Automovil apagado");
    }

    @Override
    public String encenderLuces(){
	return "Luces encendidas";
    }
	
    
}
