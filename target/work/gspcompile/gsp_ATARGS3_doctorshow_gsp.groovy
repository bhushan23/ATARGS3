import atargs3.Doctor
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_doctorshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/doctor/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'doctor.label', default: 'Doctor'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
invokeTag('require','r',10,['modules':("bootstrap")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',43,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',53,['code':("Confirm Details"),'args':([entityName])],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (doctorInstance?.firstname)) {
printHtmlPart(8)
invokeTag('message','g',67,['code':("doctor.firstname.label"),'default':("Firstname")],-1)
printHtmlPart(9)
invokeTag('fieldValue','g',70,['bean':(doctorInstance),'field':("firstname")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (doctorInstance?.lastname)) {
printHtmlPart(12)
invokeTag('message','g',78,['code':("doctor.lastname.label"),'default':("Lastname")],-1)
printHtmlPart(13)
invokeTag('fieldValue','g',81,['bean':(doctorInstance),'field':("lastname")],-1)
printHtmlPart(10)
}
printHtmlPart(14)
if(true && (doctorInstance?.username)) {
printHtmlPart(15)
invokeTag('message','g',88,['code':("doctor.username.label"),'default':("Username")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',91,['bean':(doctorInstance),'field':("username")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (doctorInstance?.address)) {
printHtmlPart(19)
invokeTag('message','g',101,['code':("Address")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',104,['bean':(doctorInstance),'field':("address")],-1)
printHtmlPart(21)
}
printHtmlPart(14)
if(true && (doctorInstance?.mobile)) {
printHtmlPart(22)
invokeTag('message','g',111,['code':("doctor.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',113,['bean':(doctorInstance),'field':("mobile")],-1)
printHtmlPart(24)
}
printHtmlPart(14)
if(true && (doctorInstance?.email)) {
printHtmlPart(25)
invokeTag('message','g',121,['code':("doctor.email.label"),'default':("Email")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',123,['bean':(doctorInstance),'field':("email")],-1)
printHtmlPart(21)
}
printHtmlPart(14)
if(true && (doctorInstance?.patients)) {
printHtmlPart(27)
invokeTag('message','g',131,['code':("doctor.patients.label"),'default':("Patients")],-1)
printHtmlPart(28)
for( p in (doctorInstance.patients) ) {
printHtmlPart(29)
createTagBody(4, {->
printHtmlPart(30)
expressionOut.print(p?.encodeAsHTML())
printHtmlPart(31)
})
invokeTag('link','g',136,['controller':("patientDetails"),'action':("show"),'id':(p.id)],4)
printHtmlPart(32)
}
printHtmlPart(33)
}
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
createTagBody(3, {->
printHtmlPart(36)
invokeTag('message','g',148,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(37)
})
invokeTag('link','g',149,['class':("btn btn-info"),'action':("edit"),'resource':(doctorInstance)],3)
printHtmlPart(37)
invokeTag('actionSubmit','g',152,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(36)
invokeTag('message','g',154,['code':("complete sign up")],-1)
printHtmlPart(37)
})
invokeTag('link','g',155,['class':("btn btn-primary"),'controller':("login"),'action':("completesignup")],3)
printHtmlPart(38)
})
invokeTag('form','g',158,['url':([resource:doctorInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',162,[:],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909779L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 43, 43, 44, 53, 53, 53, 53, 56, 56, 60, 60, 63, 63, 67, 67, 70, 70, 72, 75, 75, 75, 78, 78, 81, 81, 83, 85, 85, 85, 88, 88, 91, 91, 94, 97, 97, 97, 101, 101, 104, 104, 106, 108, 108, 108, 111, 111, 113, 113, 115, 117, 117, 117, 121, 121, 123, 123, 125, 127, 127, 127, 131, 131, 132, 132, 135, 135, 135, 136, 136, 136, 136, 137, 137, 139, 139, 147, 147, 148, 148, 148, 149, 149, 149, 152, 152, 153, 154, 154, 154, 155, 155, 155, 155, 158, 158, 158, 162, 162, 162, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
