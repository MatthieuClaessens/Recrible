package com.recrible.CV;

public interface CVImplement {

    CVDTO createCV(CVDTO cvdto);
    CVDTO readCV(Long cvId);
    CVDTO editCV(CVDTO cvDTO);
    void deleteCV(Long cvId);
}