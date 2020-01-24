<%@ include file="header.jsp"%>

<%--Bonjour ${TabPhoto.get(0).toString()}--%>
Bonjour ${currentUser.getNom()} ${currentUser.getPrenom()}
<%--

  <p>
    <a href="http://localhost:8080/login"> J'ai déja un compte</a>
  </p>
  <p>
    <a href="http://localhost:8080/creationCompte"> Créer un compte</a>
  </p>
--%>


  <p>
    <a href="http://localhost:8080/deconnexion"> Se deconnecter</a>
  </p>





<div class="album py-5 bg-light">
    <div class="container">


        <c:if test="${TabPhoto.size()> 0}">
            <c:forEach var = "i" begin = "0" end = "${TabPhoto.size()-1}">
                <div class="row justify-content-center ">
                    <div class="col-md-10 photo" style="background-color: #A6A6A6;margin-top: 20px">
                        <div>

                            <div class="row justify-content-center " >
                                <div class="col-12"  id="div_profil_header"  style="background-color: #A6A6A6;color: white;">
                                        <%--<div class="col-11 col-xl-6  col-lg-6 col-md-8 col-sm-10 "  id="div_profil_header">--%>

                                        <%--header--%>

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
                                                    <h4>${TabUser.get(i).getNom()} ${TabUser.get(i).getPrenom()}</h4>
                                                </div>
                                            </div>
                                            <div class="row"
                                                 style="
                     /*background-color: aquamarine;*/
                     text-align: center">
                                                <div class="col-12">
                                                    <span style="font-weight:bolder ">NB</span> publications
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>
                        <div style="padding: 10px">

                            <div class="card mb-6 shadow-sm">
                                <img src="/publication/${TabPhoto.get(i).getSrc()}" alt="photo" width="100%" height="100%"/>
                                <div class="card-body">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">Jaime</button>
                                        </div>
                                        <small class="text-muted">9 Jaimes</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </c:forEach>

        </c:if>




    </div>
</div>

  </body>
</html>