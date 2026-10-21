package com.fasterxml.jackson.core;

import androidx.activity.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.Serializable;
import java.nio.charset.Charset;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class JsonLocation implements Serializable {
    public static final int MAX_CONTENT_SNIPPET = 500;
    public static final JsonLocation NA = new JsonLocation(null, -1, -1, -1, -1);
    protected final int _columnNr;
    protected final int _lineNr;
    protected final long _totalBytes;
    protected final long _totalChars;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final transient Object f43037p0;

    public JsonLocation(Object obj, long j10, int i10, int i11) {
        this(obj, -1L, j10, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    public StringBuilder _appendSourceDesc(StringBuilder sb2) {
        int length;
        int length2;
        Object obj = this.f43037p0;
        if (obj == null) {
            sb2.append("UNKNOWN");
            return sb2;
        }
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        String name = cls.getName();
        if (name.startsWith("java.")) {
            name = cls.getSimpleName();
        } else if (obj instanceof byte[]) {
            name = "byte[]";
        } else if (obj instanceof char[]) {
            name = "char[]";
        }
        sb2.append(RootService.OPEN_BRACKET);
        sb2.append(name);
        sb2.append(RootService.CLOSE_BRACKET);
        int length3 = 0;
        String str = " chars";
        if (!(obj instanceof CharSequence)) {
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                length = cArr.length;
                String str2 = new String(cArr, 0, Math.min(length, 500));
                sb2.append('\"');
                sb2.append(str2);
                sb2.append('\"');
                length2 = str2.length();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int iMin = Math.min(bArr.length, 500);
                String str3 = new String(bArr, 0, iMin, Charset.forName("UTF-8"));
                sb2.append('\"');
                sb2.append(str3);
                sb2.append('\"');
                length3 = bArr.length - iMin;
                str = " bytes";
            }
            if (length3 > 0) {
                sb2.append("[truncated ");
                sb2.append(length3);
                sb2.append(str);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
            return sb2;
        }
        CharSequence charSequence = (CharSequence) obj;
        length = charSequence.length();
        String string = charSequence.subSequence(0, Math.min(length, 500)).toString();
        sb2.append('\"');
        sb2.append(string);
        sb2.append('\"');
        length2 = string.length();
        length3 = length - length2;
        if (length3 > 0) {
            sb2.append("[truncated ");
            sb2.append(length3);
            sb2.append(str);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        Object obj2 = jsonLocation.f43037p0;
        Object obj3 = this.f43037p0;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && getByteOffset() == jsonLocation.getByteOffset();
    }

    public long getByteOffset() {
        return this._totalBytes;
    }

    public long getCharOffset() {
        return this._totalChars;
    }

    public int getColumnNr() {
        return this._columnNr;
    }

    public int getLineNr() {
        return this._lineNr;
    }

    public Object getSourceRef() {
        return this.f43037p0;
    }

    public int hashCode() {
        Object obj = this.f43037p0;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String sourceDescription() {
        return _appendSourceDesc(new StringBuilder(100)).toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("[Source: ");
        _appendSourceDesc(sb2);
        sb2.append("; line: ");
        sb2.append(this._lineNr);
        sb2.append(", column: ");
        return a.d(sb2, this._columnNr, AbstractJsonLexerKt.END_LIST);
    }

    public JsonLocation(Object obj, long j10, long j11, int i10, int i11) {
        this.f43037p0 = obj;
        this._totalBytes = j10;
        this._totalChars = j11;
        this._lineNr = i10;
        this._columnNr = i11;
    }
}
