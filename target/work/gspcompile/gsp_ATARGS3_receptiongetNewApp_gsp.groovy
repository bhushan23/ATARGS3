import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_receptiongetNewApp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reception/getNewApp.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('require','r',8,['modules':("bootstrap")],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',9,[:],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'dashboard.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'js', file: 'holder.js'))
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',34,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
invokeTag('remoteField','g',63,['name':("A"),'action':("Afunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',65,['name':("FN"),'action':("FNfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',67,['name':("LN"),'action':("LNfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',69,['name':("M"),'action':("Mfunc"),'update':("PatientTable")],-1)
printHtmlPart(9)
invokeTag('remoteField','g',71,['name':("MOB"),'action':("MOBfunc"),'update':("PatientTable")],-1)
printHtmlPart(10)
for( _it22938664 in (res) ) {
changeItVariable(_it22938664)
printHtmlPart(11)
expressionOut.print(it.id)
printHtmlPart(12)
expressionOut.print(it.firstname)
printHtmlPart(12)
expressionOut.print(it.lastname)
printHtmlPart(12)
expressionOut.print(it.age)
printHtmlPart(12)
expressionOut.print(it.machine)
printHtmlPart(12)
expressionOut.print(it.mobile)
printHtmlPart(12)
expressionOut.print(it.priority1)
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
createClosureForHtmlPart(15, 4)
invokeTag('link','g',103,['params':([p: "${it.id},${it.priority1}"]),'action':("confirmApp"),'class':("btn btn-info")],4)
printHtmlPart(16)
})
invokeTag('form','g',106,['action':("confirmApp"),'method':("post")],3)
printHtmlPart(17)
expressionOut.print(it.priority2)
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
createClosureForHtmlPart(15, 4)
invokeTag('link','g',113,['params':([p: "${it.id},${it.priority2}"]),'action':("confirmApp"),'class':("btn btn-info")],4)
printHtmlPart(16)
})
invokeTag('form','g',116,['action':("confirmApp"),'method':("post")],3)
printHtmlPart(17)
expressionOut.print(it.priority3)
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
createClosureForHtmlPart(15, 4)
invokeTag('link','g',123,['params':([p: "${it.id},${it.priority3}"]),'action':("confirmApp"),'class':("btn btn-info")],4)
printHtmlPart(16)
})
invokeTag('form','g',126,['action':("confirmApp"),'method':("post")],3)
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(19)
createClosureForHtmlPart(20, 4)
invokeTag('link','g',132,['params':([p:"${it.id}"]),'action':("rejectApp"),'class':("btn btn-danger")],4)
printHtmlPart(21)
})
invokeTag('form','g',135,['action':("rejectApp"),'method':("post")],3)
printHtmlPart(22)
}
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',152,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394306908000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
