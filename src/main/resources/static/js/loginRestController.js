/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule = (function () {
    var putUser = function (user, callback){
        axios.post('/races/sign-up', user)
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
    var postUser = function (player,callbackPost){
        axios.post('/races',player)
                .then(function(response){
                    callbackPost.onSuccess(response.data);
                    console.log("Player updated");
                })
                .catch(function(error){
                    console.log(player);
                    callbackPost.onFailed(error.data);
                    console.log("Unexpected error");
                });
    };

    var login = function (user, callback) {
        axios.post('/login', user)
            .then(function (value) {
                callback.onSuccess(value);
            })
            .catch(function (reason) {
                callback.onFailed(reason);
                console.log(reason.response)
            })
    }

    var postToken = function (user, callback) {
        axios.post('/races/token', user)
            .then(function (value) {
                callback.onSuccess(value);
            })
            .catch(function (reason) {
                callback.onFailed(reason);
                console.log(reason);
            })
    }
    
    var createRace = function (callback) {
        axios({
            method: 'put',
            url: '/races',
            headers: {'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJEYW5pZWxhIiwiZXhwIjoxNTQ1MzYzMTQ4fQ.O7Jddjtk2FMNn9gkjkG-5ZKRH275PyLgOz5-1IaCWC8jpY552oTqKpYlSPxGcLJM5Z_fwrO8BUSws86HOHE71w'}
        })
            .then(function (value) {
                console.log(value);
                callback.onSuccess(value);
            })
            .catch(function (reason) {
                callback.onFailed(reason);
                console.log(reason);
            })
    }

    var getProfile = function (user, token, callback) {
        axios({
            method: 'get',
            url: '/profile.html?'+user,
            headers: {'Authorization': 'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJEYW5pZWxhIiwiZXhwIjoxNTQ1MzYzMTQ4fQ.O7Jddjtk2FMNn9gkjkG-5ZKRH275PyLgOz5-1IaCWC8jpY552oTqKpYlSPxGcLJM5Z_fwrO8BUSws86HOHE71w'}
        })
            .then(function (value) {
                console.log(value);
                callback.onSuccess(value);
            })
            .catch(function (reason) {
                callback.onFailed(reason);
                console.log(reason);
            })
    }
    
    
    return {
        putUser:putUser,
        getUser:getUser,
        postUser:postUser,
        login: login,
        postToken: postToken,
        createRace: createRace,
        getProfile: getProfile
    };
})();
 

