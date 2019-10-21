package by.epam.Unit04;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Sentence {
    private List<Word> sentence;

    public Sentence() {
        sentence = new ArrayList<Word>();
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentense(List<Word> sentence) {
        this.sentence = sentence;
    }

    public void addWord(Word new_word) {                ///////????
        sentence.add(new_word);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(sentence, sentence.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "wordList=" + sentence +
                '}';
    }
}