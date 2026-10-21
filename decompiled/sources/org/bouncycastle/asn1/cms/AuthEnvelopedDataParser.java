package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;

/* JADX INFO: loaded from: classes12.dex */
public class AuthEnvelopedDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1SequenceParser f86848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ASN1Integer f86849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ASN1Encodable f86850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EncryptedContentInfoParser f86852e;

    public AuthEnvelopedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86848a = aSN1SequenceParser;
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1SequenceParser.readObject());
        this.f86849b = aSN1Integer;
        if (aSN1Integer.intValueExact() != 0) {
            throw new ASN1ParsingException("AuthEnvelopedData version number must be 0");
        }
    }

    public ASN1SetParser getAuthAttrs() throws IOException {
        if (this.f86850c == null) {
            this.f86850c = this.f86848a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86850c;
        if (aSN1Encodable instanceof ASN1TaggedObjectParser) {
            this.f86850c = null;
            return (ASN1SetParser) ((ASN1TaggedObjectParser) aSN1Encodable).getObjectParser(17, false);
        }
        if (this.f86852e.getContentType().equals((ASN1Primitive) CMSObjectIdentifiers.data)) {
            return null;
        }
        throw new ASN1ParsingException("authAttrs must be present with non-data content");
    }

    public EncryptedContentInfoParser getAuthEncryptedContentInfo() throws IOException {
        if (this.f86850c == null) {
            this.f86850c = this.f86848a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86850c;
        if (aSN1Encodable == null) {
            return null;
        }
        this.f86850c = null;
        EncryptedContentInfoParser encryptedContentInfoParser = new EncryptedContentInfoParser((ASN1SequenceParser) aSN1Encodable);
        this.f86852e = encryptedContentInfoParser;
        return encryptedContentInfoParser;
    }

    public ASN1OctetString getMac() throws IOException {
        if (this.f86850c == null) {
            this.f86850c = this.f86848a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86850c;
        this.f86850c = null;
        return ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
    }

    public OriginatorInfo getOriginatorInfo() throws IOException {
        this.f86851d = true;
        if (this.f86850c == null) {
            this.f86850c = this.f86848a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86850c;
        if (!(aSN1Encodable instanceof ASN1TaggedObjectParser) || ((ASN1TaggedObjectParser) aSN1Encodable).getTagNo() != 0) {
            return null;
        }
        ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser) ((ASN1TaggedObjectParser) this.f86850c).getObjectParser(16, false);
        this.f86850c = null;
        return OriginatorInfo.getInstance(aSN1SequenceParser.toASN1Primitive());
    }

    public ASN1SetParser getRecipientInfos() throws IOException {
        if (!this.f86851d) {
            getOriginatorInfo();
        }
        if (this.f86850c == null) {
            this.f86850c = this.f86848a.readObject();
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) this.f86850c;
        this.f86850c = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getUnauthAttrs() throws IOException {
        if (this.f86850c == null) {
            this.f86850c = this.f86848a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86850c;
        if (aSN1Encodable == null) {
            return null;
        }
        this.f86850c = null;
        return (ASN1SetParser) ((ASN1TaggedObjectParser) aSN1Encodable).getObjectParser(17, false);
    }

    public ASN1Integer getVersion() {
        return this.f86849b;
    }
}
