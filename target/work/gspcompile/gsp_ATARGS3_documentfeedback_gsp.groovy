import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_documentfeedback_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/document/feedback.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',8,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',9,[:],-1)
printHtmlPart(3)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(3)
if(true && (flash.messageFB)) {
printHtmlPart(8)
expressionOut.print(flash.messageFB)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (flash.messageDL)) {
printHtmlPart(8)
expressionOut.print(flash.messageDL)
printHtmlPart(9)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('textArea','g',98,['id':("ta"),'name':("ta"),'width':("200"),'height':("300")],-1)
printHtmlPart(13)
invokeTag('submitButton','g',105,['name':("submit"),'class':("btn btn-success"),'value':("SUBMIT"),'action':("savefeedback")],-1)
printHtmlPart(2)
})
invokeTag('form','g',106,['controller':("document"),'action':("savefeedback")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',111,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396930063191L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 7, 7, 8, 8, 9, 9, 10, 10, 10, 10, 10, 10, 10, 13, 13, 14, 14, 24, 24, 25, 26, 26, 26, 26, 28, 28, 30, 32, 32, 32, 34, 34, 36, 36, 98, 98, 98, 98, 105, 106, 106, 106, 106, 111, 111, 111, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "feedback.gsp"
)
class ___LineNumberPlaceholder { }
