package io.github.seondongpyo.viliage.domain;

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

	private String area;

	private String photo;

	private String roadNameAddress;

	private String landLotAddress;

	private String representative;

	private String phoneNumber;

	private LocalDate approvedDate;

	private String homepage;

	private String institution;

	private Double latitude;

	private Double longitude;

	private LocalDate referenceDate;

	private String institutionCode;

	private String institutionName;

}
