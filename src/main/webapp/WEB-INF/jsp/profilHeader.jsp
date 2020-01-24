
<div class="row justify-content-center " >
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
                        <h4> ${user.getNom()} ${user.getPrenom()}</h4>
                    </div>
                </div>
                <div class="row"
                     style="
                     /*background-color: aquamarine;*/
                     text-align: center">
                    <div class="col-12">
                        <span style="font-weight:bolder ">${nbPublication}</span> publications
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
