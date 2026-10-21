package com.mypinpad.tsdk.isolation;

import java.io.EOFException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class abq {
    public static final boolean setOnFocusChangeListener(@NotNull abx abxVar) {
        return ((Boolean) setY(new Object[]{abxVar}, -1111583503, 1111583503, (int) System.currentTimeMillis())).booleanValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        Intrinsics.checkNotNullParameter(abxVar, "");
        try {
            abx abxVar2 = new abx();
            abxVar.setOnFocusChangeListener(abxVar2, 0L, c.coerceAtMost(((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue(), 64L));
            int i13 = 0;
            while (i13 < 16) {
                System.currentTimeMillis();
                System.currentTimeMillis();
                int i14 = i13 ^ 46;
                int i15 = -(-((i13 & 46) << 1));
                int i16 = (i14 & i15) + (i15 | i14);
                i13 = (-2) - ((((i16 | (-44)) << 1) - (i16 ^ (-44))) ^ (-1));
                if (((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar2}, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                    break;
                }
                int iUiMessageCallbackKtWhenMappings = abxVar2.UiMessageCallbackKtWhenMappings();
                if (!Character.isISOControl(iUiMessageCallbackKtWhenMappings) || Character.isWhitespace(iUiMessageCallbackKtWhenMappings)) {
                }
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        } catch (EOFException unused) {
        }
    }
}
