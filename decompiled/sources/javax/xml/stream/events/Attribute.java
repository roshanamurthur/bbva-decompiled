package javax.xml.stream.events;

import javax.xml.namespace.QName;

/* JADX INFO: loaded from: classes12.dex */
public interface Attribute extends XMLEvent {
    String getDTDType();

    QName getName();

    String getValue();

    boolean isSpecified();
}
