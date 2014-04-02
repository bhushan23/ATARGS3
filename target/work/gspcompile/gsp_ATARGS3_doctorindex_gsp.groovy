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
invokeTag('captureHead','sitemesh',124,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('remoteLink','g',137,['controller':("Doctor"),'update':("PatientTable"),'action':("ReportButton")],2)
printHtmlPart(10)
for( _it600981 in (limits[0]..<limits[1]) ) {
changeItVariable(_it600981)
printHtmlPart(11)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(12)
}
printHtmlPart(13)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(14)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(15)
}
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('set','g',181,['var':("i"),'value':(0)],-1)
printHtmlPart(16)
for( _it809942 in (limits[1]..<limits[2]) ) {
changeItVariable(_it809942)
printHtmlPart(11)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(12)
}
printHtmlPart(11)
if(true && (free[i] == 8)) {
printHtmlPart(18)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(19)
}
else {
printHtmlPart(20)
createTagBody(4, {->
printHtmlPart(21)
expressionOut.print(free[i])
printHtmlPart(22)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(23)
})
invokeTag('remoteLink','g',204,['update':("PatientTable"),'action':("GetDate"),'params':([Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"])],4)
printHtmlPart(24)
expressionOut.print(free[i] /12 *100)
printHtmlPart(25)
}
printHtmlPart(11)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(15)
}
printHtmlPart(11)
invokeTag('set','g',220,['var':("i"),'value':(i + 1)],-1)
printHtmlPart(16)
}
printHtmlPart(26)
invokeTag('remoteField','g',245,['name':("FN"),'action':("FNfunc"),'update':("PatientTable"),'placeholder':("first name"),'size':("13")],-1)
printHtmlPart(27)
invokeTag('remoteField','g',247,['name':("LN"),'action':("LNfunc"),'update':("PatientTable"),'placeholder':("surname"),'size':("13")],-1)
printHtmlPart(27)
invokeTag('remoteField','g',249,['name':("A"),'action':("Afunc"),'update':("PatientTable"),'placeholder':("age"),'size':("5")],-1)
printHtmlPart(27)
invokeTag('remoteField','g',251,['name':("M"),'action':("Mfunc"),'update':("PatientTable"),'placeholder':("m/c"),'size':("17	")],-1)
printHtmlPart(27)
invokeTag('remoteField','g',253,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable"),'placeholder':("mobile"),'size':("15")],-1)
printHtmlPart(28)
for( _it23155755 in (patientList) ) {
changeItVariable(_it23155755)
printHtmlPart(29)
expressionOut.print(it.firstname)
printHtmlPart(30)
expressionOut.print(it.lastname)
printHtmlPart(30)
expressionOut.print(it.age)
printHtmlPart(30)
expressionOut.print(it.machine)
printHtmlPart(30)
expressionOut.print(it.mobile)
printHtmlPart(31)
if(true && (it.file!=null)) {
printHtmlPart(32)
createClosureForHtmlPart(33, 4)
invokeTag('link','g',298,['style':("color:blue"),'controller':("Doctor"),'action':("getReport"),'params':([patientId:it.id])],4)
printHtmlPart(34)
}
printHtmlPart(35)
}
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',316,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396259975000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
