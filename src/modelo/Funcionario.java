
package modelo;

import java.util.Date;

/**
 *
 * @author joseseie
 */
public class Funcionario {
    
    String nome;
    char sexo;
    String morada;
    String naturalidde;
    Date dataDeNascimento;
    String contacto;
    String email;

    public Funcionario() {
    }

    public Funcionario(String nome, char sexo, String morada, String naturalidde, Date dataDeNascimento, String contacto, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.morada = morada;
        this.naturalidde = naturalidde;
        this.dataDeNascimento = dataDeNascimento;
        this.contacto = contacto;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNaturalidde() {
        return naturalidde;
    }

    public void setNaturalidde(String naturalidde) {
        this.naturalidde = naturalidde;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
