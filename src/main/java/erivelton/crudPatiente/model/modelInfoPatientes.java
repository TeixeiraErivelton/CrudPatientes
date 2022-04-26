package erivelton.crudPatiente.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "info_patientes")
public class modelInfoPatientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPacientes;

    @Column(name = "NOME_PACI")
    private String nomePaciente;

    @Column(name = "DATA_NASC_PACI")
    private String dataNasc;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "TEL_PACI")
    private String telefonePaciente;

    @Column(name = "EMAIL_PACI")
    private String emailPaciente;

    @Column(name = "END_PACI")
    private String enderecoPaciente;

    @Column(name = "END_NUM")
    private String enderecoNumero;

    @Column(name = "BAIRRO_PACI")
    private String bairroPaciente;

    @Column(name = "CITY_PACI")
    private String cidadePaciente;

    @Column(name = "UF")
    private String uf;

    @Column(name = "NOME_RESP")
    private String nomeResponsavel;

    @Column(name = "TEL_RESP")
   private String telefoneResponsavel;

    @Column(name = "END_RESP")
    private String enderecoResponsavel;

    @Column(name = "END_NUM_RESP")
    private String enderecoNumeroResponsavel;

    @Column(name = "BAIRRO_RESP")
    private String bairroResponsavel;

    @Column(name = "CITY_RESP")
    private String cidadeResponsavel;

    @Column(name = "UF_RESP")
    private String ufResponsavel;

    public modelInfoPatientes(){

    }

    public modelInfoPatientes(int idPacientes, String nomePaciente, String dataNasc, String cpf, String telefonePaciente,
                              String emailPaciente, String enderecoPaciente, String enderecoNumero,
                              String bairroPaciente, String cidadePaciente, String uf, String nomeResponsavel,
                              String telefoneResponsavel, String enderecoResponsavel, String enderecoNumeroResponsavel,
                              String bairroResponsavel, String cidadeResponsavel, String ufResponsavel) {

        this.idPacientes = idPacientes;
        this.nomePaciente = nomePaciente;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.telefonePaciente = telefonePaciente;
        this.emailPaciente = emailPaciente;
        this.enderecoPaciente = enderecoPaciente;
        this.enderecoNumero = enderecoNumero;
        this.bairroPaciente = bairroPaciente;
        this.cidadePaciente = cidadePaciente;
        this.uf = uf;
        this.nomeResponsavel = nomeResponsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.enderecoResponsavel = enderecoResponsavel;
        this.enderecoNumeroResponsavel = enderecoNumeroResponsavel;
        this.bairroResponsavel = bairroResponsavel;
        this.cidadeResponsavel = cidadeResponsavel;
        this.ufResponsavel = ufResponsavel;
    }

    public int getIdPacientes() {
        return idPacientes;
    }

    public void setIdPacientes(int idPacientes) {
        this.idPacientes = idPacientes;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getBairroPaciente() {
        return bairroPaciente;
    }

    public void setBairroPaciente(String bairroPaciente) {
        this.bairroPaciente = bairroPaciente;
    }

    public String getCidadePaciente() {
        return cidadePaciente;
    }

    public void setCidadePaciente(String cidadePaciente) {
        this.cidadePaciente = cidadePaciente;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getEnderecoResponsavel() {
        return enderecoResponsavel;
    }

    public void setEnderecoResponsavel(String enderecoResponsavel) {
        this.enderecoResponsavel = enderecoResponsavel;
    }

    public String getEnderecoNumeroResponsavel() {
        return enderecoNumeroResponsavel;
    }

    public void setEnderecoNumeroResponsavel(String enderecoNumeroResponsavel) {
        this.enderecoNumeroResponsavel = enderecoNumeroResponsavel;
    }

    public String getBairroResponsavel() {
        return bairroResponsavel;
    }

    public void setBairroResponsavel(String bairroResponsavel) {
        this.bairroResponsavel = bairroResponsavel;
    }

    public String getCidadeResponsavel() {
        return cidadeResponsavel;
    }

    public void setCidadeResponsavel(String cidadeResponsavel) {
        this.cidadeResponsavel = cidadeResponsavel;
    }

    public String getUfResponsavel() {
        return ufResponsavel;
    }

    public void setUfResponsavel(String ufResponsavel) {
        this.ufResponsavel = ufResponsavel;
    }

    @Override
    public String toString() {
        return "modelInfoPatientes{" +
                "idPacientes=" + idPacientes +
                ", nomePaciente='" + nomePaciente + '\'' +
                ", dataNasc=" + dataNasc +
                ", cpf=" + cpf +
                ", telefonePaciente='" + telefonePaciente + '\'' +
                ", emailPaciente='" + emailPaciente + '\'' +
                ", enderecoPaciente='" + enderecoPaciente + '\'' +
                ", enderecoNumero='" + enderecoNumero + '\'' +
                ", bairroPaciente='" + bairroPaciente + '\'' +
                ", cidadePaciente='" + cidadePaciente + '\'' +
                ", uf='" + uf + '\'' +
                ", nomeResponsavel='" + nomeResponsavel + '\'' +
                ", telefoneResponsavel='" + telefoneResponsavel + '\'' +
                ", enderecoResponsavel='" + enderecoResponsavel + '\'' +
                ", enderecoNumeroResponsavel='" + enderecoNumeroResponsavel + '\'' +
                ", bairroResponsavel='" + bairroResponsavel + '\'' +
                ", cidadeResponsavel='" + cidadeResponsavel + '\'' +
                ", ufResponsavel='" + ufResponsavel + '\'' +
                '}';
    }
}

