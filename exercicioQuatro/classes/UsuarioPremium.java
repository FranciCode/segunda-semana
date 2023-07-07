package segundaSemana.exercicioQuatro.classes;

import segundaSemana.exercicioQuatro.interfaces.Usuario;

public class UsuarioPremium implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        double valorDesconto = (valorProduto * 0.30);
        if (valorProduto > 200) {
            return valorDesconto;
        }
        return (double) 0;
    }

    @Override
    public String getTipoUsuario() {
        return "Premium";
    }

    @Override
    public Double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 100) {
            return valorFrete;
        }
        return (double) 0;    }
}
