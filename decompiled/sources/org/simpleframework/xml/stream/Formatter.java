package org.simpleframework.xml.stream;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.BufferedWriter;
import java.io.Writer;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
class Formatter {
    private OutputBuffer buffer = new OutputBuffer();
    private Indenter indenter;
    private Tag last;
    private String prolog;
    private Writer result;
    private static final char[] NAMESPACE = {'x', 'm', 'l', 'n', 's'};
    private static final char[] LESS = {Typography.amp, 'l', 't', ';'};
    private static final char[] GREATER = {Typography.amp, 'g', 't', ';'};
    private static final char[] DOUBLE = {Typography.amp, 'q', AbstractJsonLexerKt.UNICODE_ESC, 'o', 't', ';'};
    private static final char[] SINGLE = {Typography.amp, 'a', 'p', 'o', 's', ';'};
    private static final char[] AND = {Typography.amp, 'a', 'm', 'p', ';'};
    private static final char[] OPEN = {Typography.less, '!', '-', '-', ' '};
    private static final char[] CLOSE = {' ', '-', '-', Typography.greater};

    public enum Tag {
        COMMENT,
        START,
        TEXT,
        END
    }

    public Formatter(Writer writer, Format format) {
        this.result = new BufferedWriter(writer, 1024);
        this.indenter = new Indenter(format);
        this.prolog = format.getProlog();
    }

    private void append(char c10) throws Exception {
        this.buffer.append(c10);
    }

    private void data(String str) throws Exception {
        write("<![CDATA[");
        write(str);
        write("]]>");
    }

    private void escape(String str) throws Exception {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            escape(str.charAt(i10));
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private boolean isText(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r' || c10 == ' ') {
            return true;
        }
        return c10 > ' ' && c10 <= '~' && c10 != 247;
    }

    private char[] symbol(char c10) {
        if (c10 == '\"') {
            return DOUBLE;
        }
        if (c10 == '<') {
            return LESS;
        }
        if (c10 == '>') {
            return GREATER;
        }
        if (c10 == '&') {
            return AND;
        }
        if (c10 != '\'') {
            return null;
        }
        return SINGLE;
    }

    private String unicode(char c10) {
        return Integer.toString(c10);
    }

    private void write(char c10) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(c10);
    }

    public void flush() throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.flush();
    }

    public void writeAttribute(String str, String str2, String str3) throws Exception {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(str, str3);
        write('=');
        write('\"');
        escape(str2);
        write('\"');
    }

    public void writeComment(String str) throws Exception {
        String pVar = this.indenter.top();
        if (this.last == Tag.START) {
            append(Typography.greater);
        }
        if (pVar != null) {
            append(pVar);
            append(OPEN);
            append(str);
            append(CLOSE);
        }
        this.last = Tag.COMMENT;
    }

    public void writeEnd(String str, String str2) throws Exception {
        String strPop = this.indenter.pop();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            write(JsonPointer.SEPARATOR);
            write(Typography.greater);
        } else {
            if (tag != Tag.TEXT) {
                write(strPop);
            }
            if (this.last != tag2) {
                write(Typography.less);
                write(JsonPointer.SEPARATOR);
                write(str, str2);
                write(Typography.greater);
            }
        }
        this.last = Tag.END;
    }

    public void writeNamespace(String str, String str2) throws Exception {
        if (this.last != Tag.START) {
            throw new NodeException("Start element required");
        }
        write(' ');
        write(NAMESPACE);
        if (!isEmpty(str2)) {
            write(AbstractJsonLexerKt.COLON);
            write(str2);
        }
        write('=');
        write('\"');
        escape(str);
        write('\"');
    }

    public void writeProlog() throws Exception {
        String str = this.prolog;
        if (str != null) {
            write(str);
            write(RootService.LINE_BREAK);
        }
    }

    public void writeStart(String str, String str2) throws Exception {
        String strPush = this.indenter.push();
        Tag tag = this.last;
        Tag tag2 = Tag.START;
        if (tag == tag2) {
            append(Typography.greater);
        }
        flush();
        append(strPush);
        append(Typography.less);
        if (!isEmpty(str2)) {
            append(str2);
            append(AbstractJsonLexerKt.COLON);
        }
        append(str);
        this.last = tag2;
    }

    public void writeText(String str) throws Exception {
        writeText(str, Mode.ESCAPE);
    }

    private void append(char[] cArr) throws Exception {
        this.buffer.append(cArr);
    }

    public void writeText(String str, Mode mode) throws Exception {
        if (this.last == Tag.START) {
            write(Typography.greater);
        }
        if (mode == Mode.DATA) {
            data(str);
        } else {
            escape(str);
        }
        this.last = Tag.TEXT;
    }

    private void append(String str) throws Exception {
        this.buffer.append(str);
    }

    private void escape(char c10) throws Exception {
        char[] cArrSymbol = symbol(c10);
        if (cArrSymbol != null) {
            write(cArrSymbol);
        } else {
            write(c10);
        }
    }

    private void write(char[] cArr) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(cArr);
    }

    private void write(String str) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        this.result.write(str);
    }

    private void write(String str, String str2) throws Exception {
        this.buffer.write(this.result);
        this.buffer.clear();
        if (!isEmpty(str2)) {
            this.result.write(str2);
            this.result.write(58);
        }
        this.result.write(str);
    }
}
