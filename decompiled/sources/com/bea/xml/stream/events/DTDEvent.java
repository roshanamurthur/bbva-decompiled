package com.bea.xml.stream.events;

import com.wutka.dtd.DTDEntity;
import com.wutka.dtd.DTDExternalID;
import com.wutka.dtd.DTDNotation;
import com.wutka.dtd.DTDPublic;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import javax.xml.stream.events.DTD;
import javax.xml.stream.events.EntityDeclaration;
import javax.xml.stream.events.NotationDeclaration;

/* JADX INFO: loaded from: classes9.dex */
public class DTDEvent extends BaseEvent implements DTD {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f37875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f37876h;

    public DTDEvent() {
        init();
    }

    public static EntityDeclaration createEntityDeclaration(DTDEntity dTDEntity) {
        return new EntityDeclarationEvent(dTDEntity.getName(), dTDEntity.getValue());
    }

    public static NotationDeclaration createNotationDeclaration(DTDNotation dTDNotation) {
        DTDExternalID externalID = dTDNotation.getExternalID();
        return new NotationDeclarationEvent(dTDNotation.getName(), externalID instanceof DTDPublic ? ((DTDPublic) externalID).getPub() : null, externalID.getSystem());
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        writer.write("<!DOCTYPE ");
        String str = this.f37874f;
        if (str != null && str.length() > 0) {
            writer.write(91);
            writer.write(this.f37874f);
            writer.write(93);
        }
        writer.write(62);
    }

    @Override // javax.xml.stream.events.DTD
    public String getDocumentTypeDeclaration() {
        return this.f37874f;
    }

    @Override // javax.xml.stream.events.DTD
    public List getEntities() {
        return this.f37876h;
    }

    @Override // javax.xml.stream.events.DTD
    public List getNotations() {
        return this.f37875g;
    }

    @Override // javax.xml.stream.events.DTD
    public Object getProcessedDTD() {
        return null;
    }

    public void init() {
        setEventType(11);
    }

    public void setDTD(String str) {
        this.f37874f = str;
    }

    public void setEntities(List list) {
        this.f37876h = list;
    }

    public void setNotations(List list) {
        this.f37875g = list;
    }

    public DTDEvent(String str) {
        init();
        setDTD(str);
    }
}
