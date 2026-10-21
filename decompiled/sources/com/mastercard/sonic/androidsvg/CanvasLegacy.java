package com.mastercard.sonic.androidsvg;

import android.graphics.Canvas;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CanvasLegacy.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CanvasLegacy;", "", "Landroid/graphics/Canvas;", "canvas", "", "saveFlags", "", "save", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMATRIX_SAVE_FLAG", "()I", "setMATRIX_SAVE_FLAG", "(I)V", "MATRIX_SAVE_FLAG", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class CanvasLegacy {

    @NotNull
    public static final CanvasLegacy INSTANCE = new CanvasLegacy();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static int MATRIX_SAVE_FLAG;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static final Method f51155b;

    static {
        try {
            Object obj = Canvas.class.getField("MATRIX_SAVE_FLAG").get(null);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            MATRIX_SAVE_FLAG = ((Integer) obj).intValue();
            f51155b = Canvas.class.getMethod("save", Integer.TYPE);
        } catch (Throwable th2) {
            INSTANCE.getClass();
            Intrinsics.checkNotNull(th2, "null cannot be cast to non-null type T of com.mastercard.sonic.androidsvg.CanvasLegacy.sneakyThrow0");
            throw th2;
        }
    }

    public final int getMATRIX_SAVE_FLAG() {
        return MATRIX_SAVE_FLAG;
    }

    public final void save(@Nullable Canvas canvas, int saveFlags) {
        try {
            Method method = f51155b;
            Intrinsics.checkNotNull(method);
            method.invoke(canvas, Integer.valueOf(saveFlags));
        } catch (Throwable th2) {
            Intrinsics.checkNotNull(th2, "null cannot be cast to non-null type T of com.mastercard.sonic.androidsvg.CanvasLegacy.sneakyThrow0");
            throw th2;
        }
    }

    public final void setMATRIX_SAVE_FLAG(int i10) {
        MATRIX_SAVE_FLAG = i10;
    }
}
