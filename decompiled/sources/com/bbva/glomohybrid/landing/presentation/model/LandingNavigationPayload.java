package com.bbva.glomohybrid.landing.presentation.model;

import androidx.camera.core.impl.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingNavigationPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0002\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingNavigationPayload;", "", "component1", "data", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingNavigationPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object data;

    public LandingNavigationPayload(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ LandingNavigationPayload copy$default(LandingNavigationPayload landingNavigationPayload, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = landingNavigationPayload.data;
        }
        return landingNavigationPayload.copy(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final LandingNavigationPayload copy(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new LandingNavigationPayload(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LandingNavigationPayload) && Intrinsics.areEqual(this.data, ((LandingNavigationPayload) other).data);
    }

    @NotNull
    public final Object getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return a.e(new StringBuilder("LandingNavigationPayload(data="), this.data, ")");
    }
}
