package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tag.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tag/TagKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,135:1\n1855#2,2:136\n*S KotlinDebug\n*F\n+ 1 Tag.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tag/TagKt\n*L\n126#1:136,2\n*E\n"})
public final class uw {
    @NotNull
    public static final uy setOnFocusChangeListener(@NotNull uy.Companion sety, @NotNull String str) {
        return (uy) setY(new Object[]{sety, str}, 1283421674, -1283421674, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        uy.Companion sety = (uy.Companion) objArr[0];
        String str = (String) objArr[1];
        Intrinsics.checkNotNullParameter(sety, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new uy(vc.setOnFocusChangeListener(str));
    }
}
