package com.oneclickaway.opensource.placeautocomplete.data.model.room

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 *@author Burhan ud din ---> item table
 */
@Parcelize
@Entity(tableName = "SearchSelectedItem")
data class SearchSelectedItem(
    @PrimaryKey var placeId: String,
    var locationName: String,
    var locationAddress: String,
    var searchCurrentMilliseconds: Long,
    var lat: Double? = 0.0,
    var lon: Double? = 0.0
) : Parcelable