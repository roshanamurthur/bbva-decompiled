package com.fasterxml.jackson.core.util;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
    public static final String SYS_LF;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f43148p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f43149q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f43150r0;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = RootService.LINE_BREAK;
        }
        SYS_LF = property;
        SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter("  ", property);
    }

    public DefaultIndenter() {
        this("  ", SYS_LF);
    }

    public String getEol() {
        return this.f43150r0;
    }

    public String getIndent() {
        return new String(this.f43148p0, 0, this.f43149q0);
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public boolean isInline() {
        return false;
    }

    public DefaultIndenter withIndent(String str) {
        return str.equals(getIndent()) ? this : new DefaultIndenter(str, this.f43150r0);
    }

    public DefaultIndenter withLinefeed(String str) {
        return str.equals(this.f43150r0) ? this : new DefaultIndenter(getIndent(), str);
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public void writeIndentation(JsonGenerator jsonGenerator, int i10) throws IOException {
        jsonGenerator.writeRaw(this.f43150r0);
        if (i10 <= 0) {
            return;
        }
        int length = i10 * this.f43149q0;
        while (true) {
            char[] cArr = this.f43148p0;
            if (length <= cArr.length) {
                jsonGenerator.writeRaw(cArr, 0, length);
                return;
            } else {
                jsonGenerator.writeRaw(cArr, 0, cArr.length);
                length -= cArr.length;
            }
        }
    }

    public DefaultIndenter(String str, String str2) {
        this.f43149q0 = str.length();
        this.f43148p0 = new char[str.length() * 16];
        int length = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            str.getChars(0, str.length(), this.f43148p0, length);
            length += str.length();
        }
        this.f43150r0 = str2;
    }
}
