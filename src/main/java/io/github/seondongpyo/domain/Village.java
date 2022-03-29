package io.github.seondongpyo.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;

@Getter
@Entity
public class Village {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String sido;

	private String sigungu;

	private String programCategory;

	private String program;

	private String facility;

	private String address;

	private String representative;

	private String phoneNumber;

	private LocalDate designatedDate;

	private String homepage;

	private String institution;

	private Double latitude;

	private Double longitude;

	private LocalDate approvedDate;

	private String institutionCode;

	private String institutionName;

}
