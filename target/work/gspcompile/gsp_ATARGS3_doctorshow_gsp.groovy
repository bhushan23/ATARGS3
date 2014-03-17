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
printHtmlPart(14)
if(true && (doctorInstance?.password)) {
printHtmlPart(18)
invokeTag('message','g',100,['code':("doctor.password.label"),'default':("Password")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',103,['bean':(doctorInstance),'field':("password")],-1)
printHtmlPart(17)
}
printHtmlPart(14)
if(true && (doctorInstance?.address)) {
printHtmlPart(20)
invokeTag('message','g',112,['code':("Address")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',115,['bean':(doctorInstance),'field':("address")],-1)
printHtmlPart(22)
}
printHtmlPart(14)
if(true && (doctorInstance?.mobile)) {
printHtmlPart(23)
invokeTag('message','g',122,['code':("doctor.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',124,['bean':(doctorInstance),'field':("mobile")],-1)
printHtmlPart(25)
}
printHtmlPart(14)
if(true && (doctorInstance?.email)) {
printHtmlPart(26)
invokeTag('message','g',132,['code':("doctor.email.label"),'default':("Email")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',134,['bean':(doctorInstance),'field':("email")],-1)
printHtmlPart(22)
}
printHtmlPart(14)
if(true && (doctorInstance?.patients)) {
printHtmlPart(28)
invokeTag('message','g',142,['code':("doctor.patients.label"),'default':("Patients")],-1)
printHtmlPart(29)
for( p in (doctorInstance.patients) ) {
printHtmlPart(30)
createTagBody(4, {->
printHtmlPart(31)
expressionOut.print(p?.encodeAsHTML())
printHtmlPart(32)
})
invokeTag('link','g',147,['controller':("patientDetails"),'action':("show"),'id':(p.id)],4)
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(35)
createTagBody(2, {->
printHtmlPart(36)
createTagBody(3, {->
printHtmlPart(37)
invokeTag('message','g',159,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(38)
})
invokeTag('link','g',160,['class':("btn btn-info"),'action':("edit"),'resource':(doctorInstance)],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',163,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(38)
createTagBody(3, {->
printHtmlPart(37)
invokeTag('message','g',165,['code':("complete sign up")],-1)
printHtmlPart(38)
})
invokeTag('link','g',166,['class':("btn btn-primary"),'controller':("login"),'action':("completesignup")],3)
printHtmlPart(39)
})
invokeTag('form','g',169,['url':([resource:doctorInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',173,[:],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394771784067L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
