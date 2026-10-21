package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.asn1.x9.X962NamedCurves;
import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes9.dex */
public class n2 {
    public static X9ECParameters a(String str) {
        X9ECParameters byName = X962NamedCurves.getByName(str);
        if (byName == null) {
            byName = y4.c(str);
        }
        if (byName == null) {
            byName = r3.a(str);
        }
        if (byName == null) {
            byName = m5.a(str);
        }
        if (byName == null) {
            byName = a.c(str);
        }
        return byName == null ? b3.c(str) : byName;
    }

    public static X9ECParameters a(p pVar) {
        X9ECParameters byOID = X962NamedCurves.getByOID(pVar);
        if (byOID == null) {
            byOID = y4.a(pVar);
        }
        if (byOID == null) {
            byOID = m5.a(pVar);
        }
        if (byOID == null) {
            byOID = a.a(pVar);
        }
        return byOID == null ? b3.a(pVar) : byOID;
    }

    public static Enumeration a() {
        Vector vector = new Vector();
        a(vector, X962NamedCurves.getNames());
        a(vector, y4.a());
        a(vector, r3.a());
        a(vector, m5.a());
        a(vector, a.a());
        a(vector, b3.a());
        return vector.elements();
    }

    private static void a(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }
}
