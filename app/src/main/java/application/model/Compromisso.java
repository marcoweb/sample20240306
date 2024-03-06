package application.model;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Compromisso extends AbstractAtividade {
    private Calendar dataInicial;
    private Calendar dataFinal;

    @Override
    public String getDetails() {
        return "[C] " + this.getDescricao() + " :: " + this.getDataInicial().getTime() + " :: " + this.getDataFinal().getTime();
    }

    public Calendar getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }
    public void setDataInicial(int dia, int mes, int ano) {
        Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia);
        this.dataInicial = c;
    }
    public Calendar getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }
    public void setDataFinal(int dia, int mes, int ano) {
        Calendar c = Calendar.getInstance();
        c.set(ano, mes, dia);
        this.dataFinal = c;
    }

    public Compromisso(String descricao, Calendar dataInicial, Calendar dataFinal) {
        this.setDescricao(descricao);
        this.setDataInicial(dataInicial);
        this.setDataFinal(dataFinal);
    }
    public Compromisso(String descricao, String dataInicial, String dataFinal) {
        List<String> dataInicialArray = Arrays.asList(dataInicial.split("\\s*/\\s*"));
        List<String> dataFinalArray = Arrays.asList(dataInicial.split("\\s*/\\s*"));
        System.out.println(dataInicialArray.get(2));
        this.setDescricao(descricao);
        this.setDataInicial(
            Integer.parseInt(dataInicialArray.get(0)),
            Integer.parseInt(dataInicialArray.get(1)),
            Integer.parseInt(dataInicialArray.get(2)));
        this.setDataFinal(
            Integer.parseInt(dataFinalArray.get(0)),
            Integer.parseInt(dataFinalArray.get(1)),
            Integer.parseInt(dataFinalArray.get(2)));
    }
}
