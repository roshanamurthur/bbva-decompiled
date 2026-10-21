package com.sun.mail.imap.protocol;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.sun.mail.iap.ParsingException;
import com.sun.mail.iap.Response;
import java.util.ArrayList;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: ENVELOPE.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends InternetAddress {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f65459t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final InternetAddress[] f65460u0;
    public final String v0;

    public a(Response response) throws ParsingException {
        this.f65459t0 = false;
        response.skipSpaces();
        if (response.readByte() != 40) {
            throw new ParsingException("ADDRESS parse error");
        }
        this.encodedPersonal = response.readString();
        response.readString();
        String string = response.readString();
        String string2 = response.readString();
        response.skipSpaces();
        if (!response.isNextNonSpace(RootService.CLOSE_BRACKET)) {
            throw new ParsingException("ADDRESS parse error");
        }
        if (string2 != null) {
            if (string == null || string.length() == 0) {
                this.address = string2;
                return;
            } else if (string2.length() == 0) {
                this.address = string;
                return;
            } else {
                this.address = androidx.camera.core.impl.utils.a.b(string, "@", string2);
                return;
            }
        }
        this.f65459t0 = true;
        this.v0 = string;
        if (string == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(AbstractJsonLexerKt.COLON);
        ArrayList arrayList = new ArrayList();
        while (response.peekByte() != 41) {
            a aVar = new a(response);
            if (aVar.f65459t0 && aVar.v0 == null) {
                break;
            }
            if (arrayList.size() != 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(aVar.toString());
            arrayList.add(aVar);
        }
        sb2.append(';');
        this.address = sb2.toString();
        this.f65460u0 = (InternetAddress[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // javax.mail.internet.InternetAddress
    public final InternetAddress[] getGroup(boolean z10) throws AddressException {
        InternetAddress[] internetAddressArr = this.f65460u0;
        if (internetAddressArr == null) {
            return null;
        }
        return (InternetAddress[]) internetAddressArr.clone();
    }

    @Override // javax.mail.internet.InternetAddress
    public final boolean isGroup() {
        return this.f65459t0;
    }
}
