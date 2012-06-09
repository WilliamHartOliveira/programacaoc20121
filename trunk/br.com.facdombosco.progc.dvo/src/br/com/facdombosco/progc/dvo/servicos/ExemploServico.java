package br.com.facdombosco.progc.dvo.servicos;

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
@Table(name="orcamento_servico"
    ,catalog="flete01"
)
public class ExemploServico  implements java.io.Serializable {


     private int id;
     private String defeito;
     private String parecer;
     private String data;
     private Integer tipoDefeitoId;
     private String tecnico;
     private String valorTotal;
     private int clienteId;
     private Set orcamentoItemServicos = new HashSet(0);

    public ExemploServico() {
    }

	
    public ExemploServico(int id, int clienteId) {
        this.id = id;
        this.clienteId = clienteId;
    }
    public ExemploServico(int id, String defeito, String parecer, String data, Integer tipoDefeitoId, String tecnico, String valorTotal, int clienteId, Set orcamentoItemServicos) {
       this.id = id;
       this.defeito = defeito;
       this.parecer = parecer;
       this.data = data;
       this.tipoDefeitoId = tipoDefeitoId;
       this.tecnico = tecnico;
       this.valorTotal = valorTotal;
       this.clienteId = clienteId;
       this.orcamentoItemServicos = orcamentoItemServicos;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="defeito", length=45)
    public String getDefeito() {
        return this.defeito;
    }
    
    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }
    
    @Column(name="parecer", length=45)
    public String getParecer() {
        return this.parecer;
    }
    
    public void setParecer(String parecer) {
        this.parecer = parecer;
    }
    
    @Column(name="data", length=45)
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    @Column(name="tipo_defeito_id")
    public Integer getTipoDefeitoId() {
        return this.tipoDefeitoId;
    }
    
    public void setTipoDefeitoId(Integer tipoDefeitoId) {
        this.tipoDefeitoId = tipoDefeitoId;
    }
    
    @Column(name="tecnico", length=45)
    public String getTecnico() {
        return this.tecnico;
    }
    
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
    
    @Column(name="valor_total", length=45)
    public String getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    @Column(name="cliente_id", nullable=false)
    public int getClienteId() {
        return this.clienteId;
    }
    
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    
    public void setOrcamentoItemServicos(Set orcamentoItemServicos) {
        this.orcamentoItemServicos = orcamentoItemServicos;
    }




}


