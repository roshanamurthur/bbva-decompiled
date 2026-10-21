package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setRenderEffect;", "", "", "a", "Ljava/lang/String;", "setX", "()Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class setRenderEffect {

    @NotNull
    public static final setRenderEffect INSTANCE = new setRenderEffect();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String setCompoundDrawableTintBlendMode = "10.4.0";

    static {
        int i10 = (1 ^ 95) + ((1 & 95) << 1);
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return setCompoundDrawableTintBlendMode;
    }

    @JvmName(name = "setX")
    @NotNull
    public static String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[0], -757761411, 757761411, (int) System.currentTimeMillis());
    }
}
