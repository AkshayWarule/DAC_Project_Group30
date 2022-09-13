package net.javaguide.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Data
@Entity
@Table(name="fundraiserprofile")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class Fundraiser {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long fundraiserid;
@Column
private String firstname;
@Column
private String  middlename;
@Column
private String  lastname;
@Column
private  String emailid;
@Column
private String   contactnumber;
@Column
private String profession; 
@Column
private String birthdate;
@Column
private String  maritalstatus ;
@Column
private String city;
@Column
private String state;
@Column
private String country;
@Column
private String address;
@Column
private String pincode;
@Column
private String gender;
@Column
private String aadhaarnumber;
@Column
private String password;
@Column
private String accountstatus;
@Column
private String academicqualification;
@Column
private String organizationname ;
@Column
private String govtregistrationnumber;
@Column
private String fundraisercategory ;
@Column
private String organizationcity;
@Column
private String organizationstate;
@Column
private String organizationcountry;
@Column
private String organizationaddress;
@Column
private String organizationwebsite;
@Column
private String organizationdescription;

}
