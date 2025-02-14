package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastrosMedicos;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
 private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastrosMedicos dados){
        repository.save(new Medico(dados));

    }
}
