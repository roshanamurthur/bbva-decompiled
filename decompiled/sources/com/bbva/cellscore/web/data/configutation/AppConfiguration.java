package com.bbva.cellscore.web.data.configutation;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/cellscore/web/data/configutation/AppConfiguration;", "", "", "id", "Lcom/bbva/cellscore/web/data/configutation/EnvironmentConfiguration;", "findEnvironment", "component1", "", "component2", "use", "environments", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUse", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getEnvironments", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String use;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<EnvironmentConfiguration> environments;

    public AppConfiguration(@NotNull String use, @NotNull List<EnvironmentConfiguration> environments) {
        Intrinsics.checkNotNullParameter(use, "use");
        Intrinsics.checkNotNullParameter(environments, "environments");
        this.use = use;
        this.environments = environments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppConfiguration copy$default(AppConfiguration appConfiguration, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appConfiguration.use;
        }
        if ((i10 & 2) != 0) {
            list = appConfiguration.environments;
        }
        return appConfiguration.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUse() {
        return this.use;
    }

    @NotNull
    public final List<EnvironmentConfiguration> component2() {
        return this.environments;
    }

    @NotNull
    public final AppConfiguration copy(@NotNull String use, @NotNull List<EnvironmentConfiguration> environments) {
        Intrinsics.checkNotNullParameter(use, "use");
        Intrinsics.checkNotNullParameter(environments, "environments");
        return new AppConfiguration(use, environments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfiguration)) {
            return false;
        }
        AppConfiguration appConfiguration = (AppConfiguration) other;
        return Intrinsics.areEqual(this.use, appConfiguration.use) && Intrinsics.areEqual(this.environments, appConfiguration.environments);
    }

    @NotNull
    public final EnvironmentConfiguration findEnvironment(@NotNull String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.environments.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((EnvironmentConfiguration) next).getId(), id));
        EnvironmentConfiguration environmentConfiguration = (EnvironmentConfiguration) next;
        return environmentConfiguration == null ? new EnvironmentConfiguration("", new WebConfigurationSet(null, 1, null)) : environmentConfiguration;
    }

    @NotNull
    public final List<EnvironmentConfiguration> getEnvironments() {
        return this.environments;
    }

    @NotNull
    public final String getUse() {
        return this.use;
    }

    public int hashCode() {
        return this.environments.hashCode() + (this.use.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppConfiguration(use=");
        sb2.append(this.use);
        sb2.append(", environments=");
        return a.c(sb2, this.environments, RootService.CLOSE_BRACKET);
    }
}
