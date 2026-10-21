package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkSecuritySessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkSecuritySessions.kt\ncom/mypinpad/tsdk/internal/remote/SdkSecurityAuthorizePinSession\n+ 2 Junkification.kt\ncom/mypinpad/common/bytes/JunkificationKt\n*L\n1#1,51:1\n13#2:52\n13#2:53\n*S KotlinDebug\n*F\n+ 1 SdkSecuritySessions.kt\ncom/mypinpad/tsdk/internal/remote/SdkSecurityAuthorizePinSession\n*L\n33#1:52\n34#1:53\n*E\n"})
public final class qg implements setMinimumHeight {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f57861x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f57862y0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f57863p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f57864q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final so f57865r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final String f57866s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final byte[] f57867t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public final String f57868u0;

    @Nullable
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public final String f57869w0;

    public qg(@NotNull String str, @NotNull String str2, @NotNull so soVar, @NotNull String str3, @NotNull byte[] bArr, @Nullable String str4, @Nullable byte[] bArr2, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(soVar, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f57863p0 = str;
        this.f57864q0 = str2;
        this.f57865r0 = soVar;
        this.f57866s0 = str3;
        this.f57867t0 = bArr;
        this.f57868u0 = str4;
        this.v0 = bArr2;
        this.f57869w0 = str5;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i12;
        switch ((((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559))) {
            case 1:
                qg qgVar = (qg) objArr[0];
                int i14 = f57861x0;
                int i15 = ((i14 | 117) << 1) - (i14 ^ 117);
                f57862y0 = i15 % 128;
                if (i15 % 2 != 0) {
                    return qgVar.f57867t0;
                }
                byte[] bArr = qgVar.f57867t0;
                throw null;
            case 2:
                qg qgVar2 = (qg) objArr[0];
                int iIdentityHashCode = System.identityHashCode(qgVar2);
                int i16 = ((~iIdentityHashCode) & (-2021692574)) | (2021692573 & iIdentityHashCode);
                int i17 = (-2021692574) & iIdentityHashCode;
                int i18 = (i16 & i17) | (i16 ^ i17);
                int i19 = ~i18;
                int i20 = (i18 | i19) & i19;
                int i21 = -(~(-(-(((i20 & 1469970863) | ((~i20) & 1469970863) | ((-1469970864) & i20)) * (-658)))));
                int i22 = ((((-1215910615) | i21) << 1) - (i21 ^ (-1215910615))) - 1;
                int i23 = ((i22 | (-361526678)) << 1) - ((-361526678) ^ i22);
                int i24 = ~(((iIdentityHashCode | (-2021692574)) & (~i17)) | i17);
                int i25 = 1350602893 & i24;
                int i26 = (i24 | 1350602893) & (~i25);
                int i27 = -(-(((i26 & i25) | (i26 ^ i25)) * 658));
                int i28 = i23 | i27;
                int i29 = i28 << 1;
                int i30 = -((~(i27 & i23)) & i28);
                int i31 = (i29 & i30) + (i30 | i29);
                System.identityHashCode(qgVar2);
                if (i31 <= 989446846) {
                    so soVar = qgVar2.f57865r0;
                    throw null;
                }
                so soVar2 = qgVar2.f57865r0;
                int i32 = f57862y0;
                int i33 = ((i32 ^ 17) - (~(-(-((i32 & 17) << 1))))) - 1;
                f57861x0 = i33 % 128;
                int i34 = i33 % 2;
                return soVar2;
            case 3:
                qg qgVar3 = (qg) objArr[0];
                int i35 = f57862y0;
                int i36 = i35 + 92;
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f57861x0 = i37 % 128;
                int i38 = i37 % 2;
                obj = qgVar3.f57868u0;
                int i39 = ((i35 ^ 80) + ((i35 & 80) << 1)) - 1;
                f57861x0 = i39 % 128;
                if (i39 % 2 != 0) {
                    throw null;
                }
                break;
            case 4:
                qg qgVar4 = (qg) objArr[0];
                int i40 = f57861x0;
                int i41 = ((i40 ^ 10) + ((i40 & 10) << 1)) - 1;
                f57862y0 = i41 % 128;
                int i42 = i41 % 2;
                obj = qgVar4.v0;
                int i43 = i40 + 61;
                f57862y0 = i43 % 128;
                if (i43 % 2 == 0) {
                    throw null;
                }
                break;
            case 5:
                qg qgVar5 = (qg) objArr[0];
                int i44 = ((-1) << 1) - ((f57861x0 + 126) ^ (-1));
                int i45 = i44 % 128;
                f57862y0 = i45;
                int i46 = i44 % 2;
                String str = qgVar5.f57869w0;
                int i47 = ((i45 | 15) << 1) - (i45 ^ 15);
                f57861x0 = i47 % 128;
                int i48 = i47 % 2;
                return str;
            case 6:
                qg qgVar6 = (qg) objArr[0];
                int i49 = f57861x0;
                int i50 = (i49 & (-18)) | ((~i49) & 17);
                int i51 = (i49 & 17) << 1;
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                f57862y0 = i52 % 128;
                if (i52 % 2 == 0) {
                    Random.INSTANCE.nextBytes(qgVar6.f57867t0);
                    throw null;
                }
                byte[] bArr2 = qgVar6.f57867t0;
                Random.Companion r10 = Random.INSTANCE;
                r10.nextBytes(bArr2);
                byte[] bArr3 = qgVar6.v0;
                if (bArr3 == null) {
                    int i53 = f57861x0;
                    int i54 = (i53 ^ 79) + ((i53 & 79) << 1);
                    f57862y0 = i54 % 128;
                    int i55 = i54 % 2;
                    return null;
                }
                r10.nextBytes(bArr3);
                int i56 = f57862y0;
                int i57 = (-2) - (((i56 ^ 16) + ((i56 & 16) << 1)) ^ (-1));
                f57861x0 = i57 % 128;
                int i58 = i57 % 2;
                return null;
            case 7:
                qg qgVar7 = (qg) objArr[0];
                int i59 = f57861x0;
                int i60 = i59 + 115;
                f57862y0 = i60 % 128;
                int i61 = i60 % 2;
                String str2 = qgVar7.f57864q0;
                int i62 = i59 & 121;
                int i63 = -(-((i59 ^ 121) | i62));
                int i64 = (i62 & i63) + (i62 | i63);
                f57862y0 = i64 % 128;
                if (i64 % 2 != 0) {
                    return str2;
                }
                int i65 = 62 / 0;
                return str2;
            case 8:
                qg qgVar8 = (qg) objArr[0];
                int i66 = f57862y0;
                int i67 = i66 & 109;
                int i68 = (((i66 ^ 109) | i67) << 1) - ((i66 | 109) & (~i67));
                int i69 = i68 % 128;
                f57861x0 = i69;
                int i70 = i68 % 2;
                String str3 = qgVar8.f57863p0;
                int i71 = i69 & 35;
                int i72 = (i71 - (~(-(-((i69 ^ 35) | i71))))) - 1;
                f57862y0 = i72 % 128;
                if (i72 % 2 != 0) {
                    return str3;
                }
                int i73 = 7 / 0;
                return str3;
            default:
                qg qgVar9 = (qg) objArr[0];
                int i74 = f57861x0;
                int i75 = (i74 ^ 63) + ((i74 & 63) << 1);
                f57862y0 = i75 % 128;
                int i76 = i75 % 2;
                obj = qgVar9.f57866s0;
                int i77 = i74 & 29;
                int i78 = (i74 | 29) & (~i77);
                int i79 = i77 << 1;
                int i80 = (i78 & i79) + (i78 | i79);
                f57862y0 = i80 % 128;
                if (i80 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return obj;
    }

    @Nullable
    public final String getNavBarTitleString() {
        return (String) setX(new Object[]{this}, 1347578865, -1347578862, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setMinimumHeight
    public final void setCompoundDrawableTintBlendMode() {
        setX(new Object[]{this}, -1626552540, 1626552546, System.identityHashCode(this));
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setX(new Object[]{this}, 774313408, -774313408, System.identityHashCode(this));
    }

    @Nullable
    public final String setNavigationOnClickListener() {
        return (String) setX(new Object[]{this}, 2090856827, -2090856822, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnDragListener() {
        return (byte[]) setX(new Object[]{this}, 1679861173, -1679861172, System.identityHashCode(this));
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, 1449311825, -1449311818, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setOnLongClickListener() {
        return (byte[]) setX(new Object[]{this}, -571018965, 571018969, System.identityHashCode(this));
    }

    @NotNull
    public final so setY() {
        return (so) setX(new Object[]{this}, 822459484, -822459482, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setX(new Object[]{this}, 859012527, -859012519, System.identityHashCode(this));
    }
}
