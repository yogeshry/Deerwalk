%{--<pre>--}%
    %{--${xmlstring.encodeAsHTML()}--}%
%{--</pre>--}%
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<body>
%{--<g:each status="i" in="${itemList}" var="item">--}%

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Link</th>

        </tr>
        <tr>
            <td>"${id}"</td>
            <td>"${name}"</td>
            <td>"${link}"</td>
        </tr>
    </table>
    <br/>
    <table>
        <tr>
            <th>Book</th>
            <th>Ratings</th>
        </tr>
    <g:each   in="${books}">
         <tr>
            <td>${it.name}</td>
            <td>${it.isbn}</td>
        </tr>
    </g:each>

        </table>
    </body>

