package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\b\t\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setContentInsetsRelative;", "Lcom/mypinpad/tsdk/i/getMetadata;", "", "b", "Z", "setOnFocusChangeListener", "()Z", "setY", "Lcom/mypinpad/tsdk/i/setTextMetricsParams;", "Lcom/mypinpad/tsdk/i/setImageDrawable;", "Lcom/mypinpad/tsdk/i/setNestedScrollingEnabled;"}, k = 1, mv = {1, 5, 1})
public abstract class setContentInsetsRelative extends getMetadata {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean setY;

    public setContentInsetsRelative(boolean z10, mv mvVar, DefaultConstructorMarker defaultConstructorMarker) {
        super(mvVar, null);
        this.setY = z10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return Boolean.valueOf(((setContentInsetsRelative) objArr[0]).setY);
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -142823274, 142823274, System.identityHashCode(this))).booleanValue();
    }
}
