package com.mjvschool.notificacao.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradorArquivo {
	public void gerarArquivoTxt(String contrato, String mensagem) {
		boolean windows = System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;
		String fileSeparator = File.separator;
        StringBuilder conteudo = new StringBuilder();
        conteudo.append(mensagem);

        String pastaAtual = System.getProperty("user.dir");
        String pasta = pastaAtual.substring(0,pastaAtual.lastIndexOf(fileSeparator));

        System.out.println("Diretório Destino: " + pasta);

        StringBuilder dirPath = new StringBuilder();
		if(!windows)
			dirPath.append(pasta.concat(fileSeparator).concat("agua-luz-output").concat(fileSeparator));
        else
			dirPath.append("C:\\estudo\\mjv-java-school\\agua-luz-output");


        File output = new File(dirPath.toString());
        if(!output.exists())
            output.mkdirs();

        Path path = Paths.get(dirPath.toString().concat(fileSeparator).concat("contrato-").concat(contrato).concat(".txt"));

        try {
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
