public class PageRandomWords {

    public static void main(String[] args) {
        String[] wordListOne = {"Счастье", "Правильный", "грустный", "Мама", " Папа", "Дом", "Солнце", " Море", " Любовь", "Счастье", "Улыбка", "Дружба", " Осень"};
        String[] wordListYwo = {"Рассвет", "Закат", "Весна", "Зима", "Лето", "Кошка", "Собака", "Дождь", "Ветер", "Цветы", "Дерево"};
        String[] wordListThree = {"Птица", "Радость", "Праздник", "Музыка", "Танец", "Фильм", "Книга", "Спорт", "Путешествие"};

        int oneLength = wordListOne.length;
        int twolength = wordListYwo.length;
        int threelength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twolength);
        int rand3 = (int) (Math.random() * threelength);

        String phrase = wordListOne[rand1] + "   " + wordListThree[rand2] + "    " + wordListYwo[rand3];
        System.out.println("Жизнь зто-" + phrase);
    }
}
