package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/UiMessageId;", "Lcom/mypinpad/tsdk/i/setPaintFlags;", "", "p0", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class UiMessageId extends setPaintFlags {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Throwable setCompoundDrawableTintBlendMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiMessageId(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        th2 = (i10 & 1) != 0 ? null : th2;
        this.setCompoundDrawableTintBlendMode = th2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((UiMessageId) objArr[0]).setCompoundDrawableTintBlendMode;
    }

    @Override // java.lang.Throwable
    @JvmName(name = "getCause")
    @Nullable
    public final Throwable getCause() {
        return (Throwable) setX(new Object[]{this}, -1785767927, 1785767927, System.identityHashCode(this));
    }

    public UiMessageId() {
        this(null, 1, null);
    }
}
