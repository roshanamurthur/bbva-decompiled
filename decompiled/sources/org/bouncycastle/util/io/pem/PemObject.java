package org.bouncycastle.util.io.pem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PemObject implements PemObjectGenerator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f91661d = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f91663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f91664c;

    public PemObject(String str, List list, byte[] bArr) {
        this.f91662a = str;
        this.f91663b = Collections.unmodifiableList(list);
        this.f91664c = bArr;
    }

    public byte[] getContent() {
        return this.f91664c;
    }

    public List getHeaders() {
        return this.f91663b;
    }

    public String getType() {
        return this.f91662a;
    }

    public PemObject(String str, byte[] bArr) {
        this(str, f91661d, bArr);
    }

    @Override // org.bouncycastle.util.io.pem.PemObjectGenerator
    public PemObject generate() throws PemGenerationException {
        return this;
    }
}
