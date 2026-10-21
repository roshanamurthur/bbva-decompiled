package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Mac;
import mm.a;
import mm.b;
import mm.c;

/* JADX INFO: loaded from: classes6.dex */
public class OutputStreamFactory {
    public static OutputStream createStream(MessageDigest messageDigest) {
        a aVar = new a();
        aVar.f83495p0 = messageDigest;
        return aVar;
    }

    public static OutputStream createStream(Signature signature) {
        c cVar = new c();
        cVar.f83497p0 = signature;
        return cVar;
    }

    public static OutputStream createStream(Mac mac) {
        b bVar = new b();
        bVar.f83496p0 = mac;
        return bVar;
    }
}
