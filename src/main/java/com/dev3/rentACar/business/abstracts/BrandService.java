package com.dev3.rentACar.business.abstracts;

import com.dev3.rentACar.business.reponses.GetAllBrandsResponse;
import com.dev3.rentACar.business.requests.CreateBrandRequest;
import com.dev3.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();//repsonse
    void add(CreateBrandRequest createBrandRequest);
}
