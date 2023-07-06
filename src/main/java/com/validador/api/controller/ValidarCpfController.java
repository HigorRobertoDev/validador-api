package com.validador.api.controller;

import com.validador.api.dto.response.StatusCpfResponse;
import com.validador.api.facade.ValidadorFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/validador-cpf")
public class ValidarCpfController {

    @Autowired
    private ValidadorFacade validadorFacade;

    @GetMapping(value = "/{cpf}")
    public ResponseEntity<StatusCpfResponse> validarCpf(
            @PathVariable String cpf
    ) {

        StatusCpfResponse statusCpfResponse = this.validadorFacade.validarCPF(cpf);
        return ResponseEntity.status(HttpStatus.OK).body(statusCpfResponse);
    }

}
