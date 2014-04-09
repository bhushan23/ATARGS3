import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_doctorindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/doctor/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',11,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',12,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',94,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('remoteLink','g',107,['controller':("Doctor"),'update':("PatientTable"),'action':("ReportButton"),'before':("clearSearch()")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('remoteLink','g',111,['controller':("Doctor"),'update':("PatientTable"),'action':("dashboard"),'before':("clearSearch()")],2)
printHtmlPart(12)
for( _it1421419 in (limits[0]..<limits[1]) ) {
changeItVariable(_it1421419)
printHtmlPart(13)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(14)
}
printHtmlPart(15)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(16)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('set','g',187,['var':("i"),'value':(0)],-1)
printHtmlPart(18)
for( _it32587992 in (limits[1]..<limits[2]) ) {
changeItVariable(_it32587992)
printHtmlPart(13)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(14)
}
printHtmlPart(13)
if(true && (free[i] == 8)) {
printHtmlPart(20)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(21)
}
else {
printHtmlPart(22)
createTagBody(4, {->
printHtmlPart(23)
expressionOut.print(free[i])
printHtmlPart(24)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(25)
})
invokeTag('remoteLink','g',210,['update':("PatientTable"),'before':("clearSearch()"),'action':("GetDate"),'params':([Year: it.getAt(Calendar.YEAR), Month: it.getAt(Calendar.MONTH), Day: it.getAt(Calendar.DAY_OF_MONTH)])],4)
printHtmlPart(26)
expressionOut.print(free[i] /12 *100)
printHtmlPart(27)
}
printHtmlPart(13)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(17)
}
printHtmlPart(13)
invokeTag('set','g',226,['var':("i"),'value':(i + 1)],-1)
printHtmlPart(18)
}
printHtmlPart(28)
invokeTag('remoteField','g',251,['name':("FN"),'action':("FNfunc"),'id':("fn"),'update':("PatientTable"),'placeholder':("first name"),'size':("14")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',253,['name':("LN"),'action':("LNfunc"),'update':("PatientTable"),'id':("ln"),'placeholder':("surname"),'size':("13")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',255,['name':("A"),'id':("age"),'action':("Afunc"),'update':("PatientTable"),'placeholder':("age"),'size':("5")],-1)
printHtmlPart(30)
invokeTag('remoteField','g',256,['name':("M"),'action':("Mfunc"),'update':("PatientTable"),'id':("mac"),'placeholder':("m/c"),'size':("17	")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',258,['name':("MOB"),'id':("mob"),'action':("MOBfunc"),'update':("PatientTable"),'placeholder':("mobile"),'size':("15")],-1)
printHtmlPart(29)
invokeTag('submitToRemote','g',260,['before':("clearSearch()"),'class':("btn-warning"),'update':("PatientTable"),'value':("Reset"),'action':("resetSearch")],-1)
printHtmlPart(31)
for( _it30944533 in (patientList) ) {
changeItVariable(_it30944533)
printHtmlPart(32)
expressionOut.print(it.firstname)
printHtmlPart(33)
expressionOut.print(it.lastname)
printHtmlPart(33)
expressionOut.print(it.age)
printHtmlPart(33)
expressionOut.print(it.machine)
printHtmlPart(33)
expressionOut.print(it.mobile)
printHtmlPart(34)
if(true && (it.file!=null)) {
printHtmlPart(35)
createClosureForHtmlPart(36, 4)
invokeTag('link','g',305,['style':("color:blue"),'controller':("Doctor"),'action':("getReport"),'params':([patientId:it.id])],4)
printHtmlPart(37)
}
printHtmlPart(38)
}
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',323,[:],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396845410190L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [323, 323, 323, 323, 323, 323, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 10, 11, 11, 12, 12, 13, 13, 13, 13, 13, 13, 13, 17, 17, 18, 18, 94, 94, 96, 107, 107, 107, 107, 107, 111, 111, 112, 171, 171, 172, 172, 172, 172, 172, 175, 176, 182, 182, 183, 185, 185, 185, 187, 189, 189, 189, 191, 191, 191, 191, 193, 193, 193, 197, 199, 199, 200, 200, 207, 207, 207, 207, 209, 209, 210, 210, 210, 218, 219, 221, 223, 223, 223, 224, 226, 226, 226, 226, 226, 251, 253, 253, 255, 255, 256, 256, 258, 258, 260, 260, 260, 280, 280, 280, 281, 283, 286, 286, 289, 290, 292, 293, 295, 295, 299, 299, 305, 305, 305, 305, 305, 306, 306, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323, 323],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
