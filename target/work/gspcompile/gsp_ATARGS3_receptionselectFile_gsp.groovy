import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionselectFile_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/selectFile.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('require','r',5,['modules':("bootstrap")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
if(true && (flash.messageSUMMARY)) {
printHtmlPart(10)
expressionOut.print(flash.messageSUMMARY)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (flash.messageEMAIL)) {
printHtmlPart(10)
expressionOut.print(flash.messageEMAIL)
printHtmlPart(11)
}
printHtmlPart(13)
invokeTag('textArea','g',59,['id':("sum"),'name':("sum"),'width':("200"),'height':("300"),'value':(patient_details?.summary)],-1)
printHtmlPart(14)
invokeTag('submitButton','g',60,['name':("upload"),'class':("btn btn-large btn-info"),'value':("Upload"),'onclick':("return Checkfiles(this);")],-1)
printHtmlPart(15)
})
invokeTag('uploadForm','g',63,['action':("upload")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',66,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909797L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [70, 70, 70, 70, 70, 70, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 24, 24, 25, 37, 37, 37, 37, 37, 37, 37, 41, 47, 47, 47, 47, 49, 49, 51, 52, 52, 52, 54, 54, 56, 56, 59, 59, 60, 60, 63, 63, 63, 66, 66, 66, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70],
	sourceName = "selectFile.gsp"
)
class ___LineNumberPlaceholder { }
