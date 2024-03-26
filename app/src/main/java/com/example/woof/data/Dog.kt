/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: String,
    @StringRes val hobbies: Int,
    @StringRes val Address: Int,
    @StringRes val Email: Int,
    @StringRes val Tel: Int,
    @StringRes val ID: Int
)

val dogs = listOf(
    Dog(R.drawable.photo1, R.string.dog_name_1, "Uria@exam.com", R.string.dog_description_1,R.string.Address1,R.string.Email1,R.string.Tel1,R.string.ID1),
    Dog(R.drawable.photo2, R.string.dog_name_2, "Einstein@exam.com", R.string.dog_description_2,R.string.Address2,R.string.Email2,R.string.Tel2,R.string.ID2),
    Dog(R.drawable.photo3, R.string.dog_name_3, "Behrensmeyer@exam.com", R.string.dog_description_3,R.string.Address3,R.string.Email3,R.string.Tel3,R.string.ID),
    Dog(R.drawable.photo4, R.string.dog_name_4, "Pascal@exam.com", R.string.dog_description_4,R.string.Address4,R.string.Email4,R.string.Tel4,R.string.ID),
    Dog(R.drawable.photo5, R.string.dog_name_5, "Herschel@exam.com", R.string.dog_description_5,R.string.Address5,R.string.Email5,R.string.Tel5,R.string.ID),
    Dog(R.drawable.photo6, R.string.dog_name_6, "Hubble@exam.com", R.string.dog_description_6,R.string.Address6,R.string.Email6,R.string.Tel6,R.string.ID),
    Dog(R.drawable.photo7, R.string.dog_name_7, "Wu@exam.com", R.string.dog_description_7,R.string.Address7,R.string.Email7,R.string.Tel7,R.string.ID),
    Dog(R.drawable.photo8, R.string.dog_name_8, "Hodgkin@exam.com", R.string.dog_description_8,R.string.Address8,R.string.Email8,R.string.Tel8,R.string.ID),
    Dog(R.drawable.photo9, R.string.dog_name_9, "Halley@exam.com", R.string.dog_description_9,R.string.Address9,R.string.Email9,R.string.Tel9,R.string.ID),

)

