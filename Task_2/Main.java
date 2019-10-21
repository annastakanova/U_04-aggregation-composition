package by.epam.Unit04;
//Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sentence sentence = new Sentence();
        sentence.addWord(new Word("Создать объект класса текст,"));
        sentence.addWord(new Word("используя"));
        sentence.addWord(new Word("классы:"));
        sentence.addWord(new Word("предложение,"));
        sentence.addWord(new Word("слово."));

        Sentence title = new Sentence();
        title.addWord(new Word("Классы."));

        Text tl = new Text();
        tl.addTitle(title);
        tl.addSentence(sentence);

        System.out.print("Заголовок: ");
        print(tl.getTitle());
        System.out.print("\nТекст: ");
        print(tl.getText());
    }

    public static void print(List<Sentence> text) {
        for (Sentence sen : text) {
            List<Word> lw = sen.getSentence();
            for (Word w : lw) {
                System.out.print(w.getWord());
            }
        }
    }
}
