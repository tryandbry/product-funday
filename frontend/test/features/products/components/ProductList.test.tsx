import React from 'react'
import assert from 'node:assert/strict'
import { describe, it, afterEach } from 'node:test'
import { render, screen, cleanup } from '@testing-library/react'
import { ProductList } from '../../../../src/features/products/components/ProductList.tsx'
import type { Product } from '../../../../src/features/products/types.ts'

describe('ProductList', () => {
  afterEach(() => {
    cleanup();
  })

  it('renders a list of products', () => {
    const products: Product[] = [
      { id: 1, name: "Pizza" },
      { id: 2, name: "Cheese" },
      { id: 3, name: "Pepperoni" },
    ]

    render(<ProductList products={products} />)

    assert.ok(screen.getByText('Pizza'))
    assert.ok(screen.getByText('Cheese'))
    assert.ok(screen.getByText('Pepperoni'))
  })
})