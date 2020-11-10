public class Test {

    @Todo(priority = Todo.Priority.MEDIUM, author = "Yashwant", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
   //Some business logic is written
   //But it’s not complete yet
    }

    @Override
    public String toString() {
        return "This is String Representation of current object.";
    }
}
