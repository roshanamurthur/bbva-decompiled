package com.bbva.cellscore.featureflag;

import bk.p;
import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.cellscore.web.data.component.FeatureFlag;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004J\u001a\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\r\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0002J,\u0010\u0014\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b \u0013*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u0012J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/bbva/cellscore/featureflag/FeatureFlagManager;", "Lkotlinx/coroutines/CoroutineScope;", "", "pageId", "", "Lcom/bbva/cells/componentkit/ViewModel;", "components", "", "addComponents", "removeComponents", "", "Lcom/bbva/cells/component/kit/featureflag/FlagState;", "flags", "setFlags", "name", "value", "setFlag", "getFlag", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "onFlags", "Lcom/bbva/cellscore/web/data/component/FeatureFlag;", "featureFlag", "computeFlag$cells_core_release", "(Lcom/bbva/cellscore/web/data/component/FeatureFlag;)Lcom/bbva/cells/component/kit/featureflag/FlagState;", "computeFlag", "sendFlags$cells_core_release", "()V", "sendFlags", "", "q0", "Ljava/util/Map;", "getFlags", "()Ljava/util/Map;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final class FeatureFlagManager implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f26991p0 = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f26992q0 = new LinkedHashMap();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final PublishSubject<Map<String, FlagState>> f26993r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f26994s0;

    public FeatureFlagManager() {
        PublishSubject<Map<String, FlagState>> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Map<String, FlagState>>()");
        this.f26993r0 = publishSubjectCreate;
        this.f26994s0 = new LinkedHashMap();
    }

    public final void addComponents(@NotNull String pageId, @NotNull List<? extends ViewModel<?>> components) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(components, "components");
        this.f26994s0.put(pageId, components);
    }

    @NotNull
    public final FlagState computeFlag$cells_core_release(@NotNull FeatureFlag featureFlag) {
        Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
        FlagState flagState = (FlagState) this.f26992q0.get(featureFlag.getAppId());
        return flagState == null ? featureFlag.getDefault() : flagState;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f26991p0.getCoroutineContext();
    }

    @Nullable
    public final FlagState getFlag(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (FlagState) this.f26992q0.get(name);
    }

    @NotNull
    public final Map<String, FlagState> getFlags() {
        return this.f26992q0;
    }

    @NotNull
    public final PublishSubject<Map<String, FlagState>> onFlags() {
        return this.f26993r0;
    }

    @Nullable
    public final List<ViewModel<?>> removeComponents(@NotNull String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        return (List) this.f26994s0.remove(pageId);
    }

    public final void sendFlags$cells_core_release() {
        Iterator it = this.f26994s0.entrySet().iterator();
        while (it.hasNext()) {
            for (ViewModel viewModel : (Iterable) ((Map.Entry) it.next()).getValue()) {
                Map<String, FlagState> flags = getFlags();
                LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(flags.size()));
                Iterator<T> it2 = flags.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), FeatureFlagManagerKt.access$toNewFlagStage((FlagState) entry.getValue()));
                }
                viewModel.applyFlags(linkedHashMap);
            }
        }
    }

    public final void setFlag(@NotNull String name, @NotNull FlagState value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = this.f26992q0;
        linkedHashMap.put(name, value);
        this.f26993r0.onNext(linkedHashMap);
    }

    public final void setFlags(@NotNull Map<String, ? extends FlagState> flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        LinkedHashMap linkedHashMap = this.f26992q0;
        linkedHashMap.clear();
        linkedHashMap.putAll(flags);
        this.f26993r0.onNext(flags);
    }
}
