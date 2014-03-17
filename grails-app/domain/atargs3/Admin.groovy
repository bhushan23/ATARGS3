package atargs3

class Admin {
	String username
	String password
	
    static constraints = {
		username (blank:false)
		password (blank:false)
    }
	String toString(){
		return "admin"
	}
}
