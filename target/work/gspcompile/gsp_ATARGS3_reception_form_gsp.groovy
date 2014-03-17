import atargs3.Reception
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_reception_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: receptionInstance, field: 'firstname', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("reception.firstname.label"),'default':("Firstname")],-1)
printHtmlPart(2)
invokeTag('textField','g',11,['name':("firstname"),'required':(""),'value':(receptionInstance?.firstname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: receptionInstance, field: 'lastname', 'error'))
printHtmlPart(4)
invokeTag('message','g',17,['code':("reception.lastname.label"),'default':("Lastname")],-1)
printHtmlPart(2)
invokeTag('textField','g',20,['name':("lastname"),'required':(""),'value':(receptionInstance?.lastname)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: receptionInstance, field: 'username', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("reception.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("username"),'required':(""),'value':(receptionInstance?.username)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: receptionInstance, field: 'password', 'error'))
printHtmlPart(7)
invokeTag('message','g',33,['code':("reception.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',36,['name':("password"),'required':(""),'value':(receptionInstance?.password)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: receptionInstance, field: 'address', 'error'))
printHtmlPart(8)
invokeTag('message','g',41,['code':("reception.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',44,['name':("address"),'maxlength':("250"),'required':(""),'value':(receptionInstance?.address)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: receptionInstance, field: 'mobile', 'error'))
printHtmlPart(9)
invokeTag('message','g',49,['code':("reception.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(2)
invokeTag('textField','g',52,['name':("mobile"),'maxlength':("10"),'required':(""),'value':(receptionInstance?.mobile)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388915134000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
