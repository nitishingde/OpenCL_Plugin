package org.intellij.sdk.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.*

class OpenclFileType() : LanguageFileType(OpenclLanguage.instance) {
    val instance: OpenclFileType = OpenclFileType()

    override fun getName(): String {
        return "OpenCL File"
    }

    override fun getDescription(): String {
        return "OpenCL language file"
    }

    override fun getDefaultExtension(): String {
        return "cl"
    }

    override fun getIcon(): Icon {
        return OpenclIcon.icon
    }
}