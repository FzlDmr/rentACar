package com.dev3.rentACar.business.abstracts;


import com.dev3.rentACar.business.reponses.GetAllModelsRepsonse;
import com.dev3.rentACar.business.requests.CreateModelRequest;

import java.util.List;

public interface ModelService {
    List<GetAllModelsRepsonse> getAll();
    void add(CreateModelRequest createModelRequest);
}
