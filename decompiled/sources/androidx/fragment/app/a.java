package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static StringBuilder a(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder b(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        return new StringBuilder(str2);
    }

    public static ArrayList c(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }
}
