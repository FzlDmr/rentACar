package com.dev3.rentACar.business.abstracts;

import com.dev3.rentACar.business.reponses.GetAllBrandsResponse;
import com.dev3.rentACar.business.reponses.GetByIdBrandResponse;
import com.dev3.rentACar.business.requests.CreateBrandRequest;
import com.dev3.rentACar.business.requests.UpdateBrandRequest;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();//repsonse
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
}
