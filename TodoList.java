package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> buy = new ArrayList<>() {{
    }};

    public void add(String todo) {
        buy.add(todo);
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index <= buy.size() - 1) {
            buy.add(index, todo);
            // TODO: добавьте дело на указаный индекс,
            //  проверьте возможность добавления
        } else {
            buy.add(todo);
        }
    }

    public void edit(int index, String todo) {
        if (index <= buy.size() - 1) {
            buy.set(index, todo);
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index <= buy.size() - 1) {
            System.out.println("Дело " + buy.get(index) + " удалено");
            buy.remove(index);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    // TODO: удалить дело находящееся по переданному индексу,
    //  проверьте возможность удаления дела
    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return buy;
    }
}