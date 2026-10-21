package com.wutka.dtd;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class DTDParseException extends IOException {
    public int column;
    public int lineNumber;
    public String uriID;

    public DTDParseException() {
        this.uriID = "";
        this.lineNumber = -1;
        this.column = -1;
    }

    public int getColumn() {
        return this.column;
    }

    public String getId() {
        return this.uriID;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public DTDParseException(String str) {
        super(str);
        this.uriID = "";
        this.lineNumber = -1;
        this.column = -1;
    }

    public DTDParseException(String str, int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer("At line ");
        stringBuffer.append(i10);
        stringBuffer.append(", column ");
        stringBuffer.append(i11);
        stringBuffer.append(": ");
        stringBuffer.append(str);
        super(stringBuffer.toString());
        this.uriID = "";
        this.lineNumber = i10;
        this.column = i11;
    }

    public DTDParseException(String str, String str2, int i10, int i11) {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        if (str == null || str.length() <= 0) {
            string = "At ";
        } else {
            StringBuffer stringBuffer2 = new StringBuffer("URI ");
            stringBuffer2.append(str);
            stringBuffer2.append(" at ");
            string = stringBuffer2.toString();
        }
        stringBuffer.append(string);
        stringBuffer.append("line ");
        stringBuffer.append(i10);
        stringBuffer.append(", column ");
        stringBuffer.append(i11);
        stringBuffer.append(": ");
        stringBuffer.append(str2);
        super(stringBuffer.toString());
        this.uriID = "";
        if (str != null) {
            this.uriID = str;
        }
        this.lineNumber = i10;
        this.column = i11;
    }
}
