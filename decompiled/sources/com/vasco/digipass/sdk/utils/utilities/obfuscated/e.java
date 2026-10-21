package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class e extends u {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final byte[] f66017q0 = {-1};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final byte[] f66018r0 = {0};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final e f66019s0 = new e(false);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final e f66020t0 = new e(true);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final byte[] f66021p0;

    public e(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b10 = bArr[0];
        if (b10 == 0) {
            this.f66021p0 = f66018r0;
        } else if ((b10 & 255) == 255) {
            this.f66021p0 = f66017q0;
        } else {
            this.f66021p0 = Arrays.clone(bArr);
        }
    }

    public static e b(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b10 = bArr[0];
        if (b10 == 0) {
            return f66019s0;
        }
        return (b10 & 255) == 255 ? f66020t0 : new e(bArr);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(1, this.f66021p0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() {
        return 3;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return false;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return this.f66021p0[0];
    }

    public String toString() {
        return this.f66021p0[0] != 0 ? "TRUE" : "FALSE";
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        return (uVar instanceof e) && this.f66021p0[0] == ((e) uVar).f66021p0[0];
    }

    public e(boolean z10) {
        this.f66021p0 = z10 ? f66017q0 : f66018r0;
    }
}
