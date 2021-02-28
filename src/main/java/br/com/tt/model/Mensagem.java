package br.com.tt.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Mensagem {

    //static em atributo (constante ou não) - compartilha o mesmo atributo
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_DATE;

    private String texto;
    private LocalDateTime dataHoraEnvio;
    private Usuario origem;

    public Mensagem(String texto, Usuario usuario ) {
        if(texto.length() < 5){
            System.out.println("Texto com menos de 5 caracteres");
        }else{
            this.texto = texto;
            dataHoraEnvio = LocalDateTime.now();
            origem = usuario;
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setDataHoraEnvio(LocalDateTime dataHoraEnvio){
        this.dataHoraEnvio = dataHoraEnvio;
    }

    public String getDescricao(){
        return  String.format("Mensagem: %s\nData/Hora: %s\nAutor: %s\n\n",
                texto, dataHoraEnvio.format(DATE_TIME_FORMATTER),origem.getNome());
    }
}
