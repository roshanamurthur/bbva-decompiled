package com.bbva.glomohybrid.splash.plugin;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NaturalAuthInitializer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/splash/plugin/NaturalAuthInitializer;", "", "()V", "initialize", "", "lifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NaturalAuthInitializer {

    @NotNull
    public static final NaturalAuthInitializer INSTANCE = new NaturalAuthInitializer();

    public final void initialize(@NotNull LifecycleOwner lifeCycleOwner, @NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifeCycleOwner, "lifeCycleOwner");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
    }
}
