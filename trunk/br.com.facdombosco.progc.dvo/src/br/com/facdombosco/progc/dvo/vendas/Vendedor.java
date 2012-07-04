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
@Table(name="Vendedor", catalog="progc1")
public class Vendedor  implements java.io.Serializable {

    private int idVendedor;
    private String nome;
    private Set vendas = new HashSet(0);

    public Vendedor() {
    }
	
    public Vendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    public Vendedor(int idVendedor, String nome, Set vendas) {
       this.idVendedor = idVendedor;
       this.nome = nome;
       this.vendas = vendas;
    }
   
    @Id 
    @Column(name="idVendedor", unique=true, nullable=false)
    public int getIdVendedor() {
        return this.idVendedor;
    }
    
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="vendedor", targetEntity=Venda.class)
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }

}