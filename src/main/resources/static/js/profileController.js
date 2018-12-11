/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var ProfileControllerModule =(function(){
    
    var loadInfo= function(){
        var user = window.location.search.substring(1);
        console.log(user);
        var callback={
            onSuccess: function(player){
                $("#points").append("<span>"+player.puntos+"</span>");
                $("#email").append("<p>"+player.correo+"</p>");
                $("#date").append("<p>"+player.fechaNacimiento+"</p>");
                $("#gender").append("<p>"+player.genero+"</p>");
                $("#lastTime").append("<p>"+player.tiempo+"</p>");
                $("#lastPos").append("<p>"+player.posicion+"</p>");  
                document.getElementById("team").src=player.equipo;
                
            },
            onFailed: function(exception){
                console.log(exception);
                alert("Username does not exist"); 
            }
            
        };
        
        RestControllerModule.getUser(user,callback);   
    };
    
    var changeTeam= function(){
        var user = window.location.search.substring(1);
        location.href="https://f1-manager.herokuapp.com/team.html"+"?"+user;
    };
    var selectTeam= function(img){
        console.log(img);
        var username = window.location.search.substring(1);
        var player;
        
         var callback={
            onSuccess: function(user){
                player=user;
                player.equipo=img;
                console.log(player);
                postTeam(player);
            },
            onFailed: function(exception){
                console.log(exception);
                alert("Username does not exist"); 
            }
        };
        RestControllerModule.getUser(username,callback);
    };
    
    var postTeam= function(player){
        var callbackPost={
            onSuccess: function(response){
                console.log(response);
                location.href="https://f1-manager.herokuapp.com/profile.html"+"?"+player.usuario;
            },
            onFailed: function(exception){
                console.log(exception);
                alert("User have not been updated"); 
            }
        };
        RestControllerModule.postUser(player,callbackPost);
    };

    var play = function () {
        location.href="https://f1-manager.herokuapp.com/race.html";
    }
    
    return {
        loadInfo:loadInfo,
        changeTeam: changeTeam,
        selectTeam: selectTeam,
        postTeam: postTeam,
        play: play
    }
})();


