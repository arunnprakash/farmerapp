package com.grana.farmerapp.model.common;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author __ArunPrakash__
 *
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
public class PagingAndFilterRequest {
	protected Integer pageNumber;
	protected Integer pageSize;
	protected List<FilterCriteria> filters;
	protected String sortBy;
	protected String sortingOrder;
}