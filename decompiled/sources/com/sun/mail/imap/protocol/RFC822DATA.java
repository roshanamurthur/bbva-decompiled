package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ByteArray;
import com.sun.mail.iap.ParsingException;
import java.io.ByteArrayInputStream;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class RFC822DATA implements Item {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char[] f65451r0 = {Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'F', 'C', '8', '2', '2'};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ByteArray f65452p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f65453q0;

    public RFC822DATA(FetchResponse fetchResponse) throws ParsingException {
        this(fetchResponse, false);
    }

    public ByteArray getByteArray() {
        return this.f65452p0;
    }

    public ByteArrayInputStream getByteArrayInputStream() {
        ByteArray byteArray = this.f65452p0;
        if (byteArray != null) {
            return byteArray.toByteArrayInputStream();
        }
        return null;
    }

    public boolean isHeader() {
        return this.f65453q0;
    }

    public RFC822DATA(FetchResponse fetchResponse, boolean z10) throws ParsingException {
        this.f65453q0 = z10;
        fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        this.f65452p0 = fetchResponse.readByteArray();
    }
}
