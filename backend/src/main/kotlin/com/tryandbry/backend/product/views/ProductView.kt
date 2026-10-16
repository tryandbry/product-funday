package com.tryandbry.backend.product.views

import com.tryandbry.backend.product.entities.ProductEntity

data class ProductView(
  val id: Long,
  val name: String,
)

fun ProductEntity.toView() = ProductView(
  id = requireNotNull(id),
  name = name,
)