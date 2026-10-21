package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class t0 extends c {
    public t0(boolean z10, int i10, byte[] bArr) {
        super(z10, i10, bArr);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c, com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(this.f65955p0 ? 96 : 64, this.f65956q0, this.f65957r0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        if (d()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(g()));
        stringBuffer.append(Constant.BRACKET_CLOSE);
        if (this.f65957r0 != null) {
            stringBuffer.append(" #");
            stringBuffer.append(e3.b(this.f65957r0));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
