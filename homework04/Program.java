public class Program {
    public static void main(String[] args) {
        
        ArrayListClass<Integer> intList = new ArrayListClass<>();
        intList.add(11); // добавление элемента
        intList.add(55);
        intList.add(33);
        intList.add(44);
        intList.add(22);
       
        intList.printArray(); // печать масива
        intList.remForIdx(2); // удаление элемента по индексу
        intList.printArray();
        intList.removeData(22); // удаление элемента по значению
        intList.printArray();
        System.out.println(intList.minData()); // Поиск минимального значения
        System.out.println(intList.maxData()); // Поиск максимального значения
        System.out.println(intList.sumData()); // Сумма элементов массива
        System.out.println(intList.multData()); // Произведение элементов массива
        System.out.println(intList.findIDX(1)); // Поиск элемента по индексу (если его нет то возвращает -1)
        System.out.println(intList.findData(26)); // Проверка наличия элемента в массиве. Возвращает true, если элемент
                                                   // в массиве есть, false – нет.
        try {
            intList.BubbleSort();
            System.out.print("Результат:"); // Пузырьковая сортировка
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}