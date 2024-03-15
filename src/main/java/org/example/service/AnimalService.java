package org.example.service;

import org.example.model.Animal;

import java.util.List;

public class AnimalService {


    // todo Buscar animal pelo ID

    public static Animal buscarAnimalPorId(List<Animal> listaAnimais, Long id) {
        for (Animal animal : listaAnimais) {
            if (animal.getId().equals(id)) {
                return animal;
            }
        }
        return null;
    }

    // todo alteração de um animal

    public static Animal alterarNomeAnimal(List<Animal> listaAnimais, String novoNome, Long id) {
        for (Animal animal : listaAnimais) {
            if (animal.getId().equals(id)) {
                animal.setNome(novoNome);
                return animal;
            }
        }
        return null;


    }

    public static Animal alterarNomeDonoAnimal(List<Animal> listaAniamis, Long id, String novoNomeDono) {
        for (Animal animal : listaAniamis) {
            if (animal.getId().equals(id)) {
                animal.setNomeDono(novoNomeDono);
                return animal;
            }
        }

        return null;
    }



    // todo exclusão de um animal

    public static void deletarAnimal(List<Animal> listaAnimais, Long id) {
        for(Animal animal : listaAnimais) {
            if(animal.getId().equals(id)) {
                listaAnimais.remove(animal);
                break;
            }
        }
    }

    // todo listagem todos animais

    public static void exibirTodosAnimais(List<Animal> listaAnimais) {
        for (Animal animal : listaAnimais) {
            System.out.println("Nome animal: " + animal.getNome() + ", Especie: " + animal.getEspecie() + ", Raça: " +
                    animal.getRaca() + ", Dono: " + animal.getNomeDono());
        }
    }
}
