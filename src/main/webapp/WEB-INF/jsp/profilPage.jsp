<%@ include file="header.jsp"%>


<div class="row justify-content-center ">
    <div class="col-sm-8 col-xs-12">
        <%@ include file="profilHeader.jsp"%>
    </div>
</div>





<div class="album py-5 bg-light">
    <div class="container" style="text-align: center">


        <%--Bonjour ${TabPhoto.size()}--%>
        <%--Bonjour ${nbLigne}--%>

    <c:if test="${nbLigne> 0}">

        <div class="row">
            <c:forEach var = "i" begin = "0" end = "${TabPhoto.size()-1}">
                    <div class="col-md-6 photo">
                        <div class="card mb-6 shadow-sm" style="height: 100%;">
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
            </c:forEach>
        </div>
    </c:if>

    <c:if test="${TabPhoto.size()== 0}">
    <br>
    Vous n'avez publié aucune photo!
    <br>
</c:if>
    </div>
</div>

</body>
</html>
