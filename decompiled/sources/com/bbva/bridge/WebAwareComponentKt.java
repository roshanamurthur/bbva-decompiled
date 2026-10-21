package com.bbva.bridge;

import com.bbva.bridge.webcontroller.WebState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebAwareComponent.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0007¨\u0006\b"}, d2 = {"propagatePageLoaded", "", "", "Lcom/bbva/bridge/WebAwareComponent;", "value", "", "propagateWebReady", "Lcom/bbva/bridge/webcontroller/WebState;", "cells-bridge_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebAwareComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAwareComponent.kt\ncom/bbva/bridge/WebAwareComponentKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1855#2,2:14\n1855#2,2:16\n*S KotlinDebug\n*F\n+ 1 WebAwareComponent.kt\ncom/bbva/bridge/WebAwareComponentKt\n*L\n11#1:14,2\n12#1:16,2\n*E\n"})
public final class WebAwareComponentKt {
    public static final void propagatePageLoaded(@NotNull List<? extends WebAwareComponent> list, @NotNull String value) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((WebAwareComponent) it.next()).onPageLoaded(value);
        }
    }

    public static final void propagateWebReady(@NotNull List<? extends WebAwareComponent> list, @NotNull WebState value) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((WebAwareComponent) it.next()).onWebReady(value);
        }
    }
}
