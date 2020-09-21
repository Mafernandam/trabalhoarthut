import javax.swing.JOptionPane;

public class CadastroRacao {

    public static void main(String[] args) throws RacaoMensagem {
        ListaRacao lista = new ListaRacao();
        String Marca;
        int opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    Marca = JOptionPane.showInputDialog("Marca e Preço: ");
                    lista.MarcaRacao(Marca);
                    JOptionPane.showMessageDialog(null, "Nova ração adicionada no estoque.");
                    break;

                case 2: 
                     String Marcas = lista.EstoqueRacao();

                    if (Marcas.length() > 0) {
                        JOptionPane.showMessageDialog(null, Marcas);
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há ração no estoque.");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tente novamente, amigo");
            }

        } while (opcao != 0);
    }

    private static int menu() {
        StringBuilder sb = new StringBuilder();
        sb.append("  *** CADASTRO DE RAÇÃO CANINA***");
        sb.append("\n(1) Adicionar uma nova marca no estoque");
        sb.append("\n(2) Apresentar o estoque");
        sb.append("\n(0) Sair");
        sb.append("\n Escolha: ");
        String opcao = JOptionPane.showInputDialog(sb);
        if (opcao== null) {
            return 0;
        }
        try {
            return Integer.parseInt(opcao);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}