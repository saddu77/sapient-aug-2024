package javacollections;

class Task<T>{
    T obj;
    Task(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Task<String> obj1 = new Task<String>("Scanning");
        System.out.println(obj1.getObject());

        Task<Integer> obj2 = new Task<Integer>(101);
        System.out.println(obj2.getObject());
    }
}
