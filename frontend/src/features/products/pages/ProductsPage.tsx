import { useProducts } from "../hooks/useProducts.ts"
import { ProductList } from "../components/ProductList.tsx"
import { CreateProduct } from "../components/CreateProduct.tsx"

export const ProductsPage = () => {
  const { data: products, isPending, isError, error } = useProducts();

  if (isPending) return <p>Loading...</p>
  if (isError) return <p>Error loading products: {error.message}</p>

  return (
    <>
      <ProductList products={products} />
      <CreateProduct />
    </>
  )
}