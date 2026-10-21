package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class lh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56938d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56939e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kz f56940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final lj f56942c;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[fd.valuesCustom().length];
            iArr[fd.ONLINE_REQUEST.ordinal()] = 1;
            iArr[fd.DECLINED.ordinal()] = 2;
            setY = iArr;
            int i10 = ((1 | 11) << 1) - ((11 & (~1)) | (1 & (-12)));
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    public lh(@NotNull kz kzVar, @NotNull setTextKeepState settextkeepstate, @NotNull lj ljVar) {
        Intrinsics.checkNotNullParameter(kzVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(ljVar, "");
        this.f56940a = kzVar;
        this.f56941b = settextkeepstate;
        this.f56942c = ljVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        byte b10 = 0;
        lh lhVar = (lh) objArr[0];
        fd fdVar = (fd) objArr[1];
        int i13 = f56939e;
        int i14 = i13 & 41;
        int i15 = -(-((i13 ^ 41) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f56938d = i16 % 128;
        int i17 = 2;
        int i18 = i16 % 2;
        Intrinsics.checkNotNullParameter(fdVar, "");
        kz kzVar = lhVar.f56940a;
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar}, -672536244, 672536278, System.identityHashCode(kzVar));
        kz kzVar2 = lhVar.f56940a;
        TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar2}, 85781969, -85781950, System.identityHashCode(kzVar2));
        int i19 = setY.setY[fdVar.ordinal()];
        setTextKeepState settextkeepstate = lhVar.f56941b;
        lj ljVar = lhVar.f56942c;
        if (i19 != 1) {
            if (i19 != 2) {
                throw new fh(23, fdVar.toString());
            }
            fk fkVar = (fk) lj.setY(new Object[]{ljVar, kzVar2, settextkeepstate, ValueQualifier.setY, setContentCaptureSession.setCompoundDrawableTintBlendMode}, -2078230956, 2078230956, System.identityHashCode(ljVar));
            int i20 = f56938d + 50;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f56939e = i21 % 128;
            if (i21 % 2 != 0) {
                return fkVar;
            }
            throw null;
        }
        cz czVar = new cz(kzVar2);
        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{czVar}, 1115257939, -1115257923, System.identityHashCode(czVar));
        int onFocusChangeListener = ((setFindListener) setImageTintList.setX(new Object[]{setimagetintlist}, -352851471, 352851476, System.identityHashCode(setimagetintlist))).setOnFocusChangeListener();
        byte[] bArr = new byte[onFocusChangeListener];
        System.identityHashCode(lhVar);
        System.identityHashCode(lhVar);
        int i22 = 0;
        while (i22 < onFocusChangeListener) {
            int i23 = f56938d;
            int i24 = i23 & 75;
            int i25 = i23 | 75;
            int i26 = (i24 & i25) + (i24 | i25);
            f56939e = i26 % 128;
            int i27 = i26 % i17;
            bArr[i22] = b10;
            int iIdentityHashCode = System.identityHashCode(lhVar);
            int i28 = -(-(i22 * 302));
            int i29 = (-300) & i28;
            int i30 = (-300) | i28;
            int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
            int i32 = ~i22;
            int i33 = (i32 & 1) | (i22 & (-2));
            int i34 = i22 & 1;
            int i35 = (i33 ^ i34) | (i33 & i34);
            int i36 = i35 & iIdentityHashCode;
            int i37 = (~i36) & (i35 | iIdentityHashCode);
            int i38 = (i37 & i36) | (i37 ^ i36);
            int i39 = ~i38;
            int i40 = ((i38 | i39) & i39) * (-301);
            int i41 = i31 ^ i40;
            int i42 = ((i31 & i40) | i41) << 1;
            int i43 = -i41;
            int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
            int i45 = ~iIdentityHashCode;
            int i46 = ((~i32) & iIdentityHashCode) | (i32 & i45) | (i32 & iIdentityHashCode);
            int i47 = ~i46;
            int i48 = (i46 | i47) & i47;
            int i49 = (i45 | iIdentityHashCode) & i45;
            lh lhVar2 = lhVar;
            int i50 = i49 & 1;
            int i51 = onFocusChangeListener;
            int i52 = (~i50) & (i49 | 1);
            int i53 = ~((i50 & i52) | (i52 ^ i50));
            int i54 = i48 & i53;
            int i55 = (i53 | i48) & (~i54);
            int i56 = ((i55 & i54) | (i55 ^ i54)) * (-301);
            int i57 = i44 & i56;
            int i58 = (i56 ^ i44) | i57;
            int i59 = (i57 & i58) + (i58 | i57);
            int i60 = (i45 & (-2)) | (iIdentityHashCode & 1);
            int i61 = (-2) & iIdentityHashCode;
            int i62 = ~((i60 & i61) | (i60 ^ i61));
            int i63 = i32 & i62;
            int i64 = -(~(-(-((((i62 | i32) & (~i63)) | i63) * 301))));
            i22 = ((i59 ^ i64) + ((i64 & i59) << 1)) - 1;
            int i65 = f56939e;
            int i66 = (i65 & 25) + (i65 | 25);
            f56938d = i66 % 128;
            int i67 = i66 % 2;
            i17 = 2;
            lhVar = lhVar2;
            onFocusChangeListener = i51;
            b10 = 0;
        }
        Object[] objArr2 = new Object[i17];
        objArr2[0] = setimagetintlist;
        objArr2[1] = bArr;
        setImageTintList.setX(objArr2, -1398236510, 1398236511, System.identityHashCode(setimagetintlist));
        fk fkVar2 = (fk) lj.setY(new Object[]{ljVar, kzVar2, settextkeepstate, activateSession.AUTHORISING_PLEASE_WAIT, fd.ONLINE_REQUEST, settransitionvisibility, transactionProcessingResult}, -288454242, 288454243, System.identityHashCode(ljVar));
        int i68 = f56939e;
        int i69 = i68 & 101;
        int i70 = i69 + ((i68 ^ 101) | i69);
        f56938d = i70 % 128;
        int i71 = i70 % 2;
        return fkVar2;
    }

    @NotNull
    public final fk setDividerPadding(@NotNull fd fdVar) {
        return (fk) setOnFocusChangeListener(new Object[]{this, fdVar}, 1529335352, -1529335352, System.identityHashCode(this));
    }
}
