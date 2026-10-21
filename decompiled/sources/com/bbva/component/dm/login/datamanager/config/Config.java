package com.bbva.component.dm.login.datamanager.config;

import bk.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/dm/login/datamanager/config/Config;", "", "", "a", "Ljava/util/Map;", "getHost", "()Ljava/lang/String;", "host", "b", "getPath", "path", "", "map", "<init>", "(Ljava/util/Map;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public abstract class Config {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f27724c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Config.class), "host", "getHost()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Config.class), "path", "getPath()Ljava/lang/String;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map host;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map path;

    public Config(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.host = map;
        this.path = map;
    }

    @NotNull
    public final String getHost() {
        return (String) o.getOrImplicitDefaultNullable(this.host, f27724c[0].getName());
    }

    @NotNull
    public final String getPath() {
        return (String) o.getOrImplicitDefaultNullable(this.path, f27724c[1].getName());
    }
}
