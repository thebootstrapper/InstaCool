<%--<%@ page pageEncoding="UTF-8" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Page de Connexion</title>

    <!-- chargement de ma feuille de style -->
    <link rel="stylesheet" href="/WEB-INF/css/style.css">
    <link rel="stylesheet" href="/WEB-INF/css/fontawesome.css">



    <!-- chargemment des fichiers CSS et Javascript de bootstrap4 qui sont en ligne -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>

    <style>


        body{
            /*background-image: url("img/cover.jpg");*/
            /*background-color: #eeeeee;*/
            background-color:#f8f9fa;
        }


        /*connexion*/
        .mycontainer-fluid{
            width:100%;
            margin-right:auto;
            margin-left:auto;
        }

        /* style de la bar de  navigation */
        #myrownavbar{
            padding-bottom: 50px;
        }

        /* style du formulaire de connexion */
        #div_connexion {
            background-color: #e5e7e9 ;
            box-shadow: 5px 5px  10px 10px grey;
            padding: 35px;
        }
        #div_profil_header {
            background-color: #fff ;
            /*box-shadow: 5px 5px  10px 10px #8080801a;*/
            padding: 35px;
        }
        /* style ds bouttons des 2 formulaires */
        #connexion_button ,#mail_button{
            width: 300px;
        }

        /* style du texte "mot de passe oublié" */
        #mot_de_passe_ouble{
            margin-top: 25px;
        }

        /* style du bouton de connexion du forulaire de connxion */
        #connexion_button{
            margin-top: 10px;
        }

        #creation_compte_alerte{
            /*  padding-bottom:  30px;*/
        }


        /* style du formulaire de creation de compte */
        #div_creation_compte {
            background-color: #e5e7e9 ;
            box-shadow: 5px 5px  10px 10px grey;
            padding: 35px;
        }

        /* style du message d'alert */
        #div_erreur .alert{
            /*  padding: 15px;*/
        }
        .photo{
            padding-top: 15px;
        }























    </style>

</head>
<body>

<!-- debut de la page -->
<div class="mycontainer-fluid">

    <!-- bar de navigation -->
    <div class="row "  id="myrownavbar">
        <div class="col-12">

            <nav class="navbar navbar-expand-md navbar-dark bg-primary">
                <a class="navbar-brand" href="http://localhost:8080">InstaCool</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#maNavBar" aria-controls="maNavBar" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
 <%--que quand il est connecté--%>

                <div class="collapse navbar-collapse " id="maNavBar">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="http://localhost:8080"> Accueil</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link"  href="http://localhost:8080/search"> Rechercher</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="http://localhost:8080/publier"> Publier</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link"  href="http://localhost:8080/profil?id=${idCurrentUser ? idCurrentUser : 0 }"> Mon Profil</a>
                        </li>
                    </ul>
                </div>

            </nav>
        </div>
    </div>
    <!--  Fin de la bar de navigation -->


    <%--<c:out value="coucou"></c:out>--%>
