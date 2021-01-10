/*
 * Copyright (C) 2020. Maximilian Keppeler (https://www.maxkeppeler.com)
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
 */

@file:Suppress("unused")

package com.maxkeppeler.bottomsheets.core

import android.widget.ImageView
import java.io.Serializable

/**
 * A class that holds general image view settings.
 */
abstract class ImageSource : Serializable {

    var scaleType: ImageView.ScaleType? = null
        internal set

    var ratio: Ratio? = null
        internal set

    /**
     * A class used to receive an aspect ratio.
     */
    data class Ratio(val width: Int, val height: Int) : Serializable {
        val dimensionRatio: String = "$width:$height"
    }
}