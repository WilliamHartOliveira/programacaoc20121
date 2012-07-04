package br.com.facdombosco.progc.dvo.vendas;

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
@Table(name="Venda", catalog="progc1")
public class Venda  implements java.io.Serializable {
    
    private Integer idVenda;
    private Cliente cliente;
    private Vendedor vendedor;
    private NotaFiscal notaFiscal;
    private Boolean fechado;
    private Set itemVendas = new HashSet(0);
    private Set notaFiscals = new HashSet(0);

    public Venda() {
    }
	
    public Venda(Cliente cliente, Vendedor vendedor, NotaFiscal notaFiscal) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.notaFiscal = notaFiscal;
    }
    public Venda(Cliente cliente, Vendedor vendedor, NotaFiscal notaFiscal, Boolean fechado, Set itemVendas, Set notaFiscals) {
       this.cliente = cliente;
       this.vendedor = vendedor;
       this.notaFiscal = notaFiscal;
       this.fechado = fechado;
       this.itemVendas = itemVendas;
       this.notaFiscals = notaFiscals;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)    
    @Column(name="idVenda", unique=true, nullable=false)
    public Integer getIdVenda() {
        return this.idVenda;
    }
    
    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idCliente", nullable=false)
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idVendedor", nullable=false)
    public Vendedor getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idNota", nullable=false)
    public NotaFiscal getNotaFiscal() {
        return this.notaFiscal;
    }
    
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
    @Column(name="fechado")
    public Boolean getFechado() {
        return this.fechado;
    }
    
    public void setFechado(Boolean fechado) {
        this.fechado = fechado;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="venda", targetEntity=ItemVenda.class)
    public Set getItemVendas() {
        return this.itemVendas;
    }
    
    public void setItemVendas(Set itemVendas) {
        this.itemVendas = itemVendas;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="venda", targetEntity=NotaFiscal.class)
    public Set getNotaFiscals() {
        return this.notaFiscals;
    }
    
    public void setNotaFiscals(Set notaFiscals) {
        this.notaFiscals = notaFiscals;
    }

}