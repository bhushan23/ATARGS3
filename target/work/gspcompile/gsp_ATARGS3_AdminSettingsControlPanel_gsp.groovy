import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_AdminSettingsControlPanel_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/AdminSettings/ControlPanel.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',15,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',16,[:],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',17,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',17,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',41,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(createLink(uri: '/admin/index'))
printHtmlPart(9)
expressionOut.print(createLink(uri: '/admin/getNewApp'))
printHtmlPart(10)
expressionOut.print(createLink(uri: '/admin/manageReceptionAccounts'))
printHtmlPart(11)
expressionOut.print(createLink(uri: '/admin/manageDoctorAccounts'))
printHtmlPart(12)
expressionOut.print(createLink(uri: '/admin/viaSMS'))
printHtmlPart(13)
expressionOut.print(createLink(uri: '/admin/feedres'))
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
for( _it25113024 in (0..23) ) {
changeItVariable(_it25113024)
printHtmlPart(16)
expressionOut.print(it)
printHtmlPart(17)
expressionOut.print(it)
printHtmlPart(18)
expressionOut.print(it)
printHtmlPart(19)
expressionOut.print(it)
printHtmlPart(20)
}
printHtmlPart(21)
for( _it26963049 in (0..23) ) {
changeItVariable(_it26963049)
printHtmlPart(16)
expressionOut.print(it)
printHtmlPart(17)
expressionOut.print(it)
printHtmlPart(18)
expressionOut.print(it)
printHtmlPart(19)
expressionOut.print(it)
printHtmlPart(20)
}
printHtmlPart(22)
expressionOut.print(username)
printHtmlPart(23)
expressionOut.print(password)
printHtmlPart(24)
expressionOut.print(mriInterval)
printHtmlPart(25)
expressionOut.print(ctInterval)
printHtmlPart(26)
expressionOut.print(confirmedmsg1)
printHtmlPart(27)
expressionOut.print(smscode1)
printHtmlPart(28)
invokeTag('actionSubmit','g',135,['class':("btn btn-info"),'value':("Save Changes")],-1)
printHtmlPart(29)
})
invokeTag('form','g',135,['action':("saveChanges")],2)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',148,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394732854420L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
