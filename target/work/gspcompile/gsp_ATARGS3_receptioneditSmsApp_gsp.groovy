import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptioneditSmsApp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/editSmsApp.gsp" }
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
createTagBody(2, {->
printHtmlPart(9)
for( _it31029467 in (req_entry) ) {
changeItVariable(_it31029467)
printHtmlPart(10)
expressionOut.print(it.mobile)
printHtmlPart(11)
for( _it9271280 in (doctors) ) {
changeItVariable(_it9271280)
printHtmlPart(12)
expressionOut.print(it.id)
printHtmlPart(13)
expressionOut.print(it.firstname)
printHtmlPart(14)
expressionOut.print(it.lastname)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('actionSubmit','g',129,['class':("btn btn-info"),'value':("Done")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('form','g',135,['action':("done")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',147,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389014932000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
