package segundaSemana.exercicioQuatro.teste;

import segundaSemana.exercicioQuatro.classes.UsuarioBase;
import segundaSemana.exercicioQuatro.classes.UsuarioPremium;
import segundaSemana.exercicioQuatro.classes.UsuarioStandart;

public class Menu {
    public static void main(String[] args) {
        double valorProduto = 500;
        double valorFrete = 50;


        UsuarioBase usuarioBase = new UsuarioBase();
        System.out.println(
                "Usuario: " + usuarioBase.getTipoUsuario() + "\n"+
                "Valor Desconto Produto: " + usuarioBase.getValorDesconto(valorProduto).toString() +"\n"+
                "Valor Desconto Frete: " + usuarioBase.getValorFreteDesconto(valorFrete, valorProduto).toString()+"\n"
        );


        UsuarioStandart usuarioStandart = new UsuarioStandart();
        System.out.println(
                "Usuario: " + usuarioStandart.getTipoUsuario() + "\n"+
                        "Valor Desconto Produto: " + usuarioStandart.getValorDesconto(valorProduto).toString() +"\n"+
                        "Valor Desconto Frete: " + usuarioStandart.getValorFreteDesconto(valorFrete, valorProduto).toString()+"\n"
        );


        UsuarioPremium usuarioPremium = new UsuarioPremium();
        System.out.println(
                "Usuario: " + usuarioPremium.getTipoUsuario() + "\n"+
                        "Valor Desconto Produto: " + usuarioPremium.getValorDesconto(valorProduto).toString() +"\n"+
                        "Valor Desconto Frete: " + usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto).toString()
        );

    }
}
