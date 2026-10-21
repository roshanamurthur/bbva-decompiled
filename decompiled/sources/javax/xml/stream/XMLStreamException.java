package javax.xml.stream;

/* JADX INFO: loaded from: classes12.dex */
public class XMLStreamException extends Exception {
    protected Location location;
    protected Throwable nested;

    public XMLStreamException() {
    }

    public Location getLocation() {
        return this.location;
    }

    public Throwable getNestedException() {
        return this.nested;
    }

    public XMLStreamException(String str) {
        super(str);
    }

    public XMLStreamException(Throwable th2) {
        this.nested = th2;
    }

    public XMLStreamException(String str, Throwable th2) {
        super(str);
        this.nested = th2;
    }

    public XMLStreamException(String str, Location location, Throwable th2) {
        StringBuffer stringBuffer = new StringBuffer("ParseError at [row,col]:[");
        stringBuffer.append(location.getLineNumber());
        stringBuffer.append(",");
        stringBuffer.append(location.getColumnNumber());
        stringBuffer.append("]\nMessage: ");
        stringBuffer.append(str);
        super(stringBuffer.toString());
        this.nested = th2;
        this.location = location;
    }

    public XMLStreamException(String str, Location location) {
        StringBuffer stringBuffer = new StringBuffer("ParseError at [row,col]:[");
        stringBuffer.append(location.getLineNumber());
        stringBuffer.append(",");
        stringBuffer.append(location.getColumnNumber());
        stringBuffer.append("]\nMessage: ");
        stringBuffer.append(str);
        super(stringBuffer.toString());
        this.location = location;
    }
}
