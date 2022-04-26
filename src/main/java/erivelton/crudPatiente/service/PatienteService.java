package erivelton.crudPatiente.service;

import erivelton.crudPatiente.model.modelInfoPatientes;
import erivelton.crudPatiente.repository.PatienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class PatienteService {

    private final PatienteRepository patienteRepository;

    @Autowired
    public PatienteService(PatienteRepository patienteRepository) {
        this.patienteRepository = patienteRepository;
    }

    public void process() {

        Scanner sc = new Scanner(System.in);

        System.out.println("O que deseja fazer");
        System.out.println("1 - Listar Pacientes");
        System.out.println("2 - Editar Paciente");
        System.out.println("3 - Inserir novo Paciente");
        System.out.println("4 - Apagar Paciente");

        int method = sc.nextInt();

        switch (method){
            case 1:
                //Listar
                listar();

                break;
            case 2:
                System.out.println("Editar");
                break;
            case 3:
                //Inserir

                inserir();
                break;
            case 4:
                System.out.println("Apagar");
                break;
            default:
                System.out.println("Opção Inválida");
        }

    }

    private void listar() {

        List<modelInfoPatientes> mod = patienteRepository.search();
        System.out.println(mod);
    }

    private void inserir(){

        Scanner sc = new Scanner(System.in);

        modelInfoPatientes modelInfoPatientes = new modelInfoPatientes();

        System.out.println("Dados do Paciente");
        System.out.print("Nome: ");
        modelInfoPatientes.setNomePaciente(sc.nextLine());
        System.out.print("Data de Nascimento: ");
        modelInfoPatientes.setDataNasc(sc.nextLine());
        System.out.print("CPF: ");
        modelInfoPatientes.setCpf(sc.nextLine());
        System.out.print("Telefone: ");
        modelInfoPatientes.setTelefonePaciente(sc.nextLine());
        System.out.print("e-mail: ");
        modelInfoPatientes.setEmailPaciente(sc.nextLine());
        System.out.print("Endereço: ");
        modelInfoPatientes.setEnderecoPaciente(sc.nextLine());
        System.out.print("Número: ");
        modelInfoPatientes.setEnderecoNumero(sc.nextLine());
        System.out.print("Bairro: ");
        modelInfoPatientes.setBairroPaciente(sc.nextLine());
        System.out.print("Cidade: ");
        modelInfoPatientes.setCidadePaciente(sc.nextLine());
        System.out.print("UF: ");
        modelInfoPatientes.setUf(sc.nextLine());


        System.out.println("Dados do Contato ");
        System.out.print("Nome: ");
        modelInfoPatientes.setNomeResponsavel(sc.nextLine());
        System.out.print("Telefone: ");
        modelInfoPatientes.setTelefoneResponsavel(sc.nextLine());
        System.out.print("Endereço: ");
        modelInfoPatientes.setEnderecoResponsavel(sc.nextLine());
        System.out.print("Número: ");
        modelInfoPatientes.setEnderecoNumeroResponsavel(sc.nextLine());
        System.out.print("Bairro: ");
        modelInfoPatientes.setBairroResponsavel(sc.nextLine());
        System.out.print("Cidade: ");
        modelInfoPatientes.setCidadeResponsavel(sc.nextLine());
        System.out.print("UF: ");
        modelInfoPatientes.setUfResponsavel(sc.nextLine());

        patienteRepository.insertInfoPatience(modelInfoPatientes.getNomePaciente(),
                modelInfoPatientes.getDataNasc(),
                modelInfoPatientes.getCpf(),
                modelInfoPatientes.getTelefonePaciente(),
                modelInfoPatientes.getEmailPaciente(),
                modelInfoPatientes.getEnderecoPaciente(),
                modelInfoPatientes.getEnderecoNumero(),
                modelInfoPatientes.getBairroPaciente(),
                modelInfoPatientes.getCidadePaciente(),
                modelInfoPatientes.getUf(),
                modelInfoPatientes.getNomeResponsavel(),
                modelInfoPatientes.getTelefoneResponsavel(),
                modelInfoPatientes.getEnderecoResponsavel(),
                modelInfoPatientes.getEnderecoNumeroResponsavel(),
                modelInfoPatientes.getBairroResponsavel(),
                modelInfoPatientes.getCidadeResponsavel(),
                modelInfoPatientes.getUfResponsavel());
    }
}
