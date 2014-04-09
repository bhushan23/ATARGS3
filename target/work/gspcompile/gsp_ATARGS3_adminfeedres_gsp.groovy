import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_adminfeedres_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/feedres.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',7,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',8,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
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
expressionOut.print(gfblist[0])
printHtmlPart(9)
expressionOut.print(gfblist[1])
printHtmlPart(9)
expressionOut.print(gfblist[2])
printHtmlPart(10)
expressionOut.print(gfblist[3])
printHtmlPart(11)
expressionOut.print(gfblist[4])
printHtmlPart(11)
expressionOut.print(gfblist[5])
printHtmlPart(12)
expressionOut.print(gfblist[6])
printHtmlPart(11)
expressionOut.print(gfblist[7])
printHtmlPart(11)
expressionOut.print(gfblist[8])
printHtmlPart(13)
expressionOut.print(gfblist[9])
printHtmlPart(11)
expressionOut.print(gfblist[10])
printHtmlPart(11)
expressionOut.print(gfblist[11])
printHtmlPart(14)
for( _it28956939 in (patientList) ) {
changeItVariable(_it28956939)
printHtmlPart(15)
expressionOut.print(it.service)
printHtmlPart(16)
expressionOut.print(it.staff_behaviour)
printHtmlPart(16)
expressionOut.print(it.technician_proc)
printHtmlPart(16)
expressionOut.print(it.useful)
printHtmlPart(17)
expressionOut.print(service)
printHtmlPart(18)
}
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',130,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396930293948L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 9, 9, 13, 13, 14, 14, 33, 33, 36, 72, 72, 72, 72, 73, 73, 74, 74, 78, 78, 79, 79, 80, 80, 84, 84, 85, 85, 86, 86, 90, 90, 91, 91, 92, 92, 96, 96, 96, 99, 99, 102, 102, 105, 105, 108, 108, 112, 112, 116, 116, 130, 130, 130, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "feedres.gsp"
)
class ___LineNumberPlaceholder { }
