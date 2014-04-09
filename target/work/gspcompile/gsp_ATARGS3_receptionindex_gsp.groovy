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
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',12,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',13,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',14,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',99,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('set','g',103,['var':("months"),'value':("${new java.text.DateFormatSymbols().months} ")],-1)
printHtmlPart(8)
invokeTag('set','g',104,['var':("today"),'value':(new Date())],-1)
printHtmlPart(9)
for( _it30032544 in (limits[0]..<limits[1]) ) {
changeItVariable(_it30032544)
printHtmlPart(10)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(13)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('set','g',195,['var':("i"),'value':(0)],-1)
printHtmlPart(15)
for( _it31205826 in (limits[1]..<limits[2]) ) {
changeItVariable(_it31205826)
printHtmlPart(10)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(11)
}
printHtmlPart(10)
if(true && (free[i] == 0)) {
printHtmlPart(17)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(18)
}
else {
printHtmlPart(19)
createTagBody(4, {->
printHtmlPart(20)
expressionOut.print(free[i])
printHtmlPart(21)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(22)
})
invokeTag('remoteLink','g',218,['update':("AppointmentTable"),'action':("ShowApp"),'params':([Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"])],4)
printHtmlPart(23)
expressionOut.print(free[i] /totalNoOfIntervals *100)
printHtmlPart(24)
}
printHtmlPart(10)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(14)
}
printHtmlPart(10)
invokeTag('set','g',234,['var':("i"),'value':(i + 1)],-1)
printHtmlPart(15)
}
printHtmlPart(25)
invokeTag('remoteField','g',259,['id':("fn"),'name':("FN"),'action':("FNfunc"),'update':("AppointmentTable"),'placeholder':("first name"),'size':("7")],-1)
printHtmlPart(26)
invokeTag('remoteField','g',264,['id':("ln"),'name':("LN"),'action':("LNfunc"),'update':("AppointmentTable"),'placeholder':("surname"),'size':("7")],-1)
printHtmlPart(26)
invokeTag('remoteField','g',266,['name':("A"),'action':("Afunc"),'id':("age"),'update':("AppointmentTable"),'placeholder':("age"),'size':("15")],-1)
printHtmlPart(27)
invokeTag('remoteField','g',268,['name':("M"),'action':("Mfunc"),'update':("AppointmentTable"),'id':("mac"),'placeholder':("m/c"),'size':("18")],-1)
printHtmlPart(27)
invokeTag('remoteField','g',270,['name':("MOB"),'id':("mob"),'action':("MOBfunc"),'update':("AppointmentTable"),'placeholder':("mobile"),'size':("10")],-1)
printHtmlPart(27)
invokeTag('submitToRemote','g',272,['before':("clearSearch()"),'class':("btn-warning"),'update':("AppointmentTable"),'value':("Reset"),'action':("resetSearch")],-1)
printHtmlPart(28)
for( _it20545666 in (result) ) {
changeItVariable(_it20545666)
printHtmlPart(29)
expressionOut.print(it.firstname)
printHtmlPart(30)
expressionOut.print(it.lastname)
printHtmlPart(30)
expressionOut.print(it.confirmed_date)
printHtmlPart(30)
expressionOut.print(it.machine)
printHtmlPart(30)
expressionOut.print(it.scanof)
printHtmlPart(30)
expressionOut.print(it.mobile)
printHtmlPart(31)
createTagBody(3, {->
printHtmlPart(32)
createClosureForHtmlPart(33, 4)
invokeTag('link','g',321,['params':([p:it.id]),'action':("editApp")],4)
printHtmlPart(34)
})
invokeTag('form','g',323,['action':("editApp"),'method':("post")],3)
printHtmlPart(35)
}
printHtmlPart(36)
createClosureForHtmlPart(37, 2)
invokeTag('link','g',330,['controller':("Login"),'action':("takeBackup"),'class':("btn btn-info")],2)
printHtmlPart(38)
createClosureForHtmlPart(39, 2)
invokeTag('link','g',335,['action':("cancelCTApp"),'class':("btn btn-danger")],2)
printHtmlPart(40)
createClosureForHtmlPart(39, 2)
invokeTag('link','g',337,['action':("cancelMRIApp"),'class':("btn btn-danger")],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',348,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909796L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [349, 349, 349, 349, 349, 349, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 11, 12, 12, 13, 13, 14, 14, 14, 14, 14, 14, 14, 21, 21, 22, 22, 99, 99, 101, 103, 103, 103, 104, 104, 104, 179, 179, 180, 180, 180, 180, 180, 183, 184, 190, 190, 191, 193, 193, 193, 195, 197, 197, 197, 199, 199, 199, 199, 201, 201, 201, 205, 207, 207, 208, 208, 215, 215, 215, 215, 217, 217, 218, 218, 218, 226, 227, 229, 231, 231, 231, 232, 234, 234, 234, 234, 234, 259, 264, 264, 266, 266, 268, 268, 270, 270, 272, 272, 272, 292, 292, 292, 294, 294, 296, 296, 299, 300, 303, 303, 306, 306, 308, 309, 319, 319, 321, 321, 322, 323, 323, 323, 324, 324, 330, 330, 330, 335, 335, 335, 337, 337, 337, 348, 348, 349, 349, 349, 349, 349, 349, 349, 349, 349, 349, 349, 349, 349, 349, 349],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
