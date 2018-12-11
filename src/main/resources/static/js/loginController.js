var LoginControllerModule = (function() {
    //var password= document.getElementById("password").value;
    var doLogin= function(user, password) {
        var username = {
            "usuario": user,
            "contrasena": password
        }
        var callback= {
            onSuccess: function(response){
                saveToken(response.headers.authorization, user);
                getProfile(user, response.headers.authorization);
                //document.cookie="Authorization= "+ response.headers.authorization;
                //location.href="http://localhost:8080/profile.html"+"?"+user;

            },
            onFailed: function(exception){
                console.log(exception);
                alert("Username does not exist"); 
            }
        };
        
        RestControllerModule.login(username,callback);
    };
    var register= function(user, password, email, date, gender){
        var username = {
            "usuario": user,
            "contrasena": password,
            "correo": email,
            "fechaNacimiento": date,
            "genero": gender
        }
        var callback={
            onSuccess: function(){
                alert("User created");
            },
            onFailed: function(exception){
                console.log(exception);
                alert("User has not been created"); 
            }
        };
        RestControllerModule.putUser(username, callback);
    };
    
    var saveToken = function (token, user) {

        var callback = {
            onSuccess: function (player) {
                player.token = token;
                console.log(player);
                postToken(player);
            },
            onFailed: function (excepction) {
                console.log("Error getUser");
            }
        };
        RestControllerModule.getUser(user, callback);
    }

    var postToken = function (user) {
        var callback = {
            onSuccess: function (response) {
                console.log("Token posted");
            },
            onFailed: function (exception) {
                console.log("Post failed");
            }
        };
        RestControllerModule.postToken(user, callback);
    }

    var createRace = function () {
        var callback = {
            onSuccess: function (response) {
                console.log("Race created");
            },
            onFailed: function (exception) {
                console.log("Error while creating race");
            }
        };
        RestControllerModule.createRace(callback);
    }

    var getProfile = function(user, token){
        var callback = {
            onSuccess: function (response) {
                //document.open();
                //document.write(response.data);
                //document.close();
                console.log(response);
            },
            onFailed: function (exception) {
                console.log("Error get profile");
            }
        };
        RestControllerModule.getProfile(user, token, callback);
    }

    return {
        doLogin:doLogin,
        register:register,
        saveToken: saveToken,
        postToken: postToken,
        createRace: createRace,
        getProfile: getProfile
    };
    
})();
