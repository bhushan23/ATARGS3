import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_documentgetReport_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/document/getReport.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('require','r',8,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',9,[:],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'jumbotron-narrow.css'))
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',26,['code':("Home")],-1)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
expressionOut.print(patientDetails?.otp)
printHtmlPart(8)
invokeTag('actionSubmit','g',43,['class':("btn btn-lg btn-primary"),'value':("Download"),'action':("feedback")],-1)
printHtmlPart(9)
})
invokeTag('form','g',43,['controller':("Document"),'action':("feedback")],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',49,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389151400000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
