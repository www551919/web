package com.gezhi.pojo;

import java.io.Serializable;
/**
 * �û���
 * @author Liuyf
 *
 */
public class User implements Serializable{
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String userPwd, Integer userType) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userType = userType;
	}
	
	public User(Integer userId, String userName, Integer userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
	}

	//�û�ID
	private Integer userId;
	//�û�����
	private String userName;
	//�û�����
	private String userPwd;
	//�û�״̬ 1-����  0-��ֹ��¼
	private Integer userType;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userType=" + userType
				+ "]";
	}
	
}