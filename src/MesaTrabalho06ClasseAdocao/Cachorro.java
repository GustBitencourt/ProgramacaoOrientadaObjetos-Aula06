package MesaTrabalho06ClasseAdocao;

import java.util.Calendar;

public class Cachorro {
    private String raca;
    private Integer anoNascimento;
    private Double peso;
    private Boolean estaFerido;
    private String primeiroNome;

    public Cachorro(String raca, Integer anoNascimento, Double peso, Boolean estaFerido, String primeiroNome) {
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.estaFerido = estaFerido;
        this.primeiroNome = primeiroNome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(Boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    private Integer calcularIdade(){
        return  Calendar.getInstance().get(Calendar.YEAR) - getAnoNascimento();
    }

    private String podeSerAdotado(){
        if(getEstaFerido().equals(false) && getPeso() > 5.0){
            return "pode ser adotado";
        }else {
            return "Não pode ser adotado";
        }

    }

    @Override
    public String toString() {
        return "\nNome do cachorro: " +
                getPrimeiroNome() +
                "\nSua raça é " +
                getRaca() +
                "\nSua idade em anos é: " +
                calcularIdade() +
                "\nSeu peso: " +
                String.format("%.2f", getPeso()) +
                " kilos \n" + podeSerAdotado();
    }
}

