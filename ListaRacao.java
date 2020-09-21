

public class ListaRacao {
    private final String[] marcas;
    private String nome;

    public ListaRacao() {
        marcas = new String[10];
    }

    public void MarcaRacao(String nome) throws RacaoMensagem {

        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] == null) {
                marcas[i] = nome;
                return;
            }
        }
        throw new RacaoMensagem("O estoque está completo.");
    }



    public String EstoqueRacao() {
        StringBuilder sb = new StringBuilder();
        for (String marcas : marcas) {
            if (marcas == null) {
                return sb.toString();
            }
            sb.append(marcas + "\n");
        }
        return sb.toString();
    }



}

