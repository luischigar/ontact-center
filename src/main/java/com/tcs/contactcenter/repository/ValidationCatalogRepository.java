package com.tcs.contactcenter.repository;

import com.tcs.contactcenter.model.ValidationCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationCatalogRepository extends JpaRepository<ValidationCatalog, String> {
}
