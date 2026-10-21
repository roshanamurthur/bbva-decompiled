package com.bbva.component.request.header.flowmeter;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlowmeterInterceptorConfig.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/request/header/flowmeter/FlowmeterInterceptorConfig;", "", "", "", "component1", "whiteList", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getWhiteList", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "request-header-flowmeter_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class FlowmeterInterceptorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> whiteList;

    public FlowmeterInterceptorConfig(@NotNull List<String> whiteList) {
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        this.whiteList = whiteList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlowmeterInterceptorConfig copy$default(FlowmeterInterceptorConfig flowmeterInterceptorConfig, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = flowmeterInterceptorConfig.whiteList;
        }
        return flowmeterInterceptorConfig.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.whiteList;
    }

    @NotNull
    public final FlowmeterInterceptorConfig copy(@NotNull List<String> whiteList) {
        Intrinsics.checkNotNullParameter(whiteList, "whiteList");
        return new FlowmeterInterceptorConfig(whiteList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FlowmeterInterceptorConfig) && Intrinsics.areEqual(this.whiteList, ((FlowmeterInterceptorConfig) other).whiteList);
    }

    @NotNull
    public final List<String> getWhiteList() {
        return this.whiteList;
    }

    public int hashCode() {
        return this.whiteList.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("FlowmeterInterceptorConfig(whiteList="), this.whiteList, ")");
    }
}
