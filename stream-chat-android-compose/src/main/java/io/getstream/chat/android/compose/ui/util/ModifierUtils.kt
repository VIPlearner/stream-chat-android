/*
 * Copyright (c) 2014-2024 Stream.io Inc. All rights reserved.
 *
 * Licensed under the Stream License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://github.com/GetStream/stream-chat-android/blob/main/LICENSE
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getstream.chat.android.compose.ui.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import io.getstream.chat.android.compose.ui.theme.ComponentPadding
import io.getstream.chat.android.compose.ui.theme.ComponentSize
import androidx.compose.foundation.layout.size as composeSize

/**
 * Adds padding to the modifier.
 */
internal fun Modifier.padding(padding: ComponentPadding): Modifier {
    return this.padding(
        start = padding.start,
        top = padding.top,
        end = padding.end,
        bottom = padding.bottom,
    )
}

/**
 * Adds size to the modifier.
 */
internal fun Modifier.size(size: ComponentSize): Modifier = when {
    size.width == Dp.Infinity && size.height == Dp.Infinity -> this.fillMaxSize()
    size.width == Dp.Infinity -> this.fillMaxWidth().height(size.height)
    size.height == Dp.Infinity -> this.fillMaxSize().width(size.width)
    size.width == Dp.Unspecified -> this.height(size.height)
    size.height == Dp.Unspecified -> this.width(size.width)
    else -> this.composeSize(width = size.width, height = size.height)
}
