import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionpatientHistory_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/patientHistory.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',8,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',9,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',34,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('remoteField','g',63,['name':("FN"),'action':("FNfunc2"),'update':("PatientHistoryTable"),'placeholder':("first name"),'size':("11")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',65,['name':("LN"),'action':("LNfunc2"),'update':("PatientHistoryTable"),'placeholder':("surname"),'size':("10")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',67,['name':("A"),'action':("Afunc2"),'update':("PatientHistoryTable"),'placeholder':("age"),'size':("21")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',69,['name':("M"),'action':("Mfunc2"),'update':("PatientHistoryTable"),'placeholder':("m/c"),'size':("24")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',71,['name':("MOB"),'action':("MOBfunc2"),'update':("PatientHistoryTable"),'placeholder':("mobile"),'size':("12")],-1)
printHtmlPart(11)
for( _it24111591 in (history) ) {
changeItVariable(_it24111591)
printHtmlPart(12)
expressionOut.print(it.firstname)
printHtmlPart(13)
expressionOut.print(it.lastname)
printHtmlPart(13)
expressionOut.print(it.confirmed_date)
printHtmlPart(13)
expressionOut.print(it.machine)
printHtmlPart(13)
expressionOut.print(it.scanof)
printHtmlPart(13)
expressionOut.print(it.mobile)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',120,['params':([p:it.id]),'action':("editApp")],4)
printHtmlPart(17)
})
invokeTag('form','g',123,['action':("editApp"),'method':("post")],3)
printHtmlPart(18)
}
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',139,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396263118000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
