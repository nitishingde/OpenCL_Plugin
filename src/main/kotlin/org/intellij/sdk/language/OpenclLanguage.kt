package org.intellij.sdk.language

import com.intellij.lang.Language;

class OpenclLanguage: Language("OpenCL") {
    companion object {
        val instance: OpenclLanguage = OpenclLanguage()
    }
}