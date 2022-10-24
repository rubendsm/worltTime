package worldTime;
import org.joda.time.*;
import org.joda.time.format.*;

/**
* Exercicio Engenharia Software II
* @author Ruben Magalhaes
* @version 1.0 
*/

public class worldTime {
    /**
     * Com base num país retorna a hora atual no formato hh:mm
     *
     * @param country escolher país para retornar a hora atual
     * @return Hora atual de um certo país (lisboa, londeres, tokyo)
     */
    public String getTimeByCountry(String country){
        switch(country) {
            case "Lisboa":
                country = "Europe/Lisbon";
                break;
            case "Londres":
                country = "Europe/London";
                break;
            case "Tokyo":
                country = "Asia/Tokyo";
                break;
            default:
                country = "Asia/Tokyo";
                break;
        }
         // hora atual no fuso horario padrao
        DateTime dt = new DateTime();
        // hora atual em tokyo
        DateTime dtTokyo = dt.withZone(DateTimeZone.forID(country));
        // muda para o formato horas:minutos hh:mm
        DateTimeFormatter fmt = DateTimeFormat.forPattern("hh:mm");
        String str = dtTokyo.toString(fmt);
        return str;
    }

    public static void main(String[] args) {
    
       System.out.println(new worldTime().getTimeByCountry("Tokyo"));
    }
}
