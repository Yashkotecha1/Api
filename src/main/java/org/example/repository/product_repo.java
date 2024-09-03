package org.example.repository;


import org.example.model.productModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface product_repo extends JpaRepository<productModel,Long>
{
}
