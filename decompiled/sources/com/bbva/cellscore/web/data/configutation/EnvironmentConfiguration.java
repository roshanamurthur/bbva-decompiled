package com.bbva.cellscore.web.data.configutation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/cellscore/web/data/configutation/EnvironmentConfiguration;", "", "", "component1", "Lcom/bbva/cellscore/web/data/configutation/WebConfigurationSet;", "component2", "id", "web", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/bbva/cellscore/web/data/configutation/WebConfigurationSet;", "getWeb", "()Lcom/bbva/cellscore/web/data/configutation/WebConfigurationSet;", "<init>", "(Ljava/lang/String;Lcom/bbva/cellscore/web/data/configutation/WebConfigurationSet;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EnvironmentConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WebConfigurationSet web;

    public EnvironmentConfiguration(@NotNull String id, @NotNull WebConfigurationSet web) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(web, "web");
        this.id = id;
        this.web = web;
    }

    public static /* synthetic */ EnvironmentConfiguration copy$default(EnvironmentConfiguration environmentConfiguration, String str, WebConfigurationSet webConfigurationSet, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = environmentConfiguration.id;
        }
        if ((i10 & 2) != 0) {
            webConfigurationSet = environmentConfiguration.web;
        }
        return environmentConfiguration.copy(str, webConfigurationSet);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WebConfigurationSet getWeb() {
        return this.web;
    }

    @NotNull
    public final EnvironmentConfiguration copy(@NotNull String id, @NotNull WebConfigurationSet web) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(web, "web");
        return new EnvironmentConfiguration(id, web);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvironmentConfiguration)) {
            return false;
        }
        EnvironmentConfiguration environmentConfiguration = (EnvironmentConfiguration) other;
        return Intrinsics.areEqual(this.id, environmentConfiguration.id) && Intrinsics.areEqual(this.web, environmentConfiguration.web);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final WebConfigurationSet getWeb() {
        return this.web;
    }

    public int hashCode() {
        return this.web.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EnvironmentConfiguration(id=" + this.id + ", web=" + this.web + RootService.CLOSE_BRACKET;
    }
}
