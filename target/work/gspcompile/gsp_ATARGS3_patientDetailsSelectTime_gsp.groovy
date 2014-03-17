import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ATARGS3_patientDetailsSelectTime_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patientDetails/SelectTime.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('set','g',10,['var':("current"),'value':(i * start_time as Integer)],-1)
printHtmlPart(2)
invokeTag('set','g',11,['var':("flag"),'value':(0)],-1)
printHtmlPart(3)
invokeTag('set','g',13,['var':("lim"),'value':(60-m)],-1)
printHtmlPart(3)
invokeTag('set','g',14,['var':("j"),'value':(start_min)],-1)
printHtmlPart(4)
while(start_time <= end_time) {
printHtmlPart(5)
if(true && (start_time>=cur_time)) {
printHtmlPart(6)
while(j < 60) {
printHtmlPart(5)
if(true && (start_time * 60 + j+m <= endTime_inMin)) {
printHtmlPart(6)
if(true && (1 == map["busy"][current])) {
printHtmlPart(7)
if(true && (start_time<10 && j>0)) {
printHtmlPart(8)
expressionOut.print(start_time)
printHtmlPart(9)
expressionOut.print(j)
printHtmlPart(10)
}
else if(true && (start_time>9 && j>0)) {
printHtmlPart(11)
expressionOut.print(start_time)
printHtmlPart(9)
expressionOut.print(j)
printHtmlPart(10)
}
else if(true && (start_time>9 && j<10)) {
printHtmlPart(11)
expressionOut.print(start_time)
printHtmlPart(12)
expressionOut.print(j)
printHtmlPart(10)
}
else {
printHtmlPart(8)
expressionOut.print(start_time)
printHtmlPart(12)
expressionOut.print(j)
printHtmlPart(10)
}
printHtmlPart(13)
}
else {
printHtmlPart(11)
if(true && (start_time==21 && j>0)) {
printHtmlPart(14)
}
else {
printHtmlPart(15)
createTagBody(8, {->
printHtmlPart(11)
if(true && (start_time<10 && j>0)) {
printHtmlPart(8)
expressionOut.print(start_time)
printHtmlPart(9)
expressionOut.print(j)
printHtmlPart(16)
}
else if(true && (start_time>9 && j>0)) {
printHtmlPart(11)
expressionOut.print(start_time)
printHtmlPart(9)
expressionOut.print(j)
printHtmlPart(16)
}
else if(true && (start_time>9 && j<10)) {
printHtmlPart(11)
expressionOut.print(start_time)
printHtmlPart(12)
expressionOut.print(j)
printHtmlPart(16)
}
else {
printHtmlPart(8)
expressionOut.print(start_time)
printHtmlPart(12)
expressionOut.print(j)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (1 == map["busy_asterisk"][current])) {
printHtmlPart(18)
invokeTag('set','g',76,['var':("flag"),'value':(1)],-1)
printHtmlPart(11)
}
printHtmlPart(11)
})
invokeTag('link','g',76,['action':("TimeSelected"),'params':([slot: "${start_time},${j}"])],8)
printHtmlPart(19)
}
printHtmlPart(6)
}
printHtmlPart(6)
}
printHtmlPart(6)
invokeTag('set','g',79,['var':("current"),'value':(current + 1)],-1)
printHtmlPart(6)
invokeTag('set','g',81,['var':("j"),'value':(j + m)],-1)
printHtmlPart(6)
}
printHtmlPart(5)
invokeTag('set','g',84,['var':("start_time"),'value':(start_time + j/60 - 1 as Integer)],-1)
printHtmlPart(5)
while(j>=60) {
printHtmlPart(6)
invokeTag('set','g',87,['var':("j"),'value':(j-60)],-1)
printHtmlPart(6)
}
printHtmlPart(6)
}
else {
printHtmlPart(6)
invokeTag('set','g',89,['var':("current"),'value':(current + i as Integer)],-1)
printHtmlPart(6)
}
printHtmlPart(5)

start_time++

printHtmlPart(6)
}
printHtmlPart(20)
if(true && (flag==1)) {
printHtmlPart(21)
}
printHtmlPart(6)
})
invokeTag('captureBody','sitemesh',102,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389031100000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
