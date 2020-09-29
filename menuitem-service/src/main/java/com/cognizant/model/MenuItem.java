package com.cognizant.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@XmlRootElement
@Table(name = "menuitems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
	@Id
	@Column(name = "id")
	@NotNull(message = "id can't be null")
	private long id;

	@NotNull(message = "name can't be null")
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "price")
	@NotNull(message = "price can't be null")
	private float price;

	@Column(name = "actv")
	private boolean actv;

	@Column(name = "dateoflaunch")
	private Date dateOfLaunch;

	@Column(name = "category")
	@NotNull(message = "category can't be null")
	private String category;

	@Column(name = "freedelivery")
	private boolean freeDelivery;

}