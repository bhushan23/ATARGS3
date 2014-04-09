import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_admineditSmsApp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/editSmsApp.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',6,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',7,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',32,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(createLink(uri: '/adminSettings/ControlPanel'))
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
for( _it26619975 in (req_entry) ) {
changeItVariable(_it26619975)
printHtmlPart(11)
expressionOut.print(it.mobile)
printHtmlPart(12)
for( _it20681066 in (doctors) ) {
changeItVariable(_it20681066)
printHtmlPart(13)
expressionOut.print(it.id)
printHtmlPart(14)
expressionOut.print(it.firstname)
printHtmlPart(15)
expressionOut.print(it.lastname)
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(it.machine)
printHtmlPart(18)
invokeTag('actionSubmit','g',272,['class':("btn btn-info"),'value':("Done")],-1)
printHtmlPart(19)
}
printHtmlPart(20)
})
invokeTag('form','g',276,['action':("done")],2)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',289,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909773L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [289, 289, 289, 289, 289, 289, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 12, 12, 13, 13, 32, 32, 35, 51, 51, 51, 51, 68, 68, 68, 68, 68, 99, 100, 124, 124, 124, 125, 125, 125, 126, 126, 127, 128, 128, 138, 139, 272, 272, 272, 272, 276, 276, 276, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289, 289],
	sourceName = "editSmsApp.gsp"
)
class ___LineNumberPlaceholder { }
