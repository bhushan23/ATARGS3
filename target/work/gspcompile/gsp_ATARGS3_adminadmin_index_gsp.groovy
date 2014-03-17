import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_adminadmin_index_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/admin_index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('require','r',10,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',12,[:],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('remoteField','g',54,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(6)
invokeTag('remoteField','g',61,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(6)
invokeTag('remoteField','g',69,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(6)
invokeTag('remoteField','g',70,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(6)
invokeTag('remoteField','g',72,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(7)
for( _it33478344 in (result) ) {
changeItVariable(_it33478344)
printHtmlPart(8)
expressionOut.print(it.id)
printHtmlPart(9)
expressionOut.print(it.firstname)
printHtmlPart(9)
expressionOut.print(it.lastname)
printHtmlPart(9)
expressionOut.print(it.age)
printHtmlPart(9)
expressionOut.print(it.machine)
printHtmlPart(9)
expressionOut.print(it.mobile)
printHtmlPart(10)
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',111,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394303622000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
