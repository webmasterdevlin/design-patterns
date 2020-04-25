package pro.devlinduldulao.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
