package com.bbva.ethermobilesdk.devicechecker.extension;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Iterable.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u001aU\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\u0002\"\u0016\b\u0001\u0010\b*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\t*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\n\u001a\u0002H\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"transform", "", ExifInterface.GPS_DIRECTION_TRUE, "", "", "predicate", "Lkotlin/Function1;", "transformTo", "C", "", "destination", "(Ljava/lang/Iterable;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "devicechecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIterable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterable.kt\ncom/bbva/ethermobilesdk/devicechecker/extension/IterableKt\n*L\n1#1,15:1\n11#1,3:16\n*S KotlinDebug\n*F\n+ 1 Iterable.kt\ncom/bbva/ethermobilesdk/devicechecker/extension/IterableKt\n*L\n4#1:16,3\n*E\n"})
public final class IterableKt {
    @NotNull
    public static final <T> Map<T, Boolean> transform(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                linkedHashMap.put(t10, Boolean.TRUE);
            } else {
                linkedHashMap.put(t10, Boolean.FALSE);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, C extends Map<? super T, Boolean>> C transformTo(@NotNull Iterable<? extends T> iterable, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.put(t10, Boolean.TRUE);
            } else {
                destination.put(t10, Boolean.FALSE);
            }
        }
        return destination;
    }
}
