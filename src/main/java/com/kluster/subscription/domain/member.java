package com.kluster.subscription.domain;

public class member {
	private String memberId;
	private String memberPass;
	private String memberPass2;
	private String memberName;
	private String memberNicname;
	private String memberPhonenum;
	private String memberDate;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPass() {
		return memberPass;
	}
	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}
	public String getMemberPass2() {
		return memberPass2;
	}
	public void setMemberPass2(String memberPass2) {
		this.memberPass2 = memberPass2;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberNicname() {
		return memberNicname;
	}
	public void setMemberNicname(String memberNicname) {
		this.memberNicname = memberNicname;
	}
	public String getMemberPhonenum() {
		return memberPhonenum;
	}
	public void setMemberPhonenum(String memberPhonenum) {
		this.memberPhonenum = memberPhonenum;
	}
	public String getMemberDate() {
		return memberDate;
	}
	public void setMemberDate(String memberDate) {
		this.memberDate = memberDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("member [memberId=");
		builder.append(memberId);
		builder.append(", memberPass=");
		builder.append(memberPass);
		builder.append(", memberPass2=");
		builder.append(memberPass2);
		builder.append(", memberName=");
		builder.append(memberName);
		builder.append(", memberNicname=");
		builder.append(memberNicname);
		builder.append(", memberPhonenum=");
		builder.append(memberPhonenum);
		builder.append(", memberDate=");
		builder.append(memberDate);
		builder.append("]");
		return builder.toString();
	}
	
}
