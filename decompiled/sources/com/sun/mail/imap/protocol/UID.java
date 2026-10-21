package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes9.dex */
public class UID implements Item {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f65458p0 = {Matrix.MATRIX_TYPE_RANDOM_UT, 'I', 'D'};
    public int seqnum;
    public long uid;

    public UID(FetchResponse fetchResponse) throws ParsingException {
        this.seqnum = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        this.uid = fetchResponse.readLong();
    }
}
