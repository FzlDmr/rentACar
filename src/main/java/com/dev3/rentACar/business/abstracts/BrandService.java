package com.dev3.rentACar.business.abstracts;

import com.dev3.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
