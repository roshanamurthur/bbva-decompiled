package com.bbva.push.salesforce.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bbva/push/salesforce/model/Configuration;", "", "contactKey", "", "enablePush", "", "enableGeolocation", "(Ljava/lang/String;ZZ)V", "getContactKey", "()Ljava/lang/String;", "getEnableGeolocation", "()Z", "getEnablePush", "component1", "component2", "component3", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "salesforce-push_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Configuration {

    @Nullable
    private final String contactKey;
    private final boolean enableGeolocation;
    private final boolean enablePush;

    public Configuration() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = configuration.contactKey;
        }
        if ((i10 & 2) != 0) {
            z10 = configuration.enablePush;
        }
        if ((i10 & 4) != 0) {
            z11 = configuration.enableGeolocation;
        }
        return configuration.copy(str, z10, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContactKey() {
        return this.contactKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnablePush() {
        return this.enablePush;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableGeolocation() {
        return this.enableGeolocation;
    }

    @NotNull
    public final Configuration copy(@Nullable String contactKey, boolean enablePush, boolean enableGeolocation) {
        return new Configuration(contactKey, enablePush, enableGeolocation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return Intrinsics.areEqual(this.contactKey, configuration.contactKey) && this.enablePush == configuration.enablePush && this.enableGeolocation == configuration.enableGeolocation;
    }

    @Nullable
    public final String getContactKey() {
        return this.contactKey;
    }

    public final boolean getEnableGeolocation() {
        return this.enableGeolocation;
    }

    public final boolean getEnablePush() {
        return this.enablePush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        String str = this.contactKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.enablePush;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iHashCode + r1) * 31;
        boolean z11 = this.enableGeolocation;
        return i10 + (z11 ? 1 : z11);
    }

    @NotNull
    public String toString() {
        String str = this.contactKey;
        boolean z10 = this.enablePush;
        boolean z11 = this.enableGeolocation;
        StringBuilder sb2 = new StringBuilder("Configuration(contactKey=");
        sb2.append(str);
        sb2.append(", enablePush=");
        sb2.append(z10);
        sb2.append(", enableGeolocation=");
        return i.c(sb2, z11, ")");
    }

    public Configuration(@Nullable String str, boolean z10, boolean z11) {
        this.contactKey = str;
        this.enablePush = z10;
        this.enableGeolocation = z11;
    }

    public /* synthetic */ Configuration(String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? false : z11);
    }
}
