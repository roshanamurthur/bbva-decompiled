package org.koin.core.registry;

import androidx.camera.camera2.internal.h0;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: ScopeRegistry.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0001J(\u0010\n\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0001J\u001b\u0010\u000e\u001a\u00020\u000b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R \u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, d2 = {"Lorg/koin/core/registry/ScopeRegistry;", "", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "Lorg/koin/core/scope/Scope;", "getScopeOrNull", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "source", "createScope", "", "deleteScope$koin_core", "(Ljava/lang/String;)V", "deleteScope", "scope", "(Lorg/koin/core/scope/Scope;)V", "close$koin_core", "()V", HearingDisabilitiesConstants.CLOSE_MODAL, "", "Lorg/koin/core/module/Module;", "modules", "loadScopes", "d", "Lorg/koin/core/scope/Scope;", "getRootScope", "()Lorg/koin/core/scope/Scope;", "getRootScope$annotations", "rootScope", "getScopeDefinitions", "()Ljava/util/Set;", "scopeDefinitions", "Lorg/koin/core/Koin;", "_koin", "<init>", "(Lorg/koin/core/Koin;)V", "Companion", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScopeRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeRegistry.kt\norg/koin/core/registry/ScopeRegistry\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n28#2:112\n46#2,2:113\n29#2:115\n36#2,12:116\n1#3:128\n1855#4,2:129\n1855#4,2:131\n*S KotlinDebug\n*F\n+ 1 ScopeRegistry.kt\norg/koin/core/registry/ScopeRegistry\n*L\n60#1:112\n60#1:113,2\n60#1:115\n62#1:116,12\n91#1:129,2\n97#1:131,2\n*E\n"})
public final class ScopeRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final StringQualifier f92460e = QualifierKt._q("_root_");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Koin f92461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashSet<Qualifier> f92462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, Scope> f92463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Scope rootScope;

    public ScopeRegistry(@NotNull Koin _koin) {
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.f92461a = _koin;
        HashSet<Qualifier> hashSet = new HashSet<>();
        this.f92462b = hashSet;
        Map<String, Scope> mapSafeHashMap = KoinPlatformTools.INSTANCE.safeHashMap();
        this.f92463c = mapSafeHashMap;
        Scope scope = new Scope(f92460e, "_root_", true, _koin);
        this.rootScope = scope;
        hashSet.add(scope.getScopeQualifier());
        mapSafeHashMap.put(scope.getId(), scope);
    }

    public static /* synthetic */ Scope createScope$default(ScopeRegistry scopeRegistry, String str, Qualifier qualifier, Object obj, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return scopeRegistry.createScope(str, qualifier, obj);
    }

    public final void close$koin_core() {
        Map<String, Scope> map = this.f92463c;
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            ((Scope) it.next()).close();
        }
        map.clear();
        this.f92462b.clear();
    }

    @PublishedApi
    @NotNull
    public final Scope createScope(@NotNull String scopeId, @NotNull Qualifier qualifier, @Nullable Object source) throws ScopeAlreadyCreatedException {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        Koin koin = this.f92461a;
        Logger logger = koin.getLogger();
        String str = "|- (+) Scope - id:'" + scopeId + "' q:" + qualifier;
        Level level = Level.DEBUG;
        if (logger.isAt(level)) {
            logger.display(level, str);
        }
        HashSet<Qualifier> hashSet = this.f92462b;
        if (!hashSet.contains(qualifier)) {
            Logger logger2 = koin.getLogger();
            String str2 = "| Scope '" + qualifier + "' not defined. Creating it ...";
            Level level2 = Level.WARNING;
            if (logger2.isAt(level2)) {
                logger2.display(level2, str2);
            }
            hashSet.add(qualifier);
        }
        Map<String, Scope> map = this.f92463c;
        if (map.containsKey(scopeId)) {
            throw new ScopeAlreadyCreatedException(h0.b("Scope with id '", scopeId, "' is already created"));
        }
        Scope scope = new Scope(qualifier, scopeId, false, this.f92461a, 4, null);
        if (source != null) {
            scope.set_source(source);
        }
        scope.linkTo(this.rootScope);
        map.put(scopeId, scope);
        return scope;
    }

    public final void deleteScope$koin_core(@NotNull String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Scope scope = this.f92463c.get(scopeId);
        if (scope != null) {
            deleteScope$koin_core(scope);
        }
    }

    @NotNull
    public final Scope getRootScope() {
        return this.rootScope;
    }

    @NotNull
    public final Set<Qualifier> getScopeDefinitions() {
        return this.f92462b;
    }

    @PublishedApi
    @Nullable
    public final Scope getScopeOrNull(@NotNull String scopeId) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        return this.f92463c.get(scopeId);
    }

    public final void loadScopes(@NotNull Set<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            this.f92462b.addAll(((Module) it.next()).getScopes());
        }
    }

    public final void deleteScope$koin_core(@NotNull Scope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f92461a.getInstanceRegistry().dropScopeInstances$koin_core(scope);
        this.f92463c.remove(scope.getId());
    }

    /* JADX INFO: compiled from: ScopeRegistry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/koin/core/registry/ScopeRegistry$Companion;", "", "()V", "ROOT_SCOPE_ID", "", "rootScopeQualifier", "Lorg/koin/core/qualifier/StringQualifier;", "getRootScopeQualifier$annotations", "getRootScopeQualifier", "()Lorg/koin/core/qualifier/StringQualifier;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StringQualifier getRootScopeQualifier() {
            return ScopeRegistry.f92460e;
        }

        @PublishedApi
        public static /* synthetic */ void getRootScopeQualifier$annotations() {
        }
    }

    @KoinInternalApi
    public static /* synthetic */ void getRootScope$annotations() {
    }
}
