package androidx.camera.camera2.internal;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 {
    public static float a(float f6, float f10, float f11, float f12) {
        return (f11 - (f6 * f10)) / f12;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void c(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
    }
}
