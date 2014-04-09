import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionuploadReport_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/uploadReport.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',10,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',11,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',36,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('remoteField','g',66,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',68,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',70,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',72,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',74,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
for( _it1162059 in (uploadReports) ) {
changeItVariable(_it1162059)
printHtmlPart(11)
expressionOut.print(it.id)
printHtmlPart(12)
expressionOut.print(it.firstname)
printHtmlPart(12)
expressionOut.print(it.lastname)
printHtmlPart(12)
expressionOut.print(it.machine)
printHtmlPart(12)
expressionOut.print(it.confirmed_date)
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
createClosureForHtmlPart(15, 4)
invokeTag('link','g',102,['params':([p:it.id]),'action':("selectFile")],4)
printHtmlPart(16)
})
invokeTag('form','g',105,['action':("selectFile"),'method':("post")],3)
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',122,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909798L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 12, 12, 12, 16, 16, 17, 17, 36, 36, 39, 66, 66, 66, 66, 68, 68, 70, 70, 72, 72, 74, 74, 89, 89, 89, 91, 91, 92, 92, 93, 93, 94, 94, 95, 95, 101, 101, 102, 102, 102, 105, 105, 105, 108, 108, 122, 122, 122, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "uploadReport.gsp"
)
class ___LineNumberPlaceholder { }
