import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_adminindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',14,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',15,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',40,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
for( _it12338932 in (result) ) {
changeItVariable(_it12338932)
printHtmlPart(9)
expressionOut.print(it.firstname)
printHtmlPart(10)
expressionOut.print(it.lastname)
printHtmlPart(10)
expressionOut.print(it.confirmed_date)
printHtmlPart(10)
expressionOut.print(it.machine)
printHtmlPart(10)
expressionOut.print(it.scanof)
printHtmlPart(10)
expressionOut.print(it.mobile)
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
createClosureForHtmlPart(13, 4)
invokeTag('link','g',95,['params':([p:"${it.id}"]),'action':("editApp")],4)
printHtmlPart(14)
})
invokeTag('form','g',97,['action':("editApp"),'method':("post")],3)
printHtmlPart(15)
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',119,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394769237968L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
