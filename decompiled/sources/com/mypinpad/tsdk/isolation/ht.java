package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ht extends ho {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56239j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56240k = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final getValue f56241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final io f56242i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(@NotNull gv gvVar, @NotNull setTextKeepState settextkeepstate, @NotNull ex exVar, @NotNull getValue getvalue, @NotNull io ioVar) {
        super(gvVar, settextkeepstate, exVar);
        Intrinsics.checkNotNullParameter(gvVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(exVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(ioVar, "");
        this.f56241h = getvalue;
        this.f56242i = ioVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        fk fkVar;
        int i13;
        ex x4;
        gv onFocusChangeListener;
        setTextKeepState compoundDrawableTintBlendMode;
        fd fdVar;
        getY gety;
        setItemChecked setitemchecked;
        setContentCaptureSession setcontentcapturesession;
        setDrawSelectorOnTop setdrawselectorontop;
        Byte b10;
        boolean z10;
        int i14;
        int i15 = ~i12;
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = (((~(i10 | i17)) | (~(i11 | i16))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i15 | (~(i16 | i17))) * 1324) + (i11 * (-661)) + (i10 * (-661));
        if (i18 == 1) {
            gv gvVar = (gv) objArr[0];
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            setAnimation setanimation = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(gvVar));
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            if (getbeeponfailure == null) {
                int i19 = f56240k;
                int i20 = i19 + 37;
                f56239j = i20 % 128;
                int i21 = i20 % 2;
                int i22 = (i19 & 81) + (i19 | 81);
                f56239j = i22 % 128;
                int i23 = i22 % 2;
                bArr = null;
            } else {
                bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                int i24 = f56239j;
                int i25 = ((i24 | 94) << 1) - (i24 ^ 94);
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                f56240k = i26 % 128;
                int i27 = i26 % 2;
            }
            setMaxWidth setmaxwidth = (setMaxWidth) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{bArr, 0}, 896036021, -896036014, 0);
            v vVar = new v(gvVar);
            Pair pair = new Pair(Boolean.valueOf(booleanRef.element), setmaxwidth);
            int i28 = f56240k;
            int i29 = (i28 ^ 115) + ((i28 & 115) << 1);
            f56239j = i29 % 128;
            int i30 = i29 % 2;
            return pair;
        }
        if (i18 == 2) {
            ht htVar = (ht) objArr[0];
            a aVar = (a) objArr[1];
            int i31 = f56240k;
            int i32 = i31 ^ 81;
            int i33 = -(-((i31 & 81) << 1));
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            f56239j = i34 % 128;
            int i35 = i34 % 2;
            Intrinsics.checkNotNullParameter(aVar, "");
            gv onFocusChangeListener2 = htVar.setOnFocusChangeListener();
            gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener2, (Integer) a.setX(new Object[]{aVar}, -114513983, 114513983, System.identityHashCode(aVar)), (Integer) a.setX(new Object[]{aVar}, 156913967, -156913963, System.identityHashCode(aVar)), (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))}, -1273972116, 1273972121, System.identityHashCode(onFocusChangeListener2));
            Pair pair2 = (Pair) setDividerPadding(new Object[]{htVar.setOnFocusChangeListener()}, 1099823865, -1099823864, (int) System.currentTimeMillis());
            boolean zBooleanValue = ((Boolean) pair2.getFirst()).booleanValue();
            setMaxWidth setmaxwidth2 = (setMaxWidth) pair2.getSecond();
            if (zBooleanValue) {
                int i36 = f56239j;
                int i37 = i36 | 77;
                int i38 = i37 << 1;
                int i39 = -((~(i36 & 77)) & i37);
                int i40 = (i38 & i39) + (i39 | i38);
                f56240k = i40 % 128;
                int i41 = i40 % 2;
                fkVar = fk.setY;
                int i42 = f56239j;
                i13 = (i42 & 19) + (i42 | 19);
                f56240k = i13 % 128;
            } else {
                gv onFocusChangeListener3 = htVar.setOnFocusChangeListener();
                setAnimation setanimation2 = setAnimation.INSTANCE;
                gv.setOnFocusChangeListener(new Object[]{onFocusChangeListener3, (TransactionFailed) setAnimation.setY(new Object[0], -177094674, 177094739, (int) System.currentTimeMillis()), setmaxwidth2}, 579017734, -579017711, System.identityHashCode(onFocusChangeListener3));
                setTitleTextAppearance settitletextappearance = new setTitleTextAppearance(htVar.setOnFocusChangeListener().setDividerPadding(setAnimation.TransactionParameters()));
                htVar.f56242i.setX();
                htVar.f56241h.setOnFocusChangeListener(settitletextappearance);
                fkVar = fk.setDividerPadding;
                int i43 = f56240k;
                i13 = (i43 ^ 93) + ((i43 & 93) << 1);
                f56239j = i13 % 128;
            }
            int i44 = i13 % 2;
            return fkVar;
        }
        if (i18 == 3) {
            ht htVar2 = (ht) objArr[0];
            int i45 = f56239j;
            int i46 = i45 & 83;
            int i47 = -(-((i45 ^ 83) | i46));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            f56240k = i48 % 128;
            int i49 = i48 % 2;
            fk compoundDrawableTintBlendMode2 = ex.setCompoundDrawableTintBlendMode(htVar2.setX(), htVar2.setOnFocusChangeListener(), htVar2.setCompoundDrawableTintBlendMode(), fd.END_APPLICATION, null, null, null, setDrawSelectorOnTop.setY, null, false, 184);
            int i50 = f56239j;
            int i51 = ((i50 | 105) << 1) - (((~i50) & 105) | (i50 & (-106)));
            f56240k = i51 % 128;
            int i52 = i51 % 2;
            return compoundDrawableTintBlendMode2;
        }
        ht htVar3 = (ht) objArr[0];
        int i53 = f56240k + 27;
        f56239j = i53 % 128;
        if (i53 % 2 != 0) {
            x4 = htVar3.setX();
            onFocusChangeListener = htVar3.setOnFocusChangeListener();
            compoundDrawableTintBlendMode = htVar3.setCompoundDrawableTintBlendMode();
            fdVar = fd.END_APPLICATION;
            gety = null;
            setitemchecked = null;
            setcontentcapturesession = null;
            setdrawselectorontop = setDrawSelectorOnTop.setOnFocusChangeListener;
            b10 = null;
            z10 = false;
            i14 = 11738;
        } else {
            x4 = htVar3.setX();
            onFocusChangeListener = htVar3.setOnFocusChangeListener();
            compoundDrawableTintBlendMode = htVar3.setCompoundDrawableTintBlendMode();
            fdVar = fd.END_APPLICATION;
            gety = null;
            setitemchecked = null;
            setcontentcapturesession = null;
            setdrawselectorontop = setDrawSelectorOnTop.setOnFocusChangeListener;
            b10 = null;
            z10 = false;
            i14 = 184;
        }
        fk compoundDrawableTintBlendMode3 = ex.setCompoundDrawableTintBlendMode(x4, onFocusChangeListener, compoundDrawableTintBlendMode, fdVar, gety, setitemchecked, setcontentcapturesession, setdrawselectorontop, b10, z10, i14);
        int i54 = f56239j;
        int i55 = i54 ^ 45;
        int i56 = (i54 & 45) << 1;
        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
        f56240k = i57 % 128;
        int i58 = i57 % 2;
        return compoundDrawableTintBlendMode3;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull a aVar) {
        return (fk) setDividerPadding(new Object[]{this, aVar}, 543095736, -543095734, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setNavigationOnClickListener() {
        return (fk) setDividerPadding(new Object[]{this}, -348108624, 348108624, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @NotNull
    public final fk setDividerPadding() {
        return (fk) setDividerPadding(new Object[]{this}, -1204408697, 1204408700, System.identityHashCode(this));
    }
}
