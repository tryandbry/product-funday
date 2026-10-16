import type { Product } from '../types.ts'

export interface ProductListProps {
  products: Product[]
}

export const ProductList = ({ products }: ProductListProps) => {
  return (
    <>
      {products.map(product => (
        <div key={product.id}>
          <span>{product.id}</span>
          <span>&nbsp;</span>
          <span>{product.name}</span>
        </div>
      ))}
    </>
  )
}