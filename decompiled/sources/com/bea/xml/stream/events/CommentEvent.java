package com.bea.xml.stream.events;

import java.io.IOException;
import java.io.Writer;
import javax.xml.stream.events.Comment;

/* JADX INFO: loaded from: classes9.dex */
public class CommentEvent extends CharactersEvent implements Comment {
    public CommentEvent() {
        init();
    }

    @Override // com.bea.xml.stream.events.CharactersEvent, com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        writer.write("<!--");
        String text = getText();
        if (text.length() > 0) {
            writer.write(text);
        }
        writer.write("-->");
    }

    @Override // javax.xml.stream.events.Comment
    public String getText() {
        return getData();
    }

    @Override // com.bea.xml.stream.events.CharactersEvent
    public void init() {
        setEventType(5);
    }

    public CommentEvent(String str) {
        init();
        setData(str);
    }
}
