package behavioral_patterns.command_pattern.editor_example

class DeleteTextCommand(private val document: Document, private val position: Int, private val length: Int) :
    EditorCommand {
    private var deletedText: String = ""

    override fun execute() {
        deletedText = document.getText(position, length)
        document.deleteText(position, length)
    }

    override fun undo() {
        document.insertText(deletedText, position)
    }
}