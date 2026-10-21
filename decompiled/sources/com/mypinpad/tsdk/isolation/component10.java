package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface component10 {
    boolean setOnFocusChangeListener(@Nullable String str, @Nullable String str2);

    public static final class setDividerPadding {
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            return Boolean.valueOf(((component10) objArr[0]).setOnFocusChangeListener((String) objArr[1], null));
        }
    }
}
