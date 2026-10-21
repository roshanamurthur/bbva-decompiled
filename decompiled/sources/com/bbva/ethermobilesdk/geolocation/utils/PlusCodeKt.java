package com.bbva.ethermobilesdk.geolocation.utils;

import com.google.openlocationcode.OpenLocationCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlusCode.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"coordinatesAsOpenLocation", "Lcom/google/openlocationcode/OpenLocationCode;", "latitude", "", "longitude", "length", "", "openLocationCodeAsCoordinates", "Lcom/google/openlocationcode/OpenLocationCode$CodeArea;", "openLocationCode", "", "geolocation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlusCodeKt {
    @NotNull
    public static final OpenLocationCode coordinatesAsOpenLocation(double d2, double d3, int i10) throws IllegalArgumentException {
        return new OpenLocationCode(d2, d3, i10);
    }

    public static /* synthetic */ OpenLocationCode coordinatesAsOpenLocation$default(double d2, double d3, int i10, int i11, Object obj) throws IllegalArgumentException {
        if ((i11 & 4) != 0) {
            i10 = 12;
        }
        return coordinatesAsOpenLocation(d2, d3, i10);
    }

    @NotNull
    public static final OpenLocationCode.CodeArea openLocationCodeAsCoordinates(@NotNull String openLocationCode) throws IllegalStateException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(openLocationCode, "openLocationCode");
        OpenLocationCode.CodeArea codeAreaDecode = new OpenLocationCode(openLocationCode).decode();
        Intrinsics.checkNotNullExpressionValue(codeAreaDecode, "decode(...)");
        return codeAreaDecode;
    }
}
