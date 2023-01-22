package com.tcs.contactcenter.service.Impl;

import com.tcs.contactcenter.model.ValidationCatalog;
import com.tcs.contactcenter.repository.ValidationCatalogRepository;
import com.tcs.contactcenter.service.ValidationCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationCatalogServiceImpl implements ValidationCatalogService {

    private ValidationCatalogRepository validationCatalogRepository;

    @Autowired
    public ValidationCatalogServiceImpl(ValidationCatalogRepository validationCatalogRepository){
        this.validationCatalogRepository = validationCatalogRepository;
    }

    @Override
    public List<ValidationCatalog> getAllValidationCatalog() {
        return validationCatalogRepository.findAll();
    }
}
