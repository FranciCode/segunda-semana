package segundaSemana.exercicioQuatro.interfaces;

public interface Usuario {

    Double getValorDesconto(double valorProduto);

    String getTipoUsuario();

    Double getValorFreteDesconto(double valorValorFrete, double valorProduto);
}
