package com.itgenius.productservice.services

import com.itgenius.productservice.models.Product
import com.itgenius.productservice.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class ProductService(
    private  val productRepository: ProductRepository
) {

    // CRUD
    // Get All Products
    fun getAllProducts(): List<Product> = productRepository.findAll()

    // Get Product By Id
    fun getProductById(id: Int):Optional<Product> = productRepository.findById(id)

    // Create Product
    fun createProduct(product: Product): Product = productRepository.save(product)

    // Update Product
    fun updateProduct(id: Int, updateProduct: Product): Product {
        return if(productRepository.existsById(id)) {
            updateProduct.id = id
            productRepository.save(updateProduct)
        } else {
            throw Exception("Product not found with id: $id")
        }
    }

    // Delete Product
    fun deleteProduct(id: Int) {
        return if(productRepository.existsById(id)) {
            productRepository.deleteById(id)
        } else {
            throw Exception("Product not found with id: $id")
        }
    }

}