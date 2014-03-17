import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_adminuploadReport_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/uploadReport.gsp" }
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
expressionOut.print(createLink(uri: '/adminSettings/ControlPanel'))
printHtmlPart(9)
for( _it10677683 in (uploadReports) ) {
changeItVariable(_it10677683)
printHtmlPart(10)
expressionOut.print(it.id)
printHtmlPart(11)
expressionOut.print(it.firstname)
printHtmlPart(11)
expressionOut.print(it.lastname)
printHtmlPart(11)
expressionOut.print(it.machine)
printHtmlPart(11)
expressionOut.print(it.confirmed_date)
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
createClosureForHtmlPart(14, 4)
invokeTag('link','g',87,['params':([p:"${it.id}"]),'action':("selectFile")],4)
printHtmlPart(15)
})
invokeTag('form','g',88,['action':("selectFile"),'method':("post")],3)
printHtmlPart(16)
}
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',102,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394303670000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
