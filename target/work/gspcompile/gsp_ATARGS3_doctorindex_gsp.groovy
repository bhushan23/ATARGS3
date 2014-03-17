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
printHtmlPart(3)
invokeTag('require','r',11,['modules':("bootstrap")],-1)
printHtmlPart(3)
invokeTag('layoutResources','r',12,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',124,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('remoteLink','g',135,['controller':("Doctor"),'update':("PatientTable"),'action':("ReportButton")],2)
printHtmlPart(11)
for( _it5747319 in (limits[0]..<limits[1]) ) {
changeItVariable(_it5747319)
printHtmlPart(12)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(13)
}
printHtmlPart(14)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(15)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(16)
}
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('set','g',177,['var':("i"),'value':(0)],-1)
printHtmlPart(17)
for( _it22625812 in (limits[1]..<limits[2]) ) {
changeItVariable(_it22625812)
printHtmlPart(12)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(13)
}
printHtmlPart(12)
if(true && (free[i] == 8)) {
printHtmlPart(19)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(20)
}
else {
printHtmlPart(21)
createTagBody(4, {->
printHtmlPart(22)
expressionOut.print(free[i])
printHtmlPart(23)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(24)
})
invokeTag('remoteLink','g',200,['update':("PatientTable"),'action':("GetDate"),'params':([Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"])],4)
printHtmlPart(25)
expressionOut.print(free[i] /12 *100)
printHtmlPart(26)
}
printHtmlPart(12)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(16)
}
printHtmlPart(12)
invokeTag('set','g',216,['var':("i"),'value':(i + 1)],-1)
printHtmlPart(17)
}
printHtmlPart(27)
invokeTag('remoteField','g',240,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(28)
invokeTag('remoteField','g',242,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',243,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(30)
invokeTag('remoteField','g',244,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(30)
invokeTag('remoteField','g',245,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(31)
for( _it33213743 in (patientList) ) {
changeItVariable(_it33213743)
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
invokeTag('link','g',290,['style':("color:blue"),'controller':("Doctor"),'action':("getReport"),'params':([patientId:it.id])],4)
printHtmlPart(34)
}
printHtmlPart(37)
}
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',308,[:],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389104582000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
