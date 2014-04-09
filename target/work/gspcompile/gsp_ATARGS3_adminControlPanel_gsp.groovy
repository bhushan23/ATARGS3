import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_adminControlPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/ControlPanel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',15,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',16,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',17,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',17,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',33,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(startTime)
printHtmlPart(13)
expressionOut.print(startTime)
printHtmlPart(14)
for( _it3664720 in (0..23) ) {
changeItVariable(_it3664720)
printHtmlPart(15)
expressionOut.print(it)
printHtmlPart(16)
expressionOut.print(it)
printHtmlPart(17)
expressionOut.print(it)
printHtmlPart(18)
expressionOut.print(it)
printHtmlPart(19)
}
printHtmlPart(20)
expressionOut.print(endTime)
printHtmlPart(21)
expressionOut.print(endTime)
printHtmlPart(14)
for( _it20573701 in (0..23) ) {
changeItVariable(_it20573701)
printHtmlPart(15)
expressionOut.print(it)
printHtmlPart(16)
expressionOut.print(it)
printHtmlPart(17)
expressionOut.print(it)
printHtmlPart(18)
expressionOut.print(it)
printHtmlPart(19)
}
printHtmlPart(22)
expressionOut.print(mriInterval)
printHtmlPart(23)
expressionOut.print(ctInterval)
printHtmlPart(24)
expressionOut.print(username)
printHtmlPart(25)
expressionOut.print(password)
printHtmlPart(26)
expressionOut.print(confirmedmsg1)
printHtmlPart(27)
expressionOut.print(smscode1)
printHtmlPart(28)
invokeTag('actionSubmit','g',146,['class':("btn btn-info"),'id':("savechanges"),'value':("Save Changes"),'onclick':("beforesave()")],-1)
printHtmlPart(29)
})
invokeTag('form','g',150,['action':("saveChanges")],2)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',161,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909770L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 14, 15, 15, 16, 16, 17, 17, 17, 17, 17, 17, 17, 21, 21, 22, 22, 33, 33, 35, 56, 56, 57, 57, 57, 57, 60, 60, 62, 62, 74, 74, 75, 75, 77, 77, 77, 78, 78, 79, 79, 81, 81, 82, 82, 84, 84, 90, 90, 91, 91, 93, 93, 93, 94, 94, 95, 95, 97, 97, 98, 98, 100, 100, 105, 105, 109, 109, 125, 125, 129, 129, 135, 135, 141, 141, 146, 146, 150, 150, 150, 161, 161, 161, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "ControlPanel.gsp"
)
class ___LineNumberPlaceholder { }
