package com.recrible.Entreprise;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntrepriseDTO (
    @NotNull(message = "{entreprise.entrepriseId.notnull}")
    Long entrepriseId,
    @NotBlank(message = "{entreprise.entrepriseName.notblank}")
    String entrepriseName,
    String entrepriseDescription,
    String entrepriseWebsite
) {}