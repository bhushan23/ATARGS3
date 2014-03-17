import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionScanMyAppointments_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/ScanMyAppointments.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
invokeTag('javascript','g',6,['library':("jquery")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',7,[:],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
for( _it29140799 in (result) ) {
changeItVariable(_it29140799)
printHtmlPart(5)
expressionOut.print(it.firstname)
printHtmlPart(6)
expressionOut.print(it.lastname)
printHtmlPart(6)
expressionOut.print(it.age)
printHtmlPart(6)
expressionOut.print(it.machine)
printHtmlPart(6)
expressionOut.print(it.confirmed_date)
printHtmlPart(6)
expressionOut.print(it.mobile)
printHtmlPart(7)
}
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',43,['action':("cancelCTApp"),'class':("btn btn-danger")],2)
printHtmlPart(10)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',46,['action':("cancelMRIApp"),'class':("btn btn-danger")],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394731247050L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
