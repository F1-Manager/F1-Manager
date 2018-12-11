var Stetic = (function () {

    var changeColor  = function (event) {
        console.log(event);
        var selected = document.getElementsByClassName("btn-primary")[0];
        var selection = event.srcElement;
        selected.classList.remove("btn-primary");
        selection.classList.add("btn-primary");
    };

    return {
        changeColor:changeColor
    }

})();