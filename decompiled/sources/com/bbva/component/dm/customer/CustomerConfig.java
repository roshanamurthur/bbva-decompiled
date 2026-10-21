package com.bbva.component.dm.customer;

import androidx.appcompat.app.i;
import bk.o;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0005\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0010\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\f\u0010\r*\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0011\u0010\r*\u0004\b\u0012\u0010\u000fR-\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00028FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016*\u0004\b\u0017\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/customer/CustomerConfig;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "getHost", "()Ljava/lang/String;", "getHost$delegate", "(Lcom/bbva/component/dm/customer/CustomerConfig;)Ljava/lang/Object;", "host", "getVersion", "getVersion$delegate", "version", "", "getExpand", "()Ljava/util/Map;", "getExpand$delegate", "expand", "<init>", "(Ljava/util/Map;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class CustomerConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f27535b = {i.d(CustomerConfig.class, "host", "getHost()Ljava/lang/String;", 0), i.d(CustomerConfig.class, "version", "getVersion()Ljava/lang/String;", 0), i.d(CustomerConfig.class, "expand", "getExpand()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f27536a;

    public CustomerConfig(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f27536a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerConfig copy$default(CustomerConfig customerConfig, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = customerConfig.f27536a;
        }
        return customerConfig.copy(map);
    }

    @NotNull
    public final CustomerConfig copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new CustomerConfig(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomerConfig) && Intrinsics.areEqual(this.f27536a, ((CustomerConfig) other).f27536a);
    }

    @NotNull
    public final Map<String, List<String>> getExpand() {
        return (Map) o.getOrImplicitDefaultNullable(this.f27536a, f27535b[2].getName());
    }

    @NotNull
    public final String getHost() {
        return (String) o.getOrImplicitDefaultNullable(this.f27536a, f27535b[0].getName());
    }

    @NotNull
    public final String getVersion() {
        return (String) o.getOrImplicitDefaultNullable(this.f27536a, f27535b[1].getName());
    }

    public int hashCode() {
        return this.f27536a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomerConfig(map=" + this.f27536a + ")";
    }
}
