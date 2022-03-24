/*
 * Copyright (C) 2022. dvt.co.za
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dvttest.hiweather.data.respositories

import com.dvttest.hiweather.data.db.entities.Favorite
import kotlinx.coroutines.flow.Flow

interface FavoritesRepository {
    fun getLocations(): Flow<List<Favorite>>
    suspend fun saveLocation(params: Favorite)
    suspend fun updateLocation(params: Favorite): Any
    suspend fun deleteLocations()
    suspend fun deleteLocation(id: Int)
    suspend fun deleteLocation(isCurrentWeather: Boolean)
}
