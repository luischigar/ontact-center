package com.tcs.contactcenter.controller;

import com.tcs.contactcenter.service.ValidationCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/validationCatalogs")
@CrossOrigin(origins = "*")
public class ValidationCatalogController {

    private ValidationCatalogService validationCatalogService;

    @Autowired
    public ValidationCatalogController(ValidationCatalogService validationCatalogService){
        this.validationCatalogService = validationCatalogService;
    }

    @GetMapping()
    public ResponseEntity<?> getEvaluationResult() {
        return new ResponseEntity<>(validationCatalogService.getAllValidationCatalog(), HttpStatus.OK);
    }
}
