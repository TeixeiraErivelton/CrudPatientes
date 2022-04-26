package erivelton.crudPatiente.repository;

import erivelton.crudPatiente.model.modelInfoPatientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
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
    void insertInfoPatience(@Param("nomePaciente") String nomePaciente,
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
}
