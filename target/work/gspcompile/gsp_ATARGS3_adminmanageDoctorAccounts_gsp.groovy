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
for( _it4567660 in (notConfirmed) ) {
changeItVariable(_it4567660)
printHtmlPart(9)
expressionOut.print(it.id)
printHtmlPart(10)
expressionOut.print(it.firstname)
printHtmlPart(10)
expressionOut.print(it.lastname)
printHtmlPart(10)
expressionOut.print(it.username)
printHtmlPart(11)
expressionOut.print(it.address)
printHtmlPart(10)
expressionOut.print(it.mobile)
printHtmlPart(12)
if(true && (it.confirmed_flag==1)) {
printHtmlPart(13)
createClosureForHtmlPart(14, 4)
invokeTag('link','g',85,['params':([p: "${it.id}"]),'action':("deleteDoctorAcc")],4)
printHtmlPart(13)
}
else {
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',90,['params':([p: "${it.id}"]),'action':("confirmDoctorAcc")],4)
printHtmlPart(15)
}
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',104,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909775L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [106, 106, 106, 106, 106, 106, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 12, 12, 12, 16, 16, 17, 17, 36, 36, 39, 70, 70, 70, 70, 70, 71, 71, 71, 72, 72, 72, 73, 73, 73, 74, 74, 74, 82, 85, 85, 85, 86, 86, 86, 90, 90, 90, 90, 90, 90, 93, 93, 104, 104, 105, 106, 106, 106, 106, 106, 106, 106, 106, 106, 106, 106, 106, 106, 106],
	sourceName = "manageDoctorAccounts.gsp"
)
class ___LineNumberPlaceholder { }
