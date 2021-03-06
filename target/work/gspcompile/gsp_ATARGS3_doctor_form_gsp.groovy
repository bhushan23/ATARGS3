import atargs3.Doctor
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_doctor_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/doctor/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'firstname', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("doctor.firstname.label"),'default':("Firstname")],-1)
printHtmlPart(2)
invokeTag('textField','g',11,['class':("input-small"),'name':("firstname"),'required':(""),'value':(doctorInstance?.firstname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'lastname', 'error'))
printHtmlPart(4)
invokeTag('message','g',17,['code':("doctor.lastname.label"),'default':("Lastname")],-1)
printHtmlPart(5)
expressionOut.print(doctorInstance?.lastname)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'username', 'error'))
printHtmlPart(7)
invokeTag('message','g',26,['code':("doctor.username.label"),'default':("Username")],-1)
printHtmlPart(8)
invokeTag('textField','g',29,['name':("username"),'required':(""),'value':(doctorInstance?.username),'style':("height:100%")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'password', 'error'))
printHtmlPart(10)
invokeTag('message','g',35,['code':("doctor.password.label"),'default':("Password")],-1)
printHtmlPart(11)
invokeTag('passwordField','g',40,['name':("password"),'required':(""),'value':(""),'style':("height:100%")],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'address', 'error'))
printHtmlPart(13)
invokeTag('message','g',46,['code':("doctor.address.label"),'default':("Address")],-1)
printHtmlPart(8)
invokeTag('textField','g',49,['name':("address"),'maxlength':("250"),'required':(""),'value':(doctorInstance?.address),'style':("height:100%")],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'mobile', 'error'))
printHtmlPart(15)
invokeTag('message','g',55,['code':("doctor.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(8)
invokeTag('textField','g',58,['name':("mobile"),'maxlength':("10"),'required':(""),'value':(doctorInstance?.mobile),'style':("height:100%")],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'email', 'error'))
printHtmlPart(17)
invokeTag('message','g',65,['code':("doctor.email.label"),'default':("Email")],-1)
printHtmlPart(8)
invokeTag('field','g',68,['type':("email"),'name':("email"),'value':(doctorInstance?.email),'style':("width:60%"),'class':("input-block-level")],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: doctorInstance, field: 'patients', 'error'))
printHtmlPart(19)
invokeTag('message','g',74,['code':("doctor.patients.label"),'default':("Patients")],-1)
printHtmlPart(20)
for( p in (doctorInstance?.patients) ) {
printHtmlPart(21)
createTagBody(2, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',81,['controller':("patientDetails"),'action':("show"),'id':(p.id)],2)
printHtmlPart(22)
}
printHtmlPart(23)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'patientDetails.label', default: 'PatientDetails')]))
})
invokeTag('link','g',85,['controller':("patientDetails"),'action':("create"),'params':(['doctor.id': doctorInstance?.id])],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396982601056L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 8, 8, 11, 11, 15, 15, 17, 17, 20, 20, 24, 24, 26, 26, 29, 29, 33, 33, 35, 35, 40, 40, 44, 44, 46, 46, 49, 49, 53, 53, 55, 55, 58, 58, 63, 63, 65, 65, 68, 68, 72, 72, 74, 74, 80, 80, 81, 81, 81, 81, 81, 82, 82, 85, 85, 85, 85, 85, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
