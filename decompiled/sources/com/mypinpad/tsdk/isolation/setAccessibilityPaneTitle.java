package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setAccessibilityPaneTitle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58227b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f58228c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f58229a = new LinkedHashMap();

    public interface setY {
        void setCompoundDrawableTintBlendMode();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IllegalAccessException, InstantiationException {
        int i13;
        int i14 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i15 = ~i12;
        int i16 = ((i10 | (~((~i11) | i15))) * 160) + (((~(i15 | i10)) | (~(i10 | i11))) * (-160)) + i14;
        setY sety = null;
        if (i16 != 1) {
            setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) objArr[0];
            int i17 = f58227b + 1;
            f58228c = i17 % 128;
            if (i17 % 2 == 0) {
                setaccessibilitypanetitle.f58229a.values().iterator();
                throw null;
            }
            Iterator it = setaccessibilitypanetitle.f58229a.values().iterator();
            int i18 = f58228c;
            int i19 = i18 & 89;
            int i20 = -(-((i18 ^ 89) | i19));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f58227b = i21 % 128;
            int i22 = i21 % 2;
            while (it.hasNext()) {
                int i23 = f58228c;
                int i24 = i23 & 71;
                int i25 = (((i23 | 71) & (~i24)) - (~(i24 << 1))) - 1;
                f58227b = i25 % 128;
                int i26 = i25 % 2;
                ((setY) it.next()).setCompoundDrawableTintBlendMode();
                int i27 = f58227b;
                int i28 = (i27 & 79) + (i27 | 79);
                f58228c = i28 % 128;
                int i29 = i28 % 2;
            }
            int i30 = f58228c;
            int i31 = ((i30 | 107) << 1) - (i30 ^ 107);
            f58227b = i31 % 128;
            if (i31 % 2 != 0) {
                throw null;
            }
        } else {
            setAccessibilityPaneTitle setaccessibilitypanetitle2 = (setAccessibilityPaneTitle) objArr[0];
            KClass kClass = (KClass) objArr[1];
            int i32 = f58228c;
            int i33 = ((i32 & (-54)) | ((~i32) & 53)) + ((i32 & 53) << 1);
            f58227b = i33 % 128;
            if (i33 % 2 != 0) {
                Intrinsics.checkNotNullParameter(kClass, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(kClass, "");
            sety = (setY) setaccessibilitypanetitle2.f58229a.get(kClass);
            if (sety == null) {
                Object objNewInstance = JvmClassMappingKt.getJavaClass(kClass).newInstance();
                if (objNewInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of com.mypinpad.softpos.emv.com.mypinpad.softpos.emv.terminal.kernel.common.TransactionSession.get");
                }
                sety = (setY) objNewInstance;
                setaccessibilitypanetitle2.f58229a.put(kClass, sety);
                int i34 = f58228c;
                int i35 = i34 | 103;
                int i36 = i35 << 1;
                int i37 = -((~(i34 & 103)) & i35);
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f58227b = i38 % 128;
                if (i38 % 2 != 0) {
                    i13 = 76;
                    int i39 = i13 / 0;
                }
            } else {
                int i40 = f58228c + 67;
                f58227b = i40 % 128;
                if (i40 % 2 != 0) {
                    i13 = 57;
                    int i310 = i13 / 0;
                }
            }
        }
        return sety;
    }

    @NotNull
    public final <T extends setY> T setCompoundDrawableTintBlendMode(@NotNull KClass<T> kClass) {
        return (T) setY(new Object[]{this, kClass}, 1735934812, -1735934811, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener() throws IllegalAccessException, InstantiationException {
        setY(new Object[]{this}, -875567491, 875567491, System.identityHashCode(this));
    }
}
