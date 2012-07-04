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
@Table(name="Cliente", catalog="progc1")
public class Cliente  implements java.io.Serializable {

    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Set vendas = new HashSet(0);

    public Cliente() {
    }
	
    public Cliente(String cpf) {
        this.cpf = cpf;
    }
    
    public Cliente(String cpf, String nome, String endereco, String telefone, String email, Set vendas) {
       this.cpf = cpf;
       this.nome = nome;
       this.endereco = endereco;
       this.telefone = telefone;
       this.email = email;
       this.vendas = vendas;
    }
   
    @Id 
    @Column(name="cpf", unique=true, nullable=false, length=11)
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Column(name="endereco", length=45)
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Column(name="telefone", length=45)
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="cliente", targetEntity=Venda.class)
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }

}