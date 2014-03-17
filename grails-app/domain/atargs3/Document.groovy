package atargs3

class Document {
	String filename
	String full_Path
	Date uploadDate = new Date()
	static constraints = {
		filename(blank:false,nullable:false)
		full_Path(blank:false,nullable:false)
	}

}
