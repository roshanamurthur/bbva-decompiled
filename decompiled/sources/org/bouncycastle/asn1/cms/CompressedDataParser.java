package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class CompressedDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1Integer f86873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AlgorithmIdentifier f86874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentInfoParser f86875c;

    public CompressedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86873a = (ASN1Integer) aSN1SequenceParser.readObject();
        this.f86874b = AlgorithmIdentifier.getInstance(aSN1SequenceParser.readObject().toASN1Primitive());
        this.f86875c = new ContentInfoParser((ASN1SequenceParser) aSN1SequenceParser.readObject());
    }

    public AlgorithmIdentifier getCompressionAlgorithmIdentifier() {
        return this.f86874b;
    }

    public ContentInfoParser getEncapContentInfo() {
        return this.f86875c;
    }

    public ASN1Integer getVersion() {
        return this.f86873a;
    }
}
