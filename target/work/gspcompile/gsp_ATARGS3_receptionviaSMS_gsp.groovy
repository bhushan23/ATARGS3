import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionviaSMS_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/viaSMS.gsp" }
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
invokeTag('remoteField','g',64,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',66,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',68,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',70,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',72,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
for( _it17878984 in (appViaSms) ) {
changeItVariable(_it17878984)
printHtmlPart(11)
expressionOut.print(it.machine)
printHtmlPart(12)
expressionOut.print(it.mobile)
printHtmlPart(12)
expressionOut.print(it.confirmed_date)
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
createClosureForHtmlPart(15, 4)
invokeTag('link','g',98,['params':([p:"${it.id}"]),'action':("editSmsApp")],4)
printHtmlPart(16)
})
invokeTag('form','g',101,['action':("editSmsApp"),'method':("post")],3)
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',118,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396845610634L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 7, 7, 8, 8, 9, 9, 10, 10, 10, 10, 10, 10, 10, 14, 14, 15, 15, 34, 34, 37, 64, 64, 64, 64, 66, 66, 68, 68, 70, 70, 72, 72, 86, 86, 86, 89, 89, 90, 90, 91, 91, 97, 97, 98, 98, 98, 101, 101, 101, 104, 104, 118, 118, 118, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "viaSMS.gsp"
)
class ___LineNumberPlaceholder { }
