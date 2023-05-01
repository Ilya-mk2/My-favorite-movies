package com.ilwit.mytrainingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilwit.mytrainingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var mAct: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mAct = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mAct.root)



        mAct.button1.setOnClickListener {
            goNextAct("Action_movie")

        }
        mAct.button2.setOnClickListener {
            goNextAct("Comedy")
        }
        mAct.button3.setOnClickListener {
            goNextAct("Drama")
        }
        mAct.button4.setOnClickListener {
            goNextAct("Trillers")
        }

    }

    //val trillers =resources.getStringArray(R.array.trillers)

    companion object {
        val films = mapOf(
            "Drama" to arrayOf(
                Film("Если только", "Джил Джангер", 2004),
                Film("В погоне за счастьем", "Габриэле Муччино", 2006),
                Film("7 жизней", "Габриэле Муччино", 2008),
                Film("Игры разума", "Рон Ховард", 2001),
                Film("Общество мертвых поэтов", "Питер Уир", 1989),
                Film("Проект Флорида", "Шон Бэйкер", 2017),
                Film("Возвращение", "Андрей Звягинцев", 2003),
                Film("Внутри Льюина Дэвиса", "Джоэл и Итан Коэны", 2013),
                Film("Пианист", "Роман Полански", 2002),
                Film("Реквием по мечте", "Даррен Аронофски", 2000)
            ),
            "Comedy" to arrayOf(
                Film("Евротур", "Джефф Шеффер и др.", 2004),
                Film("Американский пирог", "Пол Вайц", 1999),
                Film("ДМБ", "Роман Качанов", 2000),
                Film("Быстрее пули", "ДЭвид Литч", 2022),
                Film("Славные парни", "Шейн Блэк", 2016),
                Film("Борат", "Ларри Чарльз", 2006),
                Film("Мы - Миллеры", "Роусон Маршалл Тёрбер", 2013),
                Film("Впритык", "Тодд Филлипс", 2010),
                Film("Всегда говори - ДА", "Пейтон Рид", 2008),
                Film("Крутой парень", "Эд Дектер", 2002)
            ),
            "Trillers" to arrayOf(
                Film("Семь", "dsd", 1995),
                Film("Старикам тут не место", "cvx", 2007),
                Film("Убийца","Дени Вильнёв", 2015),
                Film("Апгрейд", "Ли Уоннелл", 2018),
                Film("Помни", "Кристофер Нолан", 2000),
                Film("Исчезнувшая", "Дэвид Финчер", 2014),
                Film("Константин", "Фрэнсис Лоуренс", 2005),
                Film("Три дня на побег", "Пол Хаггис", 2010),
                Film("Исходный код", "Данкас Джонс", 2011),
                Film("Законопослушный гражданин", "Ф. Гэри Грей", 2009),
                Film("Начало", "Кристофер Нолан", 2010)
            ),
            "Action_movie" to arrayOf(
                Film("Крепкий орешек", "Джон Мактирнан", 1988),
                Film("Час пик", "Бретт Ратнер", 1998),
                Film("13 район", "Пьер Морель", 2004),
                Film("Пьяный мастер", "Юэнь У-Пин", 1978),
                Film("Терминатор 2", "Джеймс Кэмерон", 1991),
                Film("Леон", "Люк Бессон", 1994),
                Film("Васаби", "Жерар Кравчик", 2001),
                Film("Двойной удар", "Шелдон Леттич", 1991),
                Film("Кровавый спорт", "Ньют Арнольд", 1988),
                Film("Доспехи бога", "Рэймонд Чоу", 1986),
                Film("Разборка в Бронксе", "Стэнли Тонг", 1995),
                Film("Рейд", "Гарет Эванс", 2011)
            )
        )
    }


    fun goNextAct(st: String) {
        val i = Intent(this, ListFilmActivity::class.java)
        i.putExtra(ListFilmActivity.STATE_KEY, FilmState(st, films.getValue(st).toList()))
        startActivity(i)

    }


}