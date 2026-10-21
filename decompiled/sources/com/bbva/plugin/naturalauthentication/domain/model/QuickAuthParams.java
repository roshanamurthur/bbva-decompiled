package com.bbva.plugin.naturalauthentication.domain.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QuickAuthParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/domain/model/QuickAuthParams;", "", "quickAuthEnabled", "", "<init>", "(Z)V", "getQuickAuthEnabled", "()Z", "component1", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QuickAuthParams {
    private final boolean quickAuthEnabled;

    public QuickAuthParams(boolean z10) {
        this.quickAuthEnabled = z10;
    }

    public static /* synthetic */ QuickAuthParams copy$default(QuickAuthParams quickAuthParams, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = quickAuthParams.quickAuthEnabled;
        }
        return quickAuthParams.copy(z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getQuickAuthEnabled() {
        return this.quickAuthEnabled;
    }

    @NotNull
    public final QuickAuthParams copy(boolean quickAuthEnabled) {
        return new QuickAuthParams(quickAuthEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuickAuthParams) && this.quickAuthEnabled == ((QuickAuthParams) other).quickAuthEnabled;
    }

    public final boolean getQuickAuthEnabled() {
        return this.quickAuthEnabled;
    }

    public int hashCode() {
        return this.quickAuthEnabled ? 1231 : 1237;
    }

    @NotNull
    public String toString() {
        return "QuickAuthParams(quickAuthEnabled=" + this.quickAuthEnabled + ")";
    }
}
