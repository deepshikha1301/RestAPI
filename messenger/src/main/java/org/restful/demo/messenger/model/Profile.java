package org.restful.demo.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long  profileId;
	private String profileName;
	private String firtsName;
	private String lastName;
	private Date created;
	
	public Profile() {}
	
	public Profile(long profileId, String profileName, String firtsName, String lastName) {
		super();
		this.profileId = profileId;
		this.profileName = profileName;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.created =  new Date();
	}

	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	

}
