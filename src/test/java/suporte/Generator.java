package suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

// classe necessaria para montar o nome do arquivo no formato certo
// independente do dia ou do mes que o teste ocorra, sempre vai pegar o atual
public class Generator {

    public static String dataHoraParaArquivo(){

        Timestamp ts = new Timestamp(System.currentTimeMillis());

        // retorna uma string com o formato ano, mes, dia, hora, minuto e segundo
        return new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-").format(ts);
    }
}
