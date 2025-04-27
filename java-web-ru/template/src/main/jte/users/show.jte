@import org.example.hexlet.dto.users.UsersPage
@param UsersPage page

<main>
    <h1>Информация о пользователе</h1>
    <p><strong>Имя:</strong> ${page.getFirstName()}</p>
    <p><strong>Фамилия:</strong> ${page.getLastName()}</p>
    <p><strong>Email:</strong> ${page.getEmail()}</p>
    <a href="/users">Вернуться к списку пользователей</a>
</main>