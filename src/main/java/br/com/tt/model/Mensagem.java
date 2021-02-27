package br.com.tt.model;

import java.time.LocalDateTime;


public class Mensagem {
    private String texto;
    private Long idUsuarioOrigem;
    private Long idUsuarioDestino;
    private LocalDateTime dataHoraEnvio;

    public Mensagem(String texto) {
        if(texto.length() < 5){
            System.out.println("Texto com menos de 5 caracteres");
        }else{
            this.texto = texto;
            dataHoraEnvio = LocalDateTime.now();
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setDataHoraEnvio(LocalDateTime dataHoraEnvio){
        this.dataHoraEnvio = dataHoraEnvio;
    }
}
