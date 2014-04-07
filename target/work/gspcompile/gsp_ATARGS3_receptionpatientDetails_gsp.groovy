import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionpatientDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/patientDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',6,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',7,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',32,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
for( _it24445744 in (req_entry) ) {
changeItVariable(_it24445744)
printHtmlPart(10)
expressionOut.print(it.firstname)
printHtmlPart(11)
expressionOut.print(it.middlename)
printHtmlPart(12)
expressionOut.print(it.lastname)
printHtmlPart(13)
expressionOut.print(it.gender)
printHtmlPart(14)
expressionOut.print(it.age)
printHtmlPart(15)
expressionOut.print(it.mobile)
printHtmlPart(16)
expressionOut.print(it.email)
printHtmlPart(17)
expressionOut.print(it.address)
printHtmlPart(18)
expressionOut.print(it.pincode)
printHtmlPart(19)
expressionOut.print(it.city)
printHtmlPart(20)
expressionOut.print(it.state)
printHtmlPart(21)
expressionOut.print(it.machine)
printHtmlPart(22)
if(true && (checkBoxInfo[0] == 1)) {
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (checkBoxInfo[1] == 1)) {
printHtmlPart(25)
}
printHtmlPart(24)
if(true && (checkBoxInfo[2] == 1)) {
printHtmlPart(26)
}
printHtmlPart(24)
if(true && (checkBoxInfo[3] == 1)) {
printHtmlPart(27)
}
printHtmlPart(24)
if(true && (checkBoxInfo[4] == 1)) {
printHtmlPart(28)
}
printHtmlPart(24)
if(true && (checkBoxInfo[5] == 1)) {
printHtmlPart(29)
}
printHtmlPart(24)
if(true && (checkBoxInfo[6] == 1)) {
printHtmlPart(30)
}
printHtmlPart(24)
if(true && (checkBoxInfo[7] == 1)) {
printHtmlPart(31)
}
printHtmlPart(24)
if(true && (checkBoxInfo[8] == 1)) {
printHtmlPart(32)
}
printHtmlPart(33)
if(true && (checkBoxInfo[9] == 1)) {
printHtmlPart(34)
}
printHtmlPart(35)
if(true && (checkBoxInfo[10] == 1)) {
printHtmlPart(36)
}
printHtmlPart(35)
if(true && (checkBoxInfo[11] == 1)) {
printHtmlPart(37)
}
printHtmlPart(35)
if(true && (checkBoxInfo[12] == 1)) {
printHtmlPart(38)
}
printHtmlPart(35)
if(true && (checkBoxInfo[13] == 1)) {
printHtmlPart(39)
}
printHtmlPart(35)
if(true && (checkBoxInfo[14] == 1)) {
printHtmlPart(40)
}
printHtmlPart(35)
if(true && (checkBoxInfo[15] == 1)) {
printHtmlPart(41)
}
printHtmlPart(42)
if(true && (checkBoxInfo[16] == 1)) {
printHtmlPart(43)
}
printHtmlPart(35)
if(true && (checkBoxInfo[17] == 1)) {
printHtmlPart(44)
}
printHtmlPart(35)
if(true && (checkBoxInfo[18] == 1)) {
printHtmlPart(45)
}
printHtmlPart(35)
if(true && (checkBoxInfo[19] == 1)) {
printHtmlPart(46)
}
printHtmlPart(35)
if(true && (checkBoxInfo[20] == 1)) {
printHtmlPart(47)
}
printHtmlPart(35)
if(true && (checkBoxInfo[21] == 1)) {
printHtmlPart(48)
}
printHtmlPart(35)
if(true && (checkBoxInfo[22] == 1)) {
printHtmlPart(49)
}
printHtmlPart(35)
if(true && (checkBoxInfo[23] == 1)) {
printHtmlPart(50)
}
printHtmlPart(35)
if(true && (checkBoxInfo[24] == 1)) {
printHtmlPart(51)
}
printHtmlPart(35)
if(true && (checkBoxInfo[25] == 1)) {
printHtmlPart(52)
}
printHtmlPart(35)
if(true && (checkBoxInfo[26] == 1)) {
printHtmlPart(53)
}
printHtmlPart(35)
if(true && (checkBoxInfo[27] == 1)) {
printHtmlPart(54)
}
printHtmlPart(55)
expressionOut.print(it.clinicalhistory)
printHtmlPart(56)
expressionOut.print(it.pregnant)
printHtmlPart(57)
}
printHtmlPart(58)
})
invokeTag('form','g',297,['action':("saveAppChanges")],2)
printHtmlPart(59)
})
invokeTag('captureBody','sitemesh',309,[:],1)
printHtmlPart(60)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396798361462L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [318, 318, 318, 318, 318, 318, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 12, 12, 13, 13, 32, 32, 35, 59, 59, 67, 67, 67, 67, 67, 72, 72, 79, 79, 85, 85, 91, 91, 97, 97, 103, 103, 109, 109, 115, 115, 121, 121, 127, 127, 133, 133, 140, 140, 149, 149, 151, 152, 152, 152, 154, 155, 155, 155, 157, 158, 158, 158, 160, 161, 161, 161, 163, 164, 164, 164, 166, 167, 167, 167, 169, 170, 170, 170, 172, 173, 173, 173, 175, 175, 187, 187, 189, 191, 191, 191, 193, 195, 195, 195, 197, 199, 199, 199, 201, 203, 203, 203, 205, 207, 207, 207, 209, 211, 211, 211, 213, 213, 223, 223, 226, 228, 228, 228, 231, 233, 233, 233, 235, 237, 237, 237, 239, 241, 241, 241, 243, 245, 245, 245, 248, 250, 250, 250, 252, 254, 254, 254, 256, 258, 258, 258, 261, 263, 263, 263, 266, 268, 268, 268, 270, 272, 272, 272, 274, 274, 281, 281, 290, 290, 295, 295, 297, 297, 297, 309, 309, 309, 318, 318, 318, 318, 318, 318, 318, 318, 318, 318, 318, 318, 318, 318],
	sourceName = "patientDetails.gsp"
)
class ___LineNumberPlaceholder { }
