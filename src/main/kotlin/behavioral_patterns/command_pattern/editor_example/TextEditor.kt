package behavioral_patterns.command_pattern.editor_example

class TextEditor(private val document: Document = Document()) {
    private val history = mutableListOf<EditorCommand>()
    private var historyIndex = -1

    fun executeCommand(command: EditorCommand) {
        command.execute()

        if (historyIndex < history.size - 1) {
            history.subList(historyIndex + 1, history.size).clear()
        }

        history.add(command)
        historyIndex++
    }

    fun undo() {
        if (historyIndex >= 0) {
            history[historyIndex].undo()
            historyIndex--
        }
    }

    fun redo() {
        if (historyIndex < history.size - 1) {
            historyIndex++
            history[historyIndex].execute()
        }
    }

    fun displayContent() {
        println(document.getText())
    }
}