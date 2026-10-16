package com.tryandbry.backend.product.validation

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class CreateProductRequest(
  @field:NotBlank(message = "Name is required")
  @field:Size(max = 100, message = "Name must be at most 100 characters")
  val name: String,
)