package com.tryandbry.backend.product.services

import com.tryandbry.backend.product.repositories.ProductRepository
import com.tryandbry.backend.product.entities.ProductEntity
import com.tryandbry.backend.product.views.ProductView
import com.tryandbry.backend.product.views.toView
import org.springframework.stereotype.Service

@Service
class ListProductsService(
  private val productRepository: ProductRepository,
) {
  /**
   * Fetch all product records from db
   */
  protected fun fetch(): List<ProductEntity> = productRepository.findAll()

  /**
   * Transform product db records to client-facing records
   */
  protected fun transform(productEntities: List<ProductEntity>): List<ProductView> =
    productEntities.map { it.toView() }

  fun execute(): List<ProductView> = fetch().let(::transform)
}