package com.bbva.cellscore.web.data.configutation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/cellscore/web/data/configutation/WebConfiguration;", "", "", "component1", "url", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WebConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    public WebConfiguration(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    public static /* synthetic */ WebConfiguration copy$default(WebConfiguration webConfiguration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webConfiguration.url;
        }
        return webConfiguration.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final WebConfiguration copy(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new WebConfiguration(url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WebConfiguration) && Intrinsics.areEqual(this.url, ((WebConfiguration) other).url);
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("WebConfiguration(url="), this.url, RootService.CLOSE_BRACKET);
    }
}
