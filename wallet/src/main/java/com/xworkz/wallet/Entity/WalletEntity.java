package com.xworkz.wallet.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="wallet_table")
@NamedQuery(name="findcolorbyname",query="Select entity.color FROM WalletEntity  entity WHERE entity.name=:nameby")
@NamedQuery(name="findpricebyname",query="Select entity.price FROM WalletEntity  entity WHERE entity.name=:nameby")
@NamedQuery(name="findcolorandpricebyname",query="Select entity.color,entity.price FROM WalletEntity  entity WHERE entity.name=:nameby")
public class WalletEntity {
@Id
@Column(name="wallet_id")
	private int id;
@Column(name="wallet_name")
	private String name;
@Column(name="wallet_price")
	private int price;
@Column(name="wallet_color")
	private String color;
@Column(name="wallet_brand")
	private String brand;
	
	
}
