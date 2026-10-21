package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.isolation.setImageTintList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w<T extends setImageTintList> extends getBeepOnFailure {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f61586j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f61587k = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final TransactionFailed f61588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final setScrollBarDefaultDelayBeforeFade f61589i;

    public w(@NotNull TransactionFailed transactionFailed, @NotNull setImageTintList setimagetintlist) throws Exception {
        Intrinsics.checkNotNullParameter(transactionFailed, "");
        Intrinsics.checkNotNullParameter(setimagetintlist, "");
        this.f61588h = transactionFailed;
        setDividerPadding(new setScrollContainer(transactionFailed.setOnFocusChangeListener()));
        setDividerPadding(setimagetintlist);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13;
        int i14;
        int i15 = ~i12;
        int i16 = (~i10) | i15;
        int i17 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i16))) * 369) + (((~i16) | i11) * (-369)) + ((i10 | i11 | i15) * (-369)) + (i11 * 370) + (i10 * 370);
        String str = null;
        int i18 = 2;
        if (i17 == 1) {
            w wVar = (w) objArr[0];
            Function1 function1 = (Function1) objArr[1];
            int i19 = f61586j;
            int i20 = i19 ^ 87;
            int i21 = ((((i19 & 87) | i20) << 1) - (~(-i20))) - 1;
            f61587k = i21 % 128;
            if (i21 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke((setImageTintList) setX(new Object[]{wVar}, 1693919772, -1693919769, System.identityHashCode(wVar)));
                throw null;
            }
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke((setImageTintList) setX(new Object[]{wVar}, 1693919772, -1693919769, System.identityHashCode(wVar)));
            int i22 = f61587k + 25;
            f61586j = i22 % 128;
            int i23 = i22 % 2;
            return wVar;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                w wVar2 = (w) objArr[0];
                int i24 = f61587k;
                int i25 = i24 & 71;
                int i26 = i25 + ((i24 ^ 71) | i25);
                f61586j = i26 % 128;
                int i27 = i26 % 2;
                setImageTintList compoundDrawableTintBlendMode = wVar2.setCompoundDrawableTintBlendMode();
                int i28 = f61587k;
                int i29 = (i28 & (-82)) | ((~i28) & 81);
                int i30 = (i28 & 81) << 1;
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f61586j = i31 % 128;
                int i32 = i31 % 2;
                return compoundDrawableTintBlendMode;
            }
            w wVar3 = (w) objArr[0];
            Function1 function2 = (Function1) objArr[1];
            int i33 = f61586j;
            int i34 = (i33 & (-104)) | ((~i33) & 103);
            int i35 = -(-((i33 & 103) << 1));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            f61587k = i36 % 128;
            int i37 = i36 % 2;
            Intrinsics.checkNotNullParameter(function2, "");
            w wVar4 = (w) setX(new Object[]{wVar3, function2}, 1096779168, -1096779167, System.identityHashCode(wVar3));
            setX(new Object[]{wVar3}, 1102260234, -1102260232, System.identityHashCode(wVar3));
            int i38 = f61586j + 51;
            f61587k = i38 % 128;
            if (i38 % 2 != 0) {
                return wVar4;
            }
            throw null;
        }
        w wVar5 = (w) objArr[0];
        int i39 = f61587k;
        int i40 = i39 & 87;
        int i41 = (i39 ^ 87) | i40;
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        f61586j = i42 % 128;
        if (i42 % 2 != 0) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = wVar5.f61589i;
            throw null;
        }
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = wVar5.f61589i;
        if (setscrollbardefaultdelaybeforefade2 == null) {
            throw new setOnHierarchyChangeListener(2006, str, i18, null == true ? 1 : 0);
        }
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, wVar5.f61588h}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
        System.identityHashCode(wVar5);
        System.identityHashCode(wVar5);
        if (getbeeponfailure != null) {
            int i43 = f61587k;
            int i44 = i43 & 5;
            int i45 = 5 | i43;
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            f61586j = i46 % 128;
            int i47 = i46 % 2;
            getbeeponfailure.setCompoundDrawableTintBlendMode().setOnFocusChangeListener(wVar5.setCompoundDrawableTintBlendMode().setDividerPadding(), 0);
            int i48 = f61586j;
            i13 = i48 & 69;
            i14 = i48 | 69;
        } else {
            wVar5.setCompoundDrawableTintBlendMode().setDividerPadding();
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = wVar5.f61589i;
            if (setscrollbardefaultdelaybeforefade3 != null) {
                int i49 = f61586j + 91;
                f61587k = i49 % 128;
                int i50 = i49 % 2;
                setScrollContainer dividerPadding = wVar5.setDividerPadding();
                String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{dividerPadding}, -888877733, 888877739, System.identityHashCode(dividerPadding));
                setImageTintList compoundDrawableTintBlendMode2 = wVar5.setCompoundDrawableTintBlendMode();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str2, (byte[]) setImageTintList.setX(new Object[]{compoundDrawableTintBlendMode2}, -1317873722, 1317873728, System.identityHashCode(compoundDrawableTintBlendMode2)), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade3));
                int i51 = f61587k + 46;
                int i52 = (i51 ^ (-1)) + (i51 << 1);
                f61586j = i52 % 128;
                int i53 = i52 % 2;
            }
            int i54 = f61586j;
            i13 = i54 ^ 43;
            i14 = (i54 & 43) << 1;
        }
        int i55 = i13 + i14;
        f61587k = i55 % 128;
        int i56 = i55 % 2;
        return null;
    }

    @NotNull
    public final T setAlwaysDrawnWithCacheEnabled() {
        return (T) setX(new Object[]{this}, 1693919772, -1693919769, System.identityHashCode(this));
    }

    @NotNull
    public final w<T> setCompoundDrawableTintBlendMode(@NotNull Function1<? super T, Unit> function1) {
        return (w) setX(new Object[]{this, function1}, -1790938757, 1790938757, System.identityHashCode(this));
    }

    @NotNull
    public final w<T> setDividerPadding(@NotNull Function1<? super T, Unit> function1) {
        return (w) setX(new Object[]{this, function1}, 1096779168, -1096779167, System.identityHashCode(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@Nullable getBeepOnFailure getbeeponfailure, @NotNull TransactionFailed transactionFailed, @NotNull setImageTintList setimagetintlist) throws Exception {
        this(transactionFailed, setimagetintlist);
        Intrinsics.checkNotNullParameter(transactionFailed, "");
        Intrinsics.checkNotNullParameter(setimagetintlist, "");
        if (getbeeponfailure != null) {
            setimagetintlist.setOnFocusChangeListener(getbeeponfailure.setCompoundDrawableTintBlendMode().setDividerPadding(), 0);
        }
        setIncludeFontPadding();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull TransactionFailed transactionFailed, @NotNull setImageTintList setimagetintlist) throws Exception {
        this(transactionFailed, setimagetintlist);
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(transactionFailed, "");
        Intrinsics.checkNotNullParameter(setimagetintlist, "");
        this.f61589i = setscrollbardefaultdelaybeforefade;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, transactionFailed}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (getbeeponfailure != null) {
            setImageTintList compoundDrawableTintBlendMode = getbeeponfailure.setCompoundDrawableTintBlendMode();
            if (!(((byte[]) setImageTintList.setX(new Object[]{compoundDrawableTintBlendMode}, -1317873722, 1317873728, System.identityHashCode(compoundDrawableTintBlendMode))).length == 0)) {
                setimagetintlist.setOnFocusChangeListener(getbeeponfailure.setCompoundDrawableTintBlendMode().setDividerPadding(), 0);
            }
        }
    }
}
