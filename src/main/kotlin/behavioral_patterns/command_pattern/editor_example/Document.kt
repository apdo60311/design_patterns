package behavioral_patterns.command_pattern.editor_example

import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

class Document {
    private var content: StringBuilder = StringBuilder()

    fun insertText(text: String, position: Int) {
        content.insert(position, text)
    }

    fun deleteText(position: Int, length: Int) {
        content.delete(position, position + length)
    }

    fun replaceText(text: String, position: Int) {
        content.replace(position, position + text.length + 1, text)
    }

    fun replaceWholeText(text : String) {
        content.replace(0 , content.length , text);
    }

    fun getText(position: Int = 0, length: Int = content.length): String {
        return content.substring(position, position + length)
    }

    fun copyToClipboard(position: Int = 0, length: Int = content.length) {
        val clipboard = Toolkit.getDefaultToolkit().systemClipboard
        val stringSelection = StringSelection(getText(position, length))
        clipboard.setContents(stringSelection, null)
    }

    fun clearClipboard() {
        val clipboard = Toolkit.getDefaultToolkit().systemClipboard
        clipboard.setContents(StringSelection(""), null)
    }
}