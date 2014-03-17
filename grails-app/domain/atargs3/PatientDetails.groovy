package atargs3

import java.util.Date;

class PatientDetails {
	//id in database is used as PID
	String firstname
	String middlename
	String lastname
	String gender
	int age

	String address
	String pincode
	String city
	String state
	String mobile
	String email

	Date priority1
	Date priority2
	Date priority3
	Date confirmedDate

	String machine
	int doc_id
	String docid;
	String file
	Boolean is_Paid
	String otp
	Date upDate
	Date expDate
	String summary
	String clinicalhistory="None"

	String appointmenttype
	
	String scanof=""
	String disease="None"
	String harmfulitems="None"
	String pregnant="-"

	static constraints = {
		firstname(blank:false)
		lastname()
		middlename(nullable:true)
		age()
		gender(inList: ["Male", "Female"])
		machine(nullable:true)
		address(maxSize:250)
		mobile(blank:false, maxSize:10, minSize:10)
		email( nullable:true)
		pincode( nullable:true)
		city( nullable:true)
		state( nullable:true)
		
		priority1(nullable:false)
		priority2(nullable:false)
		priority3(nullable:false)
		confirmedDate(nullable:true)
		doc_id(nullable:true)
		docid(nullable:true)

		file(nullable:true)
		is_Paid(nullable:true)
		otp(nullable:true)
		upDate(nullable:true)
		expDate(nullable:true)
		summary(nullable:true)

		appointmenttype(nullable:true)
		
		
		

	}
	String toString() {
		"${firstname}"
	}
}
