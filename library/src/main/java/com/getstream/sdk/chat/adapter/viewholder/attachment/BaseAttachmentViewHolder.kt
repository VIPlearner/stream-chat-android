package com.getstream.sdk.chat.adapter.viewholder.attachment

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.getstream.sdk.chat.adapter.AttachmentListItem

abstract class BaseAttachmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(attachmentListItem: AttachmentListItem)

    protected val context: Context
        get() = itemView.context
}
