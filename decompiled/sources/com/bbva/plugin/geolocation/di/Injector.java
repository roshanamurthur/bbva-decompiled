package com.bbva.plugin.geolocation.di;

import com.bbva.plugin.geolocation.manager.Locator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u001a\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/geolocation/di/Injector;", "", "<init>", "()V", "locator", "Lcom/bbva/plugin/geolocation/manager/Locator;", "getLocator", "()Lcom/bbva/plugin/geolocation/manager/Locator;", "setLocator", "(Lcom/bbva/plugin/geolocation/manager/Locator;)V", "warmUp", "", "withLocator", "block", "Lkotlin/Function1;", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();
    public static Locator locator;

    @NotNull
    public final Locator getLocator() {
        Locator locator2 = locator;
        if (locator2 != null) {
            return locator2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locator");
        return null;
    }

    public final void setLocator(@NotNull Locator locator2) {
        Intrinsics.checkNotNullParameter(locator2, "<set-?>");
        locator = locator2;
    }

    public final void warmUp(@NotNull Locator locator2) {
        Intrinsics.checkNotNullParameter(locator2, "locator");
        setLocator(locator2);
    }

    public final void withLocator(@NotNull Function1<? super Locator, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(getLocator());
    }
}
