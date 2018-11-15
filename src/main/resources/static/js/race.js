var myGamePiece;

var Game = (function () {

    var i = 0;
    var laps=0;
    var speed = 0.02;
    var startGame = function() {
        myGamePiece = new component(5, "red", 10, 120);
        myGameArea.start();
    };

    var myGameArea = {
        canvas : document.createElement("canvas"),
        start : function() {
            this.canvas.width = 480;
            this.canvas.height = 270;
            this.context = this.canvas.getContext("2d");
            document.body.insertBefore(this.canvas, document.body.childNodes[0]);
            this.interval = setInterval(updateGameArea, 20);
        },
        clear : function() {
            this.context.clearRect(0, 0, this.canvas.width, this.canvas.height);
        }
    };

    var component = function(r, color, x, y) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.update = function() {
            ctx = myGameArea.context;
            // ctx.fillStyle = color;
            ctx.beginPath();
            ctx.arc(this.x, this.y, this.r, 0, 2 * Math.PI);
            ctx.strokeStyle = "red";
            ctx.stroke();
            ctx.fillStyle = "red";
            ctx.fill();
            // ctx.fillRect(this.x, this.y, this.width, this.height);
        };
        this.newPos = function() {
            this.x = 240 - (200 * Math.cos(i));
            this.y = 135 + (100 * Math.sin(i));
            
            // console.log("x: " + (240 - (200 * Math.cos(i) )));
            // console.log("y: " + (135 + (100 * Math.sin(i))));
            i += speed;
            if(i >= 2*Math.PI) {
                i = 0;
                laps+=1;
                
            }
            rounds(this.x,this.y);
        }
    };
    
    var rounds = function(x,y){
        if(laps==4){
            speed=0;
            myGameArea.clear();
            "alert("Finish!!!\nYou have win the race");"
        }
    }

    var updateGameArea = function() {
        myGameArea.clear();
        myGamePiece.newPos();
        myGamePiece.update();
        if (speed == 0) {
            clearInterval(myGameArea.interval);
            document.getElementById("conserveButton").setAttribute("disabled","true");
            document.getElementById("balancedButton").setAttribute("disabled","true");
            document.getElementById("pressDownButton").setAttribute("disabled","true");
        }
    };

    var changeSpeed = function (spd) {
        speed = spd;
    };

    return {
        startGame:startGame,
        changeSpeed:changeSpeed
    }
})();
