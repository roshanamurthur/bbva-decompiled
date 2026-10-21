package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AuthenticatedSafe extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ContentInfo[] f87377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f87378q0 = true;

    public AuthenticatedSafe(ContentInfo[] contentInfoArr) {
        int length = contentInfoArr.length;
        ContentInfo[] contentInfoArr2 = new ContentInfo[length];
        System.arraycopy(contentInfoArr, 0, contentInfoArr2, 0, length);
        this.f87377p0 = contentInfoArr2;
    }

    public static AuthenticatedSafe getInstance(Object obj) {
        if (obj instanceof AuthenticatedSafe) {
            return (AuthenticatedSafe) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AuthenticatedSafe authenticatedSafe = new AuthenticatedSafe();
        authenticatedSafe.f87378q0 = true;
        authenticatedSafe.f87377p0 = new ContentInfo[aSN1Sequence.size()];
        int i10 = 0;
        while (true) {
            ContentInfo[] contentInfoArr = authenticatedSafe.f87377p0;
            if (i10 == contentInfoArr.length) {
                authenticatedSafe.f87378q0 = aSN1Sequence instanceof BERSequence;
                return authenticatedSafe;
            }
            contentInfoArr[i10] = ContentInfo.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
    }

    public ContentInfo[] getContentInfo() {
        ContentInfo[] contentInfoArr = this.f87377p0;
        int length = contentInfoArr.length;
        ContentInfo[] contentInfoArr2 = new ContentInfo[length];
        System.arraycopy(contentInfoArr, 0, contentInfoArr2, 0, length);
        return contentInfoArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        boolean z10 = this.f87378q0;
        ContentInfo[] contentInfoArr = this.f87377p0;
        return z10 ? new BERSequence(contentInfoArr) : new DLSequence(contentInfoArr);
    }
}
