package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable getObjectParser(int i10, boolean z10) throws IOException;

    int getTagNo();
}
