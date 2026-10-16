import { get } from "../../../lib/apiClient.ts"
import type { Product } from '../types.ts'

const LIST_PRODUCTS_PATH = "/products";

export const fetchProducts = async () => {
  const response = await get(LIST_PRODUCTS_PATH)
  const data: Product[] = await response.json()
  return data;
}