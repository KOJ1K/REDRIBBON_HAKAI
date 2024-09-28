package teste_hash;

import redribbon.RedRibbon;

public class TestRedRibbon {
    public static void main(String[] args) {
        RedRibbon redRibbon = new RedRibbon();

        // Caminho do arquivo local para calcular a hash
        String filePath = "C:\\OneDriveTemp\\ssl pining.txt"; // Insira o caminho correto do seu arquivo

        // URL do arquivo contendo o hash no GitHub
        String gitHubFileUrl = "https://raw.githubusercontent.com/MatheusRosa800/testehash/refs/heads/main/ssl%20pining.txt"; // Insira a URL correta do hash no GitHub

        // Testar a função isTampering
        boolean tampered = redRibbon.isTampering(filePath, gitHubFileUrl);
        if (tampered) {
            System.out.println("Tampering Alert: O arquivo foi adulterado.");
        } else {
            System.out.println("Passou: O arquivo não foi adulterado.");
        }
    }
}
