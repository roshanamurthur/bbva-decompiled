package com.bbva.component.ui.loader.extensions;

import com.bbva.component.ui.loader.LoaderViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnumExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"toLoaderType", "Lcom/bbva/component/ui/loader/LoaderViewType;", "", "", "component-ui-loader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EnumExtensionsKt {
    @NotNull
    public static final LoaderViewType toLoaderType(@Nullable String str) {
        if (Intrinsics.areEqual(str, "spinner")) {
            return LoaderViewType.Spinner;
        }
        return Intrinsics.areEqual(str, "loader") ? LoaderViewType.Loader : LoaderViewType.Loader;
    }

    @NotNull
    public static final LoaderViewType toLoaderType(int i10) {
        if (i10 == 0) {
            return LoaderViewType.Spinner;
        }
        if (i10 != 1) {
            return LoaderViewType.Loader;
        }
        return LoaderViewType.Loader;
    }
}
