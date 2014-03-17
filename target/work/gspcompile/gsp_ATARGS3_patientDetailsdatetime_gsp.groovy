import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_patientDetailsdatetime_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patientDetails/datetime.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(4)
invokeTag('javascript','g',15,['library':("jquery")],-1)
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'offcanvas.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'js', file: 'bootstrap.js'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'js', file: 'jquery-1.10.1.min.js'))
printHtmlPart(8)
invokeTag('require','r',28,['modules':("bootstrap")],-1)
printHtmlPart(9)
invokeTag('javascript','g',29,['library':("application")],-1)
printHtmlPart(9)
invokeTag('layoutResources','r',30,[:],-1)
printHtmlPart(10)
})
invokeTag('captureHead','sitemesh',32,[:],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('remoteLink','g',86,['action':("loaddate"),'update':("content")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',107,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388563514000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
