/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule = (function () {
    var putUser = function (user,passwd, callback){
        axios.put('/races/jugador/'+user+'/'+passwd)
                .then(function(user){
                    callback.onSuccess(user.data);
                    console.log("User received");
                })
                .catch(function(error){
                    callback.onFailed(error);
                    console.log(error);
                     alert("There is a problem with our servers. We apologize for the inconvince, please try again later");
                });
    };
    var getUser = function (user, callback){
        axios.get('/races/jugador/'+user)
                .then(function(player){
                    callback.onSuccess(player.data);
                    console.log("Player returned");
                })
                .catch(function(error){
                    callback.onFailed(error);
                    console.log(error);
                });
    };
    
    return {
        putUser:putUser,
        getUser:getUser
    };
})();
 

