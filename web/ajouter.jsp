<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="./css/form-validation.css" rel="stylesheet">
    <%@ include file="header.html" %>
    
    
    <svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
      <symbol id="people-circle" viewBox="0 0 16 16">
        <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
        <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
      </symbol>
    </svg>
    <body>
    <%-- Affichage du message --%>
        <c:if test="${not empty message}">
            <div class="alert alert-danger text-white text-center my-custom-message" role="alert" style="background-color: ${messageBackgroundColor};">
                ${message}
            </div>
        </c:if>

    <div class="container">
      <main>
        <br/>
        <br/>
        <div class="py-5 text-center">
              <h2>Nouveau cours</h2>
        </div>
        <div class="row g-5">
          <div class="col-md-12 col-lg-12">
            <form action="CoursController" method="GET">
              <div class="row g-3">
                <div class="col-12">
                  <label for="codecours" class="form-label">Code Cours</label>
                  <input type="number" name="codecours" class="form-control" id="codecours" placeholder="Entrez un identifiant." required>
                  <div class="invalid-feedback">
                    Entrez un identifiant.
                  </div>
                </div>
                  
                <div class="col-sm-6">
                  <label for="Titre" class="form-label">Titre</label>
                  <input type="text" name="Titre" class="form-control" id="Titre" placeholder="Entrez un titre." required>
                  <div class="invalid-feedback">
                    Entrez un titre.
                  </div>
                </div>

                <div class="col-sm-6">
                  <label for="Categorie" class="form-label">Categorie</label>
                  <input type="text" name="Categorie" class="form-control" id="Categorie" placeholder="Entrez une categorie." required>
                  <div class="invalid-feedback">
                    Entrez une categorie.
                  </div>
                </div>

                <div class="col-12">
                    <label for="Contenu" class="form-label">Contenu</label>
                    <textarea name="Contenu" class="form-control" id="Contenu" placeholder=""  style="height: 200px;" required></textarea>
                    <div class="invalid-feedback">
                        Entrez un contenu.
                    </div>
                </div>

              </div>
              <hr class="my-4">
                    </br>
                    <button class="w-100 btn btn-primary btn-lg" type="submit" name="ajouterCours">Ajouter</button>
              </button>
            </form>
          </div>
        </div>
      </main>
    </div>


    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>

      <script src="./js/form-validation.js"></script>
  </body>
</html>
