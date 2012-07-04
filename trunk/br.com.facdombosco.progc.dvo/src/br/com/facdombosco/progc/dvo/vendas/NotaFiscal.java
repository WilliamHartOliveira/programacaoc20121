package br.com.facdombosco.progc.dvo.vendas;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NotaFiscal", catalog="progc1")
public class NotaFiscal  implements java.io.Serializable {

    private Integer idNotaFiscal;
    private Venda venda;
    private Date data;
    private Set vendas = new HashSet(0);

    public NotaFiscal() {
    }

    public NotaFiscal(Venda venda, Date data, Set vendas) {
       this.venda = venda;
       this.data = data;
       this.vendas = vendas;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="idNotaFiscal", unique=true, nullable=false)
    public Integer getIdNotaFiscal() {
        return this.idNotaFiscal;
    }
    
    public void setIdNotaFiscal(Integer idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idVenda")
    public Venda getVenda() {
        return this.venda;
    }
    
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data", length=19)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="notaFiscal", targetEntity=Venda.class)
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }

}