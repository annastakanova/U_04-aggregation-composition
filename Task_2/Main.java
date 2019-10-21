package by.epam.Unit04;
//Создать объект класса Текст, используя классы Предложение, Слово.
// Методы: дополнить текст, вывести на консоль текст, заголовок текста.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Sentence> titleSentences = new ArrayList<Sentence>();
        Sentence title = new Sentence();
        title.addWord(new Word("Заголовок предложения."));
        titleSentences.add(title);

        List<Sentence> textSentences = new ArrayList<Sentence>();
        Sentence text1 = new Sentence();
        Sentence text2 = new Sentence();
        text1.addWord(new Word("Текст предложения1."));
        text2.addWord(new Word("Текст предложения2."));
        textSentences.add(text1);
        textSentences.add(text2);

        Text tl = new Text();
        tl.addTitle(titleSentences);
        tl.addSentence(textSentences);

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
