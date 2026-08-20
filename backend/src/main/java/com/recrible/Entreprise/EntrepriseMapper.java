package com.recrible.Entreprise;

public class EntrepriseMapper {
    public EntrepriseDTO toDTO(Entreprise entreprise) {
        if (entreprise == null) return null;
        return new EntrepriseDTO(
                entreprise.getEntrepriseId(),
                entreprise.getEntrepriseName(),
                entreprise.getEntrepriseDescription(),
                entreprise.getEntrepriseWebsite());
    }

    public Entreprise fromDTO(EntrepriseDTO entrepriseDTO) {
        if (entrepriseDTO == null) return null;
        return Entreprise.builder()
                .entrepriseId(entrepriseDTO.entrepriseId())
                .entrepriseName(entrepriseDTO.entrepriseName())
                .entrepriseDescription(entrepriseDTO.entrepriseDescription())
                .entrepriseWebsite(entrepriseDTO.entrepriseWebsite())
                .build();
    }
}