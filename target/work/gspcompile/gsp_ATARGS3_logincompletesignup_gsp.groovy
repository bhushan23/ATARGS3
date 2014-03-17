import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_logincompletesignup_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/completesignup.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('require','r',4,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(3)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',42,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
if(true && (session.UserLoggedin)) {
printHtmlPart(8)
expressionOut.print(session.UserLoggedin)
printHtmlPart(9)
createClosureForHtmlPart(10, 4)
invokeTag('link','g',51,['controller':("Login"),'action':("loggedinhomepage"),'class':("btn btn-lg btn-success")],4)
printHtmlPart(11)
createClosureForHtmlPart(12, 4)
invokeTag('link','g',54,['controller':("Login"),'action':("logout"),'class':("btn btn-lg btn-danger")],4)
printHtmlPart(13)
}
else {
printHtmlPart(14)
createClosureForHtmlPart(15, 4)
invokeTag('link','g',60,['controller':("Login"),'action':("login"),'class':("btn btn-large btn-danger")],4)
printHtmlPart(14)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',64,['controller':("Login"),'action':("loginAsReceptionist"),'class':("btn btn-large btn-info")],4)
printHtmlPart(14)
createClosureForHtmlPart(17, 4)
invokeTag('link','g',68,['controller':("Login"),'action':("loginAsDoctor"),'class':("btn btn-large btn-success")],4)
printHtmlPart(7)
}
printHtmlPart(18)
})
invokeTag('form','g',70,['class':("loginlink")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',74,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388132858000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
