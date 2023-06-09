package com.dev3.rentACar.business.concrets;

import com.dev3.rentACar.business.abstracts.BrandService;
import com.dev3.rentACar.dataAccess.abstracts.BrandRepository;
import com.dev3.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//Bu sinif bir business nesnesidir
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        //is kurallari
        return brandRepository.getAll();
    }
}
