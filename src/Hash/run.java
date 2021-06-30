package Hash;

import util.ManiArquivo;

public class run {


    public static void main(String[] args) {
        TabelaHash<String, String> hashTable = new TabelaHash<>();
        String arquivo = "src\\Entrada\\entrada.txt";
        String[] convert = ManiArquivo.lerArquivo(arquivo);
        String linha;
        
        System.out.println("===== CARREGANDO TABELA HASH =====");
        for(int i = 0; i < convert.length; i++){
            linha = convert[i];
            String[] texto = linha.split(";");
            
            System.out.println(texto[0] + " - " + texto[1]);
            hashTable.add(texto[0],texto[1]); 
        }
        
        System.out.println("\nTabela hash tamanho: " + hashTable.size());
        
        String buscar = "src\\Entrada\\dado.txt";
        String[] search = ManiArquivo.lerArquivo(buscar);
        
        System.out.println("\n\n===== BUSCANDO TABELA HASH =====");
        for(int i = 0; i < search.length; i++){
            linha = search[i];
            System.out.println("Buscando chave "+linha+": "+hashTable.get(linha));
        }
    }   
}
