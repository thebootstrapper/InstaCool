<%@ include file="header.jsp"%>


<div class="row justify-content-center " >
    <div class="col-11 col-xl-6  col-lg-6 col-md-8 col-sm-10 "  >

        <form:form method="POST" action="/search" modelAttribute="motForm">

            <div class="form-group row">
                <div class="col-sm-9">
                    <form:input  type="text" class="form-control"  placeholder="saisir un nom ou un prenom" value="${motForm.mot}" path="mot"/>
                </div>
                <div class="col-sm-3">
                    <div class="container">
                        <div class="row justify-content-center " >
                            <button type="submit" class="btn btn-success" id="mail_button">GO</button>
                        </div>
                    </div>
                </div>
            </div>
        </form:form>
    </div>
</div>

<c:if test="${TabUser.size() >0}">
    <div class="row justify-content-center " >
        <div class="col-sm-8 col-xs-12">
            <table class="table">
                <tr>
                    <th scope="row">

                        <c:forEach var = "i" begin = "0" end = "${TabUser.size()-1}">
                            <a href="http://localhost:8080/profil?id=${TabUser.get(i).getId()}">
                                <div class="row justify-content-center " style="padding: 15px;">
                                    <div class="col-12"  id="div_profil_header"  style="background-color: #A6A6A6;color: white;">
                                        <div class="row" >
                                                <%--photo--%>
                                            <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12"
                                                <%--style="background-color: antiquewhite"--%>
                                            >
                                                <div style="text-align: center">
                                                    <img src="/profilPicture/java.png" alt="photo" width="100px" height="100px" />
                                                </div>

                                            </div>
                                                <%--info--%>
                                            <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12"
                                                 style="
                     /*background-color: #e8e5e5;*/
                     text-align: center">

                                                <div class="row">
                                                    <div class="col-12 ">
                                                        <h4> ${TabUser.get(i).getNom()} ${TabUser.get(i).getPrenom()}</h4>
                                                    </div>
                                                </div>
                                                <div class="row"
                                                     style="
                         /*background-color: aquamarine;*/
                         text-align: center">
                                                    <div class="col-12">
                                                        <span style="font-weight:bolder ">${TabNbPublications.get(i)}</span> publications
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>

                            </a>
                        </c:forEach>
                    </th>
                </tr>
            </table>
        </div>
    </div>
</c:if>


</body>
</html>
