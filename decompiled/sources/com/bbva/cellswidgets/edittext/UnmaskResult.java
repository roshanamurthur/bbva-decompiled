package com.bbva.cellswidgets.edittext;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaskResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/bbva/cellswidgets/edittext/UnmaskResult;", "", "", "component1", "", "component2", "component3", "text", "position", "deletedChars", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPosition", "()I", "c", "getDeletedChars", "<init>", "(Ljava/lang/CharSequence;II)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class UnmaskResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CharSequence text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int position;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int deletedChars;

    public UnmaskResult(@NotNull CharSequence text, int i10, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.position = i10;
        this.deletedChars = i11;
    }

    public static /* synthetic */ UnmaskResult copy$default(UnmaskResult unmaskResult, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = unmaskResult.text;
        }
        if ((i12 & 2) != 0) {
            i10 = unmaskResult.position;
        }
        if ((i12 & 4) != 0) {
            i11 = unmaskResult.deletedChars;
        }
        return unmaskResult.copy(charSequence, i10, i11);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeletedChars() {
        return this.deletedChars;
    }

    @NotNull
    public final UnmaskResult copy(@NotNull CharSequence text, int position, int deletedChars) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new UnmaskResult(text, position, deletedChars);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmaskResult)) {
            return false;
        }
        UnmaskResult unmaskResult = (UnmaskResult) other;
        return Intrinsics.areEqual(this.text, unmaskResult.text) && this.position == unmaskResult.position && this.deletedChars == unmaskResult.deletedChars;
    }

    public final int getDeletedChars() {
        return this.deletedChars;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.position) * 31) + this.deletedChars;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnmaskResult(text=");
        sb2.append((Object) this.text);
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", deletedChars=");
        return a.c(sb2, this.deletedChars, ")");
    }
}
