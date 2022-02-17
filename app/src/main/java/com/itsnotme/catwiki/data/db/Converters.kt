package com.itsnotme.catwiki.data.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

class Converters {
    private val gson = Gson()

    @TypeConverter
    fun fromStringToList(value: String): List<String> {
        val listType = object : TypeToken<ArrayList<String>>() {}.type
        return gson.fromJson(value, listType)
    }

    @TypeConverter
    fun fromListToString(list: List<String>): String = gson.toJson(list)
}