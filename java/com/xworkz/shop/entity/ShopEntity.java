package com.xworkz.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="shopentity")
public class ShopEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SHOP_ID")
	private int shopid;
	
	@Column(name="SHOP_NAME")
	private String shopName;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="OWNER_NAME")
	private String ownerName;
	
	@Column(name="OPEN")
	private boolean open;
	
	public ShopEntity(String shopName, String location, String ownerName, boolean i) {
		super();
		
		this.shopName = shopName;
		this.location = location;
		this.ownerName = ownerName;
		this.open = i;
	}
	
	
	

}
