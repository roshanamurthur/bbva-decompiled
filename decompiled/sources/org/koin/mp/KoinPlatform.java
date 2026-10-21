package org.koin.mp;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;

/* JADX INFO: compiled from: KoinPlatform.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lorg/koin/mp/KoinPlatform;", "", "()V", "getKoin", "Lorg/koin/core/Koin;", "startKoin", "", "modules", "", "Lorg/koin/core/module/Module;", "level", "Lorg/koin/core/logger/Level;", "stopKoin", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KoinPlatform {

    @NotNull
    public static final KoinPlatform INSTANCE = new KoinPlatform();

    /* JADX INFO: compiled from: KoinPlatform.kt */
    public static final class a extends Lambda implements Function1<KoinApplication, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Level f92499p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<Module> f92500q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, Level level) {
            super(1);
            this.f92499p0 = level;
            this.f92500q0 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KoinApplication koinApplication) {
            KoinApplication startKoin = koinApplication;
            Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
            startKoin.logger(KoinPlatformTools.INSTANCE.defaultLogger(this.f92499p0));
            startKoin.modules(this.f92500q0);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    public final void startKoin(@NotNull List<Module> modules, @NotNull Level level) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(level, "level");
        DefaultContextExtKt.startKoin(new a(modules, level));
    }

    public final void stopKoin() {
        DefaultContextExtKt.stopKoin();
    }
}
