package com.bbva.glomohybrid.landing.presentation.behaviours;

import ad.d;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.domain.model.LandingBackground;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingBackgroundBehaviour.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/behaviours/LandingBackgroundBehaviour;", "", "", "path", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBackground;", "personal", "host", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingBackgroundBehaviour {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f33044a;

    public LandingBackgroundBehaviour(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.f33044a = host;
    }

    @NotNull
    public final LandingBackground personal(@Nullable String path) {
        return new LandingBackground(d.f(new StringBuilder(), this.f33044a, path), R.drawable.landing_image_header);
    }
}
