package com.bea.xml.stream;

import javax.xml.stream.XMLStreamException;

/* JADX INFO: loaded from: classes9.dex */
public class XMLEventPlayer extends XMLEventReaderBase {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final XMLStreamPlayer f37844t0;

    public XMLEventPlayer(XMLStreamPlayer xMLStreamPlayer) throws XMLStreamException {
        super(xMLStreamPlayer);
        this.f37844t0 = xMLStreamPlayer;
    }

    @Override // com.bea.xml.stream.XMLEventReaderBase
    public boolean parseSome() throws XMLStreamException {
        this.allocator.allocate(this.reader, this);
        if (this.reader.hasNext()) {
            this.reader.next();
        }
        if (isOpen() && this.reader.getEventType() == 8) {
            if (this.f37844t0.endDocumentIsPresent()) {
                this.allocator.allocate(this.reader, this);
            }
            internal_close();
        }
        return !needsMore();
    }
}
