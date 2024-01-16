package behavioral_patterns.command_pattern.editor_example

class CutCommand(private val document: Document, private val position: Int, private val length: Int) : EditorCommand {
    override fun execute() {
        document.copyToClipboard(position,length)
        document.deleteText(position, length)
    }

    override fun undo() {
        document.clearClipboard()
    }
}