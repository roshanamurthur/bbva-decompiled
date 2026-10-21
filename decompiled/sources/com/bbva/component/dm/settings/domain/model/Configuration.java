package com.bbva.component.dm.settings.domain.model;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J3\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/Configuration;", "", "", "component1", "component2", "", "Lcom/bbva/component/dm/settings/domain/model/Exceptions;", "component3", "defaultAap", "defaultHost", "exceptions", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getDefaultAap", "()Ljava/lang/String;", "b", "getDefaultHost", "c", "Ljava/util/List;", "getExceptions", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Configuration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultAAP")
    @Nullable
    private final String defaultAap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultHOST")
    @Nullable
    private final String defaultHost;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Exceptions> exceptions;

    public Configuration(@Nullable String str, @Nullable String str2, @Nullable List<Exceptions> list) {
        this.defaultAap = str;
        this.defaultHost = str2;
        this.exceptions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = configuration.defaultAap;
        }
        if ((i10 & 2) != 0) {
            str2 = configuration.defaultHost;
        }
        if ((i10 & 4) != 0) {
            list = configuration.exceptions;
        }
        return configuration.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDefaultAap() {
        return this.defaultAap;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultHost() {
        return this.defaultHost;
    }

    @Nullable
    public final List<Exceptions> component3() {
        return this.exceptions;
    }

    @NotNull
    public final Configuration copy(@Nullable String defaultAap, @Nullable String defaultHost, @Nullable List<Exceptions> exceptions) {
        return new Configuration(defaultAap, defaultHost, exceptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return Intrinsics.areEqual(this.defaultAap, configuration.defaultAap) && Intrinsics.areEqual(this.defaultHost, configuration.defaultHost) && Intrinsics.areEqual(this.exceptions, configuration.exceptions);
    }

    @Nullable
    public final String getDefaultAap() {
        return this.defaultAap;
    }

    @Nullable
    public final String getDefaultHost() {
        return this.defaultHost;
    }

    @Nullable
    public final List<Exceptions> getExceptions() {
        return this.exceptions;
    }

    public int hashCode() {
        String str = this.defaultAap;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultHost;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Exceptions> list = this.exceptions;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.c(androidx.constraintlayout.core.parser.a.c("Configuration(defaultAap=", this.defaultAap, ", defaultHost=", this.defaultHost, ", exceptions="), this.exceptions, ")");
    }
}
