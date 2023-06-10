package com.dev3.rentACar.business.concrets;

import com.dev3.rentACar.business.abstracts.ModelService;
import com.dev3.rentACar.business.reponses.GetAllModelsRepsonse;
import com.dev3.rentACar.business.requests.CreateModelRequest;
import com.dev3.rentACar.core.utilities.mappers.ModelMapperManager;
import com.dev3.rentACar.dataAccess.abstracts.ModelRepository;
import com.dev3.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperManager modelMapperService;

    @Override
    public List<GetAllModelsRepsonse> getAll() {

        List<Model> models = modelRepository.findAll();

        return models.stream()
                     .map(model -> this.modelMapperService.forResponse()
                     .map(model, GetAllModelsRepsonse.class)).toList();
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);

        this.modelRepository.save(model);
    }
}
