package segundaSemana.exercicioQuatro.classes;

import segundaSemana.exercicioQuatro.interfaces.Usuario;

public class UsuarioBase implements Usuario {


    @Override
    public Double getValorDesconto(double valorProduto) {
        double valorDesconto = (valorProduto * 0.05);
        if (valorProduto > 300) {
            return valorDesconto;
        }
        return (double) 0;
    }

    @Override
    public String getTipoUsuario() {
        return "Base";
    }

    @Override
    public Double getValorFreteDesconto(double valorFrete, double valorProduto) {
        double valorDesconto = (valorFrete * 0.05);
        if (valorProduto > 300) {
            return valorDesconto;
        }
        return (double) 0;
    }
}
