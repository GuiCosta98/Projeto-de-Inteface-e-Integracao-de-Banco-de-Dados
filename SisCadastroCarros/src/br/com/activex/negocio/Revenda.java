package br.com.activex.negocio;

public class Revenda {

    private int codRevenda;
    private String nomeRevenda;
    private String cnpjRevenda;
    private String cidade;
    private String uf;

    public Revenda(int codRevenda, String nomeRevenda, String cnpjRevenda, String cidade, String uf) {
        this.codRevenda = codRevenda;
        this.nomeRevenda = nomeRevenda;
        this.cnpjRevenda = cnpjRevenda;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Revenda() {
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

    /**
     * @return the nomeRevenda
     */
    public String getNomeRevenda() {
        return nomeRevenda;
    }

    /**
     * @param nomeRevenda the nomeRevenda to set
     */
    public void setNomeRevenda(String nomeRevenda) {
        this.nomeRevenda = nomeRevenda;
    }

    /**
     * @return the cnpjRevenda
     */
    public String getCnpjRevenda() {
        return cnpjRevenda;
    }

    /**
     * @param cnpjRevenda the cnpjRevenda to set
     */
    public void setCnpjRevenda(String cnpjRevenda) {
        this.cnpjRevenda = cnpjRevenda;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.codRevenda;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Revenda other = (Revenda) obj;
        return this.codRevenda == other.codRevenda;
    }

    @Override
    public String toString() {
        return "Revenda{" + "nomeRevenda=" + nomeRevenda + '}';
    }

    
    
    
    
}
