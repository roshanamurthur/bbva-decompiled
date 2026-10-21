package com.sun.mail.imap.protocol;

import com.sun.mail.iap.Protocol;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import com.sun.mail.util.ASCIIUtility;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class IMAPResponse extends Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f65445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65446b;

    public IMAPResponse(Protocol protocol) throws ProtocolException, IOException {
        super(protocol);
        f();
    }

    public final void f() throws ProtocolException, IOException {
        if (!isUnTagged() || isOK() || isNO() || isBAD() || isBYE()) {
            return;
        }
        String atom = readAtom();
        this.f65445a = atom;
        try {
            this.f65446b = Integer.parseInt(atom);
            this.f65445a = readAtom();
        } catch (NumberFormatException unused) {
        }
    }

    public String getKey() {
        return this.f65445a;
    }

    public int getNumber() {
        return this.f65446b;
    }

    public boolean keyEquals(String str) {
        String str2 = this.f65445a;
        return str2 != null && str2.equalsIgnoreCase(str);
    }

    public String[] readSimpleList() {
        byte[] bArr;
        int i10;
        skipSpaces();
        byte[] bArr2 = this.buffer;
        int i11 = this.index;
        if (bArr2[i11] != 40) {
            return null;
        }
        this.index = i11 + 1;
        ArrayList arrayList = new ArrayList();
        int i12 = this.index;
        while (true) {
            bArr = this.buffer;
            i10 = this.index;
            byte b10 = bArr[i10];
            if (b10 == 41) {
                break;
            }
            if (b10 == 32) {
                arrayList.add(ASCIIUtility.toString(bArr, i12, i10));
                i12 = this.index + 1;
            }
            this.index++;
        }
        if (i10 > i12) {
            arrayList.add(ASCIIUtility.toString(bArr, i12, i10));
        }
        this.index++;
        int size = arrayList.size();
        if (size > 0) {
            return (String[]) arrayList.toArray(new String[size]);
        }
        return null;
    }

    public IMAPResponse(IMAPResponse iMAPResponse) {
        super(iMAPResponse);
        this.f65445a = iMAPResponse.f65445a;
        this.f65446b = iMAPResponse.f65446b;
    }

    public IMAPResponse(String str) throws ProtocolException, IOException {
        this(str, true);
    }

    public IMAPResponse(String str, boolean z10) throws ProtocolException, IOException {
        super(str, z10);
        f();
    }
}
