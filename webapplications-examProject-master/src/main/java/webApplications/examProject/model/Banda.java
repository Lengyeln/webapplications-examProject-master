package webApplications.examProject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Banda {
	
	@Id
	@Column(name="band_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int bandaID;
	@NotEmpty
	private String nev;
	@NotEmpty
	private String mufaj;
	@NotEmpty
	private String szarmazas;
	@OneToMany
	private List<Album> albumok;
	@OneToMany
	private List<Bandatag> tagok;
	
	protected Banda() {
		
	}
	
	public Banda(int bandaID, String nev, String mufaj, String szarmazas, List<Album> albumok, List<Bandatag> tagok) {
		super();
		this.bandaID = bandaID;
		this.nev = nev;
		this.mufaj = mufaj;
		this.szarmazas = szarmazas;
		this.albumok = albumok;
		this.tagok = tagok;
	}

	public int getBandaID() {
		return bandaID;
	}

	public void setBandaID(int bandaID) {
		this.bandaID = bandaID;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getMufaj() {
		return mufaj;
	}

	public void setMufaj(String mufaj) {
		this.mufaj = mufaj;
	}

	public String getSzarmazas() {
		return szarmazas;
	}

	public void setSzarmazas(String szarmazas) {
		this.szarmazas = szarmazas;
	}

	public List<Bandatag> getTagok() {
		return tagok;
	}

	public void setTagok(List<Bandatag> tagok) {
		this.tagok = tagok;
	}

	public List<Album> getAlbumok() {
		return albumok;
	}

	public void setAlbumok(List<Album> albumok) {
		this.albumok = albumok;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albumok == null) ? 0 : albumok.hashCode());
		result = prime * result + bandaID;
		result = prime * result + ((mufaj == null) ? 0 : mufaj.hashCode());
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		result = prime * result + ((szarmazas == null) ? 0 : szarmazas.hashCode());
		result = prime * result + ((tagok == null) ? 0 : tagok.hashCode());
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
		Banda other = (Banda) obj;
		if (albumok == null) {
			if (other.albumok != null)
				return false;
		} else if (!albumok.equals(other.albumok))
			return false;
		if (bandaID != other.bandaID)
			return false;
		if (mufaj == null) {
			if (other.mufaj != null)
				return false;
		} else if (!mufaj.equals(other.mufaj))
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		if (szarmazas == null) {
			if (other.szarmazas != null)
				return false;
		} else if (!szarmazas.equals(other.szarmazas))
			return false;
		if (tagok == null) {
			if (other.tagok != null)
				return false;
		} else if (!tagok.equals(other.tagok))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Banda [bandaID=" + bandaID + ", nev=" + nev + ", mufaj=" + mufaj + ", szarmazas=" + szarmazas
				+ ", albumok=" + albumok + ", tagok=" + tagok + "]";
	}

	
}
