package com.validador.api.facade;

import com.validador.api.dto.response.StatusCpfResponse;
import com.validador.api.enums.StatusCpfEnum;
import com.validador.api.utils.CpfUtils;
import org.springframework.stereotype.Component;

@Component
public class ValidadorFacade {

    public StatusCpfResponse validarCPF(String cpf) {

        boolean cpfIsValid = CpfUtils.isCPF(cpf);

        return StatusCpfResponse.builder()
                .status((cpfIsValid) ? StatusCpfEnum.ABLE_TO_VOTE.getValue() : StatusCpfEnum.UNABLE_TO_VOTE.getValue())
                .build();
    }

}
