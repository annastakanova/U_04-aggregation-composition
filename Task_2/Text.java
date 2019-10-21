package by.epam.Unit04;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> title;
    private List<Sentence> text;

    public Text() {
    }

    public Text(Sentence sentence, Sentence topicText) {
        title = new ArrayList<Sentence>();
        text = new ArrayList<Sentence>();
    }

    public List<Sentence> getText() {
        return text;
    }
    public List<Sentence> getTitle() {
        return title;
    }
    public void setText(List<Sentence> text) {
        this.text = text;
    }
    public void setTitle(List<Sentence> title) {
        this.title = title;
    }

    public void addTitle(Sentence title) {          ///??????????????
        this.title.add(title);
    }

    public void addSentence(Sentence sentence) {    ///??????????????
        this.text.add(sentence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return title.equals(text1.title) &&
                text.equals(text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text);
    }

    @Override
    public String toString() {
        return "Text{" + "title=" + title + ", text=" + text + '}';
    }
}