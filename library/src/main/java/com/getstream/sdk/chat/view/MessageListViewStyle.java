package com.getstream.sdk.chat.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.getstream.sdk.chat.R;
import com.getstream.sdk.chat.style.TextStyle;

public class MessageListViewStyle extends BaseStyle {
    private static final String TAG = MessageListViewStyle.class.getSimpleName();

    // Message text
    public TextStyle messageTextMine;
    public TextStyle messageTextTheirs;

    // Message Bubble
    private int messageBubbleDrawableMine;
    private int messageBubbleDrawableTheirs;
    private int messageTopLeftCornerRadiusMine;
    private int messageTopRightCornerRadiusMine;
    private int messageBottomRightCornerRadiusMine;
    private int messageBottomLeftCornerRadiusMine;
    private int messageTopLeftCornerRadiusTheirs;
    private int messageTopRightCornerRadiusTheirs;
    private int messageBottomRightCornerRadiusTheirs;
    private int messageBottomLeftCornerRadiusTheirs;
    private int messageBackgroundColorMine;
    private int messageBackgroundColorTheirs;
    private int messageBorderColorMine;
    private int messageBorderColorTheirs;
    private int messageBorderWidthMine;
    private int messageBorderWidthTheirs;
    // Attachment

    public TextStyle attachmentTitleText;
    public TextStyle attachmentDescriptionText;
    public TextStyle attachmentFileSizeText;

    private int attachmentBackgroundColorMine;
    private int attachmentBackgroundColorTheirs;
    // Reaction
    private boolean reactionEnabled;
    // ReactionView
    private int reactionViewBgDrawable;
    private int reactionViewBgColor;
    private int reactionViewEmojiSize;
    private int reactionViewEmojiMargin;
    // ReactionInput
    private int reactionInputBgColor;
    private int reactionInputEmojiSize;
    private int reactionInputEmojiMargin;

    private boolean threadEnabled;
    private boolean userNameShow;
    private boolean messageDateShow;

    // Date Separator
    public TextStyle dateSeparatorDateText;

    private int dateSeparatorLineColor;
    private int dateSeparatorLineWidth;
    private int dateSeparatorLineDrawable;

    public MessageListViewStyle(Context c, AttributeSet attrs) {
        // parse the attributes
        setContext(c);
        TypedArray a = this.getContext().obtainStyledAttributes(attrs,
                R.styleable.MessageListView, 0, 0);

        // Message Text
        messageTextMine = new TextStyle.Builder(a)
                .size(R.styleable.MessageListView_streamMessageTextSizeMine, getDimension(R.dimen.stream_message_text_font_size))
                .color(R.styleable.MessageListView_streamMessageTextColorMine, Color.BLACK)
                .font(R.styleable.MessageListView_streamMessageTextFontMineAssets, R.styleable.MessageListView_streamMessageTextFontMine)
                .style(R.styleable.MessageListView_streamMessageTextStyleMine, Typeface.NORMAL)
                .build();

        messageTextTheirs = new TextStyle.Builder(a)
                .size( R.styleable.MessageListView_streamMessageTextSizeTheirs, getDimension(R.dimen.stream_message_text_font_size))
                .color(R.styleable.MessageListView_streamMessageTextColorTheirs, Color.BLACK)
                .font(R.styleable.MessageListView_streamMessageTextFontTheirsAssets, R.styleable.MessageListView_streamMessageTextFontTheirs)
                .style(R.styleable.MessageListView_streamMessageTextStyleTheirs, Typeface.NORMAL)
                .build();

        // Message Bubble
        messageBubbleDrawableMine = a.getResourceId(R.styleable.MessageListView_streamMessageBubbleDrawableMine, -1);
        messageBubbleDrawableTheirs = a.getResourceId(R.styleable.MessageListView_streamMessageBubbleDrawableTheirs, -1);

        messageTopLeftCornerRadiusMine = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageTopLeftCornerRadiusMine, getDimension(R.dimen.stream_message_corner_radius1));
        messageTopRightCornerRadiusMine = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageTopRightCornerRadiusMine, getDimension(R.dimen.stream_message_corner_radius1));
        messageBottomRightCornerRadiusMine = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageBottomRightCornerRadiusMine, getDimension(R.dimen.stream_message_corner_radius2));
        messageBottomLeftCornerRadiusMine = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageBottomLeftCornerRadiusMine, getDimension(R.dimen.stream_message_corner_radius1));

        messageTopLeftCornerRadiusTheirs = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageTopLeftCornerRadiusTheirs, getDimension(R.dimen.stream_message_corner_radius1));
        messageTopRightCornerRadiusTheirs = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageTopRightCornerRadiusTheirs, getDimension(R.dimen.stream_message_corner_radius1));
        messageBottomRightCornerRadiusTheirs = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageBottomRightCornerRadiusTheirs, getDimension(R.dimen.stream_message_corner_radius1));
        messageBottomLeftCornerRadiusTheirs = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageBottomLeftCornerRadiusTheirs, getDimension(R.dimen.stream_message_corner_radius2));

        messageBackgroundColorMine = a.getColor(R.styleable.MessageListView_streamMessageBackgroundColorMine, getColor(R.color.stream_message_background_outgoing));
        messageBackgroundColorTheirs = a.getColor(R.styleable.MessageListView_streamMessageBackgroundColorTheirs, getColor(R.color.stream_message_background_incoming));

        messageBorderColorMine = a.getColor(R.styleable.MessageListView_streamMessageBorderColorMine, getColor(R.color.stream_message_stroke));
        messageBorderColorTheirs = a.getColor(R.styleable.MessageListView_streamMessageBorderColorTheirs, getColor(R.color.stream_message_stroke));

        messageBorderWidthMine = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageBorderWidthMine, getDimension(R.dimen.stream_message_stroke));
        messageBorderWidthTheirs = a.getDimensionPixelSize(R.styleable.MessageListView_streamMessageBorderWidthTheirs, getDimension(R.dimen.stream_message_stroke));
        // Attachment
        attachmentTitleText = new TextStyle.Builder(a)
                .size(R.styleable.MessageListView_streamAttachmentTitleTextSizeMine, getDimension(R.dimen.stream_attach_title_text))
                .color(R.styleable.MessageListView_streamAttachmentTitleTextColorMine, getColor(R.color.stream_attach_title_text))
                .font(R.styleable.MessageListView_streamAttachmentTitleTextFontAssets, R.styleable.MessageListView_streamAttachmentTitleTextFont)
                .style(R.styleable.MessageListView_streamAttachmentTitleTextStyleMine, Typeface.BOLD)
                .build();

        attachmentDescriptionText = new TextStyle.Builder(a)
                .size(R.styleable.MessageListView_streamAttachmentDescriptionTextSize, getDimension(R.dimen.stream_attach_description_text))
                .color(R.styleable.MessageListView_streamAttachmentDescriptionTextColor, getColor(R.color.stream_gray_dark))
                .font(R.styleable.MessageListView_streamAttachmentDescriptionTextFontAssets, R.styleable.MessageListView_streamAttachmentDescriptionTextFont)
                .style(R.styleable.MessageListView_streamAttachmentDescriptionTextStyle, Typeface.NORMAL)
                .build();

        attachmentFileSizeText = new TextStyle.Builder(a)
                .size(R.styleable.MessageListView_streamAttachmentFileSizeTextSize, getDimension(R.dimen.stream_attach_file_size_text))
                .color(R.styleable.MessageListView_streamAttachmentFileSizeTextColor, getColor(R.color.stream_gray_dark))
                .font(R.styleable.MessageListView_streamAttachmentFileSizeTextFontAssets, R.styleable.MessageListView_streamAttachmentFileSizeTextFont)
                .style(R.styleable.MessageListView_streamAttachmentFileSizeTextStyle, Typeface.BOLD)
                .build();

        attachmentBackgroundColorMine = a.getColor(R.styleable.MessageListView_streamAttachmentBackgroundColorMine, messageBackgroundColorMine);
        attachmentBackgroundColorTheirs = a.getColor(R.styleable.MessageListView_streamAttachmentBackgroundColorTheirs, messageBackgroundColorTheirs);
        // Reaction
        reactionEnabled = a.getBoolean(R.styleable.MessageListView_streamReactionEnabled, true);

        reactionViewBgDrawable = a.getResourceId(R.styleable.MessageListView_streamrReactionViewBgDrawable, -1);
        reactionViewBgColor = a.getColor(R.styleable.MessageListView_streamReactionViewBgColor, getColor(R.color.stream_reaction_input_background));
        reactionViewEmojiSize = a.getDimensionPixelSize(R.styleable.MessageListView_streamReactionViewEmojiSize, getDimension(R.dimen.stream_reaction_view_emoji_size));
        reactionViewEmojiMargin = a.getDimensionPixelSize(R.styleable.MessageListView_streamReactionViewEmojiMargin, getDimension(R.dimen.stream_reaction_view_emoji_margin));
        // Reaction Dialog
        reactionInputBgColor = a.getColor(R.styleable.MessageListView_streamReactionInputbgColor, getColor(R.color.stream_reaction_input_background));
        reactionInputEmojiSize = a.getDimensionPixelSize(R.styleable.MessageListView_streamReactionInputEmojiSize, getDimension(R.dimen.stream_reaction_input_emoji_size));
        reactionInputEmojiMargin = a.getDimensionPixelSize(R.styleable.MessageListView_streamReactionInputEmojiMargin, getDimension(R.dimen.stream_reaction_input_emoji_margin));

        // Avatar
        avatarWidth = a.getDimensionPixelSize(R.styleable.MessageListView_streamAvatarWidth, getDimension(R.dimen.stream_message_avatar_width));
        avatarHeight = a.getDimensionPixelSize(R.styleable.MessageListView_streamAvatarHeight, getDimension(R.dimen.stream_message_avatar_height));

        avatarBorderWidth = a.getDimensionPixelSize(R.styleable.MessageListView_streamAvatarBorderWidth, getDimension(R.dimen.stream_channel_avatar_border_width));
        avatarBorderColor = a.getColor(R.styleable.MessageListView_streamAvatarBorderColor, Color.WHITE);
        avatarBackGroundColor = a.getColor(R.styleable.MessageListView_streamAvatarBackGroundColor, getColor(R.color.stream_gray_dark));

        avatarInitialText = new TextStyle.Builder(a)
                .size(R.styleable.MessageListView_streamAvatarTextSize, getDimension(R.dimen.stream_channel_initials))
                .color(R.styleable.MessageListView_streamAvatarTextColor, Color.WHITE)
                .font(R.styleable.MessageListView_streamAvatarTextFontAssets, R.styleable.MessageListView_streamAvatarTextFont)
                .style(R.styleable.MessageListView_streamAvatarTextStyle, Typeface.BOLD)
                .build();

        // Read State
        showReadState = a.getBoolean(R.styleable.MessageListView_streamShowReadState, true);
        readStateAvatarWidth = a.getDimensionPixelSize(R.styleable.MessageListView_streamReadStateAvatarWidth, getDimension(R.dimen.stream_read_state_avatar_width));
        readStateAvatarHeight = a.getDimensionPixelSize(R.styleable.MessageListView_streamReadStateAvatarHeight, getDimension(R.dimen.stream_read_state_avatar_height));

        readStateText = new TextStyle.Builder(a)
                .size(R.styleable.MessageListView_streamReadStateTextSize, getDimension(R.dimen.stream_read_state_text_size))
                .color(R.styleable.MessageListView_streamReadStateTextColor, Color.BLACK)
                .font(R.styleable.MessageListView_streamReadStateTextFontAssets, R.styleable.MessageListView_streamReadStateTextFont)
                .style(R.styleable.MessageListView_streamReadStateTextStyle, Typeface.BOLD)
                .build();

        threadEnabled = a.getBoolean(R.styleable.MessageListView_streamThreadEnabled, true);

        dateSeparatorDateText = new TextStyle.Builder(a)
                .size(R.styleable.MessageListView_streamDateSeparatorDateTextSize, getDimension(R.dimen.stream_date_separator_text))
                .color(R.styleable.MessageListView_streamDateSeparatorDateTextColor, getColor(R.color.stream_gray_dark))
                .font(R.styleable.MessageListView_streamDateSeparatorDateTextFontAssets, R.styleable.MessageListView_streamDateSeparatorDateTextFont)
                .style(R.styleable.MessageListView_streamDateSeparatorDateTextStyle, Typeface.BOLD)
                .build();

        dateSeparatorLineWidth = a.getDimensionPixelSize(R.styleable.MessageListView_streamDateSeparatorLineWidth, getDimension(R.dimen.stream_date_separator_line_width));
        dateSeparatorLineColor = a.getColor(R.styleable.MessageListView_streamDateSeparatorLineColor, getColor(R.color.stream_gray_dark));
        dateSeparatorLineDrawable = a.getResourceId(R.styleable.MessageListView_streamDateSeparatorLineDrawable, -1);

        userNameShow = a.getBoolean(R.styleable.MessageListView_streamUserNameShow, true);
        messageDateShow = a.getBoolean(R.styleable.MessageListView_streamMessageDateShow, true);

        a.recycle();
    }

    public int getMessageBubbleDrawable(boolean isMine) {
        return isMine ? messageBubbleDrawableMine : messageBubbleDrawableTheirs;
    }

    public int getMessageTopLeftCornerRadius(boolean isMine) {
        return isMine ? messageTopLeftCornerRadiusMine : messageTopLeftCornerRadiusTheirs;
    }

    public int getMessageTopRightCornerRadius(boolean isMine) {
        return isMine ? messageTopRightCornerRadiusMine : messageTopRightCornerRadiusTheirs;
    }

    public int getMessageBottomRightCornerRadius(boolean isMine) {
        return isMine ? messageBottomRightCornerRadiusMine : messageBottomRightCornerRadiusTheirs;
    }

    public int getMessageBottomLeftCornerRadius(boolean isMine) {
        return isMine ? messageBottomLeftCornerRadiusMine : messageBottomLeftCornerRadiusTheirs;
    }

    public int getMessageBackgroundColor(boolean isMine) {
        return isMine ? messageBackgroundColorMine : messageBackgroundColorTheirs;
    }


    public int getMessageBorderColor(boolean isMine) {
        return isMine ? messageBorderColorMine : messageBorderColorTheirs;
    }

    public int getMessageBorderWidth(boolean isMine) {
        return isMine ? messageBorderWidthMine : messageBorderWidthTheirs;
    }

    // Attachment


    public int getAttachmentBackgroundColor(boolean isMine) {
        return isMine ? attachmentBackgroundColorMine : attachmentBackgroundColorTheirs;
    }
    // Reaction Dialog
    public boolean isReactionEnabled() {
        return reactionEnabled;
    }

    public int getReactionViewBgDrawable() {
        return reactionViewBgDrawable;
    }

    public int getReactionViewBgColor() {
        return reactionViewBgColor;
    }

    public int getReactionViewEmojiSize() {
        return reactionViewEmojiSize;
    }

    public int getReactionViewEmojiMargin() {
        return reactionViewEmojiMargin;
    }

    public int getReactionInputBgColor() {
        return reactionInputBgColor;
    }

    public int getReactionInputEmojiSize() {
        return reactionInputEmojiSize;
    }

    public int getReactionInputEmojiMargin() {
        return reactionInputEmojiMargin;
    }


    public boolean isThreadEnabled() {
        return threadEnabled;
    }


    // Date Separator

    public int getDateSeparatorLineColor() {
        return dateSeparatorLineColor;
    }

    public int getDateSeparatorLineWidth() {
        return dateSeparatorLineWidth;
    }

    public int getDateSeparatorLineDrawable() {
        return dateSeparatorLineDrawable;
    }

    public boolean isUserNameShow() {
        return userNameShow;
    }

    public boolean isMessageDateShow() {
        return messageDateShow;
    }
}