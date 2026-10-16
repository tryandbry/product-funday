package com.tryandbry.backend.product.controllers

import com.tryandbry.backend.product.services.CreateProductService
import com.tryandbry.backend.product.validation.CreateProductRequest
import com.tryandbry.backend.product.views.ProductView
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.HttpStatus

@RestController
class CreateController(
  private val createProductService: CreateProductService,
) {
  @PostMapping("/products")
  @ResponseStatus(HttpStatus.CREATED)
  fun create(
    @Valid @RequestBody request: CreateProductRequest,
  ): ProductView = createProductService.execute(request)
}