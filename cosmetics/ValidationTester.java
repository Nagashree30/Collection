package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.CosmeticShade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;
import com.xworkz.cosmetics.service.CosmeticService;
import com.xworkz.cosmetics.service.CosmeticServiceImpl;

public class ValidationTester {
public static void main(String[] args) {
	
	CosmeticsDTO cosmeticDTO=new CosmeticsDTO();
	cosmeticDTO.setBrand("mac");
	cosmeticDTO.setShades(CosmeticShade.RED);
	cosmeticDTO.setType(CosmeticType.LIPSTICK);
	cosmeticDTO.setQuantity(1);
	cosmeticDTO.setPrice(300);
	CosmeticService service=new CosmeticServiceImpl();
	service.validateAndSave(cosmeticDTO);
}
}
