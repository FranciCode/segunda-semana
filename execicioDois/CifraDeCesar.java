package segundaSemana.execicioDois;

import java.util.Scanner;

public class CifraDeCesar {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("---Cifra de Cesar--- ");
        while(numero == 0){
            System.out.println("Para Encriptografar digite: 1");
            System.out.println("Para Desincriptografar digite: 2");
            System.out.println("Para Sair digite: 3");

            int acao = new Scanner(System.in).nextInt();

            if(acao == 1){
                System.out.print("Digite um texto: ");
                String mensagem = new Scanner(System.in).nextLine();
                System.out.print("Digite um numero: ");
                int deslocamento = new Scanner(System.in).nextInt();

                String mensagemCriptografada = criptografar(mensagem.toLowerCase(), deslocamento);
                System.out.println("Mensagem criptografada: " + mensagemCriptografada +"\n");
            } else if(acao == 2){
                System.out.print("Digite um texto: ");
                String mensagem = new Scanner(System.in).nextLine();
                System.out.print("Digite um numero: ");
                int deslocamento = new Scanner(System.in).nextInt();

                String mensagemDescriptografada = descriptografar(mensagem.toLowerCase(), deslocamento);
                System.out.println("Mensagem descriptografada: " + mensagemDescriptografada + "\n");
            } else if(acao == 3){
                numero++;
                System.out.println("Obrigado!");
            }else{
                System.out.println("Nenhuma ação selecionada");
            }
        }

    }
    public static String criptografar(String mensagem, int deslocamento) {
        StringBuilder mensagemCriptografada = new StringBuilder();
        for (int i = 0; i < mensagem.length(); i++) {
            char ch = mensagem.charAt(i);
            if (Character.isLetter(ch)) {
                char chCriptografado = (char) (((ch - 'a') + deslocamento) % 26 + 'a');
                mensagemCriptografada.append(chCriptografado);
            } else {
                mensagemCriptografada.append(ch);
            }
        }
        return mensagemCriptografada.toString();
    }

    public static String descriptografar(String mensagemCriptografada, int deslocamento) {
        StringBuilder mensagemDescriptografada = new StringBuilder();
        for (int i = 0; i < mensagemCriptografada.length(); i++) {
            char ch = mensagemCriptografada.charAt(i);
            if (Character.isLetter(ch)) {
                char chDescriptografado = (char) (((ch - 'a') - deslocamento + 26) % 26 + 'a');
                mensagemDescriptografada.append(chDescriptografado);
            } else {
                mensagemDescriptografada.append(ch);
            }
        }
        return mensagemDescriptografada.toString();
    }
}
