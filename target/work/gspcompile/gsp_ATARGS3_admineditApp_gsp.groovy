import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_admineditApp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/editApp.gsp" }
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
for( _it23713316 in (req_entry) ) {
changeItVariable(_it23713316)
printHtmlPart(11)
expressionOut.print(it.firstname)
printHtmlPart(12)
expressionOut.print(it.middlename)
printHtmlPart(13)
expressionOut.print(it.lastname)
printHtmlPart(14)
expressionOut.print(it.gender)
printHtmlPart(15)
expressionOut.print(it.age)
printHtmlPart(16)
expressionOut.print(it.mobile)
printHtmlPart(17)
expressionOut.print(it.email)
printHtmlPart(18)
expressionOut.print(it.address)
printHtmlPart(19)
expressionOut.print(it.pincode)
printHtmlPart(20)
expressionOut.print(it.city)
printHtmlPart(21)
expressionOut.print(it.state)
printHtmlPart(22)
expressionOut.print(it.machine)
printHtmlPart(23)
expressionOut.print(it.scanof)
printHtmlPart(24)
expressionOut.print(it.disease)
printHtmlPart(25)
expressionOut.print(it.harmfulitems)
printHtmlPart(26)
expressionOut.print(it.clinicalhistory)
printHtmlPart(27)
expressionOut.print(it.pregnant)
printHtmlPart(28)
}
printHtmlPart(29)
})
invokeTag('form','g',168,['action':("saveAppChanges")],2)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',180,[:],1)
printHtmlPart(31)
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
	lines = [189, 189, 189, 189, 189, 189, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 12, 12, 13, 13, 32, 32, 35, 51, 51, 51, 51, 70, 70, 70, 70, 70, 74, 74, 79, 79, 83, 83, 87, 87, 96, 96, 100, 100, 104, 104, 108, 108, 112, 112, 116, 116, 120, 120, 125, 125, 131, 131, 137, 137, 145, 145, 152, 152, 158, 158, 166, 166, 168, 168, 168, 180, 180, 180, 189, 189, 189, 189, 189, 189, 189, 189, 189, 189, 189, 189, 189, 189],
	sourceName = "editApp.gsp"
)
class ___LineNumberPlaceholder { }
