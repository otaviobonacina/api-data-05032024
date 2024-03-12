package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import application.model.Diretor;
import application.repository.DiretorRepository;

@RestController
public class DiretorController {
    @Autowired
    private DiretorRepository diretorRepo;

    @PostMapping("/diretores")
    public Diretor post(@RequestBody Diretor diretor) {
        return diretorRepo.save(diretor);
    }
}
