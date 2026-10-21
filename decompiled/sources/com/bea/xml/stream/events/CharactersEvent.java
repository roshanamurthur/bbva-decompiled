package com.bea.xml.stream.events;

import java.io.IOException;
import java.io.Writer;
import javax.xml.stream.events.Characters;

/* JADX INFO: loaded from: classes9.dex */
public class CharactersEvent extends BaseEvent implements Characters {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f37870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f37871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f37873i;

    public CharactersEvent() {
        this.f37871g = false;
        this.f37872h = false;
        this.f37873i = false;
        init();
    }

    @Override // com.bea.xml.stream.events.BaseEvent
    public void doWriteAsEncodedUnicode(Writer writer) throws IOException {
        char cCharAt;
        if (this.f37871g) {
            writer.write("<![CDATA[");
            writer.write(getData());
            writer.write("]]>");
            return;
        }
        String data = getData();
        int length = data.length();
        if (length > 0) {
            int i10 = 0;
            while (i10 < length && (cCharAt = data.charAt(i10)) != '&' && cCharAt != '<' && cCharAt != '>') {
                i10++;
            }
            if (i10 == length) {
                writer.write(data);
                return;
            }
            if (i10 > 0) {
                writer.write(data, 0, i10);
            }
            while (i10 < length) {
                char cCharAt2 = data.charAt(i10);
                if (cCharAt2 == '&') {
                    writer.write("&amp;");
                } else if (cCharAt2 == '<') {
                    writer.write("&lt;");
                } else if (cCharAt2 != '>') {
                    writer.write(cCharAt2);
                } else {
                    writer.write("&gt;");
                }
                i10++;
            }
        }
    }

    @Override // javax.xml.stream.events.Characters
    public String getData() {
        return this.f37870f;
    }

    public char[] getDataAsArray() {
        return this.f37870f.toCharArray();
    }

    public boolean hasData() {
        return this.f37870f != null;
    }

    public void init() {
        setEventType(4);
    }

    @Override // javax.xml.stream.events.Characters
    public boolean isCData() {
        return this.f37871g;
    }

    @Override // javax.xml.stream.events.Characters
    public boolean isIgnorableWhiteSpace() {
        return this.f37873i;
    }

    @Override // javax.xml.stream.events.Characters
    public boolean isWhiteSpace() {
        return this.f37872h;
    }

    public void setData(String str) {
        this.f37870f = str;
    }

    public void setIgnorable(boolean z10) {
        this.f37873i = z10;
    }

    public void setSpace(boolean z10) {
        this.f37872h = z10;
    }

    public CharactersEvent(String str) {
        this.f37871g = false;
        this.f37872h = false;
        this.f37873i = false;
        init();
        setData(str);
    }

    public CharactersEvent(String str, boolean z10) {
        this.f37871g = false;
        this.f37872h = false;
        this.f37873i = false;
        init();
        setData(str);
        this.f37871g = z10;
    }
}
