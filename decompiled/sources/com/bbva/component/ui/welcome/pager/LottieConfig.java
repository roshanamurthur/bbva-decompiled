package com.bbva.component.ui.welcome.pager;

import androidx.appcompat.app.i;
import bk.o;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Page.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0005\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/LottieConfig;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "", "a", "Ljava/util/Map;", "getLoopCount", "()Ljava/lang/Double;", "loopCount", "<init>", "(Ljava/util/Map;)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class LottieConfig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28793c = {i.d(LottieConfig.class, "loopCount", "getLoopCount()Ljava/lang/Double;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map loopCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f28795b;

    public LottieConfig(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f28795b = map;
        this.loopCount = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LottieConfig copy$default(LottieConfig lottieConfig, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = lottieConfig.f28795b;
        }
        return lottieConfig.copy(map);
    }

    @NotNull
    public final LottieConfig copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new LottieConfig(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof LottieConfig) && Intrinsics.areEqual(this.f28795b, ((LottieConfig) other).f28795b);
        }
        return true;
    }

    @Nullable
    public final Double getLoopCount() {
        return (Double) o.getOrImplicitDefaultNullable(this.loopCount, f28793c[0].getName());
    }

    public int hashCode() {
        Map<String, Object> map = this.f28795b;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "LottieConfig(map=" + this.f28795b + ")";
    }
}
