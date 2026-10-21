package org.bouncycastle.asn1;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ASN1Null extends ASN1Primitive {
    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e5) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct NULL from byte[]: ")));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance(): "));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return VDVideoSelfieConfiguration.NULL;
    }
}
