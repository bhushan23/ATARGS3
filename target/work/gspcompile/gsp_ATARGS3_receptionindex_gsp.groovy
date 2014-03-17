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
invokeTag('set','g',132,['var':("months"),'value':("${new java.text.DateFormatSymbols().months} ")],-1)
printHtmlPart(8)
invokeTag('set','g',133,['var':("today"),'value':(new Date())],-1)
printHtmlPart(9)
expressionOut.print(currentmonth)
printHtmlPart(10)
if(true && (nxtmonth == 1)) {
printHtmlPart(11)
expressionOut.print(nextmonth)
printHtmlPart(12)
}
printHtmlPart(13)
for( _it418628 in (limits[0]..<limits[1]) ) {
changeItVariable(_it418628)
printHtmlPart(14)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(15)
}
printHtmlPart(16)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(17)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(18)
}
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('set','g',194,['var':("i"),'value':(0)],-1)
printHtmlPart(19)
for( _it23015278 in (limits[1]..<limits[2]) ) {
changeItVariable(_it23015278)
printHtmlPart(14)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(15)
}
printHtmlPart(14)
if(true && (free[i] == 0)) {
printHtmlPart(21)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(22)
}
else {
printHtmlPart(23)
createTagBody(4, {->
printHtmlPart(24)
expressionOut.print(free[i])
printHtmlPart(25)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(26)
})
invokeTag('remoteLink','g',221,['update':("AppointmentTable"),'action':("ShowApp"),'params':([Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"])],4)
printHtmlPart(27)
expressionOut.print(free[i] /totalNoOfIntervals *100)
printHtmlPart(28)
}
printHtmlPart(14)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(18)
}
printHtmlPart(14)
invokeTag('set','g',232,['var':("i"),'value':(i + 1)],-1)
printHtmlPart(19)
}
printHtmlPart(29)
invokeTag('remoteField','g',255,['name':("FN"),'action':("FNfunc"),'update':("AppointmentTable")],-1)
printHtmlPart(30)
invokeTag('remoteField','g',256,['name':("LN"),'action':("LNfunc"),'update':("AppointmentTable")],-1)
printHtmlPart(30)
invokeTag('remoteField','g',257,['name':("A"),'action':("Afunc"),'update':("AppointmentTable")],-1)
printHtmlPart(30)
invokeTag('remoteField','g',257,['name':("M"),'action':("Mfunc"),'update':("AppointmentTable")],-1)
printHtmlPart(30)
invokeTag('remoteField','g',259,['name':("MOB"),'action':("MOBfunc"),'update':("AppointmentTable")],-1)
printHtmlPart(31)
for( _it2289631 in (result) ) {
changeItVariable(_it2289631)
printHtmlPart(32)
expressionOut.print(it.firstname)
printHtmlPart(33)
expressionOut.print(it.lastname)
printHtmlPart(33)
expressionOut.print(it.confirmed_date)
printHtmlPart(33)
expressionOut.print(it.machine)
printHtmlPart(33)
expressionOut.print(it.scanof)
printHtmlPart(33)
expressionOut.print(it.mobile)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(35)
createClosureForHtmlPart(36, 4)
invokeTag('link','g',309,['params':([p:"${it.id}"]),'action':("editApp")],4)
printHtmlPart(37)
})
invokeTag('form','g',310,['action':("editApp"),'method':("post")],3)
printHtmlPart(38)
}
printHtmlPart(39)
createClosureForHtmlPart(40, 2)
invokeTag('link','g',319,['controller':("Login"),'action':("takeBackup"),'class':("btn btn-info")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',328,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394731644028L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
