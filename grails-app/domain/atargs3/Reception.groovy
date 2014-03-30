package atargs3

class Reception {
	String firstname
	String lastname
	String username
	String password
	
	String address
	String mobile
	
	int confirmedFlag=0

	static constraints = {
		firstname blank:false
		lastname blank:false
		
		username (blank:false, unique:true)
		password blank:false
		
		address (blank:false, maxSize:250)
		mobile (blank:false, maxSize:10, minSize:10, unique:true)
		
	}
	String toString(){
		return "$username"
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
