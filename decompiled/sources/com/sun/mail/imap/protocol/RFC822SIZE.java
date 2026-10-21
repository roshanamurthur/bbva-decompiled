package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class RFC822SIZE implements Item {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f65454p0 = {Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'F', 'C', '8', '2', '2', '.', 'S', 'I', Matrix.MATRIX_TYPE_ZERO, 'E'};
    public int msgno;
    public long size;

    public RFC822SIZE(FetchResponse fetchResponse) throws ParsingException {
        this.msgno = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        this.size = fetchResponse.readLong();
    }
}
