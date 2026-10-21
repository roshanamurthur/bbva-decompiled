package com.mypinpad.tsdk.isolation;

import androidx.compose.animation.core.AnimationKt;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u0006\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0006\u0010\rJ\u0019\u0010\u0006\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0006\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/abp;", "Lcom/mypinpad/tsdk/i/acq;", "", "setX", "()V", "", "setY", "()Z", "setDividerPadding", "Lcom/mypinpad/tsdk/i/aco;", "p0", "(Lcom/mypinpad/tsdk/i/aco;)Lcom/mypinpad/tsdk/i/aco;", "Lcom/mypinpad/tsdk/i/acp;", "(Lcom/mypinpad/tsdk/i/acp;)Lcom/mypinpad/tsdk/i/acp;", "Ljava/io/IOException;", "(Ljava/io/IOException;)Ljava/io/IOException;", "setOnFocusChangeListener", "<init>", "a"}, k = 1, mv = {1, 5, 1})
public class abp extends acq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f52325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f52326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static abp f52327k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f52328l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public abp f52330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f52331h;

    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            abp abpVar;
            System.identityHashCode(this);
            while (true) {
                try {
                    synchronized (abp.class) {
                        Companion companion = abp.INSTANCE;
                        abpVar = (abp) Companion.setY(new Object[0], 337571063, -337571063, (int) System.currentTimeMillis());
                        if (abpVar == abp.setCompoundDrawableTintBlendMode()) {
                            abp.setY((abp) null);
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (abpVar != null) {
                        abpVar.setDividerPadding();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    public static final class setDividerPadding implements acp {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f52336r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f52337s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ abp f52338p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ acp f52339q0;

        /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ea A[Catch: all -> 0x00d3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d3, blocks: (B:35:0x00d6, B:41:0x00fe, B:39:0x00ea, B:23:0x009a), top: B:80:0x0071 }] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
        
            if (r9 == true) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        
            if (r9 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
        
            r6 = com.mypinpad.tsdk.i.abp.setDividerPadding.f52337s0;
            r9 = (((r6 & (-98)) | ((~r6) & 97)) - (~((r6 & 97) << 1))) - 1;
            com.mypinpad.tsdk.i.abp.setDividerPadding.f52336r0 = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
        
            if ((r9 % 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
        
            r7 = com.mypinpad.tsdk.i.abp.setDividerPadding.f52337s0;
            r8 = (r7 ^ 79) + ((r7 & 79) << 1);
            com.mypinpad.tsdk.i.abp.setDividerPadding.f52336r0 = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
        
            throw r6.setY(null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        
            return java.lang.Long.valueOf(r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v46, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v47, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r6v49, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r6v50, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r6v56, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r6v58, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r6v62 */
        /* JADX WARN: Type inference failed for: r6v63 */
        /* JADX WARN: Type inference failed for: r7v23, types: [com.mypinpad.tsdk.i.abp, int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r6, int r7, int r8, int r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 552
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.abp.setDividerPadding.setX(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            setX(new Object[]{this}, -837860307, 837860310, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        public final /* synthetic */ acq setY() {
            return (acq) setX(new Object[]{this}, -984252010, 984252012, System.identityHashCode(this));
        }

        @NotNull
        public final String toString() {
            return (String) setX(new Object[]{this}, 960266860, -960266859, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acp
        public final long setY(@NotNull abx abxVar, long j10) {
            return ((Long) setX(new Object[]{this, abxVar, Long.valueOf(j10)}, -925547948, 925547952, System.identityHashCode(this))).longValue();
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f52325i = millis;
        f52326j = TimeUnit.MILLISECONDS.toNanos(millis);
        int i10 = f52328l;
        int i11 = (i10 & 37) + (i10 | 37);
        m = i11 % 128;
        int i12 = i11 % 2;
    }

    public static final /* synthetic */ long setCompoundDrawableTintBlendMode(abp abpVar, long j10) {
        return ((Long) setY(new Object[]{abpVar, Long.valueOf(j10)}, 831755254, -831755243, (int) System.currentTimeMillis())).longValue();
    }

    public static final /* synthetic */ long setLayoutAnimation() {
        return ((Long) setY(new Object[0], 1029229427, -1029229414, (int) System.currentTimeMillis())).longValue();
    }

    public static final /* synthetic */ long setOnLongClickListener() {
        return ((Long) setY(new Object[0], -2078466865, 2078466872, (int) System.currentTimeMillis())).longValue();
    }

    public static final /* synthetic */ void setX(abp abpVar, boolean z10) throws InterruptedException {
        setY(new Object[]{abpVar, Boolean.valueOf(z10)}, -483483022, 483483031, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x03bf A[DONT_INVERT, PHI: r8 r10
      0x03bf: PHI (r8v55 long) = (r8v54 long), (r8v63 long) binds: [B:58:0x03bd, B:55:0x03b0] A[DONT_GENERATE, DONT_INLINE]
      0x03bf: PHI (r10v35 boolean) = (r10v34 boolean), (r10v37 boolean) binds: [B:58:0x03bd, B:55:0x03b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x03c1  */
    public static Object setY(Object[] objArr, int i10, int i11, int i12) throws InterruptedException {
        long jA_;
        boolean zB_;
        long jLongValue;
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        switch (((i10 | i11 | i12) * 220) + (((~(i14 | i11)) | i10) * (-440)) + ((i13 | (~(i14 | i10 | i11))) * 220) + (i11 * (-219)) + (i10 * 221)) {
            case 1:
                abp abpVar = (abp) objArr[0];
                int iIdentityHashCode = System.identityHashCode(abpVar);
                int i15 = ~iIdentityHashCode;
                int i16 = (iIdentityHashCode & (-11049281)) | ((-11049281) ^ iIdentityHashCode);
                int i17 = ~i16;
                int i18 = (i16 | i17) & i17;
                int i19 = (-1341914060) ^ i18;
                int i20 = i18 & (-1341914060);
                int i21 = ((i20 & i19) | (i19 ^ i20)) * 501;
                int i22 = 920289672 & i21;
                int i23 = (i21 | 920289672) & (~i22);
                int i24 = i22 << 1;
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                int i26 = i25 & (-1107166998);
                int i27 = -(-(((-1107166998) ^ i25) | i26));
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                int i29 = ((-61381058) & i15) | ((-61381058) ^ i15);
                int i30 = i29 & (-1291582283);
                int i31 = (i29 | (-1291582283)) & (~i30);
                int i32 = (i31 & i30) | (i31 ^ i30);
                int i33 = ~i32;
                int i34 = -(-(((i32 | i33) & i33) * 501));
                int i35 = (i28 ^ i34) + ((i34 & i28) << 1);
                int iIdentityHashCode2 = System.identityHashCode(abpVar);
                int i36 = ~((1744029486 & iIdentityHashCode2) | (1744029486 ^ iIdentityHashCode2));
                int i37 = ((i36 & (-2147213184)) | ((~i36) & (-2147213184)) | (2147213183 & i36)) * ReturnCode.ERR_CONN_IO;
                int i38 = ((~i37) & 2067822825) | ((-2067822826) & i37);
                int i39 = -(-((i37 & 2067822825) << 1));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                int i41 = (iIdentityHashCode2 & (-403183698)) | ((~iIdentityHashCode2) & (-403183698)) | (403183697 & iIdentityHashCode2);
                int i42 = ~i41;
                int i43 = ((i41 | i42) & i42) * (-1504);
                int i44 = i40 & i43;
                int i45 = ((i40 ^ i43) | i44) << 1;
                int i46 = -((i43 | i40) & (~i44));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                int i48 = i47 & (-327010960);
                int i49 = ((i47 ^ (-327010960)) | i48) << 1;
                int i50 = -(((-327010960) | i47) & (~i48));
                if (i35 <= (i49 ^ i50) + ((i50 & i49) << 1)) {
                    jA_ = abpVar.a_();
                    zB_ = abpVar.b_();
                    if (jA_ == 0) {
                        if (!zB_) {
                            int i51 = m + 105;
                            f52328l = i51 % 128;
                            int i52 = i51 % 2;
                            return null;
                        }
                    }
                } else {
                    jA_ = abpVar.a_();
                    zB_ = abpVar.b_();
                    if (jA_ == 0) {
                        if (!zB_) {
                            int i53 = m + 105;
                            f52328l = i53 % 128;
                            int i54 = i53 % 2;
                            return null;
                        }
                    }
                }
                Companion.setY(new Object[]{abpVar, Long.valueOf(jA_), Boolean.valueOf(zB_)}, 836438861, -836438858, (int) System.currentTimeMillis());
                int i55 = m;
                int i56 = i55 & 111;
                int i57 = (i56 - (~(-(-((i55 ^ 111) | i56))))) - 1;
                f52328l = i57 % 128;
                if (i57 % 2 == 0) {
                    return null;
                }
                int i58 = 54 / 0;
                return null;
            case 2:
                abp abpVar2 = (abp) objArr[0];
                long jLongValue2 = ((Number) objArr[1]).longValue();
                int i59 = f52328l;
                int i60 = (i59 & 27) + (i59 | 27);
                int i61 = i60 % 128;
                m = i61;
                int i62 = i60 % 2;
                long j10 = abpVar2.f52331h - jLongValue2;
                int i63 = i61 + 69;
                f52328l = i63 % 128;
                if (i63 % 2 == 0) {
                    return Long.valueOf(j10);
                }
                throw null;
            case 3:
                int i64 = f52328l + 67;
                int i65 = i64 % 128;
                m = i65;
                int i66 = i64 % 2;
                abp abpVar3 = f52327k;
                int i67 = i65 + 10;
                int i68 = (i67 ^ (-1)) + (i67 << 1);
                f52328l = i68 % 128;
                int i69 = i68 % 2;
                return abpVar3;
            case 4:
                abp abpVar4 = (abp) objArr[0];
                abp abpVar5 = (abp) objArr[1];
                int i70 = f52328l;
                int i71 = i70 & 125;
                int i72 = -(-((i70 ^ 125) | i71));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                int i74 = i73 % 128;
                m = i74;
                int i75 = i73 % 2;
                abpVar4.f52330g = abpVar5;
                if (i75 == 0) {
                    int i76 = 42 / 0;
                }
                int i77 = i74 & 1;
                int i78 = (((i74 ^ 1) | i77) << 1) - ((~i77) & (i74 | 1));
                f52328l = i78 % 128;
                int i79 = i78 % 2;
                return null;
            case 5:
                abp abpVar6 = (abp) objArr[0];
                int i80 = f52328l;
                int i81 = i80 & 27;
                int i82 = (i80 ^ 27) | i81;
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                m = i83 % 128;
                int i84 = i83 % 2;
                boolean zBooleanValue = ((Boolean) Companion.setY(new Object[]{abpVar6}, -13501131, 13501133, (int) System.currentTimeMillis())).booleanValue();
                int i85 = f52328l;
                int i86 = (i85 & 97) + (i85 | 97);
                m = i86 % 128;
                int i87 = i86 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 6:
                abp abpVar7 = (abp) objArr[0];
                long jLongValue3 = ((Number) objArr[1]).longValue();
                int i88 = m;
                int i89 = ((i88 & (-8)) | ((~i88) & 7)) + ((i88 & 7) << 1);
                f52328l = i89 % 128;
                int i90 = i89 % 2;
                abpVar7.f52331h = jLongValue3;
                int i91 = i88 + 75;
                f52328l = i91 % 128;
                int i92 = i91 % 2;
                return null;
            case 7:
                int i93 = m;
                int i94 = i93 & 83;
                int i95 = ((i93 | 83) & (~i94)) + (i94 << 1);
                int i96 = i95 % 128;
                f52328l = i96;
                int i97 = i95 % 2;
                int i98 = i96 & 79;
                int i99 = ((i96 ^ 79) | i98) << 1;
                int i100 = -((i96 | 79) & (~i98));
                int i101 = ((i99 | i100) << 1) - (i99 ^ i100);
                m = i101 % 128;
                int i102 = i101 % 2;
                long j11 = f52326j;
                if (i102 == 0) {
                    int i103 = 66 / 0;
                }
                return Long.valueOf(j11);
            case 8:
                abp abpVar8 = (abp) objArr[0];
                int i104 = m;
                int i105 = i104 ^ 55;
                int i106 = -(-((i104 & 55) << 1));
                int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                f52328l = i107 % 128;
                int i108 = i107 % 2;
                f52327k = abpVar8;
                if (i108 != 0) {
                    throw null;
                }
                int i109 = (-2) - ((((i104 | 122) << 1) - (i104 ^ 122)) ^ (-1));
                f52328l = i109 % 128;
                int i110 = i109 % 2;
                return null;
            case 9:
                abp abpVar9 = (abp) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i111 = m;
                int i112 = ((i111 & (-72)) | ((~i111) & 71)) + ((i111 & 71) << 1);
                f52328l = i112 % 128;
                int i113 = i112 % 2;
                abpVar9.f52329f = zBooleanValue2;
                int i114 = i111 & 123;
                int i115 = (~i114) & (i111 | 123);
                int i116 = i114 << 1;
                int i117 = (i115 & i116) + (i116 | i115);
                f52328l = i117 % 128;
                if (i117 % 2 == 0) {
                    return null;
                }
                throw null;
            case 10:
                abp abpVar10 = (abp) objArr[0];
                aco acoVar = (aco) objArr[1];
                Intrinsics.checkNotNullParameter(acoVar, "");
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
                setcompounddrawabletintblendmode.f52334p0 = abpVar10;
                setcompounddrawabletintblendmode.f52335q0 = acoVar;
                int i118 = f52328l;
                int i119 = (i118 & (-12)) | ((~i118) & 11);
                int i120 = (i118 & 11) << 1;
                int i121 = (i119 & i120) + (i120 | i119);
                m = i121 % 128;
                int i122 = i121 % 2;
                return setcompounddrawabletintblendmode;
            case 11:
                abp abpVar11 = (abp) objArr[0];
                long jLongValue4 = ((Number) objArr[1]).longValue();
                int i123 = m + 117;
                f52328l = i123 % 128;
                if (i123 % 2 != 0) {
                    jLongValue = ((Long) setY(new Object[]{abpVar11, Long.valueOf(jLongValue4)}, -326427659, 326427661, System.identityHashCode(abpVar11))).longValue();
                    int i124 = 22 / 0;
                } else {
                    jLongValue = ((Long) setY(new Object[]{abpVar11, Long.valueOf(jLongValue4)}, -326427659, 326427661, System.identityHashCode(abpVar11))).longValue();
                }
                return Long.valueOf(jLongValue);
            case 12:
                abp abpVar12 = (abp) objArr[0];
                int i125 = f52328l;
                int i126 = ((i125 & 98) + (i125 | 98)) - 1;
                int i127 = i126 % 128;
                m = i127;
                int i128 = i126 % 2;
                boolean z10 = abpVar12.f52329f;
                int i129 = i127 + 100;
                int i130 = (i129 ^ (-1)) + (i129 << 1);
                f52328l = i130 % 128;
                if (i130 % 2 == 0) {
                    return Boolean.valueOf(z10);
                }
                throw null;
            case 13:
                int i131 = f52328l;
                int i132 = (i131 & 41) + (i131 | 41);
                m = i132 % 128;
                if (i132 % 2 == 0) {
                    int i133 = 22 / 0;
                }
                return Long.valueOf(f52325i);
            case 14:
                abp abpVar13 = (abp) objArr[0];
                acp acpVar = (acp) objArr[1];
                Intrinsics.checkNotNullParameter(acpVar, "");
                setDividerPadding setdividerpadding = new setDividerPadding();
                setdividerpadding.f52338p0 = abpVar13;
                setdividerpadding.f52339q0 = acpVar;
                int i134 = f52328l;
                int i135 = i134 ^ 47;
                int i136 = -(-((i134 & 47) << 1));
                int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
                m = i137 % 128;
                if (i137 % 2 != 0) {
                    return setdividerpadding;
                }
                throw null;
            case 15:
                abp abpVar14 = (abp) objArr[0];
                IOException iOException = (IOException) objArr[1];
                int i138 = f52328l;
                int i139 = i138 & 115;
                int i140 = i139 + ((i138 ^ 115) | i139);
                m = i140 % 128;
                int i141 = i140 % 2;
                IOException onFocusChangeListener = abpVar14.setOnFocusChangeListener(iOException);
                int i142 = f52328l;
                int i143 = (i142 | 51) << 1;
                int i144 = -(((~i142) & 51) | (i142 & (-52)));
                int i145 = (i143 & i144) + (i144 | i143);
                m = i145 % 128;
                int i146 = i145 % 2;
                return onFocusChangeListener;
            default:
                abp abpVar15 = (abp) objArr[0];
                int i147 = f52328l;
                int i148 = (((i147 | 110) << 1) - (i147 ^ 110)) - 1;
                m = i148 % 128;
                if (i148 % 2 == 0) {
                    abp abpVar16 = abpVar15.f52330g;
                    throw null;
                }
                abp abpVar17 = abpVar15.f52330g;
                int i149 = i147 & 19;
                int i150 = ((i147 ^ 19) | i149) << 1;
                int i151 = -((i147 | 19) & (~i149));
                int i152 = (i150 ^ i151) + ((i150 & i151) << 1);
                m = i152 % 128;
                int i153 = i152 % 2;
                return abpVar17;
        }
    }

    public void setDividerPadding() {
        int i10 = f52328l;
        int i11 = i10 ^ 79;
        int i12 = (((i10 & 79) | i11) << 1) - i11;
        m = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @NotNull
    public IOException setOnFocusChangeListener(@Nullable IOException p4) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (p4 != null) {
            int i10 = f52328l;
            int i11 = ((-1) << 1) - (((i10 & 20) + (i10 | 20)) ^ (-1));
            m = i11 % 128;
            if (i11 % 2 == 0) {
                interruptedIOException.initCause(p4);
                throw null;
            }
            interruptedIOException.initCause(p4);
            int i12 = m;
            int i13 = i12 & 63;
            int i14 = (i12 | 63) & (~i13);
            int i15 = i13 << 1;
            int i16 = (i14 & i15) + (i14 | i15);
            f52328l = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = m;
        int i19 = (i18 & 39) + (i18 | 39);
        f52328l = i19 % 128;
        if (i19 % 2 == 0) {
            return interruptedIOException;
        }
        throw null;
    }

    public static final /* synthetic */ abp setCompoundDrawableTintBlendMode(abp abpVar) {
        return (abp) setY(new Object[]{abpVar}, 168005496, -168005496, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ boolean setX(abp abpVar) {
        return ((Boolean) setY(new Object[]{abpVar}, -461757642, 461757654, (int) System.currentTimeMillis())).booleanValue();
    }

    public static final /* synthetic */ abp setCompoundDrawableTintBlendMode() {
        return (abp) setY(new Object[0], 646088702, -646088699, (int) System.currentTimeMillis());
    }

    public final void setX() throws InterruptedException {
        setY(new Object[]{this}, -1179150768, 1179150769, System.identityHashCode(this));
    }

    public static final /* synthetic */ void setOnFocusChangeListener(abp abpVar, long j10) throws InterruptedException {
        setY(new Object[]{abpVar, Long.valueOf(j10)}, 1778674966, -1778674960, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ void setOnFocusChangeListener(abp abpVar, abp abpVar2) {
        setY(new Object[]{abpVar, abpVar2}, 1240005138, -1240005134, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ void setY(abp abpVar) throws InterruptedException {
        setY(new Object[]{abpVar}, 1785926077, -1785926069, (int) System.currentTimeMillis());
    }

    @PublishedApi
    @NotNull
    public final IOException setY(@Nullable IOException p4) {
        return (IOException) setY(new Object[]{this, p4}, -1205450606, 1205450621, System.identityHashCode(this));
    }

    @NotNull
    public final acp setY(@NotNull acp p4) {
        return (acp) setY(new Object[]{this, p4}, 1261562983, -1261562969, System.identityHashCode(this));
    }

    @NotNull
    public final aco setY(@NotNull aco p4) {
        return (aco) setY(new Object[]{this, p4}, 696347811, -696347801, System.identityHashCode(this));
    }

    public final boolean setY() {
        return ((Boolean) setY(new Object[]{this}, -844782123, 844782128, System.identityHashCode(this))).booleanValue();
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abp$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0003\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/abp$setX;", "", "Lcom/mypinpad/tsdk/i/abp;", "setX", "()Lcom/mypinpad/tsdk/i/abp;", "", "getNavBarTitleString", "J", "setOnDragListener", "setY", "setOnLongClickListener", "Lcom/mypinpad/tsdk/i/abp;", "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52340a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52341b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Boolean a(Object[] objArr) {
            abp abpVar = (abp) objArr[0];
            synchronized (abp.class) {
                if (!abp.setX(abpVar)) {
                    return Boolean.FALSE;
                }
                abp.setX(abpVar, false);
                for (abp compoundDrawableTintBlendMode = abp.setCompoundDrawableTintBlendMode(); compoundDrawableTintBlendMode != null; compoundDrawableTintBlendMode = abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode)) {
                    if (abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode) == abpVar) {
                        abp.setOnFocusChangeListener(compoundDrawableTintBlendMode, abp.setCompoundDrawableTintBlendMode(abpVar));
                        abp.setOnFocusChangeListener(abpVar, (abp) null);
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }

        @Nullable
        public static abp setX() throws InterruptedException {
            return (abp) setY(new Object[0], 337571063, -337571063, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws InterruptedException {
            int i13 = ~((~i10) | i11);
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~i12;
            int i17 = (((~(i11 | i16)) | (~(i12 | i14)) | i13) * 988) + (((~(i10 | i16)) | i15) * (-1976)) + ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
            if (i17 == 1) {
                return a(objArr);
            }
            if (i17 == 2) {
                abp abpVar = (abp) objArr[0];
                int i18 = f52341b;
                int i19 = (((i18 & (-54)) | ((~i18) & 53)) - (~((i18 & 53) << 1))) - 1;
                f52340a = i19 % 128;
                int i20 = i19 % 2;
                boolean zBooleanValue = ((Boolean) setY(new Object[]{abpVar}, -875816378, 875816379, (int) System.currentTimeMillis())).booleanValue();
                int i21 = f52341b;
                int i22 = i21 & 89;
                int i23 = (i22 - (~((i21 ^ 89) | i22))) - 1;
                f52340a = i23 % 128;
                int i24 = i23 % 2;
                return Boolean.valueOf(zBooleanValue);
            }
            if (i17 == 3) {
                abp abpVar2 = (abp) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                int i25 = f52341b + 113;
                f52340a = i25 % 128;
                int i26 = i25 % 2;
                setY(new Object[]{abpVar2, Long.valueOf(jLongValue), Boolean.valueOf(zBooleanValue2)}, -17270813, 17270817, (int) System.currentTimeMillis());
                int i27 = f52340a;
                int i28 = (i27 ^ 17) + ((i27 & 17) << 1);
                f52341b = i28 % 128;
                if (i28 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            if (i17 == 4) {
                abp abpVar3 = (abp) objArr[0];
                long jLongValue2 = ((Number) objArr[1]).longValue();
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                synchronized (abp.class) {
                    try {
                        if (!(!abp.setX(abpVar3))) {
                            throw new IllegalStateException("Unbalanced enter/exit".toString());
                        }
                        abp.setX(abpVar3, true);
                        if (abp.setCompoundDrawableTintBlendMode() == null) {
                            abp.setY(new abp());
                            new a().start();
                        }
                        long jNanoTime = System.nanoTime();
                        if (jLongValue2 != 0 && zBooleanValue3) {
                            abp.setOnFocusChangeListener(abpVar3, Math.min(jLongValue2, abpVar3.c_() - jNanoTime) + jNanoTime);
                        } else if (jLongValue2 != 0) {
                            abp.setOnFocusChangeListener(abpVar3, jLongValue2 + jNanoTime);
                        } else {
                            if (!zBooleanValue3) {
                                throw new AssertionError();
                            }
                            abp.setOnFocusChangeListener(abpVar3, abpVar3.c_());
                        }
                        long compoundDrawableTintBlendMode = abp.setCompoundDrawableTintBlendMode(abpVar3, jNanoTime);
                        abp compoundDrawableTintBlendMode2 = abp.setCompoundDrawableTintBlendMode();
                        Intrinsics.checkNotNull(compoundDrawableTintBlendMode2);
                        while (abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2) != null) {
                            abp compoundDrawableTintBlendMode3 = abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                            Intrinsics.checkNotNull(compoundDrawableTintBlendMode3);
                            if (compoundDrawableTintBlendMode < abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode3, jNanoTime)) {
                                break;
                            }
                            compoundDrawableTintBlendMode2 = abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                            Intrinsics.checkNotNull(compoundDrawableTintBlendMode2);
                        }
                        abp.setOnFocusChangeListener(abpVar3, abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2));
                        abp.setOnFocusChangeListener(compoundDrawableTintBlendMode2, abpVar3);
                        if (compoundDrawableTintBlendMode2 == abp.setCompoundDrawableTintBlendMode()) {
                            abp.class.notify();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            }
            int i29 = f52341b;
            int i30 = i29 & 105;
            int i31 = (i29 | 105) & (~i30);
            int i32 = -(-(i30 << 1));
            int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
            f52340a = i33 % 128;
            if (i33 % 2 != 0) {
                abp compoundDrawableTintBlendMode4 = abp.setCompoundDrawableTintBlendMode();
                Intrinsics.checkNotNull(compoundDrawableTintBlendMode4);
                abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode4);
                throw null;
            }
            abp compoundDrawableTintBlendMode5 = abp.setCompoundDrawableTintBlendMode();
            Intrinsics.checkNotNull(compoundDrawableTintBlendMode5);
            abp compoundDrawableTintBlendMode6 = abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode5);
            if (compoundDrawableTintBlendMode6 == null) {
                long jNanoTime2 = System.nanoTime();
                abp.class.wait(abp.setLayoutAnimation());
                abp compoundDrawableTintBlendMode7 = abp.setCompoundDrawableTintBlendMode();
                Intrinsics.checkNotNull(compoundDrawableTintBlendMode7);
                if (abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode7) == null) {
                    int i34 = f52341b;
                    int i35 = ((i34 ^ 92) + ((i34 & 92) << 1)) - 1;
                    f52340a = i35 % 128;
                    if (i35 % 2 == 0 ? System.nanoTime() - jNanoTime2 >= abp.setOnLongClickListener() : System.nanoTime() + jNanoTime2 >= abp.setOnLongClickListener()) {
                        abp compoundDrawableTintBlendMode8 = abp.setCompoundDrawableTintBlendMode();
                        int i36 = f52341b;
                        int i37 = (-2) - (((i36 & 16) + (i36 | 16)) ^ (-1));
                        f52340a = i37 % 128;
                        if (i37 % 2 == 0) {
                            return compoundDrawableTintBlendMode8;
                        }
                        int i38 = 3 / 0;
                        return compoundDrawableTintBlendMode8;
                    }
                }
                int i39 = f52341b;
                int i40 = i39 & 31;
                int i41 = -(-((i39 ^ 31) | i40));
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                f52340a = i42 % 128;
                int i43 = i42 % 2;
                return null;
            }
            long compoundDrawableTintBlendMode9 = abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode6, System.nanoTime());
            if (compoundDrawableTintBlendMode9 > 0) {
                int i44 = f52341b;
                int i45 = (i44 | 69) << 1;
                int i46 = -(((~i44) & 69) | (i44 & (-70)));
                int i47 = (i45 & i46) + (i46 | i45);
                f52340a = i47 % 128;
                int i48 = i47 % 2;
                long j10 = compoundDrawableTintBlendMode9 / AnimationKt.MillisToNanos;
                abp.class.wait(j10, (int) (compoundDrawableTintBlendMode9 - (AnimationKt.MillisToNanos * j10)));
                int i49 = f52340a + 107;
                f52341b = i49 % 128;
                int i50 = i49 % 2;
                return null;
            }
            abp compoundDrawableTintBlendMode10 = abp.setCompoundDrawableTintBlendMode();
            Intrinsics.checkNotNull(compoundDrawableTintBlendMode10);
            abp.setOnFocusChangeListener(compoundDrawableTintBlendMode10, abp.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode6));
            abp.setOnFocusChangeListener(compoundDrawableTintBlendMode6, (abp) null);
            int i51 = f52340a;
            int i52 = i51 & 93;
            int i53 = (i51 | 93) & (~i52);
            int i54 = -(-(i52 << 1));
            int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
            f52341b = i55 % 128;
            if (i55 % 2 != 0) {
                return compoundDrawableTintBlendMode6;
            }
            throw null;
        }
    }

    public static final class setCompoundDrawableTintBlendMode implements aco {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f52332r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f52333s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ abp f52334p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ aco f52335q0;

        /* JADX WARN: Bottom block not found for handler: all -> 0x0294 */
        /* JADX WARN: Code duplicated, block: B:30:0x0229  */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x03f4, code lost:
        
            if (r2.setY() == false) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x040e, code lost:
        
            if ((!r2.setY()) != false) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x0410, code lost:
        
            r0 = com.mypinpad.tsdk.i.abp.setCompoundDrawableTintBlendMode.f52333s0;
            r1 = r0 | 73;
            r2 = ((r1 << 1) - (~(-((~(r0 & 73)) & r1)))) - 1;
            com.mypinpad.tsdk.i.abp.setCompoundDrawableTintBlendMode.f52332r0 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x042a, code lost:
        
            throw r2.setY((java.io.IOException) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0350, code lost:
        
            if ((!r2.setY()) != true) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0368, code lost:
        
            if ((!r2.setY()) != true) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x036a, code lost:
        
            r0 = com.mypinpad.tsdk.i.abp.setCompoundDrawableTintBlendMode.f52333s0 + 73;
            com.mypinpad.tsdk.i.abp.setCompoundDrawableTintBlendMode.f52332r0 = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0373, code lost:
        
            if ((r0 % 2) == 0) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0375, code lost:
        
            r2.setY((java.io.IOException) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0379, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x037f, code lost:
        
            throw r2.setY((java.io.IOException) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0380, code lost:
        
            r0 = com.mypinpad.tsdk.i.abp.setCompoundDrawableTintBlendMode.f52332r0;
            r1 = r0 & 3;
            r0 = (r0 ^ 3) | r1;
            r2 = ((r1 | r0) << 1) - (r0 ^ r1);
            com.mypinpad.tsdk.i.abp.setCompoundDrawableTintBlendMode.f52333s0 = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0390, code lost:
        
            if (r2 == 0) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0395, code lost:
        
            throw null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r2v13, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r2v18, types: [int] */
        /* JADX WARN: Type inference failed for: r2v29, types: [int] */
        /* JADX WARN: Type inference failed for: r2v30, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r2v31, types: [com.mypinpad.tsdk.i.abp] */
        /* JADX WARN: Type inference failed for: r2v37, types: [int] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r18, int r19, int r20, int r21) throws java.lang.InterruptedException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 1126
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.abp.setCompoundDrawableTintBlendMode.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws InterruptedException, IOException {
            setDividerPadding(new Object[]{this}, 1975212956, -1975212954, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco, java.io.Flushable
        public final void flush() throws InterruptedException, IOException {
            setDividerPadding(new Object[]{this}, -131848255, 131848256, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        public final /* synthetic */ acq setY() {
            return (acq) setDividerPadding(new Object[]{this}, -631010179, 631010182, System.identityHashCode(this));
        }

        @NotNull
        public final String toString() {
            return (String) setDividerPadding(new Object[]{this}, -283278779, 283278784, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.aco
        public final void setDividerPadding(@NotNull abx abxVar, long j10) throws InterruptedException, IOException {
            setDividerPadding(new Object[]{this, abxVar, Long.valueOf(j10)}, 291532939, -291532935, System.identityHashCode(this));
        }
    }
}
