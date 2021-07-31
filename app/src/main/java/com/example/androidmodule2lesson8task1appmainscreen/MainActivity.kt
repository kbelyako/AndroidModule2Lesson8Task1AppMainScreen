package com.example.androidmodule2lesson8task1appmainscreen

/*
ДЗ. Задание 1. Среднее
Разработать главный экран приложения по самым высоким требованиям к интерфейсу,
которые вы сможете выполнить. Задействуйте по мере необходимости Фотошоп, графику из
интернета, ну и, естественно, возможности XML.
Тема приложения – любая, но вот пара вариантов на всякий случай:
1) Визитка яхт-клуба
2) Автосалон
3) Аренда жилья
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}