import atargs3.Reception
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptionshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',7,['modules':("bootstrap")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("SignUp Receiptionist")],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',36,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',48,['code':("Verify details")],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (receptionInstance?.firstname)) {
printHtmlPart(11)
invokeTag('message','g',60,['code':("reception.firstname.label"),'default':("Firstname")],-1)
printHtmlPart(12)
invokeTag('fieldValue','g',62,['bean':(receptionInstance),'field':("firstname")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (receptionInstance?.lastname)) {
printHtmlPart(15)
invokeTag('message','g',70,['code':("reception.lastname.label"),'default':("Lastname")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',72,['bean':(receptionInstance),'field':("lastname")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (receptionInstance?.username)) {
printHtmlPart(17)
invokeTag('message','g',80,['code':("reception.username.label"),'default':("Username")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',82,['bean':(receptionInstance),'field':("username")],-1)
printHtmlPart(13)
}
printHtmlPart(19)
if(true && (receptionInstance?.address)) {
printHtmlPart(20)
invokeTag('message','g',88,['code':("reception.address.label"),'default':("Address")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',91,['bean':(receptionInstance),'field':("address")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (receptionInstance?.mobile)) {
printHtmlPart(22)
invokeTag('message','g',98,['code':("reception.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',101,['bean':(receptionInstance),'field':("mobile")],-1)
printHtmlPart(13)
}
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
createTagBody(3, {->
invokeTag('message','g',111,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',112,['class':("btn btn-info"),'action':("edit"),'resource':(receptionInstance)],3)
printHtmlPart(26)
invokeTag('actionSubmit','g',114,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(8)
createTagBody(3, {->
invokeTag('message','g',114,['code':("complete sign up")],-1)
})
invokeTag('link','g',114,['class':("btn btn-primary"),'controller':("login"),'action':("completesignup")],3)
printHtmlPart(27)
})
invokeTag('form','g',114,['url':([resource:receptionInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909798L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 115, 115, 115, 115, 115, 115, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 36, 36, 39, 48, 48, 48, 48, 48, 48, 48, 49, 49, 49, 51, 51, 54, 54, 60, 60, 62, 62, 63, 63, 64, 64, 70, 70, 72, 72, 73, 73, 74, 74, 80, 80, 82, 82, 83, 83, 84, 84, 88, 89, 91, 91, 92, 92, 93, 93, 98, 98, 101, 101, 102, 102, 111, 111, 111, 111, 112, 112, 114, 114, 114, 114, 114, 114, 114, 114, 114, 114, 114, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115, 115],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
