package br.com.facdombosco.progc.dvo.vendas;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Produto", catalog="progc1")
public class Produto  implements java.io.Serializable {

    private int idProduto;
    private String nome;
    private Float valor;
    private Set itemVendas = new HashSet(0);

    public Produto() {
    }
	
    public Produto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public Produto(int idProduto, String nome, Float valor, Set itemVendas) {
       this.idProduto = idProduto;
       this.nome = nome;
       this.valor = valor;
       this.itemVendas = itemVendas;
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
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="produto", targetEntity=ItemVenda.class)
    public Set getItemVendas() {
        return this.itemVendas;
    }
    
    public void setItemVendas(Set itemVendas) {
        this.itemVendas = itemVendas;
    }
    
}