package com.example.domain;

import java.util.Date;

public class StuVO {
   private String scode;
   private String sname;
   private String dept;
   private Date birthday;
   
   
   public String getScode() {
      return scode;
   }
   public void setScode(String scode) {
      this.scode = scode;
   }
   public String getSname() {
      return sname;
   }
   public void setSname(String sname) {
      this.sname = sname;
   }
   public String getDept() {
      return dept;
   }
   public void setDept(String dept) {
      this.dept = dept;
   }
   public Date getBirthday() {
      return birthday;
   }
   public void setBirthday(Date birthday) {
      this.birthday = birthday;
   }
   @Override
   public String toString() {
      return "StuVO [scode=" + scode + ", sname=" + sname + ", dept=" + dept + ", birthday=" + birthday + "]";
   }
   
}