package home_work_5.text;


import home_work_5.text.api.ITextSpliterator;

public class DefaultTextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        return text.split(" ");
    }
}
