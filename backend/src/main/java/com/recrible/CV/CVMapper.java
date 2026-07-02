package com.recrible.CV;

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