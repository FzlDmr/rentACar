package com.dev3.rentACar.webApi.controllers;

import com.dev3.rentACar.business.abstracts.ModelService;
import com.dev3.rentACar.business.reponses.GetAllModelsResponse;
import com.dev3.rentACar.business.requests.CreateModelRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {

    private ModelService modelService;
    @GetMapping
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }
    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }
}
