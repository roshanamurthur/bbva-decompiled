package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0007&\u001b'\u000e()*B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0007\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u001d\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0015J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u000e\u0010\u0018J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/mypinpad/tsdk/i/zw;", "Lcom/mypinpad/tsdk/i/zu;", "Lcom/mypinpad/tsdk/i/yk;", "p0", "", "p1", "Lcom/mypinpad/tsdk/i/aco;", "setX", "(Lcom/mypinpad/tsdk/i/yk;J)Lcom/mypinpad/tsdk/i/aco;", "", "setCompoundDrawableTintBlendMode", "()V", "(Lcom/mypinpad/tsdk/i/yk;)V", "Lcom/mypinpad/tsdk/i/yr;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/yr;)J", "Lcom/mypinpad/tsdk/i/acp;", "(Lcom/mypinpad/tsdk/i/yr;)Lcom/mypinpad/tsdk/i/acp;", "setY", "Lcom/mypinpad/tsdk/i/ye;", "", "(Lcom/mypinpad/tsdk/i/ye;Ljava/lang/String;)V", "", "Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "(Z)Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "(Lcom/mypinpad/tsdk/i/yr;)V", "Lcom/mypinpad/tsdk/i/zi;", "b", "Lcom/mypinpad/tsdk/i/zi;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/zi;", "Lcom/mypinpad/tsdk/i/ym;", "Lcom/mypinpad/tsdk/i/aby;", "p2", "Lcom/mypinpad/tsdk/i/abv;", "p3", "<init>", "(Lcom/mypinpad/tsdk/i/ym;Lcom/mypinpad/tsdk/i/zi;Lcom/mypinpad/tsdk/i/aby;Lcom/mypinpad/tsdk/i/abv;)V", "e", "a", "f", "d", "c"}, k = 1, mv = {1, 6, 0})
public final class zw implements zu {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f62459h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f62460i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ym f62461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zi setDividerPadding;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final aby f62463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final abv f62464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final aaa f62466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ye f62467g;

    public final class a extends e {
        public static int E0 = 1;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static int f62468y0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @NotNull
        public final yg f62469u0;
        public long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f62470w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ zw f62471x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull zw zwVar, yg ygVar) {
            super(zwVar);
            Intrinsics.checkNotNullParameter(zwVar, "");
            Intrinsics.checkNotNullParameter(ygVar, "");
            this.f62471x0 = zwVar;
            this.f62469u0 = ygVar;
            this.v0 = -1L;
            this.f62470w0 = true;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:21:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:23:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:24:0x00f6  */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x02bf, code lost:
        
            if (kotlin.text.l.startsWith$default(r4, com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic.ID_SEPARATOR, false, 2, null) != false) goto L69;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Long g(java.lang.Object[] r16, int r17, int r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 980
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.zw.a.g(java.lang.Object[], int, int):java.lang.Long");
        }

        @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            System.identityHashCode(this);
            g(new Object[]{this}, 1108047221, -1108047219);
        }

        @Override // com.mypinpad.tsdk.i.zw.e, com.mypinpad.tsdk.isolation.acp
        public final long setY(@NotNull abx abxVar, long j10) {
            Object[] objArr = {this, abxVar, Long.valueOf(j10)};
            System.identityHashCode(this);
            return g(objArr, -2043111091, 2043111091).longValue();
        }
    }

    public final class b implements aco {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f62472s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f62473t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final abz f62474p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f62475q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ zw f62476r0;

        public b(zw zwVar) {
            Intrinsics.checkNotNullParameter(zwVar, "");
            this.f62476r0 = zwVar;
            this.f62474p0 = new abz(zw.setDividerPadding(zwVar).setY());
        }

        public static /* synthetic */ abz a(Object[] objArr, int i10, int i11, int i12) throws IOException {
            int i13 = (i11 * (-463)) + (i10 * 465);
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = ~(i14 | i15);
            int i17 = ~(i14 | i10);
            if ((((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13 == 1) {
                b bVar = (b) objArr[0];
                int i18 = f62472s0;
                int i19 = i18 & 65;
                int i20 = -(-((i18 ^ 65) | i19));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f62473t0 = i21 % 128;
                if (i21 % 2 != 0) {
                    return bVar.f62474p0;
                }
                abz abzVar = bVar.f62474p0;
                throw null;
            }
            b bVar2 = (b) objArr[0];
            abx abxVar = (abx) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i22 = f62473t0;
            int i23 = i22 & 103;
            int i24 = -(-((i22 ^ 103) | i23));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f62472s0 = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(abxVar, "");
            if (bVar2.f62475q0) {
                int i27 = f62472s0;
                int i28 = (i27 & (-4)) | ((~i27) & 3);
                int i29 = (i27 & 3) << 1;
                int i30 = (i28 & i29) + (i29 | i28);
                f62473t0 = i30 % 128;
                int i31 = i30 % 2;
                throw new IllegalStateException("closed".toString());
            }
            int i32 = f62472s0;
            int i33 = i32 & 49;
            int i34 = ((i32 | 49) & (~i33)) + (i33 << 1);
            int i35 = i34 % 128;
            f62473t0 = i35;
            int i36 = i34 % 2;
            if (jLongValue == 0) {
                int i37 = i35 & 95;
                int i38 = -(-((i35 ^ 95) | i37));
                int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                f62472s0 = i39 % 128;
                int i40 = i39 % 2;
                return null;
            }
            zw zwVar = bVar2.f62476r0;
            ((abv) zw.setDividerPadding(new Object[]{zwVar}, -1525841327, 1525841341, (int) System.currentTimeMillis())).setIncludeFontPadding(jLongValue);
            ((abv) zw.setDividerPadding(new Object[]{zwVar}, -1525841327, 1525841341, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode("\r\n");
            ((abv) zw.setDividerPadding(new Object[]{zwVar}, -1525841327, 1525841341, (int) System.currentTimeMillis())).setDividerPadding(abxVar, jLongValue);
            ((abv) zw.setDividerPadding(new Object[]{zwVar}, -1525841327, 1525841341, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode("\r\n");
            int i41 = f62472s0 + 73;
            f62473t0 = i41 % 128;
            if (i41 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            int i10 = f62473t0;
            int i11 = i10 & 65;
            int i12 = (i10 | 65) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i12 | i13);
            int i15 = i14 % 128;
            f62472s0 = i15;
            int i16 = i14 % 2;
            if (this.f62475q0) {
                int i17 = i15 & 99;
                int i18 = ((i15 ^ 99) | i17) << 1;
                int i19 = -((i15 | 99) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                f62473t0 = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 5 / 0;
                    return;
                }
                return;
            }
            this.f62475q0 = true;
            ((abv) zw.setDividerPadding(new Object[]{this.f62476r0}, -1525841327, 1525841341, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode("0\r\n\r\n");
            zw.setDividerPadding(new Object[]{this.f62474p0}, -1825276854, 1825276862, (int) System.currentTimeMillis());
            zw.setDividerPadding(new Object[]{this.f62476r0, 3}, 797643836, -797643824, 3);
            int i22 = f62473t0;
            int i23 = (((i22 | 30) << 1) - (i22 ^ 30)) - 1;
            f62472s0 = i23 % 128;
            int i24 = i23 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            if (r5.f62475q0 != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            r1 = r0 & 21;
            r0 = (r0 ^ 21) | r1;
            r2 = (r1 & r0) + (r0 | r1);
            com.mypinpad.tsdk.i.zw.b.f62473t0 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        
            ((com.mypinpad.tsdk.isolation.abv) com.mypinpad.tsdk.isolation.zw.setDividerPadding(new java.lang.Object[]{r5.f62476r0}, -1525841327, 1525841341, (int) java.lang.System.currentTimeMillis())).flush();
            r0 = com.mypinpad.tsdk.i.zw.b.f62472s0;
            r1 = r0 & 5;
            r1 = (r1 - (~((r0 ^ 5) | r1))) - 1;
            com.mypinpad.tsdk.i.zw.b.f62473t0 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        
            if ((r1 % 2) == 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        
            if (r5.f62475q0 != false) goto L16;
         */
        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized void flush() {
            /*
                r5 = this;
                monitor-enter(r5)
                int r0 = com.mypinpad.tsdk.i.zw.b.f62472s0     // Catch: java.lang.Throwable -> L23
                r1 = r0 & 33
                r2 = r0 ^ 33
                r2 = r2 | r1
                int r2 = -r2
                int r2 = -r2
                r3 = r1 | r2
                r4 = 1
                int r3 = r3 << r4
                r1 = r1 ^ r2
                int r3 = r3 - r1
                int r1 = r3 % 128
                com.mypinpad.tsdk.i.zw.b.f62473t0 = r1     // Catch: java.lang.Throwable -> L23
                int r3 = r3 % 2
                r1 = 0
                if (r3 != 0) goto L25
                boolean r2 = r5.f62475q0     // Catch: java.lang.Throwable -> L23
                r3 = 90
                int r3 = r3 / r1
                if (r2 == 0) goto L3a
                goto L29
            L21:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L23
            L23:
                r0 = move-exception
                goto L6c
            L25:
                boolean r2 = r5.f62475q0     // Catch: java.lang.Throwable -> L23
                if (r2 == 0) goto L3a
            L29:
                r1 = r0 & 21
                r0 = r0 ^ 21
                r0 = r0 | r1
                r2 = r1 & r0
                r0 = r0 | r1
                int r2 = r2 + r0
                int r0 = r2 % 128
                com.mypinpad.tsdk.i.zw.b.f62473t0 = r0     // Catch: java.lang.Throwable -> L23
                int r2 = r2 % 2
                monitor-exit(r5)
                return
            L3a:
                com.mypinpad.tsdk.i.zw r0 = r5.f62476r0     // Catch: java.lang.Throwable -> L23
                java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L23
                r2[r1] = r0     // Catch: java.lang.Throwable -> L23
                long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L23
                int r0 = (int) r0     // Catch: java.lang.Throwable -> L23
                r1 = -1525841327(0xffffffffa50d8251, float:-1.2273953E-16)
                r3 = 1525841341(0x5af27dbd, float:3.4127598E16)
                java.lang.Object r0 = com.mypinpad.tsdk.isolation.zw.setDividerPadding(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L23
                com.mypinpad.tsdk.i.abv r0 = (com.mypinpad.tsdk.isolation.abv) r0     // Catch: java.lang.Throwable -> L23
                r0.flush()     // Catch: java.lang.Throwable -> L23
                int r0 = com.mypinpad.tsdk.i.zw.b.f62472s0     // Catch: java.lang.Throwable -> L23
                r1 = r0 & 5
                r0 = r0 ^ 5
                r0 = r0 | r1
                int r0 = ~r0     // Catch: java.lang.Throwable -> L23
                int r1 = r1 - r0
                int r1 = r1 - r4
                int r0 = r1 % 128
                com.mypinpad.tsdk.i.zw.b.f62473t0 = r0     // Catch: java.lang.Throwable -> L23
                int r1 = r1 % 2
                if (r1 == 0) goto L68
                monitor-exit(r5)
                return
            L68:
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L6a
            L6a:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L23
            L6c:
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.zw.b.flush():void");
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        public final void setDividerPadding(@NotNull abx abxVar, long j10) throws IOException {
            a(new Object[]{this, abxVar, Long.valueOf(j10)}, -1764363906, 1764363906, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        @NotNull
        public final acq setY() {
            return a(new Object[]{this}, -361635286, 361635287, System.identityHashCode(this));
        }
    }

    public final class c extends e {
        public static int v0 = 0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f62477w0 = 1;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f62478u0;

        public c() {
            throw null;
        }

        public static /* synthetic */ Long g(Object[] objArr, int i10, int i11, int i12) throws IOException {
            long jValueOf;
            int i13 = (i11 * (-929)) + (i10 * (-464));
            int i14 = ~i10;
            int i15 = i11 | i12;
            if (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13 != 1) {
                c cVar = (c) objArr[0];
                abx abxVar = (abx) objArr[1];
                long jLongValue = ((Number) objArr[2]).longValue();
                int i16 = v0;
                int i17 = i16 ^ 107;
                int i18 = ((((i16 & 107) | i17) << 1) - (~(-i17))) - 1;
                f62477w0 = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(abxVar, "");
                if (jLongValue < 0) {
                    int i20 = v0;
                    int i21 = ((i20 | 43) << 1) - (i20 ^ 43);
                    f62477w0 = i21 % 128;
                    int i22 = i21 % 2;
                    throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue)).toString());
                }
                int i23 = v0;
                int i24 = i23 ^ 115;
                int i25 = (((i23 & 115) | i24) << 1) - i24;
                f62477w0 = i25 % 128;
                int i26 = i25 % 2;
                int i27 = i23 + 116;
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                f62477w0 = i28 % 128;
                int i29 = i28 % 2;
                if (cVar.setX()) {
                    int i30 = v0 + 9;
                    f62477w0 = i30 % 128;
                    int i31 = i30 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i32 = v0;
                int i33 = ((i32 ^ 22) + ((i32 & 22) << 1)) - 1;
                f62477w0 = i33 % 128;
                int i34 = i33 % 2;
                int i35 = i32 + 89;
                int i36 = i35 % 128;
                f62477w0 = i36;
                int i37 = i35 % 2;
                if (!cVar.f62478u0) {
                    long y7 = super.setY(abxVar, jLongValue);
                    if (y7 == -1) {
                        int i38 = v0;
                        int i39 = (-2) - (((i38 & 26) + (i38 | 26)) ^ (-1));
                        f62477w0 = i39 % 128;
                        int i40 = i39 % 2;
                        cVar.f62478u0 = true;
                        cVar.e();
                        int i41 = (-2) - ((v0 + 76) ^ (-1));
                        f62477w0 = i41 % 128;
                        int i42 = i41 % 2;
                    } else {
                        int i43 = f62477w0 + 66;
                        int i44 = (i43 ^ (-1)) + (i43 << 1);
                        v0 = i44 % 128;
                        int i45 = i44 % 2;
                        jValueOf = Long.valueOf(y7);
                    }
                    return jValueOf;
                }
                int i46 = (-2) - ((i36 + 38) ^ (-1));
                v0 = i46 % 128;
                if (i46 % 2 != 0) {
                    throw null;
                }
                jValueOf = -1L;
                return jValueOf;
            }
            c cVar2 = (c) objArr[0];
            int i47 = v0;
            int i48 = i47 & 39;
            int i49 = i47 | 39;
            int i50 = (i48 & i49) + (i49 | i48);
            f62477w0 = i50 % 128;
            if (i50 % 2 == 0) {
                cVar2.setX();
                throw null;
            }
            if (!cVar2.setX()) {
                if (!cVar2.f62478u0) {
                    int i51 = v0;
                    int i52 = i51 & 119;
                    int i53 = ((i51 ^ 119) | i52) << 1;
                    int i54 = -((i51 | 119) & (~i52));
                    int i55 = (i53 & i54) + (i54 | i53);
                    f62477w0 = i55 % 128;
                    if (i55 % 2 == 0) {
                        cVar2.e();
                        throw null;
                    }
                    cVar2.e();
                }
                cVar2.b();
                int i56 = v0;
                int i57 = i56 & 27;
                int i58 = i56 | 27;
                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                f62477w0 = i59 % 128;
                int i60 = i59 % 2;
                return null;
            }
            int iIdentityHashCode = System.identityHashCode(cVar2);
            int i61 = ~(((-2132356646) & iIdentityHashCode) | ((-2132356646) ^ iIdentityHashCode));
            int i62 = (i61 & 990971392) | (990971392 ^ i61);
            int i63 = ~iIdentityHashCode;
            int i64 = i63 & (i63 | iIdentityHashCode);
            int i65 = ((-993220243) & i64) | ((~i64) & 993220242);
            int i66 = i64 & 993220242;
            int i67 = (i66 & i65) | (i65 ^ i66);
            int i68 = ~((i67 & 2132356645) | (i67 ^ 2132356645));
            int i69 = 730695861 - (~(-(~(-(-(((i62 & i68) | (i62 ^ i68)) * (-470)))))));
            int i70 = (-1141385254) & iIdentityHashCode;
            int i71 = (iIdentityHashCode | (-1141385254)) & (~i70);
            int i72 = (i71 & i70) | (i71 ^ i70);
            int i73 = ~i72;
            int i74 = (i72 | i73) & i73;
            int i75 = i74 & i68;
            int i76 = (((i74 | i68) & (~i75)) | i75) * 470;
            int i77 = i69 & i76;
            int i78 = (i76 | i69) & (~i77);
            int i79 = -(-(i77 << 1));
            int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
            int iIdentityHashCode2 = System.identityHashCode(cVar2);
            int i81 = (-562078339) & iIdentityHashCode2;
            int i82 = ((-562078339) | iIdentityHashCode2) & (~i81);
            int i83 = ~iIdentityHashCode2;
            int i84 = ~(i82 | i81);
            int i85 = 469833752 & i84;
            int i86 = (-720239817) - (~((((i84 | 469833752) & (~i85)) | i85) * 501));
            int i87 = (i86 | 237900288) << 1;
            int i88 = -((237900288 & (~i86)) | ((-237900289) & i86));
            int i89 = (i87 & i88) + (i88 | i87);
            int i90 = 1546590333 & i83;
            int i91 = (i83 | 1546590333) & (~i90);
            int i92 = (i91 & i90) | (i91 ^ i90);
            int i93 = (1638834919 & i92) | ((~i92) & (-1638834920));
            int i94 = i92 & (-1638834920);
            int i95 = (~((i94 & i93) | (i93 ^ i94))) * 501;
            int i96 = ((~i95) & i89) | ((~i89) & i95);
            int i97 = (i95 & i89) << 1;
            if (i80 <= (i96 & i97) + (i97 | i96)) {
                return null;
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            g(new Object[]{this}, -162880437, 162880438, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.zw.e, com.mypinpad.tsdk.isolation.acp
        public final long setY(@NotNull abx abxVar, long j10) {
            return g(new Object[]{this, abxVar, Long.valueOf(j10)}, 1060720122, -1060720122, System.identityHashCode(this)).longValue();
        }
    }

    public final class d implements aco {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f62479s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f62480t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final abz f62481p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f62482q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ zw f62483r0;

        public d(zw zwVar) {
            Intrinsics.checkNotNullParameter(zwVar, "");
            this.f62483r0 = zwVar;
            this.f62481p0 = new abz(zw.setDividerPadding(zwVar).setY());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
        
            if (r0.f62482q0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        
            if (r0.f62482q0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            r1 = java.lang.System.identityHashCode(r0);
            r2 = ~(((-564250651) & r1) | ((-564250651) ^ r1));
            r2 = -(-(((r2 & (-471939457)) | ((-471939457) ^ r2)) * (-318)));
            r7 = 326378726 & r2;
            r2 = -(-((r2 ^ 326378726) | r7));
            r5 = (r7 & r2) + (r2 | r7);
            r2 = (-471939457) & r1;
            r2 = r2 | ((~r2) & ((-471939457) | r1));
            r7 = ~r2;
            r2 = (r2 | r7) & r7;
            r7 = ~r1;
            r9 = r7 ^ 564250650;
            r10 = r7 & 564250650;
            r9 = (r9 & r10) | (r9 ^ r10);
            r9 = ~((r9 & 471939456) | (r9 ^ 471939456));
            r2 = -(-(((r2 & r9) | (r2 ^ r9)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            r10 = r5 & r2;
            r9 = ((r5 ^ r2) | r10) << 1;
            r2 = -((r2 | r5) & (~r10));
            r5 = (r9 & r2) + (r2 | r9);
            r2 = (-471939457) ^ r7;
            r4 = (-471939457) & r7;
            r2 = (r2 & r4) | (r2 ^ r4);
            r2 = (r2 & 564250650) | (r2 ^ 564250650);
            r4 = ~r2;
            r2 = (r2 | r4) & r4;
            r7 = 1034025370 & r1;
            r1 = (r1 | 1034025370) & (~r7);
            r1 = ~((r1 & r7) | (r1 ^ r7));
            r4 = ((~r1) & r2) | ((~r2) & r1);
            r1 = r1 & r2;
            r1 = ((r1 & r4) | (r4 ^ r1)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET;
            r2 = r5 & r1;
            r1 = ((r1 | r5) & (~r2)) + (r2 << 1);
            r0 = java.lang.System.identityHashCode(r0);
            r2 = ~r0;
            r4 = ((~r2) & 792172530) | ((-792172531) & r2);
            r5 = 792172530 & r2;
            r4 = ~((r4 & r5) | (r4 ^ r5));
            r7 = r4 ^ (-2147481591);
            r4 = r4 & (-2147481591);
            r4 = (r4 & r7) | (r7 ^ r4);
            r7 = (-86085985) ^ r0;
            r0 = r0 & (-86085985);
            r5 = ~((r7 ^ r0) | (r7 & r0));
            r8 = r4 ^ r5;
            r4 = r4 & r5;
            r4 = ((r4 & r8) | (r8 ^ r4)) * (-713);
            r8 = 1548408354 & r4;
            r4 = -(-((r4 ^ 1548408354) | r8));
            r0 = (-2) - ((((r8 ^ r4) + ((r4 & r8) << 1)) - (~(-(-((~(r0 | r7)) * 1426))))) ^ (-1));
            r5 = (-1441395045) & r2;
            r2 = (r2 | (-1441395045)) & (~r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x013a, code lost:
        
            if (r1 <= ((r0 - (~(-(-((~((r2 & r5) | (r2 ^ r5))) * 713))))) - 1)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x013e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x013f, code lost:
        
            ((com.mypinpad.tsdk.isolation.abv) com.mypinpad.tsdk.isolation.zw.setDividerPadding(new java.lang.Object[]{r0.f62483r0}, -1525841327, 1525841341, (int) java.lang.System.currentTimeMillis())).flush();
            r0 = (-2) - ((com.mypinpad.tsdk.i.zw.d.f62480t0 + 110) ^ (-1));
            com.mypinpad.tsdk.i.zw.d.f62479s0 = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ com.mypinpad.tsdk.isolation.abz a(java.lang.Object[] r15, int r16, int r17, int r18) throws java.security.NoSuchAlgorithmException, java.io.IOException, java.lang.CloneNotSupportedException {
            /*
                Method dump skipped, instruction units count: 657
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.zw.d.a(java.lang.Object[], int, int, int):com.mypinpad.tsdk.i.abz");
        }

        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            a(new Object[]{this}, 1723016259, -1723016256, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
        public final void flush() throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            a(new Object[]{this}, -1171501334, 1171501334, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        public final void setDividerPadding(@NotNull abx abxVar, long j10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            a(new Object[]{this, abxVar, Long.valueOf(j10)}, -1175241861, 1175241862, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        @NotNull
        public final acq setY() {
            return a(new Object[]{this}, -219140128, 219140130, System.identityHashCode(this));
        }
    }

    public final class f extends e {

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f62489w0 = 0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f62490x0 = 1;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f62491u0;
        public final /* synthetic */ zw v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(zw zwVar, long j10) {
            super(zwVar);
            Intrinsics.checkNotNullParameter(zwVar, "");
            this.v0 = zwVar;
            this.f62491u0 = j10;
            if (j10 == 0) {
                e();
            }
        }

        public static /* synthetic */ Long g(Object[] objArr, int i10, int i11, int i12) throws IOException {
            long jValueOf;
            int i13 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
            int i14 = ~i11;
            if ((((~(i10 | i14 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i14 | i12)) | i10) * (-366)) + i13 != 1) {
                f fVar = (f) objArr[0];
                int i15 = f62489w0;
                int i16 = ((i15 | 31) << 1) - (i15 ^ 31);
                f62490x0 = i16 % 128;
                int i17 = i16 % 2;
                if (fVar.setX()) {
                    int i18 = f62490x0;
                    int i19 = ((i18 & (-36)) | ((~i18) & 35)) + ((i18 & 35) << 1);
                    f62489w0 = i19 % 128;
                    if (i19 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                if (fVar.f62491u0 != 0) {
                    int i20 = f62489w0;
                    int i21 = (i20 & (-84)) | ((~i20) & 83);
                    int i22 = (i20 & 83) << 1;
                    int i23 = (i21 & i22) + (i22 | i21);
                    f62490x0 = i23 % 128;
                    if (i23 % 2 == 0) {
                        yt.setY(fVar, TimeUnit.MILLISECONDS);
                        throw null;
                    }
                    if (!yt.setY(fVar, TimeUnit.MILLISECONDS)) {
                        int i24 = f62490x0;
                        int i25 = i24 & 91;
                        int i26 = i25 + ((i24 ^ 91) | i25);
                        f62489w0 = i26 % 128;
                        int i27 = i26 % 2;
                        zw zwVar = fVar.v0;
                        ((zi) zw.setDividerPadding(new Object[]{zwVar}, -2047549538, 2047549540, System.identityHashCode(zwVar))).setOnDragListener();
                        fVar.e();
                        int i28 = f62489w0 + 55;
                        f62490x0 = i28 % 128;
                        int i29 = i28 % 2;
                    }
                }
                fVar.b();
                int i30 = f62490x0;
                int i31 = ((i30 ^ 122) + ((i30 & 122) << 1)) - 1;
                f62489w0 = i31 % 128;
                int i32 = i31 % 2;
                return null;
            }
            f fVar2 = (f) objArr[0];
            abx abxVar = (abx) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i33 = f62489w0;
            int i34 = (i33 & 17) + (i33 | 17);
            f62490x0 = i34 % 128;
            int i35 = i34 % 2;
            Intrinsics.checkNotNullParameter(abxVar, "");
            if (jLongValue < 0) {
                System.identityHashCode(fVar2);
                System.identityHashCode(fVar2);
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(jLongValue)).toString());
            }
            int i36 = f62489w0;
            int i37 = i36 & 5;
            int i38 = (i36 | 5) & (~i37);
            int i39 = i37 << 1;
            int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
            int i41 = i40 % 128;
            f62490x0 = i41;
            int i42 = i40 % 2;
            int i43 = i41 & 103;
            int i44 = ((i41 | 103) & (~i43)) + (i43 << 1);
            f62489w0 = i44 % 128;
            int i45 = i44 % 2;
            if (!fVar2.setX()) {
                int i46 = f62490x0;
                int i47 = i46 & 121;
                int i48 = (i47 - (~((i46 ^ 121) | i47))) - 1;
                f62489w0 = i48 % 128;
                if (i48 % 2 == 0) {
                    long j10 = fVar2.f62491u0;
                    if (j10 == 0) {
                        int i49 = i46 & 17;
                        int i50 = i49 + ((i46 ^ 17) | i49);
                        f62489w0 = i50 % 128;
                        if (i50 % 2 != 0) {
                            throw null;
                        }
                        int i51 = ((i46 ^ 78) + ((i46 & 78) << 1)) - 1;
                        f62489w0 = i51 % 128;
                        if (i51 % 2 != 0) {
                            throw null;
                        }
                        jValueOf = -1L;
                    } else {
                        long y7 = super.setY(abxVar, Math.min(j10, jLongValue));
                        if (y7 == -1) {
                            zw zwVar2 = fVar2.v0;
                            ((zi) zw.setDividerPadding(new Object[]{zwVar2}, -2047549538, 2047549540, System.identityHashCode(zwVar2))).setOnDragListener();
                            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                            fVar2.e();
                            throw protocolException;
                        }
                        long j11 = fVar2.f62491u0 - y7;
                        fVar2.f62491u0 = j11;
                        if (j11 == 0) {
                            int i52 = f62489w0 + 85;
                            f62490x0 = i52 % 128;
                            if (i52 % 2 == 0) {
                                fVar2.e();
                                int i53 = 63 / 0;
                            } else {
                                fVar2.e();
                            }
                            int i54 = f62489w0;
                            int i55 = (((i54 | 22) << 1) - (i54 ^ 22)) - 1;
                            f62490x0 = i55 % 128;
                            int i56 = i55 % 2;
                        }
                        int i57 = f62490x0;
                        int i58 = ((i57 & 94) + (i57 | 94)) - 1;
                        f62489w0 = i58 % 128;
                        if (i58 % 2 != 0) {
                            throw null;
                        }
                        jValueOf = Long.valueOf(y7);
                    }
                    return jValueOf;
                }
            } else {
                int i59 = f62490x0;
                int i60 = ((i59 ^ 99) - (~(-(-((i59 & 99) << 1))))) - 1;
                f62489w0 = i60 % 128;
                int i61 = i60 % 2;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            g(new Object[]{this}, -440202750, 440202750, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.zw.e, com.mypinpad.tsdk.isolation.acp
        public final long setY(@NotNull abx abxVar, long j10) {
            return g(new Object[]{this, abxVar, Long.valueOf(j10)}, 1413991316, -1413991315, System.identityHashCode(this)).longValue();
        }
    }

    static {
        int i10 = f62460i + 27;
        f62459h = i10 % 128;
        int i11 = i10 % 2;
    }

    public zw(@Nullable ym ymVar, @NotNull zi ziVar, @NotNull aby abyVar, @NotNull abv abvVar) {
        Intrinsics.checkNotNullParameter(ziVar, "");
        Intrinsics.checkNotNullParameter(abyVar, "");
        Intrinsics.checkNotNullParameter(abvVar, "");
        this.f62461a = ymVar;
        this.setDividerPadding = ziVar;
        this.f62463c = abyVar;
        this.f62464d = abvVar;
        this.f62466f = new aaa(abyVar);
    }

    public static /* synthetic */ void a(Object[] objArr) throws Throwable {
        zw zwVar = (zw) objArr[0];
        int i10 = f62459h;
        int i11 = (i10 & 65) + (i10 | 65);
        f62460i = i11 % 128;
        if (i11 % 2 == 0) {
            zi ziVar = (zi) setDividerPadding(new Object[]{zwVar}, -2047549538, 2047549540, System.identityHashCode(zwVar));
            zi.setY(new Object[]{ziVar}, -1983939424, 1983939433, System.identityHashCode(ziVar));
            throw null;
        }
        zi ziVar2 = (zi) setDividerPadding(new Object[]{zwVar}, -2047549538, 2047549540, System.identityHashCode(zwVar));
        zi.setY(new Object[]{ziVar2}, -1983939424, 1983939433, System.identityHashCode(ziVar2));
        int i12 = f62459h + 121;
        f62460i = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        yr yrVar = (yr) objArr[0];
        int i10 = f62459h;
        int i11 = i10 & 123;
        int i12 = ((i10 ^ 123) | i11) << 1;
        int i13 = -((i10 | 123) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f62460i = i14 % 128;
        int i15 = i14 % 2;
        boolean zEquals = l.equals("chunked", (String) yr.setX(new Object[]{yrVar, "Transfer-Encoding"}, 401167373, -401167369, (int) System.currentTimeMillis()), true);
        int i16 = f62459h;
        int i17 = i16 & 49;
        int i18 = i16 | 49;
        int i19 = (i17 & i18) + (i18 | i17);
        f62460i = i19 % 128;
        if (i19 % 2 != 0) {
            return Boolean.valueOf(zEquals);
        }
        int i20 = 2 / 0;
        return Boolean.valueOf(zEquals);
    }

    public static /* synthetic */ aby c(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        int i10 = f62460i;
        int i11 = (i10 & (-44)) | ((~i10) & 43);
        int i12 = -(-((i10 & 43) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f62459h = i14;
        int i15 = i13 % 2;
        aby abyVar = zwVar.f62463c;
        int i16 = i14 + 67;
        f62460i = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 71 / 0;
        }
        return abyVar;
    }

    public static /* synthetic */ d d(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        int i10 = f62460i;
        int i11 = ((i10 ^ 112) + ((i10 & 112) << 1)) - 1;
        int i12 = i11 % 128;
        f62459h = i12;
        int i13 = i11 % 2;
        int i14 = zwVar.f62465e;
        if (i14 != 1) {
            int i15 = i10 + 89;
            f62459h = i15 % 128;
            int i16 = i15 % 2;
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i14)).toString());
        }
        int i17 = i12 & 63;
        int i18 = -(-(i12 | 63));
        int i19 = (i17 & i18) + (i17 | i18);
        int i20 = i19 % 128;
        f62460i = i20;
        int i21 = i19 % 2;
        int i22 = ((i20 | 13) << 1) - (((~i20) & 13) | (i20 & (-14)));
        f62459h = i22 % 128;
        int i23 = i22 % 2;
        zwVar.f62465e = 2;
        d dVar = new d(zwVar);
        int i24 = f62460i;
        int i25 = i24 ^ 47;
        int i26 = ((((i24 & 47) | i25) << 1) - (~(-i25))) - 1;
        f62459h = i26 % 128;
        if (i26 % 2 != 0) {
            int i27 = 60 / 0;
        }
        return dVar;
    }

    public static /* synthetic */ yr.setDividerPadding e(Object[] objArr) throws IOException {
        zw zwVar = (zw) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f62460i;
        int i11 = ~i10;
        int i12 = (((i10 & (-50)) | (49 & i11)) - (~(-(-((i10 & 49) << 1))))) - 1;
        f62459h = i12 % 128;
        int i13 = i12 % 2;
        int i14 = zwVar.f62465e;
        aaa aaaVar = zwVar.f62466f;
        if (i14 != 1) {
            int i15 = (i10 & 45) + (i10 | 45);
            f62459h = i15 % 128;
            int i16 = i15 % 2;
            if (i14 != 3) {
                int i17 = ((i10 & (-68)) | (i11 & 67)) + ((i10 & 67) << 1);
                f62459h = i17 % 128;
                int i18 = i17 % 2;
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i14)).toString());
            }
        }
        int i19 = f62459h;
        int i20 = i19 & 109;
        int i21 = (i20 - (~((i19 ^ 109) | i20))) - 1;
        f62460i = i21 % 128;
        int i22 = i21 % 2;
        try {
            zy.Companion companion = zy.INSTANCE;
            zy zyVar = (zy) zy.Companion.setY(new Object[]{(String) aaa.setDividerPadding(new Object[]{aaaVar}, 1848816107, -1848816106, System.identityHashCode(aaaVar))}, -1723180197, 1723180197, (int) System.currentTimeMillis());
            yr.setDividerPadding setdividerpadding = new yr.setDividerPadding();
            yr.setDividerPadding setdividerpadding2 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding, zyVar.setCompoundDrawableTintBlendMode}, 1826457204, -1826457177, System.identityHashCode(setdividerpadding));
            int i23 = zyVar.setDividerPadding;
            yr.setDividerPadding setdividerpadding3 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding2, Integer.valueOf(i23)}, 784510625, -784510596, i23);
            yr.setDividerPadding setdividerpadding4 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding3, zyVar.setY}, 176587316, -176587297, System.identityHashCode(setdividerpadding3));
            yr.setDividerPadding setdividerpadding5 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding4, (ye) aaa.setDividerPadding(new Object[]{aaaVar}, -357327575, 357327575, System.identityHashCode(aaaVar))}, 1273569601, -1273569577, System.identityHashCode(setdividerpadding4));
            if (!(!zBooleanValue)) {
                int i24 = f62459h;
                int i25 = i24 & 31;
                int i26 = -(-((i24 ^ 31) | i25));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                f62460i = i27 % 128;
                int i28 = i27 % 2;
                if (zyVar.setDividerPadding == 100) {
                    int i29 = ((i24 & 80) + (i24 | 80)) - 1;
                    int i30 = i29 % 128;
                    f62460i = i30;
                    int i31 = i29 % 2;
                    int i32 = ((i30 & (-118)) | ((~i30) & 117)) + ((i30 & 117) << 1);
                    f62459h = i32 % 128;
                    if (i32 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
            }
            if (zyVar.setDividerPadding != 100) {
                zwVar.f62465e = 4;
                int i33 = f62460i;
                int i34 = (-2) - ((((i33 | 58) << 1) - (i33 ^ 58)) ^ (-1));
                f62459h = i34 % 128;
                if (i34 % 2 == 0) {
                    return setdividerpadding5;
                }
                throw null;
            }
            int i35 = f62459h;
            int i36 = i35 | 103;
            int i37 = i36 << 1;
            int i38 = -(i36 & (~(i35 & 103)));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f62460i = i39 % 128;
            if (i39 % 2 == 0) {
                zwVar.f62465e = 4;
            } else {
                zwVar.f62465e = 3;
            }
            int i40 = i35 + 35;
            f62460i = i40 % 128;
            if (i40 % 2 != 0) {
                return setdividerpadding5;
            }
            throw null;
        } catch (EOFException e5) {
            zi ziVar = (zi) setDividerPadding(new Object[]{zwVar}, -2047549538, 2047549540, System.identityHashCode(zwVar));
            yp ypVar = (yp) zi.setY(new Object[]{ziVar}, 2102358168, -2102358143, System.identityHashCode(ziVar));
            xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
            yg ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
            throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1659138662, 1659138681, System.identityHashCode(ygVar))), e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if ((r0 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        r9 = (com.mypinpad.tsdk.isolation.acp) setDividerPadding(new java.lang.Object[]{r1, java.lang.Long.valueOf(r7)}, 196270415, -196270409, java.lang.System.identityHashCode(r1));
        com.mypinpad.tsdk.isolation.yt.setX(r9, Integer.MAX_VALUE, java.util.concurrent.TimeUnit.MILLISECONDS);
        r9.close();
        r9 = com.mypinpad.tsdk.isolation.zw.f62459h;
        r0 = (((r9 | 16) << 1) - (r9 ^ 16)) - 1;
        com.mypinpad.tsdk.isolation.zw.f62460i = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (r7 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r7 == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.zw.f62460i;
        r0 = r9 & 113;
        r0 = (r0 - (~(-(-((r9 ^ 113) | r0))))) - 1;
        com.mypinpad.tsdk.isolation.zw.f62459h = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void f(java.lang.Object[] r9) throws java.io.IOException {
        /*
            r0 = 0
            r1 = r9[r0]
            com.mypinpad.tsdk.i.zw r1 = (com.mypinpad.tsdk.isolation.zw) r1
            r2 = 1
            r9 = r9[r2]
            com.mypinpad.tsdk.i.yr r9 = (com.mypinpad.tsdk.isolation.yr) r9
            int r3 = com.mypinpad.tsdk.isolation.zw.f62460i
            r4 = r3 ^ 95
            r5 = r3 & 95
            r4 = r4 | r5
            int r4 = r4 << r2
            int r5 = ~r5
            r3 = r3 | 95
            r3 = r3 & r5
            int r3 = -r3
            int r3 = ~r3
            int r4 = r4 - r3
            int r4 = r4 - r2
            int r3 = r4 % 128
            com.mypinpad.tsdk.isolation.zw.f62459h = r3
            r3 = 2
            int r4 = r4 % r3
            r5 = -1
            java.lang.String r7 = ""
            if (r4 == 0) goto L35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r7)
            long r7 = com.mypinpad.tsdk.isolation.yt.setX(r9)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r4 = 33
            int r4 = r4 / r0
            if (r9 != 0) goto L56
            goto L40
        L35:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r7)
            long r7 = com.mypinpad.tsdk.isolation.yt.setX(r9)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L56
        L40:
            int r9 = com.mypinpad.tsdk.isolation.zw.f62460i
            r0 = r9 & 113(0x71, float:1.58E-43)
            r9 = r9 ^ 113(0x71, float:1.58E-43)
            r9 = r9 | r0
            int r9 = -r9
            int r9 = -r9
            int r9 = ~r9
            int r0 = r0 - r9
            int r0 = r0 - r2
            int r9 = r0 % 128
            com.mypinpad.tsdk.isolation.zw.f62459h = r9
            int r0 = r0 % r3
            if (r0 != 0) goto L54
            return
        L54:
            r9 = 0
            throw r9
        L56:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r0] = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r9[r2] = r0
            int r0 = java.lang.System.identityHashCode(r1)
            r1 = 196270415(0xbb2d94f, float:6.8890076E-32)
            r4 = -196270409(0xfffffffff44d26b7, float:-6.501502E31)
            java.lang.Object r9 = setDividerPadding(r9, r1, r4, r0)
            com.mypinpad.tsdk.i.acp r9 = (com.mypinpad.tsdk.isolation.acp) r9
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mypinpad.tsdk.isolation.yt.setX(r9, r0, r1)
            r9.close()
            int r9 = com.mypinpad.tsdk.isolation.zw.f62459h
            r0 = r9 | 16
            int r0 = r0 << r2
            r9 = r9 ^ 16
            int r0 = r0 - r9
            int r0 = r0 - r2
            int r9 = r0 % 128
            com.mypinpad.tsdk.isolation.zw.f62460i = r9
            int r0 = r0 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.zw.f(java.lang.Object[]):void");
    }

    public static /* synthetic */ zi g(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        int i10 = f62460i;
        int i11 = i10 & 31;
        int i12 = i10 | 31;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f62459h = i14;
        int i15 = i13 % 2;
        zi ziVar = zwVar.setDividerPadding;
        if (i15 != 0) {
            int i16 = 84 / 0;
        }
        int i17 = i14 & 123;
        int i18 = i14 | 123;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        f62460i = i19 % 128;
        if (i19 % 2 != 0) {
            return ziVar;
        }
        throw null;
    }

    public static final /* synthetic */ ye getNavBarTitleString(zw zwVar) {
        return (ye) setDividerPadding(new Object[]{zwVar}, -422738176, 422738197, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Long h(Object[] objArr) {
        yr yrVar = (yr) objArr[1];
        int i10 = f62460i;
        int i11 = ((i10 ^ 12) + ((i10 & 12) << 1)) - 1;
        f62459h = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(yrVar, "");
            ((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(yrVar, "");
        if (!((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue()) {
            int i12 = f62460i;
            int i13 = (((i12 ^ 81) | (i12 & 81)) << 1) - (((~i12) & 81) | (i12 & (-82)));
            f62459h = i13 % 128;
            if (i13 % 2 == 0) {
                return 0L;
            }
            int i14 = 84 / 0;
            return 0L;
        }
        if (!(!((Boolean) setDividerPadding(new Object[]{yrVar}, -1669077944, 1669077957, (int) System.currentTimeMillis())).booleanValue())) {
            int i15 = f62459h;
            int i16 = ((((i15 ^ 49) | (i15 & 49)) << 1) - (~(-(((~i15) & 49) | (i15 & (-50)))))) - 1;
            f62460i = i16 % 128;
            if (i16 % 2 != 0) {
                return -1L;
            }
            throw null;
        }
        long x4 = yt.setX(yrVar);
        int i17 = f62460i;
        int i18 = i17 & 89;
        int i19 = ((((i17 ^ 89) | i18) << 1) - (~(-((i17 | 89) & (~i18))))) - 1;
        f62459h = i19 % 128;
        if (i19 % 2 == 0) {
            return Long.valueOf(x4);
        }
        throw null;
    }

    public static /* synthetic */ ym i(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        int i10 = (-2) - ((f62460i + 52) ^ (-1));
        f62459h = i10 % 128;
        int i11 = i10 % 2;
        ym ymVar = zwVar.f62461a;
        if (i11 == 0) {
            return ymVar;
        }
        throw null;
    }

    public static /* synthetic */ void j(Object[] objArr) {
        abz abzVar = (abz) objArr[0];
        int i10 = f62459h + 35;
        f62460i = i10 % 128;
        if (i10 % 2 == 0) {
            setDividerPadding(new Object[]{abzVar}, 2027481357, -2027481330, (int) System.currentTimeMillis());
            int i11 = 5 / 0;
        } else {
            setDividerPadding(new Object[]{abzVar}, 2027481357, -2027481330, (int) System.currentTimeMillis());
        }
        int i12 = f62460i + 101;
        f62459h = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        int i10 = f62460i + 25;
        f62459h = i10 % 128;
        int i11 = i10 % 2;
        int i12 = zwVar.f62465e;
        if (i11 == 0) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    public static /* synthetic */ abv l(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        int i10 = f62459h;
        int i11 = i10 & 69;
        int i12 = ((i10 ^ 69) | i11) << 1;
        int i13 = -((i10 | 69) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f62460i = i14 % 128;
        int i15 = i14 % 2;
        abv abvVar = zwVar.f62464d;
        if (i15 == 0) {
            int i16 = 70 / 0;
        }
        return abvVar;
    }

    public static /* synthetic */ aco m(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        yk ykVar = (yk) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i10 = f62459h + 30;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f62460i = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(ykVar, "");
        if (((yo) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -2084954302, 2084954305, System.identityHashCode(ykVar))) != null) {
            int i13 = f62459h;
            int i14 = i13 & 27;
            int i15 = -(-((i13 ^ 27) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            f62460i = i16 % 128;
            if (i16 % 2 == 0) {
                throw null;
            }
            int i17 = f62460i;
            int i18 = i17 & 29;
            int i19 = -(-((i17 ^ 29) | i18));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f62459h = i20 % 128;
            int i21 = i20 % 2;
        }
        if (!((Boolean) setDividerPadding(new Object[]{ykVar}, 2100441664, -2100441654, (int) System.currentTimeMillis())).booleanValue()) {
            if (jLongValue == -1) {
                throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
            }
            int i22 = f62460i;
            int i23 = i22 & 121;
            int i24 = (i22 | 121) & (~i23);
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f62459h = i26 % 128;
            if (i26 % 2 == 0) {
                return (aco) setDividerPadding(new Object[]{zwVar}, -1790449348, 1790449368, System.identityHashCode(zwVar));
            }
            throw null;
        }
        int i27 = f62459h;
        int i28 = i27 & 73;
        int i29 = (i28 - (~((i27 ^ 73) | i28))) - 1;
        f62460i = i29 % 128;
        if (i29 % 2 == 0) {
            throw null;
        }
        aco acoVar = (aco) setDividerPadding(new Object[]{zwVar}, 1891538431, -1891538405, System.identityHashCode(zwVar));
        int i30 = f62459h;
        int i31 = ((i30 ^ 76) + ((i30 & 76) << 1)) - 1;
        f62460i = i31 % 128;
        int i32 = i31 % 2;
        return acoVar;
    }

    public static /* synthetic */ f n(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = f62460i;
        int i11 = ((i10 & 67) - (~(-(-(i10 | 67))))) - 1;
        int i12 = i11 % 128;
        f62459h = i12;
        if (i11 % 2 == 0 ? zwVar.f62465e != 4 : zwVar.f62465e != 3) {
            int i13 = i10 | 107;
            int i14 = i13 << 1;
            int i15 = -((~(i10 & 107)) & i13);
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f62459h = i16 % 128;
            int i17 = i16 % 2;
        } else {
            int i18 = i12 + 59;
            f62460i = i18 % 128;
            if (i18 % 2 != 0) {
                zwVar.f62465e = 5;
                f fVar = new f(zwVar, jLongValue);
                int i19 = f62459h;
                int i20 = i19 & 87;
                int i21 = ((i19 ^ 87) | i20) << 1;
                int i22 = -((i19 | 87) & (~i20));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f62460i = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 39 / 0;
                }
                return fVar;
            }
        }
        throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(zwVar.f62465e)).toString());
    }

    public static /* synthetic */ void o(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        yk ykVar = (yk) objArr[1];
        int i10 = f62459h;
        int i11 = ((i10 & 16) + (i10 | 16)) - 1;
        f62460i = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(ykVar, "");
        zx zxVar = zx.INSTANCE;
        zi ziVar = (zi) setDividerPadding(new Object[]{zwVar}, -2047549538, 2047549540, System.identityHashCode(zwVar));
        yp ypVar = (yp) zi.setY(new Object[]{ziVar}, 2102358168, -2102358143, System.identityHashCode(ziVar));
        Proxy.Type type = ((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 250524162, -250524162, System.identityHashCode(ypVar))).type();
        Intrinsics.checkNotNullExpressionValue(type, "");
        setDividerPadding(new Object[]{zwVar, (ye) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1466291161, 1466291162, System.identityHashCode(ykVar)), (String) zx.setDividerPadding(new Object[]{ykVar, type}, -36192596, 36192597, (int) System.currentTimeMillis())}, 281753985, -281753984, System.identityHashCode(zwVar));
        int i13 = f62460i;
        int i14 = i13 & 25;
        int i15 = (i13 ^ 25) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        f62459h = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void p(Object[] objArr) throws IOException {
        zw zwVar = (zw) objArr[0];
        int i10 = f62459h;
        int i11 = ((i10 | 69) << 1) - (i10 ^ 69);
        f62460i = i11 % 128;
        int i12 = i11 % 2;
        zwVar.f62464d.flush();
        int i13 = f62460i;
        int i14 = i13 & 51;
        int i15 = i14 + ((i13 ^ 51) | i14);
        f62459h = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0081, code lost:
    
        r7 = r1.f62464d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        if (r6 >= r12) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.zw.f62460i;
        r9 = (r8 ^ 69) + ((r8 & 69) << 1);
        com.mypinpad.tsdk.isolation.zw.f62459h = r9 % 128;
        r9 = r9 % 2;
        r8 = (-2) - (((r6 ^ (-107)) + ((r6 & (-107)) << 1)) ^ (-1));
        r9 = r8 & 109;
        r8 = -(-(r8 | 109));
        r7.setCompoundDrawableTintBlendMode((java.lang.String) com.mypinpad.tsdk.isolation.ye.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3, java.lang.Integer.valueOf(r6)}, 611642845, -611642844, r6)).setCompoundDrawableTintBlendMode(": ").setCompoundDrawableTintBlendMode((java.lang.String) com.mypinpad.tsdk.isolation.ye.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3, java.lang.Integer.valueOf(r6)}, -1668064352, 1668064356, r6)).setCompoundDrawableTintBlendMode("\r\n");
        r6 = com.mypinpad.tsdk.isolation.zw.f62460i + 21;
        com.mypinpad.tsdk.isolation.zw.f62459h = r6 % 128;
        r6 = r6 % 2;
        r6 = (r9 ^ r8) + ((r8 & r9) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ef, code lost:
    
        r7.setCompoundDrawableTintBlendMode("\r\n");
        r1.f62465e = 1;
        r12 = (-2) - ((com.mypinpad.tsdk.isolation.zw.f62459h + 66) ^ (-1));
        com.mypinpad.tsdk.isolation.zw.f62460i = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0101, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0102, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.zw.f62460i;
        r0 = r12 & 59;
        r12 = -(-(r12 | 59));
        r2 = (r0 & r12) + (r12 | r0);
        com.mypinpad.tsdk.isolation.zw.f62459h = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0128, code lost:
    
        throw new java.lang.IllegalStateException(kotlin.jvm.internal.Intrinsics.stringPlus("state: ", java.lang.Integer.valueOf(r1.f62465e)).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r1.f62465e == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r1.f62465e == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.zw.f62459h;
        r6 = ((r5 ^ 35) | (r5 & 35)) << 1;
        r5 = -(((~r5) & 35) | (r5 & (-36)));
        r7 = (r6 ^ r5) + ((r5 & r6) << 1);
        com.mypinpad.tsdk.isolation.zw.f62460i = r7 % 128;
        r7 = r7 % 2;
        r1.f62464d.setCompoundDrawableTintBlendMode(r12).setCompoundDrawableTintBlendMode("\r\n");
        r12 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.ye.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3}, -1558209065, 1558209065, java.lang.System.identityHashCode(r3))).intValue();
        r6 = com.mypinpad.tsdk.isolation.zw.f62459h;
        r7 = (r6 ^ 63) + ((r6 & 63) << 1);
        com.mypinpad.tsdk.isolation.zw.f62460i = r7 % 128;
        r7 = r7 % 2;
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void q(java.lang.Object[] r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.zw.q(java.lang.Object[]):void");
    }

    public static /* synthetic */ acp r(Object[] objArr) {
        zw zwVar = (zw) objArr[0];
        yr yrVar = (yr) objArr[1];
        int i10 = f62459h + 9;
        f62460i = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(yrVar, "");
            ((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(yrVar, "");
        if (!(!((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue())) {
            if (((Boolean) setDividerPadding(new Object[]{yrVar}, -1669077944, 1669077957, (int) System.currentTimeMillis())).booleanValue()) {
                int i11 = f62460i;
                int i12 = i11 & 61;
                int i13 = (i11 | 61) & (~i12);
                int i14 = i12 << 1;
                int i15 = (i13 & i14) + (i13 | i14);
                f62459h = i15 % 128;
                int i16 = i15 % 2;
                yk ykVar = (yk) yr.setX(new Object[]{yrVar}, -504719753, 504719763, System.identityHashCode(yrVar));
                acp acpVar = (acp) setDividerPadding(new Object[]{zwVar, (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar))}, -1619138602, 1619138602, System.identityHashCode(zwVar));
                int i17 = f62460i + 117;
                f62459h = i17 % 128;
                int i18 = i17 % 2;
                return acpVar;
            }
            long x4 = yt.setX(yrVar);
            if (x4 != -1) {
                int i19 = f62460i;
                int i20 = (i19 & 95) + (i19 | 95);
                f62459h = i20 % 128;
                if (i20 % 2 == 0) {
                    return (acp) setDividerPadding(new Object[]{zwVar, Long.valueOf(x4)}, 196270415, -196270409, System.identityHashCode(zwVar));
                }
                throw null;
            }
            acp acpVar2 = (acp) setDividerPadding(new Object[]{zwVar}, -2021897242, 2021897251, System.identityHashCode(zwVar));
            int i21 = f62460i;
            int i22 = i21 & 35;
            int i23 = i22 + ((i21 ^ 35) | i22);
            f62459h = i23 % 128;
            int i24 = i23 % 2;
            return acpVar2;
        }
        acp acpVar3 = (acp) setDividerPadding(new Object[]{zwVar, 0L}, 196270415, -196270409, System.identityHashCode(zwVar));
        int iIdentityHashCode = System.identityHashCode(zwVar);
        int i25 = ~iIdentityHashCode;
        int i26 = i25 & (i25 | iIdentityHashCode);
        int i27 = ~(((-32289355) ^ i26) | ((-32289355) & i26));
        int i28 = 1167395385 & iIdentityHashCode;
        int i29 = (~i28) & (1167395385 | iIdentityHashCode);
        int i30 = ~((i28 & i29) | (i29 ^ i28));
        int i31 = i27 ^ i30;
        int i32 = i27 & i30;
        int i33 = -(-(((i32 & i31) | (i31 ^ i32)) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
        int i34 = (((-1840226028) & i33) - (~(-(-(i33 | (-1840226028)))))) - 1;
        int i35 = i26 | 1167395385;
        int i36 = ((-32289355) & i35) | ((~i35) & 32289354);
        int i37 = i35 & 32289354;
        int i38 = ~((i37 & i36) | (i36 ^ i37));
        int i39 = (-25428489) & iIdentityHashCode;
        int i40 = ~(((iIdentityHashCode | (-25428489)) & (~i39)) | i39);
        int i41 = i38 & i40;
        int i42 = (i40 | i38) & (~i41);
        int i43 = (((i42 & i41) | (i42 ^ i41)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i34;
        int iIdentityHashCode2 = System.identityHashCode(zwVar);
        int i44 = ~iIdentityHashCode2;
        int i45 = (i44 | iIdentityHashCode2) & i44;
        int i46 = 392164123 & i45;
        int i47 = (i45 | 392164123) & (~i46);
        int i48 = ~((i47 & i46) | (i47 ^ i46));
        int i49 = 955237180 & i48;
        int i50 = -(~(-(-((((i48 | 955237180) & (~i49)) | i49) * (-235)))));
        int i51 = (-2) - (((883692948 & i50) + (i50 | 883692948)) ^ (-1));
        int i52 = (i44 & 392164123) | ((-392164124) & iIdentityHashCode2);
        int i53 = 392164123 & iIdentityHashCode2;
        int i54 = ~((i52 & i53) | (i52 ^ i53));
        int i55 = ((~i54) & 955237180) | ((-955237181) & i54);
        int i56 = i54 & 955237180;
        int i57 = ((i56 & i55) | (i55 ^ i56)) * (-470);
        int i58 = i51 ^ i57;
        int i59 = ((i57 & i51) | i58) << 1;
        int i60 = -i58;
        int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
        int i62 = ~((iIdentityHashCode2 & 1073738559) | (1073738559 ^ iIdentityHashCode2));
        int i63 = ((i62 & 273662744) | (273662744 ^ i62)) * 235;
        int i64 = ((~i63) & i61) | ((~i61) & i63);
        int i65 = -(-((i63 & i61) << 1));
        if (i43 > ((i64 | i65) << 1) - (i65 ^ i64)) {
            int i66 = 93 / 0;
        }
        return acpVar3;
    }

    public static final /* synthetic */ ym setCompoundDrawableTintBlendMode(zw zwVar) {
        return (ym) setDividerPadding(new Object[]{zwVar}, -1106857887, 1106857906, (int) System.currentTimeMillis());
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-283)) + (i11 * (-282)) + (i10 * 284);
        int i15 = ~i11;
        switch (((~(i15 | i13 | i12)) * 283) + ((~(i10 | i15)) * 283) + i14) {
            case 1:
                q(objArr);
                return null;
            case 2:
                return g(objArr);
            case 3:
                return m(objArr);
            case 4:
                f(objArr);
                return null;
            case 5:
                p(objArr);
                return null;
            case 6:
                return n(objArr);
            case 7:
                zw zwVar = (zw) objArr[0];
                int i16 = f62459h;
                int i17 = (i16 & (-48)) | ((~i16) & 47);
                int i18 = (i16 & 47) << 1;
                int i19 = (i17 & i18) + (i18 | i17);
                f62460i = i19 % 128;
                int i20 = i19 % 2;
                zwVar.f62464d.flush();
                int i21 = f62460i;
                int i22 = ((i21 | 11) << 1) - (i21 ^ 11);
                f62459h = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 8:
                j(objArr);
                return null;
            case 9:
                zw zwVar2 = (zw) objArr[0];
                int i24 = f62459h;
                int i25 = i24 ^ 31;
                int i26 = ((((i24 & 31) | i25) << 1) - (~(-i25))) - 1;
                int i27 = i26 % 128;
                f62460i = i27;
                int i28 = i26 % 2;
                int i29 = zwVar2.f62465e;
                if (i29 != 4) {
                    int i30 = i24 ^ 111;
                    int i31 = -(-((i24 & 111) << 1));
                    int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                    f62460i = i32 % 128;
                    int i33 = i32 % 2;
                    throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i29)).toString());
                }
                int i34 = i27 + 93;
                int i35 = i34 % 128;
                f62459h = i35;
                int i36 = i34 % 2;
                int i37 = i35 & 37;
                int i38 = (i37 - (~((i35 ^ 37) | i37))) - 1;
                f62460i = i38 % 128;
                int i39 = i38 % 2;
                zwVar2.f62465e = 5;
                ((zi) setDividerPadding(new Object[]{zwVar2}, -2047549538, 2047549540, System.identityHashCode(zwVar2))).setOnDragListener();
                Intrinsics.checkNotNullParameter(zwVar2, "");
                c cVar = new c(zwVar2);
                int i40 = f62459h;
                int i41 = i40 ^ 57;
                int i42 = ((i40 & 57) | i41) << 1;
                int i43 = -i41;
                int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                f62460i = i44 % 128;
                int i45 = i44 % 2;
                return cVar;
            case 10:
                yk ykVar = (yk) objArr[0];
                int i46 = f62459h + 85;
                f62460i = i46 % 128;
                int i47 = i46 % 2;
                boolean zEquals = l.equals("chunked", (String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar, "Transfer-Encoding"}, 1273556189, -1273556181, System.identityHashCode(ykVar)), true);
                int i48 = f62459h;
                int i49 = i48 & 25;
                int i50 = -(-((i48 ^ 25) | i49));
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f62460i = i51 % 128;
                int i52 = i51 % 2;
                return Boolean.valueOf(zEquals);
            case 11:
                return k(objArr);
            case 12:
                zw zwVar3 = (zw) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i53 = f62459h;
                int i54 = i53 & 75;
                int i55 = (i53 | 75) & (~i54);
                int i56 = i54 << 1;
                int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                int i58 = i57 % 128;
                f62460i = i58;
                int i59 = i57 % 2;
                zwVar3.f62465e = iIntValue;
                int i60 = i58 + 119;
                f62459h = i60 % 128;
                int i61 = i60 % 2;
                return null;
            case 13:
                return b(objArr);
            case 14:
                return l(objArr);
            case 15:
                return c(objArr);
            case 16:
                return r(objArr);
            case 17:
                a(objArr);
                return null;
            case 18:
                o(objArr);
                return null;
            case 19:
                return i(objArr);
            case 20:
                return d(objArr);
            case 21:
                zw zwVar4 = (zw) objArr[0];
                int i62 = f62459h;
                int i63 = i62 & 93;
                int i64 = -(-((i62 ^ 93) | i63));
                int i65 = (i63 & i64) + (i64 | i63);
                int i66 = i65 % 128;
                f62460i = i66;
                int i67 = i65 % 2;
                ye yeVar = zwVar4.f62467g;
                int i68 = i66 + 91;
                f62459h = i68 % 128;
                if (i68 % 2 == 0) {
                    return yeVar;
                }
                throw null;
            case 22:
                return e(objArr);
            case 23:
                zw zwVar5 = (zw) objArr[0];
                ye yeVar2 = (ye) objArr[1];
                int i69 = f62459h;
                int i70 = ((i69 | 25) << 1) - (i69 ^ 25);
                f62460i = i70 % 128;
                int i71 = i70 % 2;
                zwVar5.f62467g = yeVar2;
                int i72 = (((i69 & (-16)) | ((~i69) & 15)) - (~(-(-((i69 & 15) << 1))))) - 1;
                f62460i = i72 % 128;
                if (i72 % 2 != 0) {
                    return null;
                }
                int i73 = 67 / 0;
                return null;
            case 24:
                zw zwVar6 = (zw) objArr[0];
                int i74 = f62459h + 35;
                f62460i = i74 % 128;
                if (i74 % 2 != 0) {
                    return zwVar6.f62466f;
                }
                aaa aaaVar = zwVar6.f62466f;
                throw null;
            case 25:
                return h(objArr);
            case 26:
                zw zwVar7 = (zw) objArr[0];
                int i75 = f62460i;
                int i76 = (-2) - ((((i75 | 90) << 1) - (i75 ^ 90)) ^ (-1));
                int i77 = i76 % 128;
                f62459h = i77;
                if (i76 % 2 == 0 ? zwVar7.f62465e != 1 : zwVar7.f62465e != 0) {
                    int i78 = i75 ^ 43;
                    int i79 = ((i75 & 43) | i78) << 1;
                    int i80 = -i78;
                    int i81 = ((i79 | i80) << 1) - (i79 ^ i80);
                    f62459h = i81 % 128;
                    int i82 = i81 % 2;
                    throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(zwVar7.f62465e)).toString());
                }
                int i83 = ((i77 & 102) + (i77 | 102)) - 1;
                int i84 = i83 % 128;
                f62460i = i84;
                int i85 = i83 % 2;
                int i86 = ((i84 ^ 98) + ((i84 & 98) << 1)) - 1;
                f62459h = i86 % 128;
                int i87 = i86 % 2;
                zwVar7.f62465e = 2;
                b bVar = new b(zwVar7);
                int i88 = f62459h;
                int i89 = (i88 & 83) + (i88 | 83);
                f62460i = i89 % 128;
                int i90 = i89 % 2;
                return bVar;
            case 27:
                abz abzVar = (abz) objArr[0];
                int i91 = f62460i;
                int i92 = i91 & 125;
                int i93 = -(-((i91 ^ 125) | i92));
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                f62459h = i94 % 128;
                if (i94 % 2 == 0) {
                    acq acqVar = (acq) abz.setY(new Object[]{abzVar}, 1027643068, -1027643059, System.identityHashCode(abzVar));
                    acqVar.setOnDragListener();
                    acqVar.d_();
                    return null;
                }
                acq acqVar2 = (acq) abz.setY(new Object[]{abzVar}, 1027643068, -1027643059, System.identityHashCode(abzVar));
                acqVar2.setOnDragListener();
                acqVar2.d_();
                throw null;
            default:
                zw zwVar8 = (zw) objArr[0];
                yg ygVar = (yg) objArr[1];
                int iIdentityHashCode = System.identityHashCode(zwVar8);
                int i95 = ~iIdentityHashCode;
                int i96 = (-1268080447) & i95;
                int i97 = (iIdentityHashCode & 1268080446) | i96;
                int i98 = (-1268080447) & iIdentityHashCode;
                int i99 = (i97 & i98) | (i97 ^ i98);
                int i100 = ~i99;
                int i101 = (i99 | i100) & i100;
                int i102 = i101 ^ 539500736;
                int i103 = i101 & 539500736;
                int i104 = ((i103 & i102) | (i102 ^ i103)) * (-502);
                int i105 = (-100718969) & i104;
                int i106 = ((((-100718969) ^ i104) | i105) << 1) - ((i104 | (-100718969)) & (~i105));
                int i107 = ((~i95) & (-1268080447)) | (i95 & 1268080446);
                int i108 = (i96 & i107) | (i107 ^ i96);
                int i109 = i108 ^ (-724116161);
                int i110 = i108 & (-724116161);
                int i111 = (~((i110 & i109) | (i109 ^ i110))) * (-502);
                int i112 = (i106 & i111) + (i111 | i106);
                int i113 = (i95 & 724116160) | ((-724116161) & iIdentityHashCode);
                int i114 = iIdentityHashCode & 724116160;
                int i115 = ~((i114 & i113) | (i113 ^ i114));
                int i116 = ((~i115) & (-1268080447)) | (i115 & 1268080446);
                int i117 = i115 & (-1268080447);
                int i118 = -(-(((i117 & i116) | (i116 ^ i117)) * 502));
                int i119 = i112 & i118;
                int i120 = (i119 - (~(-(-((i118 ^ i112) | i119))))) - 1;
                int iIdentityHashCode2 = System.identityHashCode(zwVar8);
                int i121 = ~iIdentityHashCode2;
                int i122 = 1035593327 & i121;
                int i123 = (1035593327 | i121) & (~i122);
                int i124 = ~((i123 & i122) | (i123 ^ i122));
                int i125 = (-950210021) & iIdentityHashCode2;
                int i126 = ((-950210021) | iIdentityHashCode2) & (~i125);
                int i127 = ~((i126 & i125) | (i126 ^ i125));
                int i128 = i124 & i127;
                int i129 = (i124 | i127) & (~i128);
                int i130 = -(-(((i129 & i128) | (i129 ^ i128)) * ReturnCode.ERR_REPOSITORY));
                int i131 = (-575619332) & i130;
                int i132 = (((i130 | (-575619332)) & (~i131)) - (~(i131 << 1))) - 1;
                int i133 = i121 ^ 950210020;
                int i134 = i121 & 950210020;
                int i135 = (i133 & i134) | (i133 ^ i134);
                int i136 = ~i135;
                int i137 = (i135 | i136) & i136;
                int i138 = ~((-1035593328) | iIdentityHashCode2);
                int i139 = -(-(((i137 ^ i138) | (i137 & i138)) * (-950)));
                int i140 = (i132 ^ i139) + ((i132 & i139) << 1);
                int i141 = ~((i121 & (-1035593328)) | ((~i121) & (-1035593328)) | i122);
                int i142 = 950210020 & iIdentityHashCode2;
                int i143 = (iIdentityHashCode2 | 950210020) & (~i142);
                int i144 = ~((i143 & i142) | (i143 ^ i142));
                int i145 = i141 & i144;
                int i146 = (i144 | i141) & (~i145);
                int i147 = -(-(((i146 & i145) | (i146 ^ i145)) * 950));
                if (i120 > (i140 & i147) + (i147 | i140) ? zwVar8.f62465e != 4 : zwVar8.f62465e != 4) {
                    int i148 = f62460i;
                    int i149 = i148 ^ 85;
                    int i150 = ((i148 & 85) | i149) << 1;
                    int i151 = -i149;
                    int i152 = (i150 & i151) + (i150 | i151);
                    f62459h = i152 % 128;
                    int i153 = i152 % 2;
                    throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(zwVar8.f62465e)).toString());
                }
                int i154 = f62460i + 41;
                f62459h = i154 % 128;
                int i155 = i154 % 2;
                zwVar8.f62465e = 5;
                a aVar = new a(zwVar8, ygVar);
                int i156 = f62460i;
                int i157 = i156 & 31;
                int i158 = (i156 | 31) & (~i157);
                int i159 = i157 << 1;
                int i160 = (i158 & i159) + (i158 | i159);
                f62459h = i160 % 128;
                int i161 = i160 % 2;
                return aVar;
        }
    }

    public static final /* synthetic */ aaa setX(zw zwVar) {
        return (aaa) setDividerPadding(new Object[]{zwVar}, 454887409, -454887385, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ aby setY(zw zwVar) {
        return (aby) setDividerPadding(new Object[]{zwVar}, 1234345737, -1234345722, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ int setOnFocusChangeListener(zw zwVar) {
        return ((Integer) setDividerPadding(new Object[]{zwVar}, -1992498415, 1992498426, (int) System.currentTimeMillis())).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setX() {
        setDividerPadding(new Object[]{this}, -21907086, 21907091, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull yr p4) {
        setDividerPadding(new Object[]{this, p4}, -1032911916, 1032911920, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @Nullable
    public final yr.setDividerPadding setOnFocusChangeListener(boolean p4) {
        return (yr.setDividerPadding) setDividerPadding(new Object[]{this, Boolean.valueOf(p4)}, 1579149778, -1579149756, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @NotNull
    public final acp setX(@NotNull yr p4) {
        return (acp) setDividerPadding(new Object[]{this, p4}, 1887965525, -1887965509, System.identityHashCode(this));
    }

    public final void setY(@NotNull ye p4, @NotNull String p10) {
        setDividerPadding(new Object[]{this, p4, p10}, 281753985, -281753984, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setCompoundDrawableTintBlendMode() {
        setDividerPadding(new Object[]{this}, -635064206, 635064223, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final long setOnFocusChangeListener(@NotNull yr p4) {
        return ((Long) setDividerPadding(new Object[]{this, p4}, -55221641, 55221666, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setX(@NotNull yk p4) {
        setDividerPadding(new Object[]{this, p4}, 1385094773, -1385094755, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setY() {
        setDividerPadding(new Object[]{this}, 1390592375, -1390592368, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @NotNull
    public final aco setX(@NotNull yk p4, long p10) {
        return (aco) setDividerPadding(new Object[]{this, p4, Long.valueOf(p10)}, 339927491, -339927488, System.identityHashCode(this));
    }

    public abstract class e implements acp {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f62484s0 = 0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f62485t0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final abz f62486p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f62487q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ zw f62488r0;

        public e(zw zwVar) {
            Intrinsics.checkNotNullParameter(zwVar, "");
            this.f62488r0 = zwVar;
            this.f62486p0 = new abz(zw.setY(zwVar).setY());
        }

        public static /* synthetic */ Object f(Object[] objArr, int i10, int i11) {
            int i12 = (i11 * 702) + (i10 * (-700));
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (i14 * 701) + ((i13 | i11) * (-701)) + ((~(i13 | i14)) * 701) + i12;
            if (i15 == 1) {
                e eVar = (e) objArr[0];
                int i16 = f62485t0;
                int i17 = i16 ^ 1;
                int i18 = (((i16 & 1) | i17) << 1) - i17;
                int i19 = i18 % 128;
                f62484s0 = i19;
                int i20 = i18 % 2;
                eVar.f62487q0 = true;
                int i21 = i19 ^ 23;
                int i22 = (((i19 & 23) | i21) << 1) - i21;
                f62485t0 = i22 % 128;
                int i23 = i22 % 2;
                return null;
            }
            if (i15 == 2) {
                e eVar2 = (e) objArr[0];
                int i24 = f62484s0;
                int i25 = ((i24 ^ 27) | (i24 & 27)) << 1;
                int i26 = -(((~i24) & 27) | (i24 & (-28)));
                int i27 = (i25 & i26) + (i25 | i26);
                int i28 = i27 % 128;
                f62485t0 = i28;
                int i29 = i27 % 2;
                boolean z10 = eVar2.f62487q0;
                if (i29 == 0) {
                    int i30 = 78 / 0;
                }
                int i31 = ((i28 & 32) + (i28 | 32)) - 1;
                f62484s0 = i31 % 128;
                int i32 = i31 % 2;
                return Boolean.valueOf(z10);
            }
            if (i15 != 3) {
                e eVar3 = (e) objArr[0];
                int i33 = f62485t0;
                int i34 = ((i33 ^ 126) + ((i33 & 126) << 1)) - 1;
                int i35 = i34 % 128;
                f62484s0 = i35;
                int i36 = i34 % 2;
                abz abzVar = eVar3.f62486p0;
                int i37 = i35 & 113;
                int i38 = i37 + ((i35 ^ 113) | i37);
                f62485t0 = i38 % 128;
                int i39 = i38 % 2;
                return abzVar;
            }
            e eVar4 = (e) objArr[0];
            int i40 = f62485t0;
            int i41 = ((i40 | 35) << 1) - (i40 ^ 35);
            f62484s0 = i41 % 128;
            int i42 = i41 % 2;
            if (((Integer) zw.setDividerPadding(new Object[]{eVar4.f62488r0}, -1992498415, 1992498426, (int) System.currentTimeMillis())).intValue() == 6) {
                int i43 = f62484s0;
                int i44 = (((i43 & (-92)) | ((~i43) & 91)) - (~((i43 & 91) << 1))) - 1;
                f62485t0 = i44 % 128;
                int i45 = i44 % 2;
                return null;
            }
            zw zwVar = eVar4.f62488r0;
            if (((Integer) zw.setDividerPadding(new Object[]{zwVar}, -1992498415, 1992498426, (int) System.currentTimeMillis())).intValue() != 5) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(zw.setOnFocusChangeListener(zwVar))));
            }
            zw.setDividerPadding(new Object[]{eVar4.f62486p0}, -1825276854, 1825276862, (int) System.currentTimeMillis());
            zw.setDividerPadding(new Object[]{zwVar, 6}, 797643836, -797643824, 6);
            int i46 = f62485t0;
            int i47 = (-2) - ((((i46 | 84) << 1) - (i46 ^ 84)) ^ (-1));
            f62484s0 = i47 % 128;
            int i48 = i47 % 2;
            return null;
        }

        public final void b() {
            System.identityHashCode(this);
            f(new Object[]{this}, 1043990207, -1043990206);
        }

        public final void e() {
            System.identityHashCode(this);
            f(new Object[]{this}, 852831574, -852831571);
        }

        public final boolean setX() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return ((Boolean) f(objArr, -1182809590, 1182809592)).booleanValue();
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        public long setY(@NotNull abx abxVar, long j10) throws IOException {
            int i10 = f62485t0;
            int i11 = i10 & 5;
            int i12 = -(-((i10 ^ 5) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            f62484s0 = i13 % 128;
            int i14 = i13 % 2;
            zw zwVar = this.f62488r0;
            try {
                if (i14 != 0) {
                    Intrinsics.checkNotNullParameter(abxVar, "");
                    ((aby) zw.setDividerPadding(new Object[]{zwVar}, 1234345737, -1234345722, (int) System.currentTimeMillis())).setY(abxVar, j10);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(abxVar, "");
                long y7 = ((aby) zw.setDividerPadding(new Object[]{zwVar}, 1234345737, -1234345722, (int) System.currentTimeMillis())).setY(abxVar, j10);
                int i15 = f62484s0;
                int i16 = i15 + 5;
                f62485t0 = i16 % 128;
                int i17 = i16 % 2;
                int i18 = i15 + 49;
                f62485t0 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = ((((i15 ^ 93) | (i15 & 93)) << 1) - (~(-(((~i15) & 93) | (i15 & (-94)))))) - 1;
                f62485t0 = i20 % 128;
                int i21 = i20 % 2;
                return y7;
            } catch (IOException e5) {
                ((zi) zw.setDividerPadding(new Object[]{zwVar}, -2047549538, 2047549540, System.identityHashCode(zwVar))).setOnDragListener();
                System.identityHashCode(this);
                f(new Object[]{this}, 852831574, -852831571);
                throw e5;
            }
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        @NotNull
        public final acq setY() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return (acq) f(objArr, -1299760748, 1299760748);
        }
    }

    public static final /* synthetic */ abv setDividerPadding(zw zwVar) {
        return (abv) setDividerPadding(new Object[]{zwVar}, -1525841327, 1525841341, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @JvmName(name = "setDividerPadding")
    @NotNull
    public final zi setDividerPadding() {
        return (zi) setDividerPadding(new Object[]{this}, -2047549538, 2047549540, System.identityHashCode(this));
    }
}
