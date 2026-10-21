package com.bbva.cellswidgets.transformations;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.text.style.MetricAffectingSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlainCharTransformation.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011J6\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/cellswidgets/transformations/PlainCharTransformation;", "Landroid/text/method/TransformationMethod;", "Landroid/view/View;", "view", "", "sourceText", "", "focused", "", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "", "onFocusChanged", "source", "getTransformation", "Companion", "FontSpan", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class PlainCharTransformation implements TransformationMethod {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Typeface f27319a;

    /* JADX INFO: compiled from: PlainCharTransformation.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/cellswidgets/transformations/PlainCharTransformation$Companion;", "", "()V", "INSTANCE", "Lcom/bbva/cellswidgets/transformations/PlainCharTransformation;", "instance", "typeface", "Landroid/graphics/Typeface;", "cells-widgets_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlainCharTransformation instance(@NotNull Typeface typeface) {
            Intrinsics.checkNotNullParameter(typeface, "typeface");
            PlainCharTransformation plainCharTransformationAccess$getINSTANCE$cp = PlainCharTransformation.access$getINSTANCE$cp();
            if (plainCharTransformationAccess$getINSTANCE$cp == null) {
                synchronized (this) {
                    plainCharTransformationAccess$getINSTANCE$cp = PlainCharTransformation.access$getINSTANCE$cp();
                    if (plainCharTransformationAccess$getINSTANCE$cp == null) {
                        plainCharTransformationAccess$getINSTANCE$cp = new PlainCharTransformation(typeface, null);
                    }
                }
            }
            return plainCharTransformationAccess$getINSTANCE$cp;
        }
    }

    /* JADX INFO: compiled from: PlainCharTransformation.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/cellswidgets/transformations/PlainCharTransformation$FontSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "textPaint", "", "updateMeasureState", "updateDrawState", "Landroid/graphics/Typeface;", "font", "<init>", "(Lcom/bbva/cellswidgets/transformations/PlainCharTransformation;Landroid/graphics/Typeface;)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
    public final class FontSpan extends MetricAffectingSpan {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public final Typeface f27320p0;

        public FontSpan(@Nullable PlainCharTransformation plainCharTransformation, Typeface typeface) {
            this.f27320p0 = typeface;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            Typeface typeface = textPaint.getTypeface();
            textPaint.setTypeface(Typeface.create(this.f27320p0, typeface != null ? typeface.getStyle() : 0));
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(@NotNull TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            Typeface typeface = textPaint.getTypeface();
            textPaint.setTypeface(Typeface.create(this.f27320p0, typeface != null ? typeface.getStyle() : 0));
        }
    }

    public PlainCharTransformation(Typeface typeface, DefaultConstructorMarker defaultConstructorMarker) {
        this.f27319a = typeface;
    }

    public static final /* synthetic */ PlainCharTransformation access$getINSTANCE$cp() {
        return null;
    }

    @Override // android.text.method.TransformationMethod
    @Nullable
    public CharSequence getTransformation(@Nullable CharSequence source, @Nullable View view) {
        if (source == null) {
            return null;
        }
        if (!(source instanceof Spannable)) {
            return source;
        }
        ((Spannable) source).setSpan(new FontSpan(this, this.f27319a), 0, source.length(), 18);
        return source;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(@Nullable View view, @Nullable CharSequence sourceText, boolean focused, int direction, @Nullable Rect previouslyFocusedRect) {
    }
}
