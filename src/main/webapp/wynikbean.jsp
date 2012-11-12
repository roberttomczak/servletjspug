<jsp:useBean id="form" class="com.example.servletjspdemo.web.Form" scope="page"/>
<jsp:setProperty property="imie" name="form" param="imie"/>
<jsp:setProperty property="nazwisko" name="form" param="nazwisko"/>
<jsp:setProperty property="jedzenie" name="form" param="jedzenie"/>
<jsp:useBean id="formapp" class="com.example.servletjspdemo.web.Form" scope="application"/> 
<jsp:setProperty property="cars" name="formapp" param="cars"/>
<jsp:setProperty property="hobby" name="formapp" param="hobby"/>
<body>
Imie: <%= form.getImie() %><BR>
Nazwisko: <%= form.getNazwisko() %><BR>
Jedzenie: <%= form.getJedzenie() %><BR>
Hobby: <%= formapp.getHobby() %><BR>
cars: <%= formapp.getCars() %><BR>

</body>
</html>