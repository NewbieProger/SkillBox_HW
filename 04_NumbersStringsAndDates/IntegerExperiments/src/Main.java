public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;


        //Нужно создать объект, если метод не статичный
//        Main main = new Main();
//        System.out.println(main.sumDigits(321));

        System.out.println(sumDigits(container.count)); //Если я сделал метод статичным в другом классе одного пекеджа
    }

    public static Integer sumDigits(Integer number) { //1. Сделал статичным, потому что идея так сказала. Видимо, чтобы я смог его вызвать без создания объекта?
        String str = number.toString(); //Тут создаем объект "Строка", обращаемся к передаваемому number (а он, в свою очередь, является объектом, т.к. является Integer'om, и превращаем в строку
        int sum = 0; //Просто переменную сделали, чтобы было , что заполнить и к чему обратиться
        for (int x = 0; x < str.length(); x++) { //Инициализация переменной x, чтобы было от чего считать и она же является индексом строки; Индекс меньше длины строки; Увеличиваем индекс строки
            sum += Character.getNumericValue(str.charAt(x)); //Приобразовал из этого "Integer.parseInt(String.valueOf(str.charAt(x)));"
//            int a = Integer.parseInt(Integer.toString(str.charAt(x)));
            /*(изнутри во вне расписываю):
            * у строки ищем символ по индексу
            * Вызывая метод charAt возвращается значение char и этот символ становится типом char, и сначала я написал просто "int a = Integer.parseInt(str.charAt(x));",
            * а ИДЕЯ сказал обернуть в valueOf, потому что parseInt принимает string, а не char
            *
            * P. S.: Хотел обернуть в toString(), но у нас статик метод (потом сделал объект Main'a , но у меня начала херота передаваться, а не те цифры, что там есть
            *
            * Потом, через оператор "+=" складываем сумму цифр
            * */


        }

        return sum; //Возвращаем сумму
    }

}
