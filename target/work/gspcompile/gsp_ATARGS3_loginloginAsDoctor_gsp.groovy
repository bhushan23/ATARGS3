import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_loginloginAsDoctor_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/loginAsDoctor.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('require','r',6,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(6)
if(true && (session.UserLoggedin)) {
printHtmlPart(7)
expressionOut.print(session.UserLoggedin)
printHtmlPart(8)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',59,['controller':("Login"),'action':("loggedinhomepage"),'class':("btn btn-lg btn-success")],3)
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',63,['controller':("Login"),'action':("logout"),'class':("btn btn-lg btn-danger")],3)
printHtmlPart(12)
}
else {
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(doctorlogin?.username)
printHtmlPart(18)
expressionOut.print(doctorlogin?.password)
printHtmlPart(19)
createClosureForHtmlPart(20, 4)
invokeTag('link','g',107,['controller':("login"),'action':("doctor_login_function"),'class':("btn btn-large btn-success")],4)
printHtmlPart(21)
createClosureForHtmlPart(22, 4)
invokeTag('link','g',110,['controller':("login"),'action':("SignupAsDoctor"),'class':("btn btn-large btn-success")],4)
printHtmlPart(23)
})
invokeTag('form','g',116,['action':("doctor_login_function"),'method':("post"),'class':("form-signin")],3)
printHtmlPart(12)
}
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',122,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394732719504L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
