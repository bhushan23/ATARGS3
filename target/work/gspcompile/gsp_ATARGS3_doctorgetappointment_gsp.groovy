import atargs3.Doctor
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_doctorgetappointment_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/doctor/getappointment.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
invokeTag('require','r',7,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'doctor.label', default: 'Doctor'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(2)
invokeTag('javascript','g',13,['library':("jquery")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('remoteField','g',34,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(5)
invokeTag('remoteField','g',35,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(5)
invokeTag('remoteField','g',36,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(5)
invokeTag('remoteField','g',37,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(5)
invokeTag('remoteField','g',38,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('actionSubmit','g',46,['action':("informptbysms"),'class':("btn btn-warning"),'value':("Suggest Appointment Via SMS")],-1)
printHtmlPart(8)
})
invokeTag('form','g',47,[:],2)
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',48,['action':("getaptnow"),'class':("btn  btn-info")],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388478120000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
