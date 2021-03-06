import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_loginlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/login.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
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
invokeTag('link','g',57,['controller':("Login"),'action':("loggedinhomepage"),'class':("btn btn-lg btn-success")],3)
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',61,['controller':("Login"),'action':("logout"),'class':("btn btn-lg btn-danger")],3)
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
})
invokeTag('form','g',90,['action':("admin_login_function"),'method':("post"),'class':("form-signin")],3)
printHtmlPart(11)
}
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',91,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396770998544L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [91, 91, 91, 91, 91, 91, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 8, 8, 8, 8, 8, 8, 8, 42, 42, 43, 50, 50, 50, 50, 52, 52, 57, 57, 57, 61, 61, 62, 62, 63, 66, 72, 72, 72, 72, 74, 74, 77, 77, 90, 90, 90, 90, 90, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91],
	sourceName = "login.gsp"
)
class ___LineNumberPlaceholder { }
