package androidx.camera.core.impl.utils;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static String a(String str, String str2, char c10) {
        return str + str2 + c10;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static byte[] c(ASN1Sequence aSN1Sequence, int i10) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10)).getOctets());
    }
}
