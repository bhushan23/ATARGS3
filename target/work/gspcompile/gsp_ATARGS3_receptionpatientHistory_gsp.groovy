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
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('remoteField','g',73,['name':("FN"),'action':("FNfunc2"),'id':("fn"),'update':("PatientHistoryTable"),'placeholder':("first name"),'size':("11")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',75,['name':("LN"),'action':("LNfunc2"),'id':("ln"),'update':("PatientHistoryTable"),'placeholder':("surname"),'size':("10")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',77,['name':("A"),'action':("Afunc2"),'id':("age"),'update':("PatientHistoryTable"),'placeholder':("age"),'size':("21")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',79,['id':("mac"),'name':("M"),'action':("Mfunc2"),'update':("PatientHistoryTable"),'placeholder':("m/c"),'size':("24")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',81,['name':("MOB"),'id':("mob"),'action':("MOBfunc2"),'update':("PatientHistoryTable"),'placeholder':("mobile"),'size':("12")],-1)
printHtmlPart(10)
invokeTag('submitToRemote','g',84,['before':("clearSearch()"),'class':("btn-warning"),'update':("PatientHistoryTable"),'value':("Reset"),'action':("resetSearchPatHist")],-1)
printHtmlPart(11)
for( _it11770815 in (result) ) {
changeItVariable(_it11770815)
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
invokeTag('link','g',134,['params':([p:it.id]),'action':("patientDetails")],4)
printHtmlPart(17)
})
invokeTag('form','g',137,['action':("patientDetails"),'method':("post")],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',141,['controller':("Reception"),'action':("getReport"),'params':([patientId:it.id])],3)
printHtmlPart(20)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',158,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396798288175L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [160, 160, 160, 160, 160, 160, 1, 1, 1, 1, 1, 1, 1, 1, 7, 7, 7, 8, 8, 9, 9, 10, 10, 10, 10, 10, 10, 10, 14, 14, 15, 15, 44, 44, 47, 73, 73, 73, 75, 75, 77, 77, 79, 79, 81, 81, 84, 84, 84, 108, 108, 108, 110, 112, 114, 115, 117, 118, 120, 121, 123, 124, 126, 127, 134, 134, 134, 134, 134, 137, 137, 137, 141, 141, 141, 143, 143, 158, 158, 158, 160, 160, 160, 160, 160, 160, 160, 160, 160, 160, 160, 160, 160, 160],
	sourceName = "patientHistory.gsp"
)
class ___LineNumberPlaceholder { }
