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
        System.out.println("4 - Procurar Paciente");
        System.out.println("5 - Apagar Paciente");

        int method = sc.nextInt();

        switch (method) {
            case 1:
                //Listar Pacientes
                listar();
                break;

            case 2:
                //Editar Pacientes
                editar();
                break;

            case 3:
                //Inserir novo Paciente
                inserir();
                break;

            case 4:
                //Procurar Paciente
                searchPaciente();
                break;

            case 5:
                //Deletar Paciente
                break;

            default:
                System.out.println("Opção Inválida");
                System.out.println("Por Favor Insira uma opção válida");
        }

    }


    private void listar() {

        List<modelInfoPatientes> mod = patienteRepository.search();
        for (erivelton.crudPatiente.model.modelInfoPatientes modelInfoPatientes : mod) {
            System.out.println("Dados Paciente " + modelInfoPatientes.getIdPacientes());
            System.out.println("Nome:" + modelInfoPatientes.getNomePaciente());
            System.out.println("Data de Nascimento: " + modelInfoPatientes.getDataNasc());
            System.out.println("CPF: " + modelInfoPatientes.getCpf());
            System.out.println("Telefone: " + modelInfoPatientes.getTelefonePaciente());
            System.out.println("e-mail: " + modelInfoPatientes.getEmailPaciente());
            System.out.println("Endereço: " + modelInfoPatientes.getEnderecoResponsavel());
            System.out.println("Número: " + modelInfoPatientes.getEnderecoNumero());
            System.out.println("Bairro: " + modelInfoPatientes.getBairroPaciente());
            System.out.println("Cidade: " + modelInfoPatientes.getCidadePaciente());
            System.out.println("UF: " + modelInfoPatientes.getUf());
            System.out.println();
            System.out.println("Dados Responsável");
            System.out.println("Nome: " + modelInfoPatientes.getNomeResponsavel());
            System.out.println("Telefone: " + modelInfoPatientes.getTelefoneResponsavel());
            System.out.println("Endereço: " + modelInfoPatientes.getEnderecoResponsavel());
            System.out.println("Número: " + modelInfoPatientes.getEnderecoNumeroResponsavel());
            System.out.println("Bairro: " + modelInfoPatientes.getBairroResponsavel());
            System.out.println("Cidade: " + modelInfoPatientes.getCidadeResponsavel());
            System.out.println("UF: " + modelInfoPatientes.getUfResponsavel());
            System.out.println();
        }
    }

    private void searchPaciente() {

        Scanner sc = new Scanner(System.in);

        String likeName;
        System.out.print("Nome do Paciente: ");
        likeName = sc.nextLine() + '%';

        List<modelInfoPatientes> mod = patienteRepository.searchPatiente(likeName);
        for (erivelton.crudPatiente.model.modelInfoPatientes modelInfoPatientes : mod) {
            System.out.println("Dados Paciente " + modelInfoPatientes.getIdPacientes());
            System.out.println("Nome: " + modelInfoPatientes.getNomePaciente());
            System.out.println("Data de Nascimento: " + modelInfoPatientes.getDataNasc());
            System.out.println("CPF: " + modelInfoPatientes.getCpf());
            System.out.println("Telefone: " + modelInfoPatientes.getTelefonePaciente());
            System.out.println("e-mail: " + modelInfoPatientes.getEmailPaciente());
            System.out.println("Endereço: " + modelInfoPatientes.getEnderecoPaciente());
            System.out.println("Número: " + modelInfoPatientes.getEnderecoNumero());
            System.out.println("Bairro: " + modelInfoPatientes.getBairroPaciente());
            System.out.println("Cidade: " + modelInfoPatientes.getCidadePaciente());
            System.out.println("UF: " + modelInfoPatientes.getUf());
            System.out.println();
            System.out.println("Dados Responsável");
            System.out.println("Nome: " + modelInfoPatientes.getNomeResponsavel());
            System.out.println("Telefone: " + modelInfoPatientes.getTelefoneResponsavel());
            System.out.println("Endereço: " + modelInfoPatientes.getEnderecoPaciente());
            System.out.println("Númeor: " + modelInfoPatientes.getEnderecoNumeroResponsavel());
            System.out.println("Bairro: " + modelInfoPatientes.getBairroResponsavel());
            System.out.println("Cidade: " + modelInfoPatientes.getCidadeResponsavel());
            System.out.println("UF: " + modelInfoPatientes.getUfResponsavel());
            System.out.println();
        }
    }

    private void inserir() {

        Scanner sc = new Scanner(System.in);

        modelInfoPatientes modelInfoPatientes = new modelInfoPatientes();

        System.out.println("Informe os dados do Paciente");
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


        System.out.println("Informe os dados do Contato ");
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

        patienteRepository.insertInfoPatiente(modelInfoPatientes.getNomePaciente(),
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

    private void editar() {

        Scanner sc = new Scanner(System.in);

        String likeName;
        System.out.print("Digite o nome o Paciente: ");
        likeName = sc.nextLine();
        String likeNameMod = likeName + '%';

        List<modelInfoPatientes> mod = patienteRepository.searchPatiente(likeNameMod);
        for (erivelton.crudPatiente.model.modelInfoPatientes modelInfoPatientes : mod) {
            System.out.println("Dados Paciente " + modelInfoPatientes.getIdPacientes());
            System.out.println("Nome: " + modelInfoPatientes.getNomePaciente());
            System.out.println("Data de Nascimento: " + modelInfoPatientes.getDataNasc());
            System.out.println("CPF: " + modelInfoPatientes.getCpf());
            System.out.println("Telefone: " + modelInfoPatientes.getTelefonePaciente());
            System.out.println("e-mail: " + modelInfoPatientes.getEmailPaciente());
            System.out.println("Endereço: " + modelInfoPatientes.getEnderecoPaciente());
            System.out.println("Número: " + modelInfoPatientes.getEnderecoNumero());
            System.out.println("Bairro: " + modelInfoPatientes.getBairroPaciente());
            System.out.println("Cidade: " + modelInfoPatientes.getCidadePaciente());
            System.out.println("UF: " + modelInfoPatientes.getUf());
            System.out.println();
            System.out.println("Dados Responsável");
            System.out.println("Nome: " + modelInfoPatientes.getNomeResponsavel());
            System.out.println("Telefone: " + modelInfoPatientes.getTelefoneResponsavel());
            System.out.println("Endereço: " + modelInfoPatientes.getEnderecoPaciente());
            System.out.println("Númeor: " + modelInfoPatientes.getEnderecoNumeroResponsavel());
            System.out.println("Bairro: " + modelInfoPatientes.getBairroResponsavel());
            System.out.println("Cidade: " + modelInfoPatientes.getCidadeResponsavel());
            System.out.println("UF: " + modelInfoPatientes.getUfResponsavel());
            System.out.println();

            System.out.println("Editar");
            System.out.println("1 - Paciente");
            System.out.println("2 - Responsável");

            int method = sc.nextInt();
            sc.nextLine();

            switch (method) {
                case 1:

                    modelInfoPatientes editPaci = new modelInfoPatientes();

                    System.out.println("Por Favor insira os novos dados do Paciente");
                    System.out.println();
                    System.out.print("Nome: ");
                    editPaci.setNomePaciente(sc.nextLine());
                    System.out.print("Data de Nascimento: ");
                    editPaci.setDataNasc(sc.nextLine());
                    System.out.print("CPF: ");
                    editPaci.setCpf(sc.nextLine());
                    System.out.print("Telefone: ");
                    editPaci.setTelefonePaciente(sc.nextLine());
                    System.out.print("e-mail: ");
                    editPaci.setEmailPaciente(sc.nextLine());
                    System.out.print("Endereço: ");
                    editPaci.setEnderecoPaciente(sc.nextLine());
                    System.out.print("Número: ");
                    editPaci.setEnderecoNumero(sc.nextLine());
                    System.out.print("Bairro: ");
                    editPaci.setBairroPaciente(sc.nextLine());
                    System.out.print("Cidade: ");
                    editPaci.setCidadePaciente(sc.nextLine());
                    System.out.print("UF: ");
                    editPaci.setUf(sc.nextLine());

                    patienteRepository.editPaciente(editPaci.getNomePaciente(), editPaci.getDataNasc(), editPaci.getCpf(),
                            editPaci.getTelefonePaciente(), editPaci.getEmailPaciente(), editPaci.getEnderecoPaciente(),
                            editPaci.getEnderecoNumero(), editPaci.getBairroPaciente(), editPaci.getCidadePaciente(),
                            editPaci.getUf(), likeName);

                    break;
                case 2:

                    modelInfoPatientes editResp = new modelInfoPatientes();

                    System.out.println("Por Favor insira os novos dados do Responsável");
                    System.out.println();
                    System.out.print("Nome: ");
                    editResp.setNomeResponsavel(sc.nextLine());
                    System.out.print("Telefone: ");
                    editResp.setTelefoneResponsavel(sc.nextLine());
                    System.out.print("Endereço: ");
                    editResp.setEnderecoResponsavel(sc.nextLine());
                    System.out.print("Número: ");
                    editResp.setEnderecoNumeroResponsavel(sc.nextLine());
                    System.out.print("Bairro: ");
                    editResp.setBairroResponsavel(sc.nextLine());
                    System.out.print("Cidade: ");
                    editResp.setCidadeResponsavel(sc.nextLine());
                    System.out.print("UF: ");
                    editResp.setUfResponsavel(sc.nextLine());

                    patienteRepository.editResp(editResp.getNomeResponsavel(), editResp.getTelefoneResponsavel(),
                            editResp.getEnderecoResponsavel(), editResp.getEnderecoNumeroResponsavel(),
                            editResp.getBairroResponsavel(), editResp.getCidadeResponsavel(),
                            editResp.getUfResponsavel(), likeNameMod);

                    break;

                default:
                    System.out.println("Opção Inválida");
            }


        }

    }

}