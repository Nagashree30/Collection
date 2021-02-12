package com.xworkz.cosmetics.dao;

import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticsDTO;

public class AdvanceCosmeticDAOImpl implements CosmeticsDAO{

	@Override
	public boolean save(CosmeticsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceByBrandAndType(double price, String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean updateTypeByBrand1(String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CosmeticsDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public boolean save1(CosmeticsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean updatePriceByBrandAndType1(double price, String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePriceByBrand(String brand, CosmeticType type) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<CosmeticsDTO> getAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int totalsize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
