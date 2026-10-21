package org.bouncycastle.asn1.crmf;

import androidx.appcompat.widget.g0;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes12.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    public static SubsequentMessage valueOf(int i10) {
        if (i10 == 0) {
            return encrCert;
        }
        if (i10 == 1) {
            return challengeResp;
        }
        throw new IllegalArgumentException(g0.c("unknown value: ", i10));
    }
}
