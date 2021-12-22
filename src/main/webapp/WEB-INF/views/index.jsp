<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<style>
    .error {
        color: #ff0000;
    }
</style>
<body>
<h1>Решение уравнений вида:</h1>
<h2>AX^2 + BX + C = 0</h2>
<spring:form method="post" commandName="equation" action="/calculate">
    <table>
        <tr>
            <td><spring:label path="a">A = </spring:label></td>
            <td><spring:input path="a" type="number" required="required"/></td>
            <td><spring:errors path="a" cssClass="error"/></td>
        </tr>
        <tr>
            <td><spring:label path="b">B = </spring:label></td>
            <td><spring:input path="b" type="number" required="required"/></td>
            <td><spring:errors path="b" cssClass="error"/></td>
        </tr>
        <tr>
            <td><spring:label path="c">C = </spring:label></td>
            <td><spring:input path="c" type="number" required="required"/></td>
            <td><spring:errors path="c" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <spring:button>Рассчитать</spring:button>
            </td>
        </tr>
    </table>
</spring:form>
</body>
</html>