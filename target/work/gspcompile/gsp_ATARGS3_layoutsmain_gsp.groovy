import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',16,['default':("Center")],-1)
})
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'favicon1.png'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'css', file: 'bootstrap-responsive.css'))
printHtmlPart(8)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'js', file: 'bootstrap.js'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'js', file: 'jquery-1.10.1.min.js'))
printHtmlPart(10)
invokeTag('layoutHead','g',45,[:],-1)
printHtmlPart(2)
invokeTag('javascript','g',46,['library':("application")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',47,[:],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',48,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(12)
invokeTag('message','g',67,['code':("Home")],-1)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',70,['code':("For Patients")],-1)
})
invokeTag('link','g',70,['controller':("PatientDetails"),'action':("patientIndex")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',75,['code':("For Referral Physians")],-1)
})
invokeTag('link','g',75,['controller':("login"),'action':("loginAsDoctor")],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',79,['code':("Meet our Experts")],-1)
})
invokeTag('link','g',79,[:],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',83,['code':("About us")],-1)
})
invokeTag('link','g',83,[:],2)
printHtmlPart(17)
if(true && (session.UserLoggedin)) {
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(14)
invokeTag('message','g',90,['code':("Hi, ${session.UserLoggedin}")],-1)
})
invokeTag('link','g',90,['controller':("Login"),'action':("loggedinhomepage")],3)
printHtmlPart(19)
}
else {
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',95,['controller':("Login"),'action':("loginAsDoctor")],3)
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',96,['controller':("Login"),'action':("loginAsReceptionist")],3)
printHtmlPart(22)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',97,['controller':("Login"),'action':("login")],3)
printHtmlPart(25)
}
printHtmlPart(26)
if(true && (session.UserLoggedin)) {
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(14)
invokeTag('message','g',104,['code':("Logout")],-1)
})
invokeTag('link','g',104,['controller':("Login"),'action':("logout")],3)
printHtmlPart(19)
}
printHtmlPart(27)
invokeTag('layoutBody','g',113,[:],-1)
printHtmlPart(28)
invokeTag('message','g',116,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(29)
invokeTag('layoutResources','r',119,[:],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',121,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389682978000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
