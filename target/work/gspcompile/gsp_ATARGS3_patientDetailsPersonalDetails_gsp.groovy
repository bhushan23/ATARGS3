import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_patientDetailsPersonalDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patientDetails/PersonalDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',5,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
if(true && (flash.messageFN)) {
printHtmlPart(3)
expressionOut.print(flash.messageFN)
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (flash.messageLN)) {
printHtmlPart(3)
expressionOut.print(flash.messageLN)
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (flash.messageAGE)) {
printHtmlPart(3)
expressionOut.print(flash.messageAGE)
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (flash.messageMOB)) {
printHtmlPart(3)
expressionOut.print(flash.messageMOB)
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (flash.messageEMAIL)) {
printHtmlPart(3)
expressionOut.print(flash.messageEMAIL)
printHtmlPart(4)
}
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
expressionOut.print(tempFN)
printHtmlPart(8)
expressionOut.print(historyMN)
printHtmlPart(9)
expressionOut.print(tempLN)
printHtmlPart(10)
expressionOut.print(tempAGE)
printHtmlPart(11)
expressionOut.print(tempMOB)
printHtmlPart(12)
expressionOut.print(email)
printHtmlPart(13)
expressionOut.print(historyAddress)
printHtmlPart(14)
expressionOut.print(historyPincode)
printHtmlPart(15)
expressionOut.print(historyCity)
printHtmlPart(16)
expressionOut.print(historyState)
printHtmlPart(17)
for( _it1987222 in (doctors) ) {
changeItVariable(_it1987222)
printHtmlPart(18)
expressionOut.print(it.id)
printHtmlPart(19)
expressionOut.print(it.firstname)
printHtmlPart(20)
expressionOut.print(it.lastname)
printHtmlPart(21)
}
printHtmlPart(22)
expressionOut.print(historyClinicalHistory)
printHtmlPart(23)
expressionOut.print(machine)
printHtmlPart(24)
})
invokeTag('form','g',303,['action':("savePersonalDetails")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',316,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394766040005L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
