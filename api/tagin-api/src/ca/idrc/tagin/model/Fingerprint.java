package ca.idrc.tagin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Fingerprint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Key key;
	private Pattern pattern;

	public Fingerprint() {

	}

	public Key getKey() {
		return key;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

}
