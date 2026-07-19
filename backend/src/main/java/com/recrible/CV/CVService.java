package com.recrible.CV;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CVService implements CVImplement {
    private final CVMapper cvMapper;

    private final CVRepository cvRepository;

    @Override
    public CVDTO createCV (CV cv) {
        return cvMapper.toDTO(cvRepository.save(cv));
    }

    @Override
    public void deleteCV(Long cvId) {
        cvRepository.deleteById(cvId);
    }
}