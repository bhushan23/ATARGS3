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
	def beforeInsert() {
		encodePassword()
	  }
	
	  def beforeUpdate() {
		if (isDirty('password')) {
		  encodePassword()
		}
	  }
	
	  protected void encodePassword() {
		password = org.apache.commons.codec.digest.DigestUtils.sha256Hex(password);
	  }
}
