package com.dev3.rentACar.dataAccess.abstracts;

import com.dev3.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {

    List<Brand> getAll();
}
