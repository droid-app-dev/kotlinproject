package com.uniimarket.app.home.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class CategoriesData {

    @SerializedName("status")
    @Expose
    private var status: Boolean? = null
    @SerializedName("message")
    @Expose
    private var message: String? = null
    @SerializedName("data")
    @Expose
    private var data: List<Datum>? = null

    fun getStatus(): Boolean? {
        return status
    }

    fun setStatus(status: Boolean?) {
        this.status = status
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getData(): List<Datum>? {
        return data
    }

    fun setData(data: List<Datum>) {
        this.data = data
    }

    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: String? = null
        @SerializedName("name")
        @Expose
        var name: String? = null
        @SerializedName("status")
        @Expose
        var status: String? = null
        @SerializedName("image")
        @Expose
        var image: String? = null

    }
}