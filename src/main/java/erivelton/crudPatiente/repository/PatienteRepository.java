package erivelton.crudPatiente.repository;

import erivelton.crudPatiente.model.modelInfoPatientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface PatienteRepository extends JpaRepository<modelInfoPatientes, Integer> {

    @Query(value = "SELECT * FROM info_patientes", nativeQuery = true)
    List<modelInfoPatientes> search();

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO info_patientes VALUES(default, :nomePaciente, :dataNasc, :cpf,:telefonePaciente,:emailPaciente,:enderecoPaciente,:enderecoNumero,\n" +
            ":bairroPaciente,:cidadePaciente,:uf,:nomeResponsavel,:telResp,:enderecoResponsavel,:enderecoNumeroResponsavel,\n" +
            ":bairroResponsavel,:cidadeResponsavel,:ufResponsavel)", nativeQuery = true)
    void insertInfoPatiente(@Param("nomePaciente") String nomePaciente,
                            @Param("dataNasc") String dataNasc,
                            @Param("cpf") String cpf,
                            @Param("telefonePaciente") String telefonePaciente,
                            @Param("emailPaciente") String emailPaciente,
                            @Param("enderecoPaciente") String enderecoPaciente,
                            @Param("enderecoNumero") String enderecoNumero,
                            @Param("bairroPaciente") String bairroPaciente,
                            @Param("cidadePaciente") String cidadePaciente,
                            @Param("uf") String uf,
                            @Param("nomeResponsavel") String nomeResponsavel,
                            @Param("telResp") String telResp,
                            @Param("enderecoResponsavel") String enderecoResponsavel,
                            @Param("enderecoNumeroResponsavel") String enderecoNumeroResponsavel,
                            @Param("bairroResponsavel") String bairroResponsavel,
                            @Param("cidadeResponsavel") String cidadeResponsavel,
                            @Param("ufResponsavel") String ufResponsavel);


    @Query(value = "SELECT * FROM info_patientes ip WHERE NOME_PACI LIKE :nomePaci", nativeQuery = true)
    List<modelInfoPatientes> searchPatiente(@Param("nomePaci") String nomePaciente);

    @Modifying
    @Transactional
    @Query(value = "UPDATE info_patientes SET NOME_PACI = :nomePaci, DATA_NASC_PACI = :dataNasc, CPF = :cpf, " +
            "TEL_PACI = :telPaci, EMAIL_PACI = :emailPaci, END_PACI = :endPaci, END_NUM = :endNum, " +
            "BAIRRO_PACI = :bairroPaci, CITY_PACI = :cidadePaci, UF = :ufPaci where NOME_PACI = :nomePaciAntes",
            nativeQuery = true)
    void editPaciente(@Param("nomePaci") String nomePaci,
                      @Param("dataNasc") String dataNasc,
                      @Param("cpf") String cpf,
                      @Param("telPaci") String telPaci,
                      @Param("emailPaci") String emailPaci,
                      @Param("endPaci") String endPaci,
                      @Param("endNum") String endNum,
                      @Param("bairroPaci") String bairroPaci,
                      @Param("cidadePaci") String cidadePaci,
                      @Param("ufPaci") String ufPaci,
                      @Param("nomePaciAntes") String nomePaciAnte);


    @Modifying
    @Transactional
    @Query(value ="UPDATE info_patientes SET NOME_RESP = :nomeResp, TEL_RESP = :telResp, END_RESP = :endResp, " +
            "END_NUM_RESP = :endNumResp, BAIRRO_RESP = :bairroResp, CITY_RESP = :cidadeResp, UF_RESP = :ufResp " +
            "WHERE NOME_PACI LIKE :nomePaci", nativeQuery = true)
    void editResp(@Param("nomeResp") String nomeResp,
                  @Param("telResp") String telResp,
                  @Param("endResp") String endResp,
                  @Param("endNumResp") String endNumResp,
                  @Param("bairroResp") String bairroResp,
                  @Param("cidadeResp") String cidadeResp,
                  @Param("ufResp") String ufResp,
                  @Param("nomePaci") String nomePaci);
}
