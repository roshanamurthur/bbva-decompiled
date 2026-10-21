package com.bbva.document.scanner.presentation;

import android.util.DisplayMetrics;
import androidx.camera.view.PreviewView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"aspectRatio", "", "Landroid/util/DisplayMetrics;", "metrics", "Landroidx/camera/view/PreviewView;", "document-scanner_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/bbva/document/scanner/presentation/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class ExtensionsKt {
    public static final int aspectRatio(@NotNull DisplayMetrics displayMetrics) {
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        double dMax = ((double) Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels)) / ((double) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return Math.abs(dMax - 1.3333333333333333d) <= Math.abs(dMax - 1.7777777777777777d) ? 0 : 1;
    }

    @NotNull
    public static final DisplayMetrics metrics(@NotNull PreviewView previewView) {
        Intrinsics.checkNotNullParameter(previewView, "<this>");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        previewView.getDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
