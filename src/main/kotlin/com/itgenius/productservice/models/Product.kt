package com.itgenius.productservice.models

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity
@Table(name = "products")
data class Product(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Int = 0,

    @Column(name = "product_name")
    @Size(min = 3, max = 50, message = "Product name must be between 3 and 50 characters")
    @NotBlank(message = "Product name is required")
    val productName: String = "",

    @Column(name = "product_price")
    @Size(min = 3, max = 50, message = "Product description must be between 3 and 50 characters")
    @NotBlank(message = "Product description is required")
    val productPrice: Double = 0.0,

    @Column(name = "product_description")
    val productDescription: String = "",

    @Column(name = "product_qty")
    @NotBlank(message = "Product qty is required")
    val productQty: Int = 0,
)
