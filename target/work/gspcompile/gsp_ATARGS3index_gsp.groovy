import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3index_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
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
expressionOut.print(resource(dir: 'css', file: 'carousel.css'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',15,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',16,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(5, 3)
invokeTag('captureTitle','sitemesh',17,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',17,[:],2)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(resource(dir: "images", file: "using_internet.jpg"))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',50,['class':("btn btn-primary btn-lg"),'style':("width:200px"),'controller':("patientDetails"),'action':("requirnment")],2)
printHtmlPart(11)
expressionOut.print(resource(dir: "images", file: "mobile.gif"))
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',72,['class':("btn btn-lg btn-primary"),'controller':("learnmore"),'action':("sms"),'role':("button")],2)
printHtmlPart(14)
expressionOut.print(resource(dir: "images", file: "nexuspdf.jpg"))
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',85,['class':("btn btn-primary btn-lg"),'style':("width:200px"),'controller':("Document"),'action':("getReport")],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',169,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394732589348L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
