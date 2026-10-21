package com.bbva.glomohybrid.provider.modules;

import android.content.Context;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.base.behaviors.AppShortcutsCreator;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.shortcuts.CountryAppShortcuts;
import com.bbva.glomohybrid.shortcuts.CountryAppShortcutsCreator;
import com.bbva.glomohybrid.shortcuts.filter.MonoEnterpriseDebitCardClientShortcutFilter;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ShortcutModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nShortcutModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt$shortcutModule$1$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,36:1\n129#2,5:37\n129#2,5:42\n*S KotlinDebug\n*F\n+ 1 ShortcutModule.kt\ncom/bbva/glomohybrid/provider/modules/ShortcutModuleKt$shortcutModule$1$1\n*L\n20#1:37,5\n22#1:42,5\n*E\n"})
public final class a2 extends Lambda implements Function2<Scope, ParametersHolder, AppShortcutsCreator> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a2 f34265p0 = new a2(2);

    @Override // kotlin.jvm.functions.Function2
    public final AppShortcutsCreator invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CountryAppShortcutsCreator((Context) factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), bk.d.listOf(new MonoEnterpriseDebitCardClientShortcutFilter((MainStorage) factory.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null))), new CountryAppShortcuts((FeatureFlagsRepository) factory.get(Reflection.getOrCreateKotlinClass(FeatureFlagsRepository.class), null, null)).getAppShortcutItems((Context) factory.get(Reflection.getOrCreateKotlinClass(Context.class), null, null)));
    }
}
