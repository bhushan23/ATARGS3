import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_loginloginAsReceptionist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/loginAsReceptionist.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',5,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',42,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
if(true && (session.UserLoggedin)) {
printHtmlPart(6)
expressionOut.print(session.UserLoggedin)
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',56,['controller':("Login"),'action':("loggedinhomepage"),'class':("btn btn-lg btn-success")],3)
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',60,['controller':("Login"),'action':("logout"),'class':("btn btn-lg btn-danger")],3)
printHtmlPart(11)
}
else {
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
expressionOut.print(receptionlogin?.username)
printHtmlPart(17)
expressionOut.print(receptionlogin?.password)
printHtmlPart(18)
createClosureForHtmlPart(19, 4)
invokeTag('link','g',98,['controller':("login"),'action':("SignupAsReceptionist"),'class':("btn btn-large btn-success")],4)
printHtmlPart(20)
})
invokeTag('form','g',101,['action':("receptionist_login_function"),'method':("post"),'class':("form-signin")],3)
printHtmlPart(11)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',105,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389680308000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
