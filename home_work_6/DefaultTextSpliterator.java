package home_work_6;

import home_work_6.api.ITextSpliterator;

public class DefaultTextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {

        text = text.replaceAll("[\\d\\s-,.:;\"()!?=*\n]", " ");
        text = text.replaceAll("\\s{2,}", " ").trim();
        return text.split(" ");
    }
}
