package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Ninja: ";
    }

    //Mostrar ninja por id (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninja por ID: ";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar Ninja por ID: ";
    }

    //Deletar ninjas (DELETE)
    @DeleteMapping("deletarID")
    public String deletarNinjaPorID() {
        return "Ninja deletado";
    }

}
