package com.mypinpad.tsdk.isolation;

import android.nfc.Tag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class on extends ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Tag f57517a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(@NotNull Tag tag) {
        super(null);
        Intrinsics.checkNotNullParameter(tag, "");
        this.f57517a = tag;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return ((on) objArr[0]).f57517a;
    }

    @NotNull
    public final Tag Q_() {
        return (Tag) setOnFocusChangeListener(new Object[]{this}, -875424305, 875424305, System.identityHashCode(this));
    }
}
