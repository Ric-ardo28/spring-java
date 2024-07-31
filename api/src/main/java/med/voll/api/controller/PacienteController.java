package med.voll.api.controller;

import med.voll.api.paciente.DadosCadastrosPacientes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrosPacientes dados) {
        System.out.println("dados recebidos " + dados);
    }
}
