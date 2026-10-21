package com.bea.xml.stream;

import com.bea.xml.stream.util.ElementTypeNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class EventState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QName f37810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f37811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f37812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37814f;

    public EventState() {
    }

    public EventState(int i10) {
        this.f37809a = i10;
        this.f37811c = new ArrayList();
        this.f37812d = new ArrayList();
    }

    public void addAttribute(Object obj) {
        this.f37811c.add(obj);
    }

    public void addNamespace(Object obj) {
        this.f37812d.add(obj);
    }

    public void clear() {
        this.f37810b = null;
        this.f37811c = new ArrayList();
        this.f37812d = new ArrayList();
        this.f37813e = null;
        this.f37814f = null;
    }

    public List getAttributes() {
        return this.f37811c;
    }

    public String getData() {
        return this.f37813e;
    }

    public String getExtraData() {
        return this.f37814f;
    }

    public String getLocalName() {
        return this.f37810b.getLocalPart();
    }

    public QName getName() {
        return this.f37810b;
    }

    public String getNamespaceURI() {
        return this.f37810b.getNamespaceURI();
    }

    public List getNamespaces() {
        return this.f37812d;
    }

    public String getPrefix() {
        return this.f37810b.getPrefix();
    }

    public int getType() {
        return this.f37809a;
    }

    public void setAttributes(List list) {
        this.f37811c = list;
    }

    public void setData(String str) {
        this.f37813e = str;
    }

    public void setExtraData(String str) {
        this.f37814f = str;
    }

    public void setName(QName qName) {
        this.f37810b = qName;
    }

    public void setNamespaces(List list) {
        this.f37812d = list;
    }

    public void setType(int i10) {
        this.f37809a = i10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer(Constant.BRACKET_OPEN);
        stringBuffer2.append(ElementTypeNames.getEventTypeString(this.f37809a));
        stringBuffer2.append(Constant.BRACKET_CLOSE);
        stringBuffer.append(stringBuffer2.toString());
        if (this.f37810b != null) {
            StringBuffer stringBuffer3 = new StringBuffer("[name='");
            stringBuffer3.append(this.f37810b);
            stringBuffer3.append("']");
            stringBuffer.append(stringBuffer3.toString());
        }
        Iterator it = this.f37812d.iterator();
        while (it.hasNext()) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(it.next());
            stringBuffer4.append(" ");
            stringBuffer.append(stringBuffer4.toString());
        }
        Iterator it2 = this.f37811c.iterator();
        while (it2.hasNext()) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(it2.next());
            stringBuffer5.append(" ");
            stringBuffer.append(stringBuffer5.toString());
        }
        if (this.f37813e != null) {
            StringBuffer stringBuffer6 = new StringBuffer(",data=[");
            stringBuffer6.append(this.f37813e);
            stringBuffer6.append(Constant.BRACKET_CLOSE);
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.f37814f != null) {
            StringBuffer stringBuffer7 = new StringBuffer(",extradata=[");
            stringBuffer7.append(this.f37814f);
            stringBuffer7.append(Constant.BRACKET_CLOSE);
            stringBuffer.append(stringBuffer7.toString());
        }
        return stringBuffer.toString();
    }
}
