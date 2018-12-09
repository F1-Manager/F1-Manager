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
            alert('Finish!!!\nYou have win the race');
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

    var changeColor  = function (event) {
        console.log(event);
        var selected = document.getElementsByClassName("btn-primary")[0];
        var selection = event.srcElement;
        selected.classList.remove("btn-primary");
        selection.classList.add("btn-primary");
    };

    var hide = function (id) {
        var container = document.getElementById(id);
        if(container.hasAttribute("hidden")) {
            container.removeAttribute("hidden");
        } else {
            container.setAttribute("hidden", "true");
        }
    };
    
    var connectAndSubscribe = function (topic) {
        
        console.info('Connecting to WS...');
        var socket = new SockJS('/stompendpoint');
        stompClient = Stomp.over(socket);
        
        //subscribe to /topic/TOPICXX when connections succeed
        stompClient.connect({}, function (frame) {
            console.log('Connected: ' + frame);
            
            stompClient.subscribe('/topic/newpoint'+topic, function (eventbody) {
                var theObject=JSON.parse(eventbody.body);
                //alert("Nuevo punto: "+theObject.x+" "+theObject.y);
                addPointToCanvas(new Point(theObject.x,theObject.y));
            });
            stompClient.subscribe('/topic/newpolygon'+topic, function (eventbody) {
                var theObject=JSON.parse(eventbody.body);
                //alert("Nuevo polygon: "+theObject[3].x+" "+theObject[3].y);
                addPolygonToCanvas(theObject);
            });
        });

    };
    
    
    var table = function(){
        // Crea un elemento <table> y un elemento <tbody>
        var tabla   = document.getElementById("info");
        // $("#info tbody").html('');
       // console.log(tabla.childNodes);
       if(document.getElementById("tblBody") != null) {
           tabla.removeChild(document.getElementById("tblBody"));
       }
        var tblBody = document.createElement("tbody");
       tblBody.setAttribute("id","tblBody");
        // Crea las celdas
        for (var i = 0; i < 2; i++) {
          // Crea las hileras de la tabla
            var hilera = document.createElement("tr");
            
            var celda = document.createElement("td");
            var posicion = document.createTextNode("1");
            celda.appendChild(posicion);
            hilera.appendChild(celda);
            
            var cell2 = document.createElement("td");
            var piloto = document.createTextNode("sebastian");
            cell2.appendChild(piloto);
            hilera.appendChild(cell2);
            
            var cell = document.createElement("td");
            var llanta = document.createTextNode("mojada");
            cell.appendChild(llanta);
            hilera.appendChild(cell);
            
            var cell3 = document.createElement("td");
            var diferencia = document.createTextNode("5");
            cell3.appendChild(diferencia);
            hilera.appendChild(cell3);

          // agrega la hilera al final de la tabla (al final del elemento tblbody)
          tblBody.appendChild(hilera);
        }

        // posiciona el <tbody> debajo del elemento <table>
       tabla.appendChild(tblBody);

        // modifica el atributo "border" de la tabla y lo fija a "2";
        tabla.setAttribute("border", "2");
//        var tb = document.getElementById("info");
//        for (var r = 0; r < 2; r++) {
//                var row = document.createElement("tr");

                 // create cells in row
                 //document.createTextNode(Math.floor(Math.random() * (10 - 1 + 1)) + 1);
//                var columna = document.createElement("td");
//                var posicion = r;
//                var piloto = "Sebastian"
//                var llantas= "malvadisco"
//                var diferencia="4"
//                columna.appendChild(posicion,piloto,llantas,diferencia);
//                row.appendChild(columna);
//
//            tb.appendChild(row); // add the row to the end of the table body
        
    }
    return {
        startGame:startGame,
        changeSpeed:changeSpeed,
        changeColor:changeColor,
        hide:hide,
        table:table
    }
})();
