package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AuthTest {

    @Test
    @AllureId("12199")
    @DisplayName("Авторизация через Google")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Owner("allure8")
    public void testGoogleAuth() {
        step("Открываем главную страницу
                ");
                step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google
                ");
                step("Авторизуемся как пользователь Artem Eroshenko", () -> {
                    step("Вводим логин eroshenkoam@gmail.com");
                    step("Вводим пароль 12398123981231
                            ");
                            step("4.3 Нажимаем кнопку Войти");
                });
        step("Должны оказаться на главной странице сайта ");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Имя Artem Eroshenko");
            step("Login eroshenkoam");
            step("Аватарка ");
        });
        step("Разлогиниваемся");
    }
}
