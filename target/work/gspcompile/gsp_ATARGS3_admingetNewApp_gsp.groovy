import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_admingetNewApp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/getNewApp.gsp" }
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
invokeTag('remoteField','g',70,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',72,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',74,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',76,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
invokeTag('remoteField','g',78,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(11)
for( _it3073701 in (res) ) {
changeItVariable(_it3073701)
printHtmlPart(12)
expressionOut.print(it.id)
printHtmlPart(13)
expressionOut.print(it.firstname)
printHtmlPart(13)
expressionOut.print(it.lastname)
printHtmlPart(13)
expressionOut.print(it.age)
printHtmlPart(13)
expressionOut.print(it.machine)
printHtmlPart(13)
expressionOut.print(it.mobile)
printHtmlPart(13)
expressionOut.print(it.priority1)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',110,['params':([p: "${it.id},${it.priority1}"]),'action':("confirmApp"),'class':("btn btn-info")],4)
printHtmlPart(17)
})
invokeTag('form','g',113,['action':("confirmApp"),'method':("post")],3)
printHtmlPart(18)
expressionOut.print(it.priority2)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',120,['params':([p: "${it.id},${it.priority2}"]),'action':("confirmApp"),'class':("btn btn-info")],4)
printHtmlPart(17)
})
invokeTag('form','g',123,['action':("confirmApp"),'method':("post")],3)
printHtmlPart(18)
expressionOut.print(it.priority3)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',130,['params':([p: "${it.id},${it.priority3}"]),'action':("confirmApp"),'class':("btn btn-info")],4)
printHtmlPart(17)
})
invokeTag('form','g',133,['action':("confirmApp"),'method':("post")],3)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
createClosureForHtmlPart(21, 4)
invokeTag('link','g',139,['params':([p:"${it.id}"]),'action':("rejectApp"),'class':("btn btn-danger")],4)
printHtmlPart(22)
})
invokeTag('form','g',142,['action':("rejectApp"),'method':("post")],3)
printHtmlPart(23)
}
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',159,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396765909774L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 12, 12, 12, 16, 16, 17, 17, 36, 36, 39, 55, 55, 55, 55, 70, 70, 72, 72, 74, 74, 76, 76, 78, 78, 97, 97, 97, 99, 99, 100, 100, 101, 101, 102, 102, 103, 103, 104, 104, 105, 105, 110, 110, 110, 110, 110, 113, 113, 113, 115, 115, 120, 120, 120, 120, 120, 123, 123, 123, 125, 125, 130, 130, 130, 130, 130, 133, 133, 133, 139, 139, 139, 139, 139, 142, 142, 142, 145, 145, 159, 159, 159, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "getNewApp.gsp"
)
class ___LineNumberPlaceholder { }
