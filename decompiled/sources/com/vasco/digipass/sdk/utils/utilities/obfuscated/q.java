package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q extends u implements r {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    byte[] f66256p0;

    public q(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f66256p0 = bArr;
    }

    public static q a(Object obj) {
        if (obj == null || (obj instanceof q)) {
            return (q) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return a((Object) u.a((byte[]) obj));
            } catch (IOException e5) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct OCTET STRING from byte[]: ")));
            }
        }
        if (obj instanceof g) {
            u aSN1Primitive = ((g) obj).toASN1Primitive();
            if (aSN1Primitive instanceof q) {
                return (q) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.r
    public InputStream b() {
        return new ByteArrayInputStream(this.f66256p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u e() {
        return new e1(this.f66256p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u f() {
        return new e1(this.f66256p0);
    }

    public byte[] g() {
        return this.f66256p0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return Arrays.hashCode(g());
    }

    public String toString() {
        return "#" + k5.b(e3.a(this.f66256p0));
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (uVar instanceof q) {
            return Arrays.areEqual(this.f66256p0, ((q) uVar).f66256p0);
        }
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.g3
    public u a() {
        return toASN1Primitive();
    }
}
