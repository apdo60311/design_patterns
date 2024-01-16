package behavioral_patterns.command_pattern.editor_example

class InsertTextCommand(private val text: String, private val document: Document, private val position: Int) :
    EditorCommand {
    private var previousText: String = ""

    override fun execute() {
        previousText = document.getText()
        document.insertText(text, position)
    }

    override fun undo() {
        // document.deleteText(position , text.length)
        document.replaceWholeText(previousText);
    }

}