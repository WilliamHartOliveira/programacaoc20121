package br.com.facdombosco.progc.dvo.vendas;
// Generated 05/07/2012 22:15:12 by Hibernate Tools 3.2.1.GA


import br.com.facdombosco.progc.dvo.compras.Fornecedor;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Produto"
    ,catalog="progc1"
)
public class Produto  implements java.io.Serializable {

     private Integer idProduto;
     private ItemVenda itemVenda;
     private String nome;
     private Float valor;
     private Fornecedor fornecedor;
     private Set itemVendas = new HashSet(0);

    public Produto() {
    }
	
    public Produto(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
    }
    
    public Produto(ItemVenda itemVenda, String nome, Float valor, Fornecedor fornecedor, Set itemVendas) {
       this.itemVenda = itemVenda;
       this.nome = nome;
       this.valor = valor;
       this.fornecedor = fornecedor;
       this.itemVendas = itemVendas;
    }
    
    public Produto(ItemVenda itemVenda, String nome, Float valor) {
       this.itemVenda = itemVenda;
       this.nome = nome;
       this.valor = valor;
       this.fornecedor.setIdFornecedor(1);
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="idProduto", unique=true, nullable=false)
    public Integer getIdProduto() {
        return this.idProduto;
    }
    
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idProduto", unique=true, nullable=false, insertable=false, updatable=false)
    public ItemVenda getItemVenda() {
        return this.itemVenda;
    }
    
    public void setItemVenda(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
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
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idProdutoFornecedor")
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="produto", targetEntity=ItemVenda.class)
    public Set getItemVendas() {
        return this.itemVendas;
    }
    
    public void setItemVendas(Set itemVendas) {
        this.itemVendas = itemVendas;
    }

    @Override
    public String toString()
    {
        return this.getNome();
    }
}


