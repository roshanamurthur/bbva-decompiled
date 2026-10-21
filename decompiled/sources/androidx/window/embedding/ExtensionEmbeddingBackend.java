package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.lifecycle.d;
import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 *2\u00020\u0001:\u0003*+,B\u0013\b\u0007\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b)\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "rules", "", "setSplitRules", "rule", "registerRule", "unregisterRule", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "callback", "registerSplitListenerForActivity", "consumer", "unregisterSplitListenerForActivity", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "a", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "embeddingExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "splitChangeCallbacks", "<init>", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, k = 1, mv = {1, 6, 0})
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static volatile ExtensionEmbeddingBackend f24130e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @GuardedBy("globalLock")
    @VisibleForTesting
    @Nullable
    public EmbeddingInterfaceCompat embeddingExtension;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final EmbeddingCallbackImpl f24134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArraySet<EmbeddingRule> f24135d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f24131f = new ReentrantLock();

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "getInstance", "", "extensionVersion", "", "isExtensionVersionSupported", "(Ljava/lang/Integer;)Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.f24130e == null) {
                ReentrantLock reentrantLock = ExtensionEmbeddingBackend.f24131f;
                reentrantLock.lock();
                try {
                    if (ExtensionEmbeddingBackend.f24130e == null) {
                        Companion companion = ExtensionEmbeddingBackend.INSTANCE;
                        companion.getClass();
                        EmbeddingCompat embeddingCompat = null;
                        try {
                            EmbeddingCompat.Companion companion2 = EmbeddingCompat.INSTANCE;
                            if (companion.isExtensionVersionSupported(companion2.getExtensionApiLevel()) && companion2.isEmbeddingAvailable()) {
                                embeddingCompat = new EmbeddingCompat();
                            }
                        } catch (Throwable th2) {
                            Intrinsics.stringPlus("Failed to load embedding extension: ", th2);
                        }
                        ExtensionEmbeddingBackend.f24130e = new ExtensionEmbeddingBackend(embeddingCompat);
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend = ExtensionEmbeddingBackend.f24130e;
            Intrinsics.checkNotNull(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(@Nullable Integer extensionVersion) {
            return extensionVersion != null && extensionVersion.intValue() >= 1;
        }
    }

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "", "onSplitInfoChanged", "a", "Ljava/util/List;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "(Ljava/util/List;)V", "lastInfo", "<init>", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<SplitInfo> lastInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExtensionEmbeddingBackend f24137b;

        public EmbeddingCallbackImpl(ExtensionEmbeddingBackend this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f24137b = this$0;
        }

        @Nullable
        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(@NotNull List<SplitInfo> splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<SplitListenerWrapper> it = this.f24137b.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }

        public final void setLastInfo(@Nullable List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    /* JADX INFO: compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "", "accept", "Landroidx/core/util/Consumer;", "c", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "callback", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class SplitListenerWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Activity f24138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Executor f24139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Consumer<List<SplitInfo>> callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ArrayList f24141d;

        public SplitListenerWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f24138a = activity;
            this.f24139b = executor;
            this.callback = callback;
        }

        public final void accept(@NotNull List<SplitInfo> splitInfoList) {
            Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((SplitInfo) obj).contains(this.f24138a)) {
                    arrayList.add(obj);
                }
            }
            if (Intrinsics.areEqual(arrayList, this.f24141d)) {
                return;
            }
            this.f24141d = arrayList;
            this.f24139b.execute(new d(this, arrayList, 1));
        }

        @NotNull
        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl(this);
        this.f24134c = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.f24135d = new CopyOnWriteArraySet<>();
    }

    @Nullable
    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @NotNull
    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @NotNull
    public Set<EmbeddingRule> getSplitRules() {
        return this.f24135d;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        CopyOnWriteArraySet<EmbeddingRule> copyOnWriteArraySet = this.f24135d;
        if (copyOnWriteArraySet.contains(rule)) {
            return;
        }
        copyOnWriteArraySet.add(rule);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(copyOnWriteArraySet);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> callback) {
        EmbeddingCallbackImpl embeddingCallbackImpl = this.f24134c;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = f24131f;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                callback.accept(CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, callback);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (embeddingCallbackImpl.getLastInfo() != null) {
                List<SplitInfo> lastInfo = embeddingCallbackImpl.getLastInfo();
                Intrinsics.checkNotNull(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(CollectionsKt__CollectionsKt.emptyList());
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        CopyOnWriteArraySet<EmbeddingRule> copyOnWriteArraySet = this.f24135d;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.addAll(rules);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(copyOnWriteArraySet);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        CopyOnWriteArraySet<EmbeddingRule> copyOnWriteArraySet = this.f24135d;
        if (copyOnWriteArraySet.contains(rule)) {
            copyOnWriteArraySet.remove(rule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat == null) {
                return;
            }
            embeddingInterfaceCompat.setSplitRules(copyOnWriteArraySet);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterSplitListenerForActivity(@NotNull Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ReentrantLock reentrantLock = f24131f;
        reentrantLock.lock();
        try {
            for (SplitListenerWrapper splitListenerWrapper : getSplitChangeCallbacks()) {
                if (Intrinsics.areEqual(splitListenerWrapper.getCallback(), consumer)) {
                    getSplitChangeCallbacks().remove(splitListenerWrapper);
                    break;
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }
}
