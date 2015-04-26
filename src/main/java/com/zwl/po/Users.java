package com.zwl.po;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="users"
    ,catalog="mis"
, uniqueConstraints = @UniqueConstraint(columnNames="LoginId")
)

public class Users  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String loginId;
     private String loginPwd;
     private String name;
     private String phone;


    // Constructors

    /** default constructor */
    public Users() {
    }

    
    /** full constructor */
    public Users(String loginId, String loginPwd, String name, String phone) {
        this.loginId = loginId;
        this.loginPwd = loginPwd;
        this.name = name;
        this.phone = phone;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="Id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="LoginId", unique=true, nullable=false, length=50)

    public String getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    
    @Column(name="LoginPwd", nullable=false, length=50)

    public String getLoginPwd() {
        return this.loginPwd;
    }
    
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
    
    @Column(name="Name", nullable=false, length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="Phone", nullable=false, length=100)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }


}