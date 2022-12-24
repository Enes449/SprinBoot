package edu.fra.uas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentAccount {

		@Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private long id;
	    private String Name;
	    private int alter;
	    private double note;

	    // used for serialization / deserialization
	    protected StudentAccount() {}
	    
	    public StudentAccount(String Name, int alter, double note){

	        this.Name = Name;
	        this.alter = alter;
	        this.note = note;
	    }

	    public long getId() {
	        return id;
	    }

	    public String getName() {
	        return Name;
	    }

	    public int getAlter() {
	        return alter;
	    }

		public double getNote() {
			return note;
		}

		public void setNote(double note) {
			this.note = note;
		}
	    
	    
	}

