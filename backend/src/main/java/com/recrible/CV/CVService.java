package com.recrible.CV;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityNotFoundException;


@Service
@RequiredArgsConstructor
@Transactional
public class CVService implements CVImplement {
    private final CVMapper cvMapper;

    private final CVRepository cvRepository;


    private CV ensureCVExists(Long cvId) {
        return cvRepository.findById(cvId)
                .orElseThrow(() -> new EntityNotFoundException("CV with ID " + cvId + " not found"));
    }

    private CVDTO saveAndReturn(CV cv) {
        return cvMapper.toDTO(cvRepository.save(cv));
    }

    @Override
    public CVDTO createCV(CVDTO cvDTO) {
        return saveAndReturn(cvMapper.fromDTO(cvDTO));
    }

    @Override
    public CVDTO readCV(Long cvId) {
        return cvMapper.toDTO(ensureCVExists(cvId));
    }
    
    @Override
    public void deleteCV(Long cvId) {
        ensureCVExists(cvId);
        cvRepository.deleteById(cvId);
    }
}