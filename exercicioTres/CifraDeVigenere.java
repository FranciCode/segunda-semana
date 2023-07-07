package segundaSemana.exercicioTres;

import java.util.Scanner;

public class CifraDeVigenere {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("---Cifra de Vigenère--- ");
        while (numero == 0) {
            System.out.println("Para Criptografar digite: 1");
            System.out.println("Para Desincriptografar digite: 2");
            System.out.println("Para Sair digite: 3");

            int acao = new Scanner(System.in).nextInt();

            if (acao == 1) {
                System.out.print("Digite um texto: ");
                String mensagem = new Scanner(System.in).nextLine();
                System.out.print("Digite uma palavra-chave: ");
                String palavraChave = new Scanner(System.in).next();

                String mensagemCriptografada = criptografar(mensagem, palavraChave);
                System.out.println("Mensagem criptografada: " + mensagemCriptografada + "\n");
            } else if (acao == 2) {
                System.out.print("Digite um texto: ");
                String mensagem = new Scanner(System.in).nextLine();
                System.out.print("Digite um palavra-chave: ");
                String palavraChave = new Scanner(System.in).next();

                String mensagemDescriptografada = descriptografar(mensagem, palavraChave);
                System.out.println("Mensagem descriptografada: " + mensagemDescriptografada + "\n");
            } else if (acao == 3) {
                numero++;
                System.out.println("Obrigado!");
            } else {
                System.out.println("Nenhuma ação selecionada");
            }
        }

    }

    public static String criptografar(String mensagem, String palavraChave) {
        StringBuilder mensagemCriptografada = new StringBuilder();
        int mensagemLength = mensagem.length();
        int chaveLength = palavraChave.length();

        for (int i = 0; i < mensagemLength; i++) {
            char ch = mensagem.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                int deslocamento = palavraChave.charAt(i % chaveLength) - base;
                char chCriptografado = (char) (((ch - base + deslocamento) % 26) + base);
                mensagemCriptografada.append(chCriptografado);
            } else {
                mensagemCriptografada.append(ch);
            }
        }
        return mensagemCriptografada.toString();
    }

    public static String descriptografar(String mensagemCriptografada, String palavraChave) {
        StringBuilder mensagemDescriptografada = new StringBuilder();
        int mensagemLength = mensagemCriptografada.length();
        int chaveLength = palavraChave.length();

        for (int i = 0; i < mensagemLength; i++) {
            char ch = mensagemCriptografada.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                int deslocamento = palavraChave.charAt(i % chaveLength) - base;
                char chDescriptografado = (char) (((ch - base - deslocamento + 26) % 26) + base);
                mensagemDescriptografada.append(chDescriptografado);
            } else {
                mensagemDescriptografada.append(ch);
            }
        }
        return mensagemDescriptografada.toString();
    }
}
