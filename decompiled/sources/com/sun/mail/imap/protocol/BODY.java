package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ByteArray;
import com.sun.mail.iap.ParsingException;
import java.io.ByteArrayInputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class BODY implements Item {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char[] f65412s0 = {'B', 'O', 'D', 'Y'};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ByteArray f65413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f65414q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f65415r0;

    public BODY(FetchResponse fetchResponse) throws ParsingException {
        fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        if (fetchResponse.readByte() != 91) {
            throw new ParsingException("BODY parse error: missing ``['' at section start");
        }
        String string = fetchResponse.readString(AbstractJsonLexerKt.END_LIST);
        this.f65414q0 = string;
        if (fetchResponse.readByte() != 93) {
            throw new ParsingException("BODY parse error: missing ``]'' at section end");
        }
        this.f65415r0 = string.regionMatches(true, 0, "HEADER", 0, 6);
        if (fetchResponse.readByte() == 60) {
            fetchResponse.readNumber();
            fetchResponse.skip(1);
        }
        this.f65413p0 = fetchResponse.readByteArray();
    }

    public ByteArray getByteArray() {
        return this.f65413p0;
    }

    public ByteArrayInputStream getByteArrayInputStream() {
        ByteArray byteArray = this.f65413p0;
        if (byteArray != null) {
            return byteArray.toByteArrayInputStream();
        }
        return null;
    }

    public String getSection() {
        return this.f65414q0;
    }

    public boolean isHeader() {
        return this.f65415r0;
    }
}
