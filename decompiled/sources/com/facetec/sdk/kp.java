package com.facetec.sdk;

import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kp {
    public static kp a(@Nullable kn knVar, String str) {
        Charset charset = kz.f42210e;
        if (knVar != null) {
            Charset charsetA = knVar.a();
            if (charsetA == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(knVar);
                sb2.append("; charset=utf-8");
                knVar = kn.e(sb2.toString());
            } else {
                charset = charsetA;
            }
        }
        return d(knVar, str.getBytes(charset));
    }

    private static kp b(@Nullable final kn knVar, final byte[] bArr, final int i10) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        kz.a(bArr.length, i10);
        return new kp() { // from class: com.facetec.sdk.kp.2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ int f42125d = 0;

            @Override // com.facetec.sdk.kp
            @Nullable
            public final kn b() {
                return knVar;
            }

            @Override // com.facetec.sdk.kp
            public final long d() {
                return i10;
            }

            @Override // com.facetec.sdk.kp
            public final void b(ni niVar) throws IOException {
                niVar.c(bArr, this.f42125d, i10);
            }
        };
    }

    @Nullable
    public abstract kn b();

    public abstract void b(ni niVar) throws IOException;

    public long d() throws IOException {
        return -1L;
    }

    public static kp d(@Nullable kn knVar, byte[] bArr) {
        return b(knVar, bArr, bArr.length);
    }
}
