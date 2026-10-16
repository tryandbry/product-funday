import { useQuery } from "@tanstack/react-query";
import { fetchProducts } from "../api/fetchProducts.ts";
import type { Product } from "../types.ts"

export const useProducts = () => {
  return useQuery({
    queryKey: ['products'],
    queryFn: fetchProducts,
    placeholderData: [] as Product[],
  })
}
