package javax.xml.stream.events;

/* JADX INFO: loaded from: classes12.dex */
public interface Characters extends XMLEvent {
    String getData();

    boolean isCData();

    boolean isIgnorableWhiteSpace();

    boolean isWhiteSpace();
}
