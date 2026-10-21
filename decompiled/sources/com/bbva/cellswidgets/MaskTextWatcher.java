package com.bbva.cellswidgets;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cellswidgets.edittext.MaskResult;
import com.bbva.cellswidgets.edittext.TextMask;
import com.bbva.cellswidgets.edittext.TextUnMask;
import com.bbva.cellswidgets.edittext.UnmaskResult;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MaskTextWatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016J\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/bbva/cellswidgets/MaskTextWatcher;", "Landroid/text/TextWatcher;", "", "s", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "count", "after", "", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "maskedText", "unmaskText$cells_widgets_release", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "unmaskText", "", "p0", "Ljava/lang/String;", "getMask", "()Ljava/lang/String;", "mask", "<init>", "(Ljava/lang/String;)V", "Companion", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class MaskTextWatcher implements TextWatcher {
    public static final char WILDCARD = '#';

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mask;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f27267q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f27268r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f27269s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public CharSequence f27270t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public String f27271u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f27272w0;

    /* JADX INFO: compiled from: MaskTextWatcher.kt */
    public static final class a extends Lambda implements Function0<TextMask> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextMask invoke() {
            return new TextMask(MaskTextWatcher.this.getMask(), MaskTextWatcher.WILDCARD);
        }
    }

    /* JADX INFO: compiled from: MaskTextWatcher.kt */
    public static final class b extends Lambda implements Function0<TextUnMask> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextUnMask invoke() {
            return new TextUnMask(MaskTextWatcher.this.getMask(), MaskTextWatcher.WILDCARD);
        }
    }

    public MaskTextWatcher(@NotNull String mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.mask = mask;
        this.f27267q0 = LazyKt__LazyJVMKt.lazy(new a());
        this.f27268r0 = LazyKt__LazyJVMKt.lazy(new b());
        this.f27270t0 = "";
        this.f27271u0 = "";
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable s4) {
        Intrinsics.checkNotNullParameter(s4, "s");
        if (this.f27269s0 != 2) {
            return;
        }
        this.f27269s0 = 3;
        InputFilter[] filters = s4.getFilters();
        s4.setFilters(new InputFilter[0]);
        s4.clear();
        String str = this.f27271u0;
        int length = this.f27272w0;
        CharSequence charSequenceUnmaskText$cells_widgets_release = unmaskText$cells_widgets_release(str);
        if (length > charSequenceUnmaskText$cells_widgets_release.length()) {
            length = charSequenceUnmaskText$cells_widgets_release.length();
        }
        MaskResult maskResultMask = ((TextMask) this.f27267q0.getValue()).mask(charSequenceUnmaskText$cells_widgets_release, length);
        s4.append(maskResultMask.getText());
        s4.setFilters(filters);
        Selection.setSelection(s4, maskResultMask.getPosition());
        this.f27269s0 = 0;
        this.f27270t0 = "";
        this.f27271u0 = "";
        this.v0 = 0;
        this.f27272w0 = 0;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s4, int start, int count, int after) {
        Intrinsics.checkNotNullParameter(s4, "s");
        if (this.f27269s0 != 0) {
            return;
        }
        this.f27269s0 = 1;
        UnmaskResult unmaskResultUnmask = ((TextUnMask) this.f27268r0.getValue()).unmask(s4, start, count);
        this.f27270t0 = StringsKt__StringsKt.removeRange(unmaskResultUnmask.getText(), unmaskResultUnmask.getPosition(), unmaskResultUnmask.getDeletedChars() + unmaskResultUnmask.getPosition());
        this.v0 = unmaskResultUnmask.getPosition();
    }

    @NotNull
    public final String getMask() {
        return this.mask;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s4, int start, int before, int count) {
        Intrinsics.checkNotNullParameter(s4, "s");
        if (this.f27269s0 != 1) {
            return;
        }
        this.f27269s0 = 2;
        String string = new StringBuilder(this.f27270t0).insert(this.v0, s4, start, start + count).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f27271u0 = string;
        this.f27272w0 = this.v0 + count;
    }

    @NotNull
    public final CharSequence unmaskText$cells_widgets_release(@Nullable CharSequence maskedText) {
        if (maskedText == null) {
            maskedText = "";
        }
        return TextUnMask.unmask$default((TextUnMask) this.f27268r0.getValue(), maskedText, 0, 0, 6, null).getText();
    }
}
