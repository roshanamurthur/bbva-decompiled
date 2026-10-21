package androidx.constraintlayout.core.parser;

import androidx.compose.runtime.collection.MutableVector;
import java.util.HashSet;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static Object a(MutableVector mutableVector, int i10) {
        return mutableVector.removeAt(mutableVector.getSize() - i10);
    }

    public static String b(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static StringBuilder c(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void d(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }
}
