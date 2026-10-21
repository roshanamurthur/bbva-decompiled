package org.koin.core;

import bk.d;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinApplicationDslMarker;
import org.koin.core.module.Module;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: KoinApplication.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u0003\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0014\u0010\u0003\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0007J\u001d\u0010\u0018\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "Lorg/koin/core/module/Module;", "modules", "", "([Lorg/koin/core/module/Module;)Lorg/koin/core/KoinApplication;", "", "", "createEagerInstances", "", "override", "allowOverride", "", "", "values", LogKeysKt.PROPERTIES, "Lorg/koin/core/logger/Logger;", "logger", "Lorg/koin/core/logger/Level;", "level", "printLogger", HearingDisabilitiesConstants.CLOSE_MODAL, "unloadModules$koin_core", "(Ljava/util/List;)V", "unloadModules", "module", "(Lorg/koin/core/module/Module;)V", "Lorg/koin/core/Koin;", "a", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "koin", "<init>", "()V", "Companion", "koin-core"}, k = 1, mv = {1, 8, 0})
@KoinApplicationDslMarker
@SourceDebugExtension({"SMAP\nKoinApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinApplication.kt\norg/koin/core/KoinApplication\n+ 2 Measure.kt\norg/koin/core/time/MeasureKt\n*L\n1#1,138:1\n34#2:139\n48#2,4:140\n*S KotlinDebug\n*F\n+ 1 KoinApplication.kt\norg/koin/core/KoinApplication\n*L\n61#1:139\n61#1:140,4\n*E\n"})
public final class KoinApplication {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Koin koin;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f92316b;

    /* JADX INFO: compiled from: KoinApplication.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "()V", "init", "Lorg/koin/core/KoinApplication;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KoinApplication init() {
            return new KoinApplication(null);
        }
    }

    public /* synthetic */ KoinApplication(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KoinApplication printLogger$default(KoinApplication koinApplication, Level level, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            level = Level.INFO;
        }
        return koinApplication.printLogger(level);
    }

    public final void allowOverride(boolean override) {
        this.f92316b = override;
    }

    public final void close() {
        this.koin.close();
    }

    public final void createEagerInstances() {
        this.koin.createEagerInstances();
    }

    @NotNull
    public final Koin getKoin() {
        return this.koin;
    }

    @NotNull
    public final KoinApplication logger(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.koin.setupLogger(logger);
        return this;
    }

    @NotNull
    public final KoinApplication modules(@NotNull Module modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return modules(d.listOf(modules));
    }

    @NotNull
    public final KoinApplication printLogger(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.koin.setupLogger(KoinPlatformTools.INSTANCE.defaultLogger(level));
        return this;
    }

    @NotNull
    public final KoinApplication properties(@NotNull Map<String, ? extends Object> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.koin.getPropertyRegistry().saveProperties(values);
        return this;
    }

    public final void unloadModules$koin_core(@NotNull List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.koin.unloadModules(modules);
    }

    public KoinApplication() {
        this.koin = new Koin();
        this.f92316b = true;
    }

    @NotNull
    public final KoinApplication modules(@NotNull Module... modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        return modules(ArraysKt___ArraysKt.toList(modules));
    }

    public final void unloadModules$koin_core(@NotNull Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.koin.unloadModules(d.listOf(module));
    }

    @NotNull
    public final KoinApplication modules(@NotNull List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Koin koin = this.koin;
        Logger logger = koin.getLogger();
        Level level = Level.INFO;
        if (logger.isAt(level)) {
            KoinPlatformTimeTools koinPlatformTimeTools = KoinPlatformTimeTools.INSTANCE;
            long timeInNanoSeconds = koinPlatformTimeTools.getTimeInNanoSeconds();
            koin.loadModules(modules, this.f92316b);
            double dDoubleValue = ((Number) new Pair(Unit.INSTANCE, Double.valueOf((koinPlatformTimeTools.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d)).getSecond()).doubleValue();
            int size = koin.getInstanceRegistry().size();
            koin.getLogger().display(level, "loaded " + size + " definitions in " + dDoubleValue + " ms");
        } else {
            koin.loadModules(modules, this.f92316b);
        }
        return this;
    }
}
