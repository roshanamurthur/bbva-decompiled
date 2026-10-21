package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.DERIA5String;

/* JADX INFO: loaded from: classes12.dex */
public class TimeStampedDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DERIA5String f86989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetaData f86990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ASN1OctetStringParser f86991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Evidence f86992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ASN1SequenceParser f86993e;

    public TimeStampedDataParser(ASN1SequenceParser aSN1SequenceParser) throws IOException {
        this.f86993e = aSN1SequenceParser;
        ASN1Integer.getInstance(aSN1SequenceParser.readObject());
        ASN1Encodable object = aSN1SequenceParser.readObject();
        if (object instanceof DERIA5String) {
            this.f86989a = DERIA5String.getInstance(object);
            object = aSN1SequenceParser.readObject();
        }
        if ((object instanceof MetaData) || (object instanceof ASN1SequenceParser)) {
            this.f86990b = MetaData.getInstance(object.toASN1Primitive());
            object = aSN1SequenceParser.readObject();
        }
        if (object instanceof ASN1OctetStringParser) {
            this.f86991c = (ASN1OctetStringParser) object;
        }
    }

    public static TimeStampedDataParser getInstance(Object obj) throws IOException {
        if (obj instanceof ASN1Sequence) {
            return new TimeStampedDataParser(((ASN1Sequence) obj).parser());
        }
        if (obj instanceof ASN1SequenceParser) {
            return new TimeStampedDataParser((ASN1SequenceParser) obj);
        }
        return null;
    }

    public ASN1OctetStringParser getContent() {
        return this.f86991c;
    }

    public DERIA5String getDataUri() {
        return this.f86989a;
    }

    public MetaData getMetaData() {
        return this.f86990b;
    }

    public Evidence getTemporalEvidence() throws IOException {
        if (this.f86992d == null) {
            this.f86992d = Evidence.getInstance(this.f86993e.readObject().toASN1Primitive());
        }
        return this.f86992d;
    }
}
