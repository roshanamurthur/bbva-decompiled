package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected final boolean f65955p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected final int f65956q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    protected final byte[] f65957r0;

    public c(boolean z10, int i10, byte[] bArr) {
        this.f65955p0 = z10;
        this.f65956q0 = i10;
        this.f65957r0 = Arrays.clone(bArr);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(this.f65955p0 ? 96 : 64, this.f65956q0, this.f65957r0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        return i5.b(this.f65956q0) + i5.a(this.f65957r0.length) + this.f65957r0.length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return this.f65955p0;
    }

    public int g() {
        return this.f65956q0;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        boolean z10 = this.f65955p0;
        return ((z10 ? 1 : 0) ^ this.f65956q0) ^ Arrays.hashCode(this.f65957r0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (!(uVar instanceof c)) {
            return false;
        }
        c cVar = (c) uVar;
        return this.f65955p0 == cVar.f65955p0 && this.f65956q0 == cVar.f65956q0 && Arrays.areEqual(this.f65957r0, cVar.f65957r0);
    }
}
