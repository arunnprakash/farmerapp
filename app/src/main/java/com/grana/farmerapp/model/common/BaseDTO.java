package com.grana.farmerapp.model.common;

import java.time.ZonedDateTime;

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
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode
@ToString
public class BaseDTO {
	protected Long id;

	protected String createdBy;

	protected ZonedDateTime createdDate;

	protected String lastModifiedBy;

	protected ZonedDateTime lastModifiedDate;

	protected Boolean deleted;

	protected Long version;
}