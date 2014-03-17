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
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',11,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',12,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',37,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(createLink(uri: '/adminSettings/ControlPanel'))
printHtmlPart(9)
invokeTag('remoteField','g',71,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',73,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',75,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',77,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',79,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(11)
for( _it1452248 in (patientList) ) {
changeItVariable(_it1452248)
printHtmlPart(12)
expressionOut.print(it.service)
printHtmlPart(13)
expressionOut.print(it.staff_behaviour)
printHtmlPart(13)
expressionOut.print(it.technician_proc)
printHtmlPart(13)
expressionOut.print(it.useful)
printHtmlPart(14)
expressionOut.print(service)
printHtmlPart(15)
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',126,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394732947608L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
