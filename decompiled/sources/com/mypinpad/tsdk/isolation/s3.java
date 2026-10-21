package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/cv;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class s3 extends Lambda implements Function1<cv, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s3 f58186p0 = new s3();

    static {
        int i10 = (1 & 53) + (1 | 53);
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public s3() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445)) != 1) {
            s3 s3Var = (s3) objArr[0];
            a(new Object[]{s3Var, (cv) objArr[1]}, -270245195, 270245196, System.identityHashCode(s3Var));
            return Unit.INSTANCE;
        }
        s3 s3Var2 = (s3) objArr[0];
        cv cvVar = (cv) objArr[1];
        int iIdentityHashCode = System.identityHashCode(s3Var2);
        int i16 = ~iIdentityHashCode;
        int i17 = (i16 | iIdentityHashCode) & i16;
        int i18 = (-152688956) & i17;
        int i19 = ((i17 | (-152688956)) & (~i18)) | i18;
        int i20 = ~i19;
        int i21 = (i19 | i20) & i20;
        int i22 = 722964892 & iIdentityHashCode;
        int i23 = (~i22) & (722964892 | iIdentityHashCode);
        int i24 = ~((i23 & i22) | (i23 ^ i22));
        int i25 = i21 & i24;
        int i26 = (i21 | i24) & (~i25);
        int i27 = (i26 & i25) | (i26 ^ i25);
        int i28 = i16 & (-722964893);
        int i29 = (i16 ^ (-722964893)) | i28;
        int i30 = ~i29;
        int i31 = (i29 | i30) & i30;
        int i32 = i27 & i31;
        int i33 = (i27 | i31) & (~i32);
        int i34 = ((i33 & i32) | (i33 ^ i32)) * 959;
        int i35 = 863502012 & i34;
        int i36 = (i34 | 863502012) & (~i35);
        int i37 = i35 << 1;
        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
        int i39 = (i38 & (-1954279035)) + ((-1954279035) | i38);
        int i40 = (i39 ^ (-1)) + (i39 << 1);
        int i41 = 722964892 & i16;
        int i42 = (722964892 | i16) & (~i41);
        int i43 = (i42 & i41) | (i42 ^ i41);
        int i44 = ~i43;
        int i45 = (i43 | i44) & i44;
        int i46 = (i16 & (-152688956)) | (152688955 & iIdentityHashCode);
        int i47 = (-152688956) & iIdentityHashCode;
        int i48 = ~((i46 & i47) | (i46 ^ i47));
        int i49 = ((~i48) & i45) | ((~i45) & i48);
        int i50 = i48 & i45;
        int i51 = (i50 & i49) | (i49 ^ i50);
        int i52 = (iIdentityHashCode & (-722964893)) | i28 | i22;
        int i53 = ~i52;
        int i54 = (i52 | i53) & i53;
        int i55 = i51 ^ i54;
        int i56 = i54 & i51;
        int i57 = ((i56 & i55) | (i55 ^ i56)) * 959;
        int i58 = i40 & i57;
        int i59 = -(-(i57 | i40));
        int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
        int iIdentityHashCode2 = System.identityHashCode(s3Var2);
        int i61 = ~iIdentityHashCode2;
        int i62 = (((-1429604634) & i61) | ((-1429604634) ^ i61)) * (-757);
        int i63 = 1880116148 & i62;
        int i64 = ((1880116148 ^ i62) | i63) << 1;
        int i65 = -((i62 | 1880116148) & (~i63));
        int i66 = (i64 & i65) + (i65 | i64);
        int i67 = (-271976449) & iIdentityHashCode2;
        int i68 = ((-271976449) | iIdentityHashCode2) & (~i67);
        int i69 = (i68 & i67) | (i68 ^ i67);
        int i70 = ~i69;
        int i71 = ((i69 | i70) & i70) * 1514;
        int i72 = i66 & i71;
        int i73 = ((i66 ^ i71) | i72) << 1;
        int i74 = -((i71 | i66) & (~i72));
        int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
        int i76 = ((~i61) & (-313927909)) | (313927908 & i61);
        int i77 = i61 & (-313927909);
        int i78 = ~((i77 & i76) | (i76 ^ i77));
        int i79 = ((~i78) & 41951460) | ((-41951461) & i78);
        int i80 = i78 & 41951460;
        int i81 = (-1157628186) ^ iIdentityHashCode2;
        int i82 = iIdentityHashCode2 & (-1157628186);
        int i83 = ((~((i82 & i81) | (i81 ^ i82))) | (i80 & i79) | (i79 ^ i80)) * 757;
        int i84 = i75 & i83;
        int i85 = (i83 ^ i75) | i84;
        if (i60 > ((i84 | i85) << 1) - (i85 ^ i84)) {
            Intrinsics.checkNotNullParameter(cvVar, "");
            cv.setDividerPadding(new Object[]{cvVar}, 1509608714, -1509608708, System.identityHashCode(cvVar));
            return null;
        }
        Intrinsics.checkNotNullParameter(cvVar, "");
        cv.setDividerPadding(new Object[]{cvVar}, 1509608714, -1509608708, System.identityHashCode(cvVar));
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(cv cvVar) {
        return a(new Object[]{this, cvVar}, 733633235, -733633235, System.identityHashCode(this));
    }
}
