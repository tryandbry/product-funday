package com.tryandbry.backend.product.repositories

import com.tryandbry.backend.product.entities.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<ProductEntity, Long>
