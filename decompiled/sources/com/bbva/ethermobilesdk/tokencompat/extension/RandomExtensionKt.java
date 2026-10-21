package com.bbva.ethermobilesdk.tokencompat.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RandomExtension.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lkotlin/random/Random;", "", "nextByte", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0})
public final class RandomExtensionKt {
    public static final byte nextByte(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return (byte) random.nextInt(256);
    }
}
