import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_doctorScanMyPatients_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/doctor/ScanMyPatients.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('javascript','g',4,['library':("jquery")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',5,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
for( _it6194439 in (patientList) ) {
changeItVariable(_it6194439)
printHtmlPart(4)
expressionOut.print(it.firstname)
printHtmlPart(5)
expressionOut.print(it.lastname)
printHtmlPart(5)
expressionOut.print(it.age)
printHtmlPart(5)
expressionOut.print(it.machine)
printHtmlPart(5)
expressionOut.print(it.mobile)
printHtmlPart(6)
if(true && (it.file!=null)) {
printHtmlPart(7)
createClosureForHtmlPart(8, 4)
invokeTag('link','g',49,['style':("color:blue"),'controller':("Doctor"),'action':("getReport"),'params':([patientId:it.id])],4)
printHtmlPart(9)
}
printHtmlPart(10)
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',56,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396256560000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
