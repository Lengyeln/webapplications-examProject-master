package webApplications.examProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Album")
public class Album {
	
	@Id
	@Column(name="album_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int albumID;
	@NotEmpty
	private String cim;
	@NotNull
	@Min(value = 1)
	private int eladottDb;
	@NotNull
	@Min(value = 1975)
	private int kiadasDatum;
	
	protected Album() {
		
	}
	
	public Album(int albumID, String cim, int eladottDb, int kiadasDatum) {
		super();
		this.albumID = albumID;
		this.cim = cim;
		this.eladottDb = eladottDb;
		this.kiadasDatum = kiadasDatum;
	}

	public int getAlbumID() {
		return albumID;
	}

	public void setAlbumID(int albumID) {
		this.albumID = albumID;
	}	

	public String getCim() {
		return cim;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public int getEladottDb() {
		return eladottDb;
	}

	public void setEladottDb(int eladottDb) {
		this.eladottDb = eladottDb;
	}

	public int getKiadasDatum() {
		return kiadasDatum;
	}

	public void setKiadasDatum(int kiadasDatum) {
		this.kiadasDatum = kiadasDatum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + albumID;
		result = prime * result + ((cim == null) ? 0 : cim.hashCode());
		result = prime * result + eladottDb;
		result = prime * result + kiadasDatum;
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
		Album other = (Album) obj;
		if (albumID != other.albumID)
			return false;
		if (cim == null) {
			if (other.cim != null)
				return false;
		} else if (!cim.equals(other.cim))
			return false;
		if (eladottDb != other.eladottDb)
			return false;
		if (kiadasDatum != other.kiadasDatum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return albumID + ",  " + cim;
	}

	
}
