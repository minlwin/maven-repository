package com.jdc.maven.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class SaleItemPk {

	@Column(name = "sale_id", nullable = false)
	private int saleId;
	@Column(name = "product_id", nullable = false)
	private int productId;
}
