package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CharToByteConverter;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Argon2Parameters {
    public static final int ARGON2_VERSION_10 = 16;
    public static final int ARGON2_VERSION_13 = 19;
    public static final int ARGON2_d = 0;
    public static final int ARGON2_i = 1;
    public static final int ARGON2_id = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f89189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f89193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f89194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharToByteConverter f89195i;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f89196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f89197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f89198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f89199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f89200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f89201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f89202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f89203h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharToByteConverter f89204i;

        public Builder() {
            this(1);
        }

        public Argon2Parameters build() {
            return new Argon2Parameters(this.f89203h, this.f89196a, this.f89197b, this.f89198c, this.f89199d, this.f89200e, this.f89201f, this.f89202g, this.f89204i);
        }

        public void clear() {
            Arrays.clear(this.f89196a);
            Arrays.clear(this.f89197b);
            Arrays.clear(this.f89198c);
        }

        public Builder withAdditional(byte[] bArr) {
            this.f89198c = Arrays.clone(bArr);
            return this;
        }

        public Builder withCharToByteConverter(CharToByteConverter charToByteConverter) {
            this.f89204i = charToByteConverter;
            return this;
        }

        public Builder withIterations(int i10) {
            this.f89199d = i10;
            return this;
        }

        public Builder withMemoryAsKB(int i10) {
            this.f89200e = i10;
            return this;
        }

        public Builder withMemoryPowOfTwo(int i10) {
            this.f89200e = 1 << i10;
            return this;
        }

        public Builder withParallelism(int i10) {
            this.f89201f = i10;
            return this;
        }

        public Builder withSalt(byte[] bArr) {
            this.f89196a = Arrays.clone(bArr);
            return this;
        }

        public Builder withSecret(byte[] bArr) {
            this.f89197b = Arrays.clone(bArr);
            return this;
        }

        public Builder withVersion(int i10) {
            this.f89202g = i10;
            return this;
        }

        public Builder(int i10) {
            this.f89204i = PasswordConverter.UTF8;
            this.f89203h = i10;
            this.f89201f = 1;
            this.f89200e = 4096;
            this.f89199d = 3;
            this.f89202g = 19;
        }
    }

    public Argon2Parameters(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, int i12, int i13, int i14, CharToByteConverter charToByteConverter) {
        this.f89187a = Arrays.clone(bArr);
        this.f89188b = Arrays.clone(bArr2);
        this.f89189c = Arrays.clone(bArr3);
        this.f89190d = i11;
        this.f89191e = i12;
        this.f89192f = i13;
        this.f89193g = i14;
        this.f89194h = i10;
        this.f89195i = charToByteConverter;
    }

    public void clear() {
        Arrays.clear(this.f89187a);
        Arrays.clear(this.f89188b);
        Arrays.clear(this.f89189c);
    }

    public byte[] getAdditional() {
        return Arrays.clone(this.f89189c);
    }

    public CharToByteConverter getCharToByteConverter() {
        return this.f89195i;
    }

    public int getIterations() {
        return this.f89190d;
    }

    public int getLanes() {
        return this.f89192f;
    }

    public int getMemory() {
        return this.f89191e;
    }

    public byte[] getSalt() {
        return Arrays.clone(this.f89187a);
    }

    public byte[] getSecret() {
        return Arrays.clone(this.f89188b);
    }

    public int getType() {
        return this.f89194h;
    }

    public int getVersion() {
        return this.f89193g;
    }
}
