package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/yn;", "Ljava/io/Closeable;", "Lcom/mypinpad/tsdk/i/yj;", "setX", "()Lcom/mypinpad/tsdk/i/yj;", "", "setOnFocusChangeListener", "()J", "Lcom/mypinpad/tsdk/i/aby;", "setY", "()Lcom/mypinpad/tsdk/i/aby;", "", "setDividerPadding", "()Ljava/lang/String;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "()V", "<init>"}, k = 1, mv = {1, 6, 0})
public abstract class yn implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static int f62157p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f62158q0 = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    static {
        int i10 = f62158q0;
        int i11 = ((i10 & (-118)) | ((~i10) & 117)) + ((i10 & 117) << 1);
        f62157p0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object compoundDrawableTintBlendMode;
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 != 1) {
            yn ynVar = (yn) objArr[0];
            int i18 = f62157p0;
            int i19 = i18 ^ 61;
            int i20 = ((i18 & 61) | i19) << 1;
            int i21 = -i19;
            int i22 = (i20 & i21) + (i20 | i21);
            f62158q0 = i22 % 128;
            int i23 = i22 % 2;
            yj x4 = ynVar.setX();
            if (x4 == null) {
                int i24 = f62158q0;
                int i25 = i24 ^ 35;
                int i26 = ((i24 & 35) | i25) << 1;
                int i27 = -i25;
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                int i29 = i28 % 128;
                f62157p0 = i29;
                int i30 = i28 % 2;
                int i31 = i29 & 123;
                int i32 = -(-(i29 | 123));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f62158q0 = i33 % 128;
                int i34 = i33 % 2;
                compoundDrawableTintBlendMode = null;
            } else {
                compoundDrawableTintBlendMode = (Charset) yj.setX(new Object[]{x4, Charsets.UTF_8}, -1673590045, 1673590046, System.identityHashCode(x4));
                int i35 = f62157p0;
                int i36 = i35 ^ 41;
                int i37 = ((i35 & 41) | i36) << 1;
                int i38 = -i36;
                int i39 = (i37 & i38) + (i37 | i38);
                f62158q0 = i39 % 128;
                int i40 = i39 % 2;
            }
            if (compoundDrawableTintBlendMode == null) {
                int i41 = f62158q0;
                int i42 = (i41 & (-10)) | ((~i41) & 9);
                int i43 = (i41 & 9) << 1;
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                f62157p0 = i44 % 128;
                int i45 = i44 % 2;
                compoundDrawableTintBlendMode = Charsets.UTF_8;
                int i46 = f62157p0;
                int i47 = ((i46 | 111) << 1) - (i46 ^ 111);
                f62158q0 = i47 % 128;
                int i48 = i47 % 2;
            }
            int i49 = f62158q0;
            int i50 = (((i49 & (-86)) | ((~i49) & 85)) - (~(-(-((i49 & 85) << 1))))) - 1;
            f62157p0 = i50 % 128;
            if (i50 % 2 != 0) {
                throw null;
            }
        } else {
            yn ynVar2 = (yn) objArr[0];
            int i51 = f62158q0;
            int i52 = i51 & 99;
            int i53 = (i51 | 99) & (~i52);
            int i54 = i52 << 1;
            int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
            f62157p0 = i55 % 128;
            int i56 = i55 % 2;
            aby y7 = ynVar2.setY();
            try {
                compoundDrawableTintBlendMode = y7.setCompoundDrawableTintBlendMode((Charset) yt.setY(new Object[]{y7, (Charset) setX(new Object[]{ynVar2}, 29403445, -29403445, System.identityHashCode(ynVar2))}, -2095201481, 2095201524, (int) System.currentTimeMillis()));
                CloseableKt.closeFinally(y7, null);
                int i57 = f62158q0;
                int i58 = i57 & 29;
                int i59 = -(-(i57 | 29));
                int i60 = (i58 & i59) + (i59 | i58);
                f62157p0 = i60 % 128;
                if (i60 % 2 != 0) {
                    int i61 = 79 / 0;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(y7, th2);
                    throw th3;
                }
            }
        }
        return compoundDrawableTintBlendMode;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        int i10 = f62158q0;
        int i11 = (((i10 & (-22)) | ((~i10) & 21)) - (~((i10 & 21) << 1))) - 1;
        f62157p0 = i11 % 128;
        int i12 = i11 % 2;
        yt.setY(new Object[]{setY()}, 1911381155, -1911381148, (int) System.currentTimeMillis());
        int i13 = f62158q0;
        int i14 = i13 & 97;
        int i15 = -(-(i13 | 97));
        int i16 = (i14 & i15) + (i15 | i14);
        f62157p0 = i16 % 128;
        int i17 = i16 % 2;
    }

    @NotNull
    public final String setDividerPadding() throws IOException {
        return (String) setX(new Object[]{this}, 2103810995, -2103810994, System.identityHashCode(this));
    }

    public abstract long setOnFocusChangeListener();

    @Nullable
    public abstract yj setX();

    @NotNull
    public abstract aby setY();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yn$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\fH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\rH\u0007J'\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003J\u001d\u0010\u000f\u001a\u00020\u0004*\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0010"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "()V", "create", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "content", "", "contentLength", "", "Lokio/BufferedSource;", "", "Lokio/ByteString;", "asResponseBody", "toResponseBody", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
            int i15 = ~i12;
            int i16 = ~(i15 | i11);
            int i17 = ~(i10 | i11);
            int i18 = i13 | (~i11);
            int i19 = ((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14;
            if (i19 == 1) {
                byte[] bArr = (byte[]) objArr[0];
                Intrinsics.checkNotNullParameter(bArr, "");
                abx abxVar = new abx();
                return (yn) setCompoundDrawableTintBlendMode(new Object[]{(abx) abx.setOnFocusChangeListener(new Object[]{abxVar, bArr}, -808853030, 808853073, System.identityHashCode(abxVar)), null, Long.valueOf(bArr.length)}, 1865914915, -1865914915, (int) System.currentTimeMillis());
            }
            if (i19 == 2) {
                return (yn) setCompoundDrawableTintBlendMode(new Object[]{(byte[]) objArr[1], null}, -224728398, 224728399, (int) System.currentTimeMillis());
            }
            aby abyVar = (aby) objArr[0];
            yj yjVar = (yj) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            Intrinsics.checkNotNullParameter(abyVar, "");
            return new setY(yjVar, jLongValue, abyVar);
        }

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yn$setOnFocusChangeListener$setY */
        public final class setY extends yn {

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public static int f62159u0 = 0;
            public static int v0 = 1;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ yj f62160r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ long f62161s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ aby f62162t0;

            public setY(yj yjVar, long j10, aby abyVar) {
                this.f62160r0 = yjVar;
                this.f62161s0 = j10;
                this.f62162t0 = abyVar;
            }

            public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
                int i13 = (i11 * (-667)) + (i10 * (-1335));
                int i14 = ~i11;
                int i15 = i10 | i12;
                int i16 = ((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13;
                if (i16 == 1) {
                    setY sety = (setY) objArr[0];
                    int i17 = v0 + 43;
                    int i18 = i17 % 128;
                    f62159u0 = i18;
                    int i19 = i17 % 2;
                    long j10 = sety.f62161s0;
                    int i20 = i18 & 103;
                    int i21 = ((i18 ^ 103) | i20) << 1;
                    int i22 = -((~i20) & (i18 | 103));
                    int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                    v0 = i23 % 128;
                    if (i23 % 2 != 0) {
                        return Long.valueOf(j10);
                    }
                    throw null;
                }
                if (i16 != 2) {
                    setY sety2 = (setY) objArr[0];
                    int i24 = f62159u0 + 77;
                    v0 = i24 % 128;
                    int i25 = i24 % 2;
                    aby abyVar = sety2.f62162t0;
                    if (i25 != 0) {
                        return abyVar;
                    }
                    throw null;
                }
                setY sety3 = (setY) objArr[0];
                int iIdentityHashCode = System.identityHashCode(sety3);
                int i26 = ~iIdentityHashCode;
                int i27 = (iIdentityHashCode | i26) & i26;
                int i28 = i27 & (-1505716060);
                int i29 = (i27 | (-1505716060)) & (~i28);
                int i30 = (i29 & i28) | (i29 ^ i28);
                int i31 = ((-2013293276) & i30) | ((~i30) & 2013293275);
                int i32 = i30 & 2013293275;
                int i33 = (i32 & i31) | (i31 ^ i32);
                int i34 = ~i33;
                int i35 = (i33 | i34) & i34;
                int i36 = 536873088 & i35;
                int i37 = -(~(-(-((((i35 | 536873088) & (~i36)) | i36) * (-828)))));
                int i38 = ((((-125283773) | i37) << 1) - (i37 ^ (-125283773))) - 1;
                int i39 = ((~i26) & (-29295873)) | (29295872 & i26);
                int i40 = i26 & (-29295873);
                int i41 = ((i39 & i40) | (i39 ^ i40)) * (-828);
                int i42 = i38 & i41;
                int i43 = -(-((i41 ^ i38) | i42));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                int i45 = (1512821759 & i44) | ((~i44) & (-1512821760));
                int i46 = (i44 & (-1512821760)) << 1;
                int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
                int iIdentityHashCode2 = System.identityHashCode(sety3);
                int i48 = ~iIdentityHashCode2;
                int i49 = ((-481157015) ^ iIdentityHashCode2) | ((-481157015) & iIdentityHashCode2);
                int i50 = ~i49;
                int i51 = (i49 | i50) & i50;
                int i52 = i48 & 1800046957;
                int i53 = (~i52) & (i48 | 1800046957);
                int i54 = ~((i52 & i53) | (i53 ^ i52));
                int i55 = ((i51 & i54) | (i51 ^ i54)) * (-1808);
                int i56 = (-289363509) ^ i55;
                int i57 = -(-((i55 & (-289363509)) << 1));
                int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                int i59 = ~(((-134777093) & iIdentityHashCode2) | ((-134777093) ^ iIdentityHashCode2));
                int i60 = i48 & 481157014;
                int i61 = (~i60) & (i48 | 481157014);
                int i62 = (i60 & i61) | (i61 ^ i60);
                int i63 = i62 & 1800046957;
                int i64 = (1800046957 | i62) & (~i63);
                int i65 = ~((i64 & i63) | (i64 ^ i63));
                int i66 = i59 & i65;
                int i67 = (i59 | i65) & (~i66);
                int i68 = -(-(((i67 & i66) | (i67 ^ i66)) * 904));
                int i69 = ((i58 ^ i68) - (~((i68 & i58) << 1))) - 1;
                int i70 = ~(((-1800046958) & iIdentityHashCode2) | ((-1800046958) ^ iIdentityHashCode2));
                int i71 = 346379922 ^ i70;
                int i72 = i70 & 346379922;
                int i73 = (i72 & i71) | (i71 ^ i72);
                int i74 = (iIdentityHashCode2 | i48) & i48;
                int i75 = ~((i74 & 481157014) | ((-481157015) & i74) | ((~i74) & 481157014));
                int i76 = i73 ^ i75;
                int i77 = i75 & i73;
                int i78 = ((i77 & i76) | (i76 ^ i77)) * 904;
                int i79 = (i69 | i78) << 1;
                int i80 = -((i78 & (~i69)) | ((~i78) & i69));
                int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                yj yjVar = sety3.f62160r0;
                if (i47 > i81) {
                    return yjVar;
                }
                throw null;
            }

            @Override // com.mypinpad.tsdk.isolation.yn
            @Nullable
            public final yj setX() {
                return (yj) setOnFocusChangeListener(new Object[]{this}, 603357635, -603357633, System.identityHashCode(this));
            }

            @Override // com.mypinpad.tsdk.isolation.yn
            @NotNull
            public final aby setY() {
                return (aby) setOnFocusChangeListener(new Object[]{this}, 730740282, -730740282, System.identityHashCode(this));
            }

            @Override // com.mypinpad.tsdk.isolation.yn
            public final long setOnFocusChangeListener() {
                return ((Long) setOnFocusChangeListener(new Object[]{this}, 1058378893, -1058378892, System.identityHashCode(this))).longValue();
            }
        }

        public static /* synthetic */ yn setCompoundDrawableTintBlendMode(Companion companion, byte[] bArr) {
            return (yn) setCompoundDrawableTintBlendMode(new Object[]{companion, bArr}, -1555551412, 1555551414, (int) System.currentTimeMillis());
        }
    }
}
