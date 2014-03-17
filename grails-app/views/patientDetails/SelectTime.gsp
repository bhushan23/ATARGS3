<%--<!DOCTYPE html>
<html>
	<head>
	<title> Book My Scan </title>	
	<script>
	function filledSlot() {
		alert("That slot is already occupied.\n Note: Blue Slots are occupied while white are free.");
	}
	</script>
	</head>
	<body class="hero-unit" style="width:40%">
		
		<g:set var="current" value="${0}" />
		<g:set var="i" value="30"/>
		<g:set var="j" value="${0 }"/>
		<g:set var="lim" value="${60}-${m }"/>
		<g:each in="${0..23}">
			${ 	map["busy"][current]}
			${m }
			<g:while test="${j <= lim }">
			<g:if test="${1 == map["busy"][current]}">
				
				<a onclick="filledSlot()">
				<div style="background-color:#9999FF; margin:4px">
				${it}:00 - Busy Slot
				</div></a>
				
			</g:if>
			<g:else>
				<div style="background-color:#F5F5F5; margin:4px">
				<g:link action="TimeSelected" params="[slot: it]">
				${it}:00 - Free Slot</g:link>
				</div>
			</g:else>
			<g:set var="current" value="${current + 1 }"/>
			<g:set var="j" value="${j + m }"/>
			</g:while>
		
		
			
		</g:each>
	
	</body>
</html>
--%>



<!DOCTYPE html>
<html>
	<head>
	<title> Book My Scan </title>	
	<script>
	function filledSlot() {
		alert("That slot is already occupied.\n Note: Blue Slots are occupied while white are free.");
	}
	</script>
	</head>
	<body >
		<%--<g:set var="i" value="${60/m }"/>
		
		--%>
		
		<g:set var="current" value="${i * start_time as Integer}" />
		
		<g:set var="flag" value="${0 }"/>
		<g:set var="lim" value="${60-m }"/>
		<g:set var="j" value="${start_min }"/>
		<%--<g:each in="${start_time..<end_time}">
			--%>
			<g:while test="${start_time <= end_time }">
			
			<g:if test="${start_time>=cur_time }">
			<%--<g:set var="j" value="${0 }"/>
			
			--%><g:while test="${j < 60 }">
			
			<g:if test="${start_time * 60 + j+m <= endTime_inMin }">
			<g:if test="${1 == map["busy"][current]}">
				
				<a onclick="filledSlot()">
				<div style="background-color:#9999FF; margin:4px">
				
				<g:if test="${ start_time<10 && j>0 }">
				0${start_time}:${j } - Busy Slot
				</g:if>
				<g:elseif test="${ start_time>9 && j>0 }">
				${start_time}:${j } - Busy Slot
				</g:elseif>
				<g:elseif test="${ start_time>9 && j<10 }">
				${start_time}:0${j } - Busy Slot
				</g:elseif>
				<g:else>
				0${start_time}:0${j } - Busy Slot
				</g:else>
				
				</div>
				</a>
				
			</g:if>
			<g:else>
				<g:if test="${start_time==21 && j>0 }">
			
				</g:if>
				<g:else>
				<div style="background-color:#F5F5F5; margin:4px">
				<g:link action="TimeSelected" params="[slot: "${start_time},${j }"]">
				<g:if test="${ start_time<10 && j>0 }">
				0${start_time}:${j } - Free Slot
				</g:if>
				<g:elseif test="${ start_time>9 && j>0 }">
				${start_time}:${j } - Free Slot
				</g:elseif>
				<g:elseif test="${ start_time>9 && j<10 }">
				${start_time}:0${j } - Free Slot
				</g:elseif>
				<g:else>
				0${start_time}:0${j } - Free Slot
				</g:else>
						
					<g:if test="${1 == map["busy_asterisk"][current]}">
				*
				<g:set var="flag" value="${1 }"/>
				</g:if>
				</g:link>
		
				</div>
				</g:else>
			</g:else>
			</g:if>
			<g:set var="current" value="${current + 1 }"/>
			<g:set var="j" value="${j + m }"/>
			</g:while>
			
			<g:set var="start_time" value="${start_time + j/60 - 1 as Integer}"/>
			
			<g:while test="${j>=60 }">
			<g:set var="j" value="${j-60 }"/>
			</g:while>
			</g:if>
			<g:else>
			<g:set var="current" value="${current + i as Integer}"/>
			</g:else>
			<%--</g:each>
	
	--%>
			<%start_time++ %>
			</g:while>
			<br>
			<g:if test="${flag==1 }">
			* Slot has been requested by another patient but not yet confirmed.There is a possibility that you might not get this slot.
			</g:if>
			</body>
</html>
