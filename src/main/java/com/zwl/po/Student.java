package com.zwl.po;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Student entity. @author daina
 */
@Entity
@Table(name="student"
    ,catalog="mis"
)

public class Student  implements java.io.Serializable {

    // Fields    

     private Integer stuId;
     private String stuName;
     private String stuSex;
     private Date stuBirthday;
     private String stuTel;
     private Date stuInDate;
     private String stuAddress;
     private String stuMemo;


    // Constructors

    /** default constructor */
    public Student() {
    }

	/** minimal constructor */
    public Student(String stuName) {
        this.stuName = stuName;
    }
    
    /** full constructor */
    public Student(String stuName, String stuSex, Date stuBirthday, String stuTel, Date stuInDate, String stuAddress, String stuMemo) {
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuBirthday = stuBirthday;
        this.stuTel = stuTel;
        this.stuInDate = stuInDate;
        this.stuAddress = stuAddress;
        this.stuMemo = stuMemo;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="stuId", unique=true, nullable=false)

    public Integer getStuId() {
        return this.stuId;
    }
    
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
    
    @Column(name="stuName", nullable=false, length=50)

    public String getStuName() {
        return this.stuName;
    }
    
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    
    @Column(name="stuSex", length=2)

    public String getStuSex() {
        return this.stuSex;
    }
    
    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="stuBirthday", length=10)

    public Date getStuBirthday() {
        return this.stuBirthday;
    }
    
    public void setStuBirthday(Date stuBirthday) {
        this.stuBirthday = stuBirthday;
    }
    
    @Column(name="stuTel", length=100)

    public String getStuTel() {
        return this.stuTel;
    }
    
    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="stuInDate", length=10)

    public Date getStuInDate() {
        return this.stuInDate;
    }
    
    public void setStuInDate(Date stuInDate) {
        this.stuInDate = stuInDate;
    }
    
    @Column(name="stuAddress", length=100)

    public String getStuAddress() {
        return this.stuAddress;
    }
    
    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
    
    @Column(name="stuMemo", length=100)

    public String getStuMemo() {
        return this.stuMemo;
    }
    
    public void setStuMemo(String stuMemo) {
        this.stuMemo = stuMemo;
    }

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuSex="
				+ stuSex + ", stuBirthday=" + stuBirthday + ", stuTel="
				+ stuTel + ", stuInDate=" + stuInDate + ", stuAddress="
				+ stuAddress + ", stuMemo=" + stuMemo + "]";
	}

}