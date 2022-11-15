class GenericAddition<T> {
    public T addition(T one, T two) {
        if (one.getClass() == Integer.class) {
            return (T) (Integer) ((Integer) one + (Integer) two);
        }
        if (one.getClass() == Float.class) {
            return (T) (Float) ((Float) one + (Float) two);
        }
        if (one.getClass() == String.class) {
            return (T) (String) ((String) one + (String) two);
        }

        return (T) (String) "Not a integer, Float or String";
    }
}

class Main{

    public static void main(String[] args)
    {
        GenericAddition<Integer> mainInt = new GenericAddition<>();
        GenericAddition<Float> mainFloat = new GenericAddition<>();
        GenericAddition<String> mainString = new GenericAddition<>();
        GenericAddition<Double> mainDouble = new GenericAddition<>();
        System.out.println(mainInt.addition(1,3));
        System.out.println(mainString.addition("Hello","Dinesh"));
        System.out.println(mainFloat.addition(1.0f,3.0f));
        System.out.println(mainDouble.addition(1.0,3.0));
    }
}

