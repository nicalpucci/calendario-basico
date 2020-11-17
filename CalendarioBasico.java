public class CalendarioBasico {
    
    private int dia;
    private int mes;
    private int ano;
    
    public CalendarioBasico(){
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    /**
     * metodo getter para obtener la fecha
     */
    public String obtenerFecha(){
        String obtenerFecha;
        String ceroDia = "";
        String ceroMes = "";
        String ceroAno = "";
        if(dia <= 9){
            ceroDia = "0";
        }
        if(mes <= 9){
            ceroMes = "0";
        }
        if(ano <= 9){
            ceroAno = "0";
        }
        obtenerFecha = (ceroDia + dia + "-" + ceroMes+mes + "-" + ceroAno+ano);
        return obtenerFecha;    
    }
    
    /**
     * metodo setter para fijar una fecha
     */
    public void fijarFecha(int diaFijado, int mesFijado, int anoFijado){
        dia = diaFijado;
        mes = mesFijado;
        ano = anoFijado;
        
    }
    
    /**
     * metodo para avanzar un dia mas
     */
    public void avanzarFecha(){
        dia++;
        if(dia > 30){
            dia = 1;
            mes++;
        }
        if(mes > 12){
            mes = 1;
            ano++;
        }
        if(ano > 99){
            ano = 1;
            dia = 1;
            mes = 1;
        }
    }
}