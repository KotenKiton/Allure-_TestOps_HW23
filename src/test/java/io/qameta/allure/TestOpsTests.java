package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class TestOpsTests {

    @Test
    @AllureId("12211")
    @DisplayName("Авторизация_HW")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Owner("allure8")
    @Feature("Авторизация_HW")
    public void PersonalAccountTest () {
        step("Открыть главную страницу");
        step("Нажать кнопку Личный кабинет");
        step("Заполнить поле Логин");
        step("Заполнить поле Пароль");
        step("Нажать кнопку Войти");
        step("Разлогиниться");
    }

    @Test
    @AllureId("12219")
    @DisplayName("Авторизация_HW_Через_Yandex")
    @Tags({@Tag("major"), @Tag("web")})
    @Owner("allure8")
    @Feature("Авторизация_HW")
    public void PersonalAccountYandex () {
        step("Открыть главную страницу ");
        step("Нажать на кнопку Войти через Яндекс аккаунт");
        step("Ввести данные яндекс почты random@yandex.ru");
        step("Нажать кнопку  Войти ");
        step("Разлогиниться");
    }

    @Test
    @AllureId("12220")
    @DisplayName("Авторизация через Apple_HW")
    @Tag("web")
    @Owner("allure8")
    @Feature("Авторизация_HW")
    public void PersonalAccountApple() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Apple аккаунт");
        step("Авторизуемся как пользователь KotenKiton", () -> {
            step("Вводим логин Koten");
            step("Вводим пароль Kiton123");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Apple аккаунта.", () -> {
            step("Имя - KotenKiton");
            step("Логин - Koten");
        });
        step("Разлогиниться");
    }
}