package org.hibernate.tutorial.anotation.enumtest;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hsqldb.rights.User;

@Entity
@Table(name = "ORDER_TAB")
public class EnumDomain {
	

		@Id
		@GeneratedValue
		private long orderNumber;
		
		private enum ORDERTYPE {SALES_ORDER, PURCHASE_ORDER, PRODUCTION_ORDER}; 
		
		@Enumerated
		private ORDERTYPE orderType; 
		
		private enum TRANSTYPE {CASH, CREDIT, CHEQUE}
		
		@Column
		private TRANSTYPE transMode; // cash or credit
		
		@Column
		private String orderDesc;

}
