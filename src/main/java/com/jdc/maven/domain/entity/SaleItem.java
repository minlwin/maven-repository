package com.jdc.maven.domain.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class SaleItem {

	@EmbeddedId
	private SaleItemPk id;
	
	@ManyToOne
	@JoinColumn(name = "sale_id", referencedColumnName = "id", updatable = false, insertable = false)
	private SaleHistory sale;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id", updatable = false, insertable = false)
	private Product product;
	
	private int price;
	private int quantity;
}
