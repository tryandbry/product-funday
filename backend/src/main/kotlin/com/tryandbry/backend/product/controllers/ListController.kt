package com.tryandbry.backend.product.controllers

import com.tryandbry.backend.product.services.ListProductsService
import com.tryandbry.backend.product.views.ProductView
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ListController(
  private val listProductsService: ListProductsService,
) {
  @GetMapping("/products")
  fun list(): List<ProductView> = listProductsService.execute()
}