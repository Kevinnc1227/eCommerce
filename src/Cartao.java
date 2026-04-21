public abstract class Cartao extends FormaPagamento{
    private BandeiraCartao bandeira;
    
    public Cartao(){
        this.setDescricao("Cartao");
        this.setValor(0.0f);
        this.bandeira = null;
    }

    public void setBandeira(BandeiraCartao bandeira){
        this.bandeira = bandeira;
    }

    public BandeiraCartao getBandeira(){
        return this.bandeira;
    }
    
    public abstract String toString();
}