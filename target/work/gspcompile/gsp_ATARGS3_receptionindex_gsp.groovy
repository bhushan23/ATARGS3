import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',13,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',14,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',129,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('set','g',133,['var':("months"),'value':("${new java.text.DateFormatSymbols().months} ")],-1)
printHtmlPart(8)
invokeTag('set','g',134,['var':("today"),'value':(new Date())],-1)
printHtmlPart(9)
expressionOut.print(currentmonth)
printHtmlPart(10)
if(true && (nxtmonth == 1)) {
printHtmlPart(11)
expressionOut.print(nextmonth)
printHtmlPart(10)
}
printHtmlPart(12)
for( _it28646424 in (limits[0]..<limits[1]) ) {
changeItVariable(_it28646424)
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
invokeTag('set','g',197,['var':("i"),'value':(0)],-1)
printHtmlPart(18)
for( _it21464884 in (limits[1]..<limits[2]) ) {
changeItVariable(_it21464884)
printHtmlPart(13)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(14)
}
printHtmlPart(13)
if(true && (free[i] == 0)) {
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
invokeTag('remoteLink','g',220,['update':("AppointmentTable"),'action':("ShowApp"),'params':([Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"])],4)
printHtmlPart(26)
expressionOut.print(free[i] /totalNoOfIntervals *100)
printHtmlPart(27)
}
printHtmlPart(13)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(17)
}
printHtmlPart(13)
invokeTag('set','g',236,['var':("i"),'value':(i + 1)],-1)
printHtmlPart(18)
}
printHtmlPart(28)
invokeTag('remoteField','g',258,['name':("FN"),'action':("FNfunc"),'update':("AppointmentTable"),'placeholder':("first name"),'size':("8")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',264,['name':("LN"),'action':("LNfunc"),'update':("AppointmentTable"),'placeholder':("surname"),'size':("8")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',266,['name':("A"),'action':("Afunc"),'update':("AppointmentTable"),'placeholder':("age"),'size':("14")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',267,['name':("M"),'action':("Mfunc"),'update':("AppointmentTable"),'placeholder':("m/c"),'size':("18")],-1)
printHtmlPart(29)
invokeTag('remoteField','g',270,['name':("MOB"),'action':("MOBfunc"),'update':("AppointmentTable"),'placeholder':("mobile"),'size':("10")],-1)
printHtmlPart(30)
for( _it16607649 in (result) ) {
changeItVariable(_it16607649)
printHtmlPart(31)
expressionOut.print(it.firstname)
printHtmlPart(32)
expressionOut.print(it.lastname)
printHtmlPart(32)
expressionOut.print(it.confirmed_date)
printHtmlPart(32)
expressionOut.print(it.machine)
printHtmlPart(32)
expressionOut.print(it.scanof)
printHtmlPart(32)
expressionOut.print(it.mobile)
printHtmlPart(33)
createTagBody(3, {->
printHtmlPart(34)
createClosureForHtmlPart(35, 4)
invokeTag('link','g',316,['params':([p:it.id]),'action':("editApp")],4)
printHtmlPart(36)
})
invokeTag('form','g',319,['action':("editApp"),'method':("post")],3)
printHtmlPart(37)
}
printHtmlPart(38)
createClosureForHtmlPart(39, 2)
invokeTag('link','g',325,['controller':("Login"),'action':("takeBackup"),'class':("btn btn-info")],2)
printHtmlPart(40)
createClosureForHtmlPart(41, 2)
invokeTag('link','g',330,['action':("cancelCTApp"),'class':("btn btn-danger")],2)
printHtmlPart(42)
createClosureForHtmlPart(41, 2)
invokeTag('link','g',333,['action':("cancelMRIApp"),'class':("btn btn-danger")],2)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',343,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396263613000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
