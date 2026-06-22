package com.recrible.mapper;

import com.recrible.dto.CVDTO;
import com.recrible.dto.UserAccountDTO;
import com.recrible.entity.CV;
import com.recrible.entity.UserAccount;
import org.springframework.stereotype.Component;

@Component
public class CVMapper {
    public CVDTO toDTO(CV cv) {
        if (cv == null) return null;
        return new CVDTO(
                cv.getCvId(),
                cv.getCvName(),
                cv.getCvDate()
                );
    }

    public CV fromDTO(CVDTO cvDTO) {
        if (cvDTO == null) return null;

        return CV.builder()
                .cvId(cvDTO.cvId())
                .cvName(cvDTO.cvName())
                .cvDate(cvDTO.cvDate())
                .build();
    }
}