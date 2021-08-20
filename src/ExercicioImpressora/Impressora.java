package ExercicioImpressora;

import java.time.LocalDate;
import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoDeConenxao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora (String modelo, String tipoDeConenxao, LocalDate  dataFabricacao) {
        this.modelo = modelo;
        this.tipoDeConenxao = tipoDeConenxao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoDeConenxao() {
        return tipoDeConenxao;
    }

    public void setTipoDeConenxao(String tipoDeConenxao) {
        this.tipoDeConenxao = tipoDeConenxao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel(){
        if(folhasDisponiveis >0 ){
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(String texto) {
        if(temPapel()) {
            System.out.println(texto);
        } else {
            System.out.println("Não foi possível fazer a impressão, pois não há papel");
        }
    }
}
