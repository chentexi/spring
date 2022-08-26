package com.trent.bean;

/**
 * @Author: Trent
 * @Date: 2022/8/25 16:14
 * @program: spring
 * @Description:
 */
public class Dept{
	private String DeptNo;
	private String deptName;
	
	public String getDeptNo(){
		return DeptNo;
	}
	public void setDeptNo(String deptNo){
		DeptNo = deptNo;
	}
	public String getDeptName(){
		return deptName;
	}
	public void setDeptName(String deptName){
		this.deptName = deptName;
	}
	//@Override
	//public String toString(){
	//	return "\'Dept\':{" + "\'DeptNo\':\'" + DeptNo + '\'' + "," + "\'deptName\':\'" + deptName + '\'' + '}';
	//}
}
