import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptioneditApp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/editApp.gsp" }
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
for( _it20581648 in (req_entry) ) {
changeItVariable(_it20581648)
printHtmlPart(10)
expressionOut.print(it.firstname)
printHtmlPart(11)
expressionOut.print(it.middlename)
printHtmlPart(12)
expressionOut.print(it.lastname)
printHtmlPart(13)
expressionOut.print(it.gender)
printHtmlPart(14)
expressionOut.print(it.age)
printHtmlPart(15)
expressionOut.print(it.mobile)
printHtmlPart(16)
expressionOut.print(it.email)
printHtmlPart(17)
expressionOut.print(it.address)
printHtmlPart(18)
expressionOut.print(it.pincode)
printHtmlPart(19)
expressionOut.print(it.city)
printHtmlPart(20)
expressionOut.print(it.state)
printHtmlPart(21)
expressionOut.print(it.machine)
printHtmlPart(22)
expressionOut.print(it.scanof)
printHtmlPart(23)
expressionOut.print(it.disease)
printHtmlPart(24)
expressionOut.print(it.harmfulitems)
printHtmlPart(25)
expressionOut.print(it.clinicalhistory)
printHtmlPart(26)
expressionOut.print(it.pregnant)
printHtmlPart(27)
}
printHtmlPart(28)
})
invokeTag('form','g',163,['action':("saveAppChanges")],2)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',175,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394767447842L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
