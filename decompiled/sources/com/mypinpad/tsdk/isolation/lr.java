package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class lr extends lo {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56985j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56986k = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56987i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(@NotNull lq lqVar, @NotNull setTextKeepState settextkeepstate, @NotNull mc mcVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(lqVar, settextkeepstate, mcVar, getvalue);
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(mcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56987i = setcontentdescription;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x014f  */
    /* JADX WARN: Code duplicated, block: B:13:0x018e  */
    /* JADX WARN: Code duplicated, block: B:9:0x013f A[PHI: r3
      0x013f: PHI (r3v5 com.mypinpad.tsdk.i.fk) = (r3v4 com.mypinpad.tsdk.i.fk), (r3v15 com.mypinpad.tsdk.i.fk) binds: [B:8:0x013d, B:5:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        fk fkVar;
        int i13;
        lr lrVar = (lr) objArr[0];
        setRotationX setrotationx = (setRotationX) objArr[1];
        int iIdentityHashCode = System.identityHashCode(lrVar);
        int i14 = ~iIdentityHashCode;
        int i15 = ~i14;
        int i16 = i14 & 332875652;
        int i17 = ((-332875653) & i15) | i16;
        int i18 = (-332875653) & i14;
        int i19 = ~((i17 & i18) | (i17 ^ i18));
        int i20 = (-1313668561) ^ iIdentityHashCode;
        int i21 = (-1313668561) & iIdentityHashCode;
        int i22 = ~((i20 & i21) | (i20 ^ i21));
        int i23 = i19 ^ i22;
        int i24 = i19 & i22;
        int i25 = -(-(((i24 & i23) | (i23 ^ i24)) * ReturnCode.ERR_REPOSITORY));
        int i26 = (797638556 & i25) + (i25 | 797638556);
        int i27 = i14 ^ 1313668560;
        int i28 = i14 & 1313668560;
        int i29 = ~(i27 | i28);
        int i30 = 332875652 ^ iIdentityHashCode;
        int i31 = 332875652 & iIdentityHashCode;
        int i32 = (i30 ^ i31) | (i30 & i31);
        int i33 = ~i32;
        int i34 = (i32 | i33) & i33;
        int i35 = ((i29 & i34) | (i29 ^ i34)) * (-950);
        int i36 = (i26 & i35) + (i35 | i26);
        int i37 = (i15 & 332875652) | i18;
        int i38 = ~((i37 & i16) | (i37 ^ i16));
        int i39 = i28 | i21;
        int i40 = iIdentityHashCode & 1313668560;
        int i41 = ~((i40 & i39) | (i39 ^ i40));
        int i42 = i38 & i41;
        int i43 = (i41 | i38) & (~i42);
        int i44 = -(-(((i43 & i42) | (i43 ^ i42)) * 950));
        int i45 = i36 | i44;
        int i46 = i45 << 1;
        int i47 = -((~(i44 & i36)) & i45);
        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
        int iIdentityHashCode2 = System.identityHashCode(lrVar);
        int i49 = ~iIdentityHashCode2;
        int i50 = (iIdentityHashCode2 | i49) & i49;
        int i51 = i50 ^ 1803871344;
        int i52 = 1803871344 & i50;
        int i53 = (i52 & i51) | (i51 ^ i52);
        int i54 = (1470380055 & i53) | ((~i53) & (-1470380056));
        int i55 = i53 & (-1470380056);
        int i56 = (i55 & i54) | (i54 ^ i55);
        int i57 = ~i56;
        int i58 = (i56 | i57) & i57;
        int i59 = 671138912 & i58;
        int i60 = (i58 | 671138912) & (~i59);
        int i61 = (((i60 & i59) | (i60 ^ i59)) * (-828)) + 1586370808;
        int i62 = ((i50 & (-337647624)) | ((-337647624) ^ i50)) * (-828);
        int i63 = ((~i62) & i61) | ((~i61) & i62);
        int i64 = -(-((i62 & i61) << 1));
        int i65 = (i63 & i64) + (i64 | i63);
        if (i48 <= ((i65 & 399357604) - (~(-(-(399357604 | i65))))) - 1) {
            Intrinsics.checkNotNullParameter(setrotationx, "");
            ef efVar = ef.INSTANCE;
            fkVar = (fk) ef.setY(new Object[]{lrVar.setOnFocusChangeListener(), lrVar.setCompoundDrawableTintBlendMode(), (ew) lrVar.setX(), setrotationx}, -1790973370, 1790973370, (int) System.currentTimeMillis());
            int i66 = 69 / 0;
            if (fkVar != null) {
                int i67 = f56985j;
                int i68 = i67 & 19;
                int i69 = (i68 - (~((i67 ^ 19) | i68))) - 1;
                f56986k = i69 % 128;
                int i70 = i69 % 2;
            } else {
                lv lvVar = lv.INSTANCE;
                fkVar = (fk) lv.setDividerPadding(new Object[]{(lq) lrVar.setOnFocusChangeListener(), lrVar.f56987i, lrVar.setY()}, -382258194, 382258194, (int) System.currentTimeMillis());
                int i71 = f56986k;
                int i72 = i71 & 77;
                int i73 = (i71 | 77) & (~i72);
                int i74 = -(-(i72 << 1));
                i13 = (i73 & i74) + (i73 | i74);
                f56985j = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(setrotationx, "");
            ef efVar2 = ef.INSTANCE;
            fkVar = (fk) ef.setY(new Object[]{lrVar.setOnFocusChangeListener(), lrVar.setCompoundDrawableTintBlendMode(), (ew) lrVar.setX(), setrotationx}, -1790973370, 1790973370, (int) System.currentTimeMillis());
            if (fkVar != null) {
                int i610 = f56985j;
                int i611 = i610 & 19;
                int i612 = (i611 - (~((i610 ^ 19) | i611))) - 1;
                f56986k = i612 % 128;
                int i75 = i612 % 2;
            } else {
                lv lvVar2 = lv.INSTANCE;
                fkVar = (fk) lv.setDividerPadding(new Object[]{(lq) lrVar.setOnFocusChangeListener(), lrVar.f56987i, lrVar.setY()}, -382258194, 382258194, (int) System.currentTimeMillis());
                int i76 = f56986k;
                int i77 = i76 & 77;
                int i78 = (i76 | 77) & (~i77);
                int i79 = -(-(i77 << 1));
                i13 = (i78 & i79) + (i78 | i79);
                f56985j = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
            }
        }
        return fkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, -344529788, 344529788, System.identityHashCode(this));
    }
}
