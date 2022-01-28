package com.guru2_android.guru2_app.dateDecorator

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.text.style.ForegroundColorSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.DayViewDecorator
import com.prolificinteractive.materialcalendarview.DayViewFacade

class TodayDecorator (context: Context): DayViewDecorator {
    private var date = CalendarDay.today()
    // val drawable = context.resources.getDrawable(R.drawable.today)
    override fun shouldDecorate(day: CalendarDay?): Boolean {
        return day?.equals(date)!!
    }
    override fun decorate(view: DayViewFacade?) {
        //오늘날짜 주황색으로 굵게 표시하기
        view?.addSpan(StyleSpan(Typeface.BOLD))
        //view?.addSpan(RelativeSizeSpan(1.4f))
        view?.addSpan(ForegroundColorSpan(Color.parseColor("#FEA819")))
    }
}