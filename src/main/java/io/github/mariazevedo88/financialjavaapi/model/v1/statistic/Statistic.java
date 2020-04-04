package io.github.mariazevedo88.financialjavaapi.model.v1.statistic;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class that implements the Statistic structure.
 * 
 * @author Mariana Azevedo
 * @since 01/04/2020
 */
@Entity
@Table(name = "statistics")
@AllArgsConstructor
public class Statistic implements Serializable {
	
	private static final long serialVersionUID = -7804600023031651840L;

	@Id
	@Getter
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Getter
	@Column(name = "transactions_sum")
	private BigDecimal sum;
	
	@Getter
	@Column(name = "transactions_avg")
	private BigDecimal avg;
	
	@Getter
	@Column(name = "transactions_max")
	private BigDecimal max;
	
	@Getter
	@Column(name = "transactions_min")
	private BigDecimal min;
	
	@Getter
	@Column(name = "transactions_count")
	private long count;
	
	public Statistic (BigDecimal sum, BigDecimal avg, BigDecimal max, BigDecimal min, long count) {
		this.sum = sum;
		this.avg = avg;
		this.max = max;
		this.min = min;
		this.count = count;
	}
}