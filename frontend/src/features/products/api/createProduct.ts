import { post } from '../../../lib/apiClient'
import type { Product, CreateProductRequest } from '../types.ts'

const CREATE_PRODUCTS_PATH = "/products";

export const createProduct = async (productRequest: CreateProductRequest) => {
  const response = await post<CreateProductRequest>(CREATE_PRODUCTS_PATH, productRequest)
  const data: Product = await response.json()
  return data;
}