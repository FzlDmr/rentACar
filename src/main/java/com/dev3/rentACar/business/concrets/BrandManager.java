package com.dev3.rentACar.business.concrets;

import com.dev3.rentACar.business.abstracts.BrandService;
import com.dev3.rentACar.business.reponses.GetAllBrandsResponse;
import com.dev3.rentACar.business.requests.CreateBrandRequest;
import com.dev3.rentACar.core.utilities.mappers.ModelMapperService;
import com.dev3.rentACar.dataAccess.abstracts.BrandRepository;
import com.dev3.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service//Bu sinif bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();
        /* Burayi
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponse.add(responseItem);
        }
         */
      return brands.stream().
                    map(brand->this.modelMapperService.forResponse().
                    map(brand,GetAllBrandsResponse.class)).toList();

    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        // Brand brand = new Brand();
        // brand.setName(createBrandRequest.getName());
        // modelMapper ile setlemeden direk yapabildik

        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);

        this.brandRepository.save(brand);
    }
}
