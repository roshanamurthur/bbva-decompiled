package com.bbva.cellswidgets.edittext;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaskResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/cellswidgets/edittext/MaskResult;", "", "", "component1", "", "component2", "text", "position", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPosition", "()I", "<init>", "(Ljava/lang/CharSequence;I)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class MaskResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int position;

    public MaskResult(@NotNull CharSequence text, int i10) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.position = i10;
    }

    public static /* synthetic */ MaskResult copy$default(MaskResult maskResult, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = maskResult.text;
        }
        if ((i11 & 2) != 0) {
            i10 = maskResult.position;
        }
        return maskResult.copy(charSequence, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final MaskResult copy(@NotNull CharSequence text, int position) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new MaskResult(text, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaskResult)) {
            return false;
        }
        MaskResult maskResult = (MaskResult) other;
        return Intrinsics.areEqual(this.text, maskResult.text) && this.position == maskResult.position;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.position;
    }

    @NotNull
    public String toString() {
        return "MaskResult(text=" + ((Object) this.text) + ", position=" + this.position + ")";
    }
}
