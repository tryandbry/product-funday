package com.tryandbry.backend.product.services

import com.tryandbry.backend.product.repositories.ProductRepository
import com.tryandbry.backend.product.entities.ProductEntity
import com.tryandbry.backend.product.views.ProductView
import kotlin.test.assertNotNull
import kotlin.test.assertEquals
import kotlin.test.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`

class ListProductsServiceTest {
  private val productRepository = mock(ProductRepository::class.java)
  
  private val service = ListProductsService(productRepository)

  @Test
  fun `fetches from db`() {
    val productEntity1 = ProductEntity(id = 1, name = "hello")
    val productEntities = listOf(
      productEntity1,
    )

    `when`(productRepository.findAll()).thenReturn(productEntities)

    val results = service.execute()

    verify(productRepository).findAll()
  }

  @Test
  fun `returns all records`() {
    val productEntity1 = ProductEntity(id = 1, name = "hello")
    val productEntity2 = ProductEntity(id = 2, name = "world")
    val productEntities = listOf(
      productEntity1,
      productEntity2,
    )

    `when`(productRepository.findAll()).thenReturn(productEntities)

    val results = service.execute()

    assertEquals(results.size, productEntities.size)
  }

  @Test
  fun `returns record names`() {
    val productEntity1 = ProductEntity(id = 1, name = "hello")
    val productEntity2 = ProductEntity(id = 2, name = "world")
    val productEntities = listOf(
      productEntity1,
      productEntity2,
    )

    `when`(productRepository.findAll()).thenReturn(productEntities)

    val results = service.execute()

    assertNotNull(results.find { it.name == productEntity1.name })
    assertNotNull(results.find { it.name == productEntity2.name })
  }

  @Test
  fun `returns record IDs`() {
    val productEntity1 = ProductEntity(id = 1, name = "hello")
    val productEntity2 = ProductEntity(id = 2, name = "world")
    val productEntities = listOf(
      productEntity1,
      productEntity2,
    )

    `when`(productRepository.findAll()).thenReturn(productEntities)

    val results = service.execute()

    assertNotNull(results.find { it.id == productEntity1.id })
    assertNotNull(results.find { it.id == productEntity2.id })
  }

  @Test
  fun `transforms db records into client-facing records`() {
    val productEntity = ProductEntity(id = 1, name = "hello")
    val productView = ProductView(id = 1, name = "hello")
    val productEntities = listOf(productEntity)
    val productViews = listOf(productView)

    `when`(productRepository.findAll()).thenReturn(productEntities)

    val results = service.execute()

    assertEquals(results, productViews)
  }
}