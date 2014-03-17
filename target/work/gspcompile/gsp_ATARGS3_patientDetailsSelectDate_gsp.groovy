import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_patientDetailsSelectDate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patientDetails/SelectDate.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('javascript','g',5,['library':("jquery")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('require','r',7,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',8,[:],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',99,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',139,['action':("PersonalDetails"),'class':("btn btn-info")],2)
printHtmlPart(6)
if(true && (counter == 0)) {
printHtmlPart(7)
}
else if(true && (counter == 1)) {
printHtmlPart(8)
}
else if(true && (counter == 2)) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
}
printHtmlPart(11)
for( _it14455179 in (limits[0]..<limits[1]) ) {
changeItVariable(_it14455179)
printHtmlPart(12)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(13)
}
printHtmlPart(14)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(15)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(16)
}
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('set','g',201,['var':("i"),'value':(0)],-1)
printHtmlPart(17)
for( _it14114814 in (limits[1]..<limits[2]) ) {
changeItVariable(_it14114814)
printHtmlPart(12)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SUNDAY)) {
printHtmlPart(13)
}
printHtmlPart(12)
if(true && (free[i] == 0)) {
printHtmlPart(19)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(20)
}
else {
printHtmlPart(21)
createTagBody(4, {->
printHtmlPart(22)
expressionOut.print(free[i])
printHtmlPart(23)
expressionOut.print(it.getAt([Calendar.DATE]))
printHtmlPart(24)
})
invokeTag('remoteLink','g',230,['controller':("PatientDetails"),'action':("SelectTime"),'update':("SelectTimeSection"),'params':([Year: "${it.getAt(Calendar.YEAR)}", Month: "${it.getAt(Calendar.MONTH)}", Day: "${it.getAt(Calendar.DAY_OF_MONTH)}"])],4)
printHtmlPart(25)
expressionOut.print(free[i] /totalNoOfIntervals *100)
printHtmlPart(26)
}
printHtmlPart(12)
if(true && (it.getAt([Calendar.DAY_OF_WEEK]) == Calendar.SATURDAY)) {
printHtmlPart(16)
}
printHtmlPart(12)
invokeTag('set','g',241,['var':("i"),'value':(i + 1)],-1)
printHtmlPart(17)
}
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',277,['onload':("showmonth('sdas');")],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1394770357919L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
