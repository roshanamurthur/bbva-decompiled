package com.bea.xml.stream.events;

import java.io.Writer;
import javax.xml.stream.events.EndDocument;

/* JADX INFO: loaded from: classes9.dex */
public class EndDocumentEvent extends BaseEvent implements EndDocument {
    public EndDocumentEvent() {
        init();
    }

    public void init() {
        setEventType(8);
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public String toString() {
        return "<? EndDocument ?>";
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) {
    }
}
