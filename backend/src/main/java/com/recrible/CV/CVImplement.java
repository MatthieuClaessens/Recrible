package com.recrible.CV;

public interface CVImplement {

    CVDTO createCV(CVDTO cvdto);
    CVDTO readCV(Long cvId);
    void deleteCV(Long cvId);
}