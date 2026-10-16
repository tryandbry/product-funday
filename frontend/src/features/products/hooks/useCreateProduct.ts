import { useMutation, useQueryClient } from '@tanstack/react-query'
import type { CreateProductRequest } from '../types.ts'
import { createProduct } from '../api/createProduct.ts'

export const useCreateProduct = () => {
  const queryClient = useQueryClient();

  return useMutation({
    mutationFn: (productRequest: CreateProductRequest) => createProduct(productRequest),
    onSuccess: () => {
      queryClient.invalidateQueries({
        queryKey: ['products']
      });
    },
  })
}