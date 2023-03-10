package com.DataJPAauditing.Entity;

import java.util.Date;

import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Audited
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private String description;
	private String prodcutType;
	
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	@LastModifiedBy
	private String LastModifiedBy;
	
	@LastModifiedDate
	@Temporal(TemporalType.DATE)
	private Date LastModifiedDate;
	
}
