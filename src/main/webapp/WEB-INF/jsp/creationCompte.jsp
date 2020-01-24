<%@ include file="header.jsp"%>


<!-- formulaire de creation de compte -->
    <div class="row justify-content-center " >
        <div class="col-11 col-xl-6  col-lg-6 col-md-8 col-sm-10 "  id="div_creation_compte">
<form:form method="POST" action="/creationCompte" modelAttribute="userForm">

                <div class="form-group row">
                    <label for="nom" class="col-sm-2  col-xl-2 col-form-label"> Nom&nbsp;:</label>
                    <div class="col-sm-10  col-xl-10">
                        <form:input  type="text" class="form-control"
                                     placeholder="nom" value="${nom}" path="nom"/>

                    </div>
                </div>


                <div class="form-group row">
                    <label for="prenom" class="col-sm-2  col-xl-2 col-form-label"> Prénom&nbsp;:</label>
                    <div class="col-sm-10 col-xl-10">
                        <form:input  type="text" class="form-control"
                                     placeholder="prenom" value="${prenom}" path="prenom"/>
                    </div>
                </div>


                <div class="form-group row">
                    <label for="email" class="col-sm-2 col-xl-2 col-form-label"> Email&nbsp;:</label>
                    <div class="col-sm-10 col-xl-10">
                        <form:input  type="text" class="form-control"
                                     placeholder="email" value="${email}" path="email"/>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="password" class="col-sm-2 col-form-label">Mot de passe&nbsp;:</label>
                    <div class="col-sm-10">
                        <form:input  type="password" class="form-control"
                                     placeholder="password" value="${password}" path="password"/>
                    </div>
                </div>

<%--
Photo de profil
                <div class="form-group row">
                    <label for="password" class="col-sm-2 col-form-label">Mot de passe&nbsp;:</label>
                    <div class="col-sm-10">
                        <form:input  type="file" class="form-control"
                                     placeholder="password" value="${password}" path="profil"/>
                    </div>
                </div>

--%>


                <div class="container">
                    <div class="row justify-content-end ">
                        <div class="col-sm-10">
                            <div class="container">
                                <div class="row justify-content-center " >
                                    <button type="submit" class="btn btn-success" id="mail_button">Creer</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

    </form:form>

            <p>  ${message}</p>
            <p>
                <a href="http://localhost:8080/login"> J'ai deja un compte</a>
            </p>
        </div>


    </div>
    <!-- fin formulaire de creation de compte -->



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