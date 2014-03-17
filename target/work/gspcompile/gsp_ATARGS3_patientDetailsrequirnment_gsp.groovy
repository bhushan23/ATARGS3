import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_patientDetailsrequirnment_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patientDetails/requirnment.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'offcanvas.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'js', file: 'bootstrap.js'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'js', file: 'jquery-1.10.1.min.js'))
printHtmlPart(7)
invokeTag('javascript','g',24,['library':("application")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',25,[:],-1)
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',27,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',60,['class':("btn btn-default"),'action':("setMachine"),'role':("button"),'params':([machine:'MRI'])],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',61,['class':("btn btn-default"),'action':("setMachine"),'role':("button"),'params':([machine:'CT'])],2)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',107,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394358965000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
