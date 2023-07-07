package segundaSemana.exercicioQuatro.classes;

import segundaSemana.exercicioQuatro.interfaces.Usuario;

public class UsuarioStandart implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        double valorDesconto = (valorProduto * 0.15);
        if (valorProduto > 200) {
            return valorDesconto;
        }
        return (double) 0;
    }

    @Override
    public String getTipoUsuario() {
        return "Standart";
    }

    @Override
    public Double getValorFreteDesconto(double valorFrete, double valorProduto) {
        double valorDesconto = (valorFrete * 0.10);
        if (valorProduto > 200) {
            return valorDesconto;
        }
        return (double) 0;
    }
}
