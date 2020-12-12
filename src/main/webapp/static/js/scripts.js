function cargarImplements(url, data, container) {
    $.post(url, data).done(function (data) {
        $(container).html(data);
    });
}

function multipleFiles(container, max) {
    $(container).on("change", function (e) {
        if (this.files.length > max) {
            alert(`Superó el máximo de archivos. Solo se permite cargar ${max} archivo(s).`);
            $(".custom-file-label[for='" + this.id + "']").html("Cargar");
            this.value = null;
        } else {
            var fileName = e.target.files[0].name;
            $(".custom-file-label[for='" + this.id + "']").html(fileName);
        }
    });
}

function SearchTable() {

    var tables = $("table.data-table");
    var container_id = ".table-responsive";

    var table;
    var item;
    var container;

    tables.each(function() {
        table = $(this);
        container = table.closest(container_id);

        if ($(container).find(".container-filtro-table").length === 0) {

            var input_box = $("<div>", {class: 'd-flex justify-content-end mb-3 container-filtro-table'});
            var input_item = $("<input>", {type: 'text', class: 'table-search-input', placeholder: 'Buscar'});
            input_box.append(input_item);

            $(container).prepend(input_box);

            input_item.on('keyup', function() {
                item = $(this);
                search($(item.closest(container_id)).find("table.data-table"), this.value.toUpperCase());
            });
        }
    });

    function search(table, filter) {

        var tr, tds, td;

        tr = table.find("tbody tr");

        var cont;

        for (var i = 0; i < tr.length; i++) {
            cont = 0;
            tds = $(tr[i]).find("td");

            for (var j = 0; j < tds.length; j++) {
                td = $(tds[j]);
                if (td.html().trim().toUpperCase().indexOf(filter) > -1) {
                    cont++;
                }
            }
            if (cont > 0) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}