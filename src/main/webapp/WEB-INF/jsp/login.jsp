<%@ include file="header.jsp"%>


    <!-- formulaire de connexion -->
    <div class="row justify-content-center " >
        <div class="col-11 col-xl-6  col-lg-6 col-md-8 col-sm-10 "  id="div_connexion">

            <form:form method="POST" action="/login" modelAttribute="userForm">
                <div class="form-group row">
                    <label for="email" class="col-sm-2 col-form-label"> Email&nbsp;:</label>
                    <div class="col-sm-10">
                        <%--<input type="texte" class="form-control" id="email" name="email" value='${email}'>--%>
                        <form:input  type="text" class="form-control"
                                     placeholder="saisir un nom ou un prenom" value="${email}" path="email"/>

                    </div>
                </div>
                <div class="form-group row">
                    <label for="password" class="col-sm-2 col-form-label">Password&nbsp;:</label>
                    <div class="col-sm-10">
                        <%--<input type="password" class="form-control" name="password"--%>
                               <%--id="password" placeholder="Password" value="{password}">--%>
                        <form:input  type="password" class="form-control"
                                     placeholder="saisir un nom ou un prenom" value="${password}" path="password"/>
                    </div>
                </div>


                <div class="container">
                    <div class="row justify-content-end ">
                        <div class="col-sm-10">
                            <div class="container">
                                <div class="row justify-content-center " >
                                    <button type="submit" class="btn btn-success" id="connexion_button">connexion</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form:form>
                <a href="http://localhost:8080/creationCompte"> Creer un compte</a>

            <p style="color:red;">  ${message.toString()}</p>

            <p>
            </p>
        </div>
    </div>

    <!-- fin du formulaire de connexion -->


</div>
<!-- fin de la page -->


<!--  chargemment des fichiers CSS et Javascript de bootstrap4 qui sont en ligne
à cause d'un certain bug dans leurs fichiers je dois les recharger encore -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>


<!-- My JS -->
<script type="text/javascript" src="CompteUtilisateur/connexion.js"></script>

</body>
</html>