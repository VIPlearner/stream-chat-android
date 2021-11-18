package io.getstream.chat.android.compose.state.messages.list

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import io.getstream.chat.android.common.state.MessageAction
import io.getstream.chat.android.compose.ui.theme.ChatTheme

/**
 * UI representation of a Message option, when the user selects a message in the list.
 *
 * @param title The title to represent the action.
 * @param titleColor The color of the title text.
 * @param iconPainter The icon to represent the action.
 * @param iconColor The color of the icon.
 * @param action The [MessageAction] the option represents.
 */

public class MessageOption(
    @StringRes public val title: Int,
    public val titleColor: Color,
    public val iconPainter: Painter,
    public val iconColor: Color,
    public val action: MessageAction,
)

/**
 * Wraps the given information in a data holder that helps us render message options.
 *
 * @param title The title that represents this message option.
 * @param iconPainter The image that represents this message option.
 * @param action The action that we run when the option is selected.
 *
 * @return [MessageOption] That is shown in the UI.
 */
@Composable
public fun buildMessageOption(
    @StringRes title: Int,
    iconPainter: Painter,
    action: MessageAction,
): MessageOption {
    return MessageOption(
        title = title,
        iconPainter = iconPainter,
        action = action,
        titleColor = ChatTheme.colors.textHighEmphasis,
        iconColor = ChatTheme.colors.textLowEmphasis,
    )
}
