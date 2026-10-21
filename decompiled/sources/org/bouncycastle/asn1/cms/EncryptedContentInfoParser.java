package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class EncryptedContentInfoParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlgorithmIdentifier f86888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ASN1TaggedObjectParser f86889c;

    public EncryptedContentInfoParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86887a = (ASN1ObjectIdentifier) aSN1SequenceParser.readObject();
        this.f86888b = AlgorithmIdentifier.getInstance(aSN1SequenceParser.readObject().toASN1Primitive());
        this.f86889c = (ASN1TaggedObjectParser) aSN1SequenceParser.readObject();
    }

    public AlgorithmIdentifier getContentEncryptionAlgorithm() {
        return this.f86888b;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.f86887a;
    }

    public ASN1Encodable getEncryptedContent(int i10) throws IOException {
        return this.f86889c.getObjectParser(i10, false);
    }
}
