@import org.example.hexlet.dto.UsersPage
@param UsersPage page

<html>
<table>
    <head>
        <tr>
            <th>Имя</th>
            <th>Email</th>
            <th>Просмотр</th>
        </tr>
    </head>
    <body>
        @for(UserPage user : page.getUsers())
        <tr>
            <td>&{user.getFirstName()}</td>
            <td>${user.getLastName()}</td>
            <td>${user.getEmail()}</td>
            <td><a href="/users/${user.getId()}">Просмотр</a></td>
        </tr>
        @endfor
    </body>
</table>
</html>