package com.mypinpad.tsdk.isolation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class TerminalSdk implements component10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51843b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51844c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setContextClickable f51845a;

    public TerminalSdk(@NotNull setContextClickable setcontextclickable) {
        Intrinsics.checkNotNullParameter(setcontextclickable, "");
        this.f51845a = setcontextclickable;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x005b A[PHI: r7
      0x005b: PHI (r7v13 java.util.List) = (r7v12 java.util.List), (r7v38 java.util.List) binds: [B:8:0x0058, B:5:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x013d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0143  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        List list;
        int i13;
        int i14;
        TerminalSdk terminalSdk = (TerminalSdk) objArr[0];
        String str = (String) objArr[1];
        int i15 = f51844c;
        int i16 = i15 & 109;
        int i17 = (i15 | 109) & (~i16);
        int i18 = i16 << 1;
        int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
        f51843b = i19 % 128;
        int i20 = i19 % 2;
        setContextClickable setcontextclickable = terminalSdk.f51845a;
        if (i20 == 0) {
            list = (List) setContextClickable.setDividerPadding(new Object[]{setcontextclickable}, 1227135897, -1227135893, System.identityHashCode(setcontextclickable));
            if (!(!(list instanceof Collection))) {
                int i21 = f51843b;
                int i22 = i21 | 21;
                int i23 = i22 << 1;
                int i24 = -((~(i21 & 21)) & i22);
                i13 = (i23 & i24) + (i24 | i23);
                f51844c = i13 % 128;
                if (i13 % 2 != 0) {
                    list.isEmpty();
                    throw null;
                }
                if (!list.isEmpty()) {
                }
            }
            i14 = f51844c + 1;
            f51843b = i14 % 128;
            if (i14 % 2 != 0) {
                int i25 = 43 / 0;
            }
            return Boolean.FALSE;
        }
        list = (List) setContextClickable.setDividerPadding(new Object[]{setcontextclickable}, 1227135897, -1227135893, System.identityHashCode(setcontextclickable));
        int i26 = 77 / 0;
        if (list instanceof Collection) {
            int i27 = f51843b;
            int i28 = i27 | 21;
            int i29 = i28 << 1;
            int i210 = -((~(i27 & 21)) & i28);
            i13 = (i29 & i210) + (i210 | i29);
            f51844c = i13 % 128;
            if (i13 % 2 != 0) {
                list.isEmpty();
                throw null;
            }
            if (!list.isEmpty()) {
            }
        }
        i14 = f51844c + 1;
        f51843b = i14 % 128;
        if (i14 % 2 != 0) {
            int i211 = 43 / 0;
        }
        return Boolean.FALSE;
        Iterator it = list.iterator();
        int i30 = f51843b;
        int i31 = (-2) - (((i30 ^ 72) + ((i30 & 72) << 1)) ^ (-1));
        f51844c = i31 % 128;
        while (true) {
            int i32 = i31 % 2;
            if (!it.hasNext()) {
                break;
            }
            int i33 = f51843b + 21;
            f51844c = i33 % 128;
            int i34 = i33 % 2;
            setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = (setDefaultFocusHighlightEnabled) it.next();
            if (Intrinsics.areEqual((String) setDefaultFocusHighlightEnabled.setCompoundDrawableTintBlendMode(new Object[]{setdefaultfocushighlightenabled}, 1588822726, -1588822726, System.identityHashCode(setdefaultfocushighlightenabled)), str)) {
                int i35 = f51844c + 21;
                f51843b = i35 % 128;
                if (i35 % 2 != 0) {
                    Intrinsics.areEqual((String) setDefaultFocusHighlightEnabled.setCompoundDrawableTintBlendMode(new Object[]{setdefaultfocushighlightenabled}, 1631406134, -1631406130, System.identityHashCode(setdefaultfocushighlightenabled)), (Object) null);
                    throw null;
                }
                if (!(!Intrinsics.areEqual((String) setDefaultFocusHighlightEnabled.setCompoundDrawableTintBlendMode(new Object[]{setdefaultfocushighlightenabled}, 1631406134, -1631406130, System.identityHashCode(setdefaultfocushighlightenabled)), (Object) null))) {
                    int i36 = f51843b;
                    int i37 = i36 & 13;
                    int i38 = ((i36 ^ 13) | i37) << 1;
                    int i39 = -((i36 | 13) & (~i37));
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    int i41 = i40 % 128;
                    f51844c = i41;
                    int i42 = i40 % 2;
                    int i43 = i41 & 49;
                    int i44 = -(-((i41 ^ 49) | i43));
                    int i45 = (i43 & i44) + (i43 | i44);
                    f51843b = i45 % 128;
                    int i46 = i45 % 2;
                    int i47 = i41 + 9;
                    f51843b = i47 % 128;
                    int i48 = i47 % 2;
                    return Boolean.TRUE;
                }
            }
            i31 = f51844c + 83;
            f51843b = i31 % 128;
        }
        i14 = f51844c + 1;
        f51843b = i14 % 128;
        if (i14 % 2 != 0) {
            int i212 = 43 / 0;
        }
        return Boolean.FALSE;
    }

    @Override // com.mypinpad.tsdk.isolation.component10
    public final boolean setOnFocusChangeListener(@Nullable String str, @Nullable String str2) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, str, str2}, 330340923, -330340923, System.identityHashCode(this))).booleanValue();
    }
}
