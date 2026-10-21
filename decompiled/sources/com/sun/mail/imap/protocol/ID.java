package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ID {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f65430a;

    public ID(Response response) throws ProtocolException {
        this.f65430a = null;
        response.skipSpaces();
        byte bPeekByte = response.peekByte();
        if (bPeekByte == 78 || bPeekByte == 110) {
            return;
        }
        if (bPeekByte != 40) {
            throw new ProtocolException("Missing '(' at start of ID");
        }
        this.f65430a = new HashMap();
        String[] stringList = response.readStringList();
        if (stringList != null) {
            for (int i10 = 0; i10 < stringList.length; i10 += 2) {
                String str = stringList[i10];
                if (str == null) {
                    throw new ProtocolException("ID field name null");
                }
                int i11 = i10 + 1;
                if (i11 >= stringList.length) {
                    throw new ProtocolException("ID field without value: ".concat(str));
                }
                this.f65430a.put(str, stringList[i11]);
            }
        }
        this.f65430a = Collections.unmodifiableMap(this.f65430a);
    }
}
