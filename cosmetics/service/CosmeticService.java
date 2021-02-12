package com.xworkz.cosmetics.service;

import com.xworkz.cosmetics.dto.CosmeticsDTO;

public interface CosmeticService {
boolean validateAndSave(CosmeticsDTO cosmeticdto);
void deleteByBrand(String brand);
int cosmeticsSize();
}
