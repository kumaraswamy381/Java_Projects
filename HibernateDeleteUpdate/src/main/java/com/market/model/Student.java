package com.market.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class Student {
	
         @Id
         @Column(name="SID")
		private int sID;
         
         @Column(name="SNAME")
		private String sName;
         
         @Column(name="SCITY")
		private String sCity;
		
		public Student() {
			System.out.println("Zero param constructor for Hibernate");
		}
		
		public int getsID() {
			return sID;
		}
		public void setsID(int sID) {
			this.sID = sID;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public String getsCity() {
			return sCity;
		}
		public void setsCity(String sCity) {
			this.sCity = sCity;
		}
		@Override
		public String toString() {
			return "Student [sID=" + sID + ", sName=" + sName + ", sCity=" + sCity + ", getsID()=" + getsID()
					+ ", getsName()=" + getsName() + ", getsCity()=" + getsCity() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
	


}
