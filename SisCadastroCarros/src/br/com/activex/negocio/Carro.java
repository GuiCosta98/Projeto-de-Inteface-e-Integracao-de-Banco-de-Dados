
package br.com.activex.negocio;


public class Carro {
    
    private String fabricante;
    private String modelo; 
    private String cor; 
    private int ano;
    private int codCarro;
    private double km;
    private double valor;
    private String tipoCombustivel;
    private int codRevenda;

    public Carro() {
    }

    public Carro(String fabricante, String modelo, String cor, int ano, int codCarro, double km, double valor, String tipoCombustivel, int codRevenda) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.codCarro = codCarro;
        this.km = km;
        this.valor = valor;
        this.tipoCombustivel = tipoCombustivel;
        this.codRevenda = codRevenda;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the codCarro
     */
    public int getCodCarro() {
        return codCarro;
    }

    /**
     * @param codCarro the codCarro to set
     */
    public void setCodCarro(int codCarro) {
        this.codCarro = codCarro;
    }

    /**
     * @return the km
     */
    public double getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(double km) {
        this.km = km;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the tipoCombustivel
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * @param tipoCombustivel the tipoCombustivel to set
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * @return the codRevenda
     */
    public int getCodRevenda() {
        return codRevenda;
    }

    /**
     * @param codRevenda the codRevenda to set
     */
    public void setCodRevenda(int codRevenda) {
        this.codRevenda = codRevenda;
    }
    
    
}
