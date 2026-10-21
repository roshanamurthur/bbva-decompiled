package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;

/* JADX INFO: loaded from: classes12.dex */
public class EnvelopedDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1SequenceParser f86898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ASN1Integer f86899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ASN1Encodable f86900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86901d;

    public EnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86898a = aSN1SequenceParser;
        this.f86899b = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
    }

    public EncryptedContentInfoParser getEncryptedContentInfo() throws IOException {
        if (this.f86900c == null) {
            this.f86900c = this.f86898a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86900c;
        if (aSN1Encodable == null) {
            return null;
        }
        this.f86900c = null;
        return new EncryptedContentInfoParser((ASN1SequenceParser) aSN1Encodable);
    }

    public OriginatorInfo getOriginatorInfo() throws IOException {
        this.f86901d = true;
        if (this.f86900c == null) {
            this.f86900c = this.f86898a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86900c;
        if (!(aSN1Encodable instanceof ASN1TaggedObjectParser) || ((ASN1TaggedObjectParser) aSN1Encodable).getTagNo() != 0) {
            return null;
        }
        ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser) ((ASN1TaggedObjectParser) this.f86900c).getObjectParser(16, false);
        this.f86900c = null;
        return OriginatorInfo.getInstance(aSN1SequenceParser.toASN1Primitive());
    }

    public ASN1SetParser getRecipientInfos() throws IOException {
        if (!this.f86901d) {
            getOriginatorInfo();
        }
        if (this.f86900c == null) {
            this.f86900c = this.f86898a.readObject();
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) this.f86900c;
        this.f86900c = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getUnprotectedAttrs() throws IOException {
        if (this.f86900c == null) {
            this.f86900c = this.f86898a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86900c;
        if (aSN1Encodable == null) {
            return null;
        }
        this.f86900c = null;
        return (ASN1SetParser) ((ASN1TaggedObjectParser) aSN1Encodable).getObjectParser(17, false);
    }

    public ASN1Integer getVersion() {
        return this.f86899b;
    }
}
