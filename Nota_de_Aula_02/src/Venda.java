public class Venda{
    private String formaDePagamento;
    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }


    public static void venderProduto(Produto p, int quantidade, String formaDePagamento){
        int quantidadeEstoque = p.getQuantidadeEstoque();
        formaDePagamento.toLowerCase();

        if(quantidadeEstoque != 0){
            p.setQuantidadeEstoque(p.getQuantidadeEstoque() - quantidade);
        }else{
            System.out.println("Estoque vazio! Não é possivel realizar essa venda");
        }

        if(formaDePagamento.matches("pix | especie | transferencia | debito")){
            System.out.println("O valor total da sua venda é de ");
        }
    }

}