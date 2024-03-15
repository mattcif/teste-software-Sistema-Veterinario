package org.example;

import org.example.model.Animal;
import org.example.service.AnimalService;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{




    public static void main(String[] args ) {
        List<Animal> listaAnimais = new ArrayList<>();


        listaAnimais.add(cadastrarAnimal(1L, "Max", "Cachorro", "Labrador", "João"));
        listaAnimais.add(cadastrarAnimal(2L, "Bella", "Gato", "Siamês", "Maria"));
        listaAnimais.add(cadastrarAnimal(3L, "Charlie", "Cachorro", "Poodle", "Pedro"));
        listaAnimais.add(cadastrarAnimal(4L, "Luna", "Gato", "Persa", "Ana"));
        listaAnimais.add(cadastrarAnimal(5L, "Rocky", "Cachorro", "Bulldog", "Carlos"));


        // todo cadastrar animais


        AnimalService animalService = new AnimalService();

        // buscar por id
        System.out.println("buscar animal por id" + animalService.buscarAnimalPorId(listaAnimais, 3L));

        // update nome animal

        animalService.alterarNomeAnimal(listaAnimais, "Maxine", 1L);


        // update nome dono

        animalService.alterarNomeDonoAnimal(listaAnimais, 3L, "Isa");

        // excluir animal

        animalService.deletarAnimal(listaAnimais, 5L);

        // listar todos

        animalService.exibirTodosAnimais(listaAnimais);

    }


    public static Animal cadastrarAnimal(
            Long id,
            String nome,
            String especie,
            String raca,
            String nomeDono
    ) {
        return new Animal(id, nome, especie, raca, nomeDono);

    }


}
