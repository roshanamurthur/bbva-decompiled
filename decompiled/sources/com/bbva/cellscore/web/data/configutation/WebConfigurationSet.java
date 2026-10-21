package com.bbva.cellscore.web.data.configutation;

import androidx.datastore.preferences.protobuf.e;
import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/cellscore/web/data/configutation/WebConfigurationSet;", "", "", "key", "Lcom/bbva/cellscore/web/data/configutation/WebConfiguration;", "get", "", "component1", "webs", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getWebs", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WebConfigurationSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> webs;

    /* JADX WARN: Multi-variable type inference failed */
    public WebConfigurationSet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebConfigurationSet copy$default(WebConfigurationSet webConfigurationSet, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = webConfigurationSet.webs;
        }
        return webConfigurationSet.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.webs;
    }

    @NotNull
    public final WebConfigurationSet copy(@NotNull Map<String, String> webs) {
        Intrinsics.checkNotNullParameter(webs, "webs");
        return new WebConfigurationSet(webs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WebConfigurationSet) && Intrinsics.areEqual(this.webs, ((WebConfigurationSet) other).webs);
    }

    @Nullable
    public final WebConfiguration get(@Nullable String key) {
        if (key == null) {
            key = "url";
        }
        String str = this.webs.get(key);
        if (str == null) {
            str = "https://appassets.androidplatform.net/assets/www/index.html";
        }
        return new WebConfiguration(str);
    }

    @NotNull
    public final Map<String, String> getWebs() {
        return this.webs;
    }

    public int hashCode() {
        return this.webs.hashCode();
    }

    @NotNull
    public String toString() {
        return e.g(new StringBuilder("WebConfigurationSet(webs="), this.webs, RootService.CLOSE_BRACKET);
    }

    public WebConfigurationSet(@NotNull Map<String, String> webs) {
        Intrinsics.checkNotNullParameter(webs, "webs");
        this.webs = webs;
    }

    public /* synthetic */ WebConfigurationSet(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q.emptyMap() : map);
    }
}
