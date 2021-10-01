package com.example.apipractice.json

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ItemData(
    @SerializedName("DESC_KOR")
    val name: String,//음식 이름
    @SerializedName("SERVING_WT")
    val servingSize: String,//1회제공량 (g)
    @SerializedName("NUTR_CONT1")
    val kcal: String,//열량 (kcal)
    @SerializedName("NUTR_CONT2")
    val carbohydrate: String,//탄수화물 (g)
    @SerializedName("NUTR_CONT3")
    val protein: String,//단백질 (g)
    @SerializedName("NUTR_CONT4")
    val fat: String,//지방 (g)
    @SerializedName("NUTR_CONT5")
    val sugars: String,//당류 (g)
    @SerializedName("NUTR_CONT6")
    val Natrium: String,//나트륨 (mg)
    @SerializedName("NUTR_CONT7")
    val cholesterol: String,//콜레스테롤 (mg)
    @SerializedName("NUTR_CONT8")
    val fattyAcid: String,//포화지방산 (g)
    @SerializedName("NUTR_CONT9")
    val transFattyAcid: String,//트랜스지방산 (g)
    @SerializedName("BGN_YEAR")
    val constructionYear: String,//구축년도
    @SerializedName("ANIMAL_PLANT")
    val animalPlant: String
) : Serializable {

}