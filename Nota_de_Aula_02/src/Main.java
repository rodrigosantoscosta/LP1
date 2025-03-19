import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();
//        Produto batata = new Produto("1","Batata",2.53);
//        listaProdutos.add(batata);

        boolean key = true;
        int escolha = 0;

        while(key){
            System.out.println("\n1 - Cadastrar produto\n2 - Vender\n3 - Exibir estoque\n4 - Adicionar estoque\n5 - Sair do programa\nEscolha a opção do menu: ");
            escolha = sc.nextInt();
            sc.nextLine();// Reset do buffer do scanner

            switch(escolha){

                case 1:
                    Produto p = new Produto();

                    System.out.println("Digite o codigo do produto: ");
                    p.setCodigo(sc.next());

                    System.out.println("Digite o nome do produto: ");
                    p.setNome(sc.next());

                    System.out.println("Deseja usar o atributo tamanho ou peso? S/N");
                    String resposta = sc.next();

                    if ((resposta.toLowerCase()).startsWith("s")){
                        System.out.println("1 - Usar tamanho\n2 - Usar peso");
                        int escolha_atributo = sc.nextInt();

                        if (escolha_atributo == 1){
                            System.out.println("Digite o tamanho do produto em metros: ");
                            p.setTamanho(sc.nextDouble());
                        }else if(escolha_atributo == 2){
                            System.out.println("Digite o peso do produto: ");
                            p.setPeso(sc.nextDouble());
                        }else{
                            System.out.println("Erro: Opção invalida!");
                        }
                    }

                    System.out.println("Digite a cor do produto: ");
                    p.setCor(sc.next());

                    System.out.println("Digite o valor do produto: ");
                    p.setValor(sc.nextDouble());

                    System.out.println("Digite a quantidade que deseja adicionar em estoque do produto: ");
                    p.setQuantidadeEstoque(sc.nextInt());

                    listaProdutos.add(p);

                    break;

                case 2:
                    Produto.exibirListaProdutos(listaProdutos);
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Estoque vazio");
                        break;
                    }

                    System.out.println("Digite o código do produto que você quer vender: ");
                    String codigoEscolha = sc.next();
                    Produto temp = null;

                    for (Produto produto : listaProdutos) {
                        if(Objects.equals(produto.getCodigo(), codigoEscolha)) {
                            temp = produto;
                            break;
                        }
                    }

                    if(temp == null){
                        System.out.println("Erro: Código de produto não existe em estoque!");
                        break;
                    }

                    System.out.println("Digite a quantidade que voce quer vender do produto: ");
                    int quantidadeVenda = sc.nextInt();

                    if (temp.getQuantidadeEstoque() < quantidadeVenda) {
                        System.out.println("Estoque insuficiente!");
                        break;
                    }

                    System.out.println("1 - Pix\n2 - Espécie\n3 - Transferência\n" +
                            "4 - Débito\n5 - Crédito em até 3x sem juros\nPix, Espécie, Transferência ou Débito tem 5% de desconto!" +
                            "\n\nSelecione a forma de pagamento:");
                    int escolhaPagamento = sc.nextInt();

                    double valorTotal = temp.getValor() * quantidadeVenda;
                    boolean vendaConluida = true;

                    switch(escolhaPagamento){
                        case 1 | 3 | 4:
                            valorTotal = valorTotal * 0.95;
                            System.out.println("Valor total com  5% de desconto aplicado: " + String.format("%.2f", valorTotal));

                            break;

                        case 2:
                            valorTotal = valorTotal * 0.95;
                            System.out.println("Valor total com  5% de desconto aplicado: " + String.format("%.2f", valorTotal));

                            System.out.println("Digite o valor em especie do pagamento: ");
                            double pagamentoEspecie = sc.nextDouble();


                            System.out.println("Troco: R$ " + String.format("%.2f", pagamentoEspecie - valorTotal));

                            break;

                        case 5:
                            System.out.println("Em quantas vezes deseja parcelar?");
                            int escolhasParcelas = sc.nextInt();

                            if(escolhasParcelas >= 1 && escolhasParcelas <= 3){
                                System.out.println("Valor total: R$ " +  String.format("%.2f", valorTotal) +
                                        " dividido em parcelas de " + escolhasParcelas +
                                        "x " + String.format("%.2f",valorTotal / escolhasParcelas));
                            }else{
                                System.out.println("Erro: Escolha de parcelas inválida!");
                                vendaConluida = false;
                            }
                            break;

                        default:
                            System.out.println("Erro: Forma de pagamento inválida");
                            vendaConluida = false;
                    }

                    if(vendaConluida){
                        System.out.println("Venda concluida");
                        temp.setQuantidadeEstoque(temp.getQuantidadeEstoque() - quantidadeVenda);
                    }

                    break;

                case 3:
                    Produto.exibirListaProdutos(listaProdutos);
                    break;

                case 4:
                    Produto.exibirListaProdutos(listaProdutos);

                    System.out.println("Digite a quantidade a adicionar");
                    int quantidadeAdicionarEstoque = sc.nextInt();

                    System.out.println("Digite o código do produto que deseja adicionar unidades ao estoque: ");
                    String codigoAdicionarEstoque = sc.next();


                    Produto.adicionarEstoque(quantidadeAdicionarEstoque, codigoAdicionarEstoque, listaProdutos);

                    break;

                case 5:
                    System.out.println("Saindo do programa!");
                    key = false;

                    break;

                default:
                    System.out.println("Erro: Opção invalida!");
                    break;
            }
        }
    }
}
