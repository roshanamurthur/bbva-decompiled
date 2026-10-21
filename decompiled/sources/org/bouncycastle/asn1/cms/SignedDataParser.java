package org.bouncycastle.asn1.cms;

import androidx.emoji2.text.flatbuffer.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;

/* JADX INFO: loaded from: classes12.dex */
public class SignedDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1SequenceParser f86968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ASN1Integer f86969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ASN1Encodable f86970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86972e;

    public SignedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86968a = aSN1SequenceParser;
        this.f86969b = (ASN1Integer) aSN1SequenceParser.readObject();
    }

    public static SignedDataParser getInstance(Object obj) throws IOException {
        if (obj instanceof ASN1Sequence) {
            return new SignedDataParser(((ASN1Sequence) obj).parser());
        }
        if (obj instanceof ASN1SequenceParser) {
            return new SignedDataParser((ASN1SequenceParser) obj);
        }
        throw new IOException(a.c(obj, "unknown object encountered: "));
    }

    public ASN1SetParser getCertificates() throws IOException {
        this.f86971d = true;
        ASN1Encodable object = this.f86968a.readObject();
        this.f86970c = object;
        if (!(object instanceof ASN1TaggedObjectParser) || ((ASN1TaggedObjectParser) object).getTagNo() != 0) {
            return null;
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) ((ASN1TaggedObjectParser) this.f86970c).getObjectParser(17, false);
        this.f86970c = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getCrls() throws IOException {
        if (!this.f86971d) {
            throw new IOException("getCerts() has not been called.");
        }
        this.f86972e = true;
        if (this.f86970c == null) {
            this.f86970c = this.f86968a.readObject();
        }
        ASN1Encodable aSN1Encodable = this.f86970c;
        if (!(aSN1Encodable instanceof ASN1TaggedObjectParser) || ((ASN1TaggedObjectParser) aSN1Encodable).getTagNo() != 1) {
            return null;
        }
        ASN1SetParser aSN1SetParser = (ASN1SetParser) ((ASN1TaggedObjectParser) this.f86970c).getObjectParser(17, false);
        this.f86970c = null;
        return aSN1SetParser;
    }

    public ASN1SetParser getDigestAlgorithms() throws IOException {
        ASN1Encodable object = this.f86968a.readObject();
        return object instanceof ASN1Set ? ((ASN1Set) object).parser() : (ASN1SetParser) object;
    }

    public ContentInfoParser getEncapContentInfo() throws IOException {
        return new ContentInfoParser((ASN1SequenceParser) this.f86968a.readObject());
    }

    public ASN1SetParser getSignerInfos() throws IOException {
        if (!this.f86971d || !this.f86972e) {
            throw new IOException("getCerts() and/or getCrls() has not been called.");
        }
        if (this.f86970c == null) {
            this.f86970c = this.f86968a.readObject();
        }
        return (ASN1SetParser) this.f86970c;
    }

    public ASN1Integer getVersion() {
        return this.f86969b;
    }
}
