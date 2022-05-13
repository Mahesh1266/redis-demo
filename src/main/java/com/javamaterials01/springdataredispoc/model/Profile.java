package com.javamaterials01.springdataredispoc.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Profile")
public class Profile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int ban;
	private String name;
	private List<Integer> bans;
	private int lines;
	private int crpKey;
	private int ccrpid;
	private String treatmentDetails;
	private String mobile;

	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(int ban, String name, List<Integer> bans, int lines, int crpKey, int ccrpid, String treatmentDetails,
			String mobile) {
		super();
		this.ban = ban;
		this.name = name;
		this.bans = bans;
		this.lines = lines;
		this.crpKey = crpKey;
		this.ccrpid = ccrpid;
		this.treatmentDetails = treatmentDetails;
		this.mobile = mobile;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getBans() {
		return bans;
	}

	public void setBans(List<Integer> bans) {
		this.bans = bans;
	}

	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}

	public int getCrpKey() {
		return crpKey;
	}

	public void setCrpKey(int crpKey) {
		this.crpKey = crpKey;
	}

	public int getCcrpid() {
		return ccrpid;
	}

	public void setCcrpid(int ccrpid) {
		this.ccrpid = ccrpid;
	}

	public String getTreatmentDetails() {
		return treatmentDetails;
	}

	public void setTreatmentDetails(String treatmentDetails) {
		this.treatmentDetails = treatmentDetails;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Profile [ban=" + ban + ", name=" + name + ", bans=" + bans + ", lines=" + lines + ", crpKey=" + crpKey
				+ ", ccrpid=" + ccrpid + ", treatmentDetails=" + treatmentDetails + ", mobile=" + mobile + "]";
	}

}
