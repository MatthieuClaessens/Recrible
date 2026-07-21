package com.recrible.CV;

public interface CVImplement {

    CVDTO createCV(CVDTO cvdto);
    CVDTO readCV(Long cvId);
    CVDTO editCV(Long cvId, String cvName);
    void deleteCV(Long cvId);
}