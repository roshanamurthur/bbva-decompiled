package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public class AuthenticatedDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1SequenceParser f86861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ASN1Integer f86862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ASN1Encodable f86863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86864d;

    public AuthenticatedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86861a = aSN1SequenceParser;
        this.f86862b = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
    }

    public ASN1SetParser getAuthAttrs() throws IOException {
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86863c;
        if (!(aSN1Encodable instanceof ASN1TaggedObjectParser)) {
            return null;
        }
        this.f86863c = null;
        return (ASN1SetParser) ((ASN1TaggedObjectParser) aSN1Encodable).getObjectParser(17, false);
    }

    public AlgorithmIdentifier getDigestAlgorithm() throws IOException {
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86863c;
        if (!(aSN1Encodable instanceof ASN1TaggedObjectParser)) {
            return null;
        }
        AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance((ASN1TaggedObject) aSN1Encodable.toASN1Primitive(), false);
        this.f86863c = null;
        return algorithmIdentifier;
    }

    public ContentInfoParser getEncapsulatedContentInfo() throws IOException {
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86863c;
        if (aSN1Encodable == null) {
            return null;
        }
        this.f86863c = null;
        return new ContentInfoParser((ASN1SequenceParser) aSN1Encodable);
    }

    public ASN1OctetString getMac() throws IOException {
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86863c;
        this.f86863c = null;
        return ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
    }

    public AlgorithmIdentifier getMacAlgorithm() throws IOException {
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86863c;
        if (aSN1Encodable == null) {
            return null;
        }
        this.f86863c = null;
        return AlgorithmIdentifier.getInstance(((ASN1SequenceParser) aSN1Encodable).toASN1Primitive());
    }

    public OriginatorInfo getOriginatorInfo() throws IOException {
        this.f86864d = true;
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86863c;
        if (!(aSN1Encodable instanceof ASN1TaggedObjectParser) || ((ASN1TaggedObjectParser) aSN1Encodable).getTagNo() != 0) {
            return null;
        }
        ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser) ((ASN1TaggedObjectParser) this.f86863c).getObjectParser(16, false);
        this.f86863c = null;
        return OriginatorInfo.getInstance(aSN1SequenceParser.toASN1Primitive());
    }

    public ASN1SetParser getRecipientInfos() throws IOException {
        if (!this.f86864d) {
            getOriginatorInfo();
        }
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) this.f86863c;
        this.f86863c = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getUnauthAttrs() throws IOException {
        if (this.f86863c == null) {
            this.f86863c = this.f86861a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86863c;
        if (aSN1Encodable == null) {
            return null;
        }
        this.f86863c = null;
        return (ASN1SetParser) ((ASN1TaggedObjectParser) aSN1Encodable).getObjectParser(17, false);
    }

    public ASN1Integer getVersion() {
        return this.f86862b;
    }
}
