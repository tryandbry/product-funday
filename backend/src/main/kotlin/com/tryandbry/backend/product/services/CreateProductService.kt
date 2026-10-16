package com.tryandbry.backend.product.services

import com.tryandbry.backend.product.repositories.ProductRepository
import com.tryandbry.backend.product.validation.CreateProductRequest
import com.tryandbry.backend.product.entities.ProductEntity
import com.tryandbry.backend.product.views.ProductView
import com.tryandbry.backend.product.views.toView
import org.springframework.stereotype.Service

@Service
class CreateProductService(
  private val productRepository: ProductRepository,
) {
  fun execute(request: CreateProductRequest): ProductView {
    val product = ProductEntity(
      name = request.name,
    )

    val savedProduct = productRepository.save(product)

    return savedProduct.toView()
  }
}