package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class km extends kj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56804h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56805i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final kb f56807g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull kw kwVar, @NotNull getValue getvalue, @NotNull kb kbVar) {
        super(kaVar, settextkeepstate, kwVar);
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(kbVar, "");
        this.f56806f = getvalue;
        this.f56807g = kbVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        km kmVar = (km) objArr[0];
        int i13 = f56804h;
        int i14 = (((i13 ^ 117) | (i13 & 117)) << 1) - (((~i13) & 117) | (i13 & (-118)));
        f56805i = i14 % 128;
        int i15 = i14 % 2;
        ka onFocusChangeListener = kmVar.setOnFocusChangeListener();
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis());
        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -203580470, 203580510, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
            throw new fh(33, setAnimation.setOnGroupClickListener().setOnFocusChangeListener());
        }
        kmVar.setOnFocusChangeListener();
        ka onFocusChangeListener2 = kmVar.setOnFocusChangeListener();
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) ka.setCompoundDrawableTintBlendMode(new Object[]{(setMaxWidth) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener2}, 2099681381, -2099681372, System.identityHashCode(onFocusChangeListener2))}, 1223662572, -1223662558, (int) System.currentTimeMillis());
        ka onFocusChangeListener3 = kmVar.setOnFocusChangeListener();
        boolean zBooleanValue = ((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, -411478475, 411478481, System.identityHashCode(onFocusChangeListener3))).booleanValue();
        getValue getvalue = kmVar.f56806f;
        if (zBooleanValue) {
            int i16 = f56805i;
            int i17 = ((i16 ^ 106) + ((i16 & 106) << 1)) - 1;
            f56804h = i17 % 128;
            int i18 = i17 % 2;
            ka onFocusChangeListener4 = kmVar.setOnFocusChangeListener();
            if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener4}, 1663195320, -1663195315, System.identityHashCode(onFocusChangeListener4))).booleanValue()) {
                getBeepOnFailure getbeeponfailureTransactionResult = kmVar.setOnFocusChangeListener().TransactionResult();
                Intrinsics.checkNotNull(getbeeponfailureTransactionResult);
                getvalue.setOnFocusChangeListener(new setAutofillId(getbeeponfailureTransactionResult));
                fk fkVar = fk.setDividerPadding;
                int i19 = f56804h;
                int i20 = i19 & 33;
                int i21 = (i19 | 33) & (~i20);
                int i22 = -(-(i20 << 1));
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                f56805i = i23 % 128;
                if (i23 % 2 != 0) {
                    return fkVar;
                }
                throw null;
            }
            ka onFocusChangeListener5 = kmVar.setOnFocusChangeListener();
            setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5}, -296152793, 296152815, System.identityHashCode(onFocusChangeListener5));
            byte[] bArr = (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist));
            ka onFocusChangeListener6 = kmVar.setOnFocusChangeListener();
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, (TransactionFailed) setAnimation.setY(new Object[0], -1717172174, 1717172411, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(onFocusChangeListener6));
            kb kbVar = kmVar.f56807g;
            kb.setX(new Object[]{kbVar, bArr, getbeeponfailure2, getbeeponfailure}, 1914418543, -1914418543, System.identityHashCode(kbVar));
            int i24 = f56805i;
            int i25 = i24 & 11;
            int i26 = i24 | 11;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f56804h = i27 % 128;
            int i28 = i27 % 2;
        }
        getvalue.setOnFocusChangeListener(new setTitleTextAppearance(getbeeponfailure));
        fk fkVar2 = fk.setDividerPadding;
        int i29 = f56804h;
        int i30 = i29 & 23;
        int i31 = (i30 - (~((i29 ^ 23) | i30))) - 1;
        f56805i = i31 % 128;
        int i32 = i31 % 2;
        return fkVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, 352335965, -352335965, System.identityHashCode(this));
    }
}
