package br.com.facdombosco.progc.dvo.compras;
// Generated 30/06/2012 11:42:13 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Produto generated by hbm2java
 */
@Entity
@Table(name="Produto"
    ,catalog="progc1"
)
public class Produto  implements java.io.Serializable {


     private int idProduto;
     private String nome;
     private Float valor;
     private int idProdutoFornecedor;

    public Produto() {
    }

	
    public Produto(int idProduto, int idProdutoFornecedor) {
        this.idProduto = idProduto;
        this.idProdutoFornecedor = idProdutoFornecedor;
    }
    public Produto(int idProduto, String nome, Float valor, int idProdutoFornecedor) {
       this.idProduto = idProduto;
       this.nome = nome;
       this.valor = valor;
       this.idProdutoFornecedor = idProdutoFornecedor;
    }
   
     @Id 
    
    @Column(name="idProduto", unique=true, nullable=false)
    public int getIdProduto() {
        return this.idProduto;
    }
    
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Column(name="valor", precision=12, scale=0)
    public Float getValor() {
        return this.valor;
    }
    
    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    @Column(name="idProdutoFornecedor", nullable=false)
    public int getIdProdutoFornecedor() {
        return this.idProdutoFornecedor;
    }
    
    public void setIdProdutoFornecedor(int idProdutoFornecedor) {
        this.idProdutoFornecedor = idProdutoFornecedor;
    }




}


