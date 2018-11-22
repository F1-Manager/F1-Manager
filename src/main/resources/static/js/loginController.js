var LoginControllerModule = (function() {
    //var user = document.getElementById("username").value;
    //var password= document.getElementById("password").value;
    var doLogin= function(user, password) {
        var callback={
            onSuccess: function(player){
                if (player.contrasena==password){
                    location.href="http://localhost:8080/race.html";
                }else {
                    alert("Username or password incorrect"); 
                }
            },
            onFailed: function(exception){
                console.log(exception);
                alert("Username does not exist"); 
            }
        };
        RestControllerModule.getUser(user,callback);
    };
    var register= function(user, password, email, date, gender){
        var callback={
            onSuccess: function(){
                location.href="http://localhost:8080/race.html";
            },
            onFailed: function(exception){
                console.log(exception);
                alert("User has not been created"); 
            }
        };
        RestControllerModule.putUser(user, password, email, date, gender, callback);
    }

    return {
        doLogin:doLogin,
        register:register
    };
    
})();



