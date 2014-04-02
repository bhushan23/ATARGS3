import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionScanMyPatientHistory_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/ScanMyPatientHistory.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('javascript','g',4,['library':("jquery")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',5,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
for( _it29486396 in (result) ) {
changeItVariable(_it29486396)
printHtmlPart(4)
expressionOut.print(it.firstname)
printHtmlPart(5)
expressionOut.print(it.lastname)
printHtmlPart(5)
expressionOut.print(it.confirmed_date)
printHtmlPart(5)
expressionOut.print(it.machine)
printHtmlPart(5)
expressionOut.print(it.scanof)
printHtmlPart(5)
expressionOut.print(it.mobile)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 4)
invokeTag('link','g',45,['params':([p:it.id]),'action':("editApp")],4)
printHtmlPart(9)
})
invokeTag('form','g',48,['action':("editApp"),'method':("post")],3)
printHtmlPart(10)
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396262211000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
