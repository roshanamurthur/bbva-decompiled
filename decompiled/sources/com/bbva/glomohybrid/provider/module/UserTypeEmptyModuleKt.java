package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.dsl.ModuleDSLKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: compiled from: UserTypeEmptyModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getUserTypeEmptyModule", "()Lorg/koin/core/module/Module;", "userTypeEmptyModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class UserTypeEmptyModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33996a = ModuleDSLKt.module$default(false, a.f33997p0, 1, null);

    /* JADX INFO: compiled from: UserTypeEmptyModule.kt */
    @SourceDebugExtension({"SMAP\nUserTypeEmptyModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTypeEmptyModule.kt\ncom/bbva/glomohybrid/provider/module/UserTypeEmptyModuleKt$userTypeEmptyModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 ScopeDSL.kt\norg/koin/dsl/ScopeDSL\n+ 4 Module.kt\norg/koin/core/module/ModuleKt\n+ 5 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,20:1\n92#2,2:21\n94#2,2:42\n36#3:23\n37#3,2:40\n226#4:24\n227#4:39\n105#5,14:25\n*S KotlinDebug\n*F\n+ 1 UserTypeEmptyModule.kt\ncom/bbva/glomohybrid/provider/module/UserTypeEmptyModuleKt$userTypeEmptyModule$1\n*L\n12#1:21,2\n12#1:42,2\n13#1:23\n13#1:40,2\n13#1:24\n13#1:39\n13#1:25,14\n*E\n"})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33997p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(CellsWebActivity.class));
            ScopeDSL scopeDSL = new ScopeDSL(typeQualifier, module2);
            StringQualifier stringQualifierNamed = QualifierKt.named(CellsWebActivity.USERTYPE_ID);
            f7 f7Var = f7.f34053p0;
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UserTypeActivityDelegate.class), stringQualifierNamed, f7Var, Kind.Scoped, CollectionsKt__CollectionsKt.emptyList()));
            scopeDSL.getModule().indexPrimaryType(scopedInstanceFactory);
            new KoinDefinition(scopeDSL.getModule(), scopedInstanceFactory);
            module2.getScopes().add(typeQualifier);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getUserTypeEmptyModule() {
        return f33996a;
    }
}
