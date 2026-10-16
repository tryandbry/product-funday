import { useState, type ChangeEvent, type SubmitEvent, useEffect } from 'react'
import { useCreateProduct} from "../hooks/useCreateProduct.ts"
import type { CreateProductRequest } from '../types.ts'

export const CreateProduct = () => {
  const [productName, setProductName] = useState('')
  const { mutate: createProduct, reset, isError, isSuccess, error } = useCreateProduct()

  const handleOnChange = (event: ChangeEvent<HTMLInputElement>) => {
    setProductName(event.target.value)
  }

  const handleSubmit = (event: SubmitEvent<HTMLFormElement>) => {
    event.preventDefault()
    const productRequest: CreateProductRequest = { name: productName } as CreateProductRequest
    createProduct(productRequest)
    setProductName('')
  }

  useEffect(() => {
    if (isError) {
      console.error(`Error creating product: ${error.message}`)
    }
    if (isError || isSuccess) {
      reset()
    }
  }, [isError, isSuccess, error, reset])

  return (
    <>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={productName}
          placeholder="Enter new product name"
          onChange={handleOnChange}
        />
        <button type="submit">Create Product</button>
      </form>
    </>
  )
}