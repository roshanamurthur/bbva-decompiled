package org.bouncycastle.crypto.util;

import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;

/* JADX INFO: loaded from: classes5.dex */
public class ScryptConfig extends PBKDFConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89648e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f89649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f89650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f89651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f89652d = 16;

        public Builder(int i10, int i11, int i12) {
            if (i10 <= 1 || ((i10 - 1) & i10) != 0) {
                throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
            }
            this.f89649a = i10;
            this.f89650b = i11;
            this.f89651c = i12;
        }

        public ScryptConfig build() {
            return new ScryptConfig(this);
        }

        public Builder withSaltLength(int i10) {
            this.f89652d = i10;
            return this;
        }
    }

    public ScryptConfig(Builder builder) {
        super(MiscObjectIdentifiers.id_scrypt);
        this.f89645b = builder.f89649a;
        this.f89646c = builder.f89650b;
        this.f89647d = builder.f89651c;
        this.f89648e = builder.f89652d;
    }

    public int getBlockSize() {
        return this.f89646c;
    }

    public int getCostParameter() {
        return this.f89645b;
    }

    public int getParallelizationParameter() {
        return this.f89647d;
    }

    public int getSaltLength() {
        return this.f89648e;
    }
}
