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
            System.out.println("\n1 - Cadastrar produto\n2 - Vender\n3 - Exibir estoque\n4 - Sair do programa\nEscolha a opção do menu: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch(escolha){

                case 1:
                    Produto p = new Produto();

                    System.out.println("Digite o codigo do produto: ");
                    p.setCodigo(sc.nextLine());

                    System.out.println("Digite o nome do produto: ");
                    p.setNome(sc.nextLine());

                    System.out.println("Deseja usar o atributo tamanho ou peso? S/N");
                    String resposta = sc.nextLine();

                    if ((resposta.toLowerCase()).startsWith("s")){
                        System.out.println("1 - Usar tamanho\n2 - Usar peso");
                        int escolha_atributo = sc.nextInt();

                        if (escolha == 1){
                            System.out.println("Digite o tamanho do produto em metros: ");
                            p.setTamanho(sc.nextDouble());
                        }else if(escolha == 2){
                            System.out.println("Digite o peso do produto: ");
                            p.setPeso(sc.nextDouble());
                        }else{
                            System.out.println("Erro: Opção invalida!");
                        }
                    }

                    System.out.println("Digite a cor do produto: ");
                    p.setCor(sc.nextLine());

                    System.out.println("Digite o valor do produto: ");
                    p.setValor(sc.nextDouble());

                    System.out.println("Digite a quantidade que deseja adicionar em estoque do produto: ");
                    p.setQuantidadeEstoque(sc.nextInt());

                    break;

                case 2:
                    Produto.exibirListaProdutos(listaProdutos);
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Estoque vazio");
                        break;
                    }

                    System.out.println("Digite o código do produto que você quer comprar: ");
                    String codigoEscolha = sc.nextLine();
                    Produto temp = null;

                    for (Produto produto : listaProdutos) {
                        if(produto.getCodigo() == codigoEscolha) {
                            temp = produto;
                            break;
                        }
                    }

                    if(temp == null){
                        System.out.println("Erro: Código de produto não existe em estoque!");
                        break;
                    }

                    System.out.println("Digite a quantidade que voce quer comprar do produto");


                case 3:
                    Produto.exibirListaProdutos(listaProdutos);
                    break;

                case 4:
                    System.out.println("Saindo do programa!");
                    break;

                default:
                    System.out.println("Erro: Opção invalida!");
                    break;
                }
            }
        }
}
