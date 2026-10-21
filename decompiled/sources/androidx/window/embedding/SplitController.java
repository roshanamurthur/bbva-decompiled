package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import bk.w;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SplitController.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0006J*\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u001a\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eJ\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006\u0019"}, d2 = {"Landroidx/window/embedding/SplitController;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "rule", "", "registerRule", "unregisterRule", "clearRegisteredRules", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "consumer", "addSplitListener", "removeSplitListener", "", "isSplitSupported", "<init>", "()V", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SplitController {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile SplitController f24142c = null;
    public static final boolean sDebug = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExtensionEmbeddingBackend f24144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Set<? extends EmbeddingRule> f24145b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f24143d = new ReentrantLock();

    /* JADX INFO: compiled from: SplitController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "()V", "globalInstance", "Landroidx/window/embedding/SplitController;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "sDebug", "", "getInstance", "initialize", "", "context", "Landroid/content/Context;", "staticRuleResourceId", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SplitController getInstance() {
            if (SplitController.f24142c == null) {
                ReentrantLock reentrantLock = SplitController.f24143d;
                reentrantLock.lock();
                try {
                    if (SplitController.f24142c == null) {
                        SplitController.f24142c = new SplitController(null);
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            SplitController splitController = SplitController.f24142c;
            Intrinsics.checkNotNull(splitController);
            return splitController;
        }

        @JvmStatic
        public final void initialize(@NotNull Context context, int staticRuleResourceId) throws XmlPullParserException, IOException {
            Intrinsics.checkNotNullParameter(context, "context");
            Set<EmbeddingRule> splitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, staticRuleResourceId);
            SplitController companion = getInstance();
            if (splitRules$window_release == null) {
                splitRules$window_release = w.emptySet();
            }
            SplitController.access$setStaticSplitRules(companion, splitRules$window_release);
        }
    }

    public /* synthetic */ SplitController(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final void access$setStaticSplitRules(SplitController splitController, Set set) {
        splitController.f24145b = set;
        splitController.f24144a.setSplitRules(set);
    }

    @JvmStatic
    @NotNull
    public static final SplitController getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static final void initialize(@NotNull Context context, int i10) throws XmlPullParserException, IOException {
        INSTANCE.initialize(context, i10);
    }

    public final void addSplitListener(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f24144a.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void clearRegisteredRules() {
        this.f24144a.setSplitRules(this.f24145b);
    }

    @NotNull
    public final Set<EmbeddingRule> getSplitRules() {
        return CollectionsKt___CollectionsKt.toSet(this.f24144a.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.f24144a.isSplitSupported();
    }

    public final void registerRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f24144a.registerRule(rule);
    }

    public final void removeSplitListener(@NotNull Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f24144a.unregisterSplitListenerForActivity(consumer);
    }

    public final void unregisterRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f24144a.unregisterRule(rule);
    }

    public SplitController() {
        this.f24144a = ExtensionEmbeddingBackend.INSTANCE.getInstance();
        this.f24145b = w.emptySet();
    }
}
