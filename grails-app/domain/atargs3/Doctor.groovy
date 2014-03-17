package atargs3

class Doctor {
	String firstname
	String lastname
	String username
	String password
	
	String address
	String mobile
	String email
	
	int confirmedFlag
	

	static hasMany = [patients: PatientDetails]
	

	static constraints = {
		firstname blank:false
		lastname blank:false
		
		username (blank:false, unique:true)
		password blank:false
		
		address (blank:false, maxSize:250)
		mobile (blank:false, maxSize:10, minSize:10, unique:true)
		email(email:true)
	}
	
	String toString() {
		"${username}"
	}
}
	
