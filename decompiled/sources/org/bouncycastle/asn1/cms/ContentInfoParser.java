package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;

/* JADX INFO: loaded from: classes12.dex */
public class ContentInfoParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ASN1TaggedObjectParser f86879b;

    public ContentInfoParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86878a = (ASN1ObjectIdentifier) aSN1SequenceParser.readObject();
        this.f86879b = (ASN1TaggedObjectParser) aSN1SequenceParser.readObject();
    }

    public ASN1Encodable getContent(int i10) throws IOException {
        ASN1TaggedObjectParser aSN1TaggedObjectParser = this.f86879b;
        if (aSN1TaggedObjectParser != null) {
            return aSN1TaggedObjectParser.getObjectParser(i10, true);
        }
        return null;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.f86878a;
    }
}
