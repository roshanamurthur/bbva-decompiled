package com.bbva.component.ic.security.model;

import androidx.appcompat.app.i;
import bk.o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HandlerConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\f\u0010\rR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/ic/security/model/HandlerConfig;", "", "", "", "a", "Ljava/util/Map;", "getUnauthorizedCode", "()Ljava/util/List;", "unauthorizedCode", "", "", "config", "<init>", "(Ljava/util/Map;)V", "component-ic-security_release"}, k = 1, mv = {2, 0, 0})
public final class HandlerConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f28184b = {i.d(HandlerConfig.class, "unauthorizedCode", "getUnauthorizedCode()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map unauthorizedCode;

    public HandlerConfig(@NotNull Map<String, ? extends Object> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.unauthorizedCode = config;
    }

    @NotNull
    public final List<Integer> getUnauthorizedCode() {
        return (List) o.getOrImplicitDefaultNullable(this.unauthorizedCode, f28184b[0].getName());
    }
}
