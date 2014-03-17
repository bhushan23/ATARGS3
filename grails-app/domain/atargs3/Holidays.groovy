package atargs3

class Holidays {

	String holiday
	String machine
	
    static constraints = {
		holiday(nullable:true)
		machine(nullable:true)
    }
}
