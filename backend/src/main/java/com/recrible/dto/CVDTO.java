package com.recrible.dto;

import com.recrible.entity.UserAccount;

import java.time.LocalDate;

/**
 * A Data Transfer Object (DTO) representing a Curriculum Vitae (CV) record.
 * This record is used to transfer CV data between different layers of the application.
 *
 * @param cvId   The unique identifier of the CV
 * @param cvName The name or title of the CV
 * @param cvDate The date associated with the CV, typically the creation or last modification date
 */
public record CVDTO(Long cvId, String cvName, LocalDate cvDate) {}
