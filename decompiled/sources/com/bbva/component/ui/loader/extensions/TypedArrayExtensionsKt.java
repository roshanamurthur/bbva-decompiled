package com.bbva.component.ui.loader.extensions;

import android.content.res.TypedArray;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypedArrayExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u000e"}, d2 = {"optBoolean", "", "Landroid/content/res/TypedArray;", FirebaseAnalytics.Param.INDEX, "", "optColor", "optInt", "default", "optResource", "optString", "", "optTextArray", "", "", "component-ui-loader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TypedArrayExtensionsKt {
    public static final boolean optBoolean(@NotNull TypedArray typedArray, int i10) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        if (typedArray.hasValue(i10)) {
            return typedArray.getBoolean(i10, false);
        }
        return false;
    }

    public static final int optColor(@NotNull TypedArray typedArray, int i10) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        if (typedArray.hasValue(i10)) {
            return typedArray.getColor(i10, 0);
        }
        return 0;
    }

    public static final int optInt(@NotNull TypedArray typedArray, int i10, int i11) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        return typedArray.hasValue(i10) ? typedArray.getInt(i10, i11) : i11;
    }

    public static final int optResource(@NotNull TypedArray typedArray, int i10) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        if (typedArray.hasValue(i10)) {
            return typedArray.getResourceId(i10, 0);
        }
        return 0;
    }

    @Nullable
    public static final String optString(@NotNull TypedArray typedArray, int i10) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        if (typedArray.hasValue(i10)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    @NotNull
    public static final List<CharSequence> optTextArray(@NotNull TypedArray typedArray, int i10) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        if (!typedArray.hasValue(i10)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        CharSequence[] textArray = typedArray.getTextArray(i10);
        Intrinsics.checkNotNullExpressionValue(textArray, "getTextArray(...)");
        return ArraysKt___ArraysKt.toList(textArray);
    }
}
