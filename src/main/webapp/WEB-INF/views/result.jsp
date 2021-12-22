<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<body>
<h2>Квадратное уравнение:</h2>
<b>${equation.a}</b> x^2 + <b>${equation.b}</b> x + <b>${equation.c}</b> = 0
<br/>
<h2>Корни уравнения:</h2>
x1 = ${equation.root1}, x2 = ${equation.root2}
<br/>
<br/>
<input type="button" onclick="history.back();" value="Назад"/>
</body>
</html>
