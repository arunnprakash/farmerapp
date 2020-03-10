package com.grana.farmerapp.model.authorization;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.grana.farmerapp.model.common.BaseDTO;

import lombok.AccessLevel;
import lombok.Builder;
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
@EqualsAndHashCode(callSuper = true)
@ToString
public class UserDTO extends BaseDTO {
	protected String userName;
	protected String firstName;
	protected String lastName;
	protected String mobileNumber;
	protected Date dob;
	protected Boolean suspended;
	protected String latitude;
	protected String longitude;
	protected List<RoleDTO> roles;
	protected List<Map<String, Object>> assets;
	protected Map<String, Object> preferredLanguage;
	protected Map<String, Object> village;
	protected Map<String, Object> gender;
	@Builder(toBuilder=true)
	public UserDTO(Long id, String createdBy, ZonedDateTime createdDate, String lastModifiedBy,
			ZonedDateTime lastModifiedDate, Boolean deleted, Long version, String userName, String firstName, 
			String lastName, String mobileNumber, Date dob, Boolean suspended, String latitude, String longitude, List<RoleDTO> roles,
			List<Map<String, Object>> assets, Map<String, Object> preferredLanguage, Map<String, Object> village, Map<String, Object> gender) {
		super(id, createdBy, createdDate, lastModifiedBy, lastModifiedDate, deleted, version);
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
		this.suspended = suspended;
		this.latitude = latitude;
		this.longitude = longitude;
		this.preferredLanguage = preferredLanguage;
		this.village = village;
		this.gender = gender;
		this.roles = roles;
		this.assets = assets;
	}
}