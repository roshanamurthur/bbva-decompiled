package com.bbva.component.ui.carousel.extensions;

import androidx.camera.core.processing.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CarouselStringExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"formatPan", "", "component-ui-carousel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CarouselStringExtensionsKt {
    @NotNull
    public static final String formatPan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f.d("•••• •••• •••• ••", StringsKt___StringsKt.takeLast("••" + str, 2));
    }
}
