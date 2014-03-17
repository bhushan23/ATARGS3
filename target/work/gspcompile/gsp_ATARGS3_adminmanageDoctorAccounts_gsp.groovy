import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_adminmanageDoctorAccounts_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/manageDoctorAccounts.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',10,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',11,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',36,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(createLink(uri: '/adminSettings/ControlPanel'))
printHtmlPart(9)
for( _it9653880 in (notConfirmed) ) {
changeItVariable(_it9653880)
printHtmlPart(10)
expressionOut.print(it.id)
printHtmlPart(11)
expressionOut.print(it.firstname)
printHtmlPart(11)
expressionOut.print(it.lastname)
printHtmlPart(11)
expressionOut.print(it.username)
printHtmlPart(11)
expressionOut.print(it.password)
printHtmlPart(11)
expressionOut.print(it.address)
printHtmlPart(11)
expressionOut.print(it.mobile)
printHtmlPart(12)
if(true && (it.confirmed_flag==1)) {
printHtmlPart(13)
createClosureForHtmlPart(14, 4)
invokeTag('link','g',89,['params':([p: "${it.id}"]),'action':("deleteDoctorAcc")],4)
printHtmlPart(13)
}
else {
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',94,['params':([p: "${it.id}"]),'action':("confirmDoctorAcc")],4)
printHtmlPart(15)
}
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',109,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394732900123L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
