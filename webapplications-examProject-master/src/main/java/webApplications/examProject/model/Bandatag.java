package webApplications.examProject.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Bandatag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="member_ID", nullable = false)
	@NotNull
	private int bandatagID;
	@NotEmpty
	private String nev;
	@NotEmpty
	private String nem;
	@NotEmpty
	private String hangszer;
	@NotNull
	private Date szuletesiDatum;
	@NotEmpty
	private String szuletesiHely;
	
	public Bandatag(){
		
	}

	
	public Bandatag(int bandatagID, String nev, String nem, String hangszer, Date szuletesiDatum,
			String szuletesiHely) {
		super();
		this.bandatagID = bandatagID;
		this.nev = nev;
		this.nem = nem;
		this.hangszer = hangszer;
		this.szuletesiDatum = szuletesiDatum;
		this.szuletesiHely = szuletesiHely;
	}


	public int getBandatagID() {
		return bandatagID;
	}

	public void setBandatagID(int bandatagID) {
		this.bandatagID = bandatagID;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getHangszer() {
		return hangszer;
	}

	public void setHangszer(String hangszer) {
		this.hangszer = hangszer;
	}

	public Date getSzuletesiDatum() {
		return szuletesiDatum;
	}

	public void setSzuletesiDatum(Date szuletesiDatum) {
		this.szuletesiDatum = szuletesiDatum;
	}

	public String getSzuletesiHely() {
		return szuletesiHely;
	}

	public void setSzuletesiHely(String szuletesiHely) {
		this.szuletesiHely = szuletesiHely;
	}

	public String getNem() {
		return nem;
	}

	public void setNem(String nem) {
		this.nem = nem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bandatagID;
		result = prime * result + ((hangszer == null) ? 0 : hangszer.hashCode());
		result = prime * result + ((nem == null) ? 0 : nem.hashCode());
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		result = prime * result + ((szuletesiDatum == null) ? 0 : szuletesiDatum.hashCode());
		result = prime * result + ((szuletesiHely == null) ? 0 : szuletesiHely.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bandatag other = (Bandatag) obj;
		if (bandatagID != other.bandatagID)
			return false;
		if (hangszer == null) {
			if (other.hangszer != null)
				return false;
		} else if (!hangszer.equals(other.hangszer))
			return false;
		if (nem == null) {
			if (other.nem != null)
				return false;
		} else if (!nem.equals(other.nem))
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		if (szuletesiDatum == null) {
			if (other.szuletesiDatum != null)
				return false;
		} else if (!szuletesiDatum.equals(other.szuletesiDatum))
			return false;
		if (szuletesiHely == null) {
			if (other.szuletesiHely != null)
				return false;
		} else if (!szuletesiHely.equals(other.szuletesiHely))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ID: " + bandatagID + ", név: " + nev + ", neme: " + nem + ", hangszer: " + hangszer
				+ ", születési dátum: " + szuletesiDatum + ", születési hely: " + szuletesiHely;
	}

	
}
