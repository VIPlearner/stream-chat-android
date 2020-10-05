package com.getstream.sdk.chat.model

import android.net.Uri
import com.getstream.sdk.chat.utils.Utils
import io.getstream.chat.android.client.models.Attachment
import java.io.File

data class AttachmentMetaData(
    var uri: Uri? = null,
    var type: String? = null,
    var mimeType: String? = null,
    var title: String? = null,
    var file: File? = null
) {
    var size: Long = 0
    var isSelected = false
    var videoLength: Long = 0

    constructor(attachment: Attachment) : this(
        type = attachment.type,
        mimeType = attachment.mimeType,
        title = attachment.title
    )

    constructor(file: File) : this(
        file = file,
        uri = Uri.fromFile(file),
        mimeType = Utils.getMimeType(file)
    )
}
