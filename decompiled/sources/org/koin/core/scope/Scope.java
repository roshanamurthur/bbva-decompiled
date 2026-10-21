package org.koin.core.scope;

import ad.d;
import androidx.camera.camera2.internal.h0;
import androidx.camera.camera2.internal.n1;
import androidx.exifinterface.media.ExifInterface;
import bk.g;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTimeTools;
import org.koin.mp.KoinPlatformTools;
import qn.b;
import qn.c;

/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes13.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010A\u001a\u00020\u0011\u0012\n\u0010B\u001a\u00060+j\u0002`,\u0012\b\b\u0002\u0010C\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020)¢\u0006\u0004\bn\u0010oJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u000b\"\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00072\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u000b\"\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u000eJL\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\n\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0086\bø\u0001\u0000JN\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0019\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\n\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0086\bø\u0001\u0000JC\u0010\u001c\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\n\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010 \u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\n\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010\u001dJE\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b \u0010#JC\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u001c\u0010#JJ\u0010'\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u00012\u0006\u0010$\u001a\u00028\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\b\u0002\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0\u00052\b\b\u0002\u0010&\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b'\u0010(J\u0006\u0010*\u001a\u00020)J\u0012\u0010.\u001a\u00020\u00002\n\u0010-\u001a\u00060+j\u0002`,J\u000e\u00101\u001a\u00020\u00072\u0006\u00100\u001a\u00020/J\u001b\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0001H\u0086\bJ\u001e\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00102\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!J'\u00105\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u00028\u0000¢\u0006\u0004\b5\u00106J!\u00107\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u00103\u001a\u00020+¢\u0006\u0004\b7\u00108J\u001f\u00105\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u00012\u0006\u00103\u001a\u00020+¢\u0006\u0004\b5\u00108J\u0006\u00109\u001a\u00020\u0007J\b\u0010:\u001a\u00020+H\u0016J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\r\u0010<\u001a\u00060+j\u0002`,HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0010\u0010@\u001a\u00020)HÀ\u0003¢\u0006\u0004\b>\u0010?J5\u0010E\u001a\u00020\u00002\b\b\u0002\u0010A\u001a\u00020\u00112\f\b\u0002\u0010B\u001a\u00060+j\u0002`,2\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020)HÆ\u0001J\t\u0010G\u001a\u00020FHÖ\u0001J\u0013\u0010I\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010A\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010B\u001a\u00060+j\u0002`,8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010C\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bC\u0010TR \u0010D\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bW\u0010?R*\u0010`\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b_\u0010Y\u001a\u0004\b\\\u0010\u001f\"\u0004\b]\u0010^R&\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00160a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\bf\u0010Y\u001a\u0004\bd\u0010eR\u0011\u0010i\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bh\u0010TR\u0011\u0010m\u001a\u00020j8F¢\u0006\u0006\u001a\u0004\bk\u0010l\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006p"}, d2 = {"Lorg/koin/core/scope/Scope;", "", "Lorg/koin/mp/Lockable;", "", "isNotClosed", "", "links", "", "create$koin_core", "(Ljava/util/List;)V", "create", "", "scopes", "linkTo", "([Lorg/koin/core/scope/Scope;)V", "unlink", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/LazyThreadSafetyMode;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "inject", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getSource", "()Ljava/lang/Object;", "getOrNull", "Lkotlin/reflect/KClass;", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "instance", "secondaryTypes", "allowOverride", "declare", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "Lorg/koin/core/Koin;", "getKoin", "", "Lorg/koin/core/scope/ScopeID;", "scopeID", "getScope", "Lorg/koin/core/scope/ScopeCallback;", "callback", "registerCallback", "getAll", "key", "defaultValue", "getProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getPropertyOrNull", "(Ljava/lang/String;)Ljava/lang/Object;", HearingDisabilitiesConstants.CLOSE_MODAL, "toString", "component1", "component2", "component3", "component4$koin_core", "()Lorg/koin/core/Koin;", "component4", "scopeQualifier", "id", "isRoot", "_koin", "copy", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "c", "Z", "()Z", "d", "Lorg/koin/core/Koin;", "get_koin", "get_koin$annotations", "()V", "f", "Ljava/lang/Object;", "get_source", "set_source", "(Ljava/lang/Object;)V", "get_source$annotations", "_source", "Lkotlin/collections/ArrayDeque;", "h", "Lkotlin/collections/ArrayDeque;", "get_parameterStack", "()Lkotlin/collections/ArrayDeque;", "get_parameterStack$annotations", "_parameterStack", "getClosed", "closed", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "logger", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Ljava/lang/String;ZLorg/koin/core/Koin;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n28#2:404\n46#2,2:405\n29#2:407\n28#2:408\n46#2,2:409\n29#2:411\n50#2,2:413\n28#2:415\n46#2,2:416\n29#2:418\n28#2:419\n46#2,2:420\n29#2:422\n28#2:423\n46#2,2:424\n29#2:426\n28#2:427\n46#2,2:428\n29#2:430\n28#2:431\n46#2,2:432\n29#2:434\n1#3:412\n1360#4:435\n1446#4,5:436\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope\n*L\n177#1:404\n177#1:405,2\n177#1:407\n180#1:408\n180#1:409,2\n180#1:411\n225#1:413,2\n233#1:415\n233#1:416,2\n233#1:418\n248#1:419\n248#1:420,2\n248#1:422\n252#1:423\n252#1:424,2\n252#1:426\n260#1:427\n260#1:428,2\n260#1:430\n267#1:431\n267#1:432,2\n267#1:434\n362#1:435\n362#1:436,5\n*E\n"})
public final /* data */ class Scope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Qualifier scopeQualifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isRoot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Koin _koin;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList<Scope> f92469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object _source;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList<ScopeCallback> f92471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayDeque<ParametersHolder> _parameterStack;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f92473i;

    /* JADX INFO: compiled from: Scope.kt */
    @SourceDebugExtension({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$close$1\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n28#2:404\n46#2,2:405\n29#2:407\n1855#3,2:408\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$close$1\n*L\n389#1:404\n389#1:405,2\n389#1:407\n390#1:408,2\n*E\n"})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Scope scope = Scope.this;
            Logger logger = scope.get_koin().getLogger();
            String str = "|- (-) Scope - id:'" + scope.getId() + '\'';
            Level level = Level.DEBUG;
            if (logger.isAt(level)) {
                logger.display(level, str);
            }
            Iterator it = scope.f92471g.iterator();
            while (it.hasNext()) {
                ((ScopeCallback) it.next()).onScopeClose(scope);
            }
            scope.f92471g.clear();
            scope.set_source(null);
            scope.f92473i = true;
            scope.get_koin().getScopeRegistry().deleteScope$koin_core(scope);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: org.koin.core.scope.Scope$declare$1, reason: invalid class name */
    /* JADX INFO: compiled from: Scope.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$declare$1\n+ 2 InstanceRegistry.kt\norg/koin/core/registry/InstanceRegistry\n+ 3 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n128#2:404\n129#2,8:412\n137#2,3:421\n142#2:425\n112#3,7:405\n1855#4:420\n1856#4:424\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$declare$1\n*L\n319#1:404\n319#1:412,8\n319#1:421,3\n319#1:425\n319#1:405,7\n319#1:420\n319#1:424\n*E\n"})
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f92476q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92477r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ List<KClass<?>> f92478s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f92479t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(T t10, Qualifier qualifier, List<? extends KClass<?>> list, boolean z10) {
            super(0);
            this.f92476q0 = t10;
            this.f92477r0 = qualifier;
            this.f92478s0 = list;
            this.f92479t0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Scope scope = Scope.this;
            InstanceRegistry instanceRegistry = scope.get_koin().getInstanceRegistry();
            Qualifier qualifier = this.f92477r0;
            List<KClass<?>> list = this.f92478s0;
            boolean z10 = this.f92479t0;
            Qualifier scopeQualifier = scope.getScopeQualifier();
            String id = scope.getId();
            Kind kind = Kind.Scoped;
            Intrinsics.needClassReification();
            final Object obj = this.f92476q0;
            Function2<Scope, ParametersHolder, T> function2 = new Function2<Scope, ParametersHolder, T>() { // from class: org.koin.core.scope.Scope$declare$1$invoke$$inlined$declareScopedInstance$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final T invoke(@NotNull Scope _createDefinition, @NotNull ParametersHolder it) {
                    Intrinsics.checkNotNullParameter(_createDefinition, "$this$_createDefinition");
                    Intrinsics.checkNotNullParameter(it, "it");
                    return (T) obj;
                }
            };
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, list);
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier());
            InstanceFactory<?> instanceFactory = instanceRegistry.getInstances().get(strIndexKey);
            ScopedInstanceFactory scopedInstanceFactory = instanceFactory instanceof ScopedInstanceFactory ? (ScopedInstanceFactory) instanceFactory : null;
            if (scopedInstanceFactory != null) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                scopedInstanceFactory.refreshInstance(id, obj);
                return;
            }
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition);
            InstanceRegistry.saveMapping$default(instanceRegistry, z10, strIndexKey, scopedInstanceFactory2, false, 8, null);
            Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
            while (it.hasNext()) {
                InstanceRegistry.saveMapping$default(instanceRegistry, z10, BeanDefinitionKt.indexKey((KClass) it.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory2, false, 8, null);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$inject$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Scope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,403:1\n133#2:404\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n*L\n106#1:404\n*E\n"})
    public static final class C07881<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92482q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92483r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07881(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f92482q0 = qualifier;
            this.f92483r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) Scope.this.get(Reflection.getOrCreateKotlinClass(Object.class), this.f92482q0, this.f92483r0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.scope.Scope$injectOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Scope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$injectOrNull$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,403:1\n158#2:404\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$injectOrNull$1\n*L\n121#1:404\n*E\n"})
    public static final class C07891<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f92485q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f92486r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07891(Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f92485q0 = qualifier;
            this.f92486r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) Scope.this.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), this.f92485q0, this.f92486r0);
        }
    }

    public /* synthetic */ Scope(Qualifier qualifier, String str, boolean z10, Koin koin, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier, str, (i10 & 4) != 0 ? false : z10, koin);
    }

    public static /* synthetic */ Scope copy$default(Scope scope, Qualifier qualifier, String str, boolean z10, Koin koin, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = scope.scopeQualifier;
        }
        if ((i10 & 2) != 0) {
            str = scope.id;
        }
        if ((i10 & 4) != 0) {
            z10 = scope.isRoot;
        }
        if ((i10 & 8) != 0) {
            koin = scope._koin;
        }
        return scope.copy(qualifier, str, z10, koin);
    }

    public static /* synthetic */ void declare$default(Scope scope, Object obj, Qualifier qualifier, List list, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        if ((i10 & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List secondaryTypes = list;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m6249synchronized(scope, scope.new AnonymousClass1(obj, qualifier2, secondaryTypes, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static /* synthetic */ Lazy inject$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) scope.new C07881(qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Scope scope, Qualifier qualifier, LazyThreadSafetyMode mode, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            mode = LazyThreadSafetyMode.SYNCHRONIZED;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) scope.new C07891(qualifier, function0));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    public final Object a(KClass kClass, Qualifier qualifier, Function0 function0) throws ClosedScopeException, NoBeanDefFoundException {
        String str;
        if (this.f92473i) {
            throw new ClosedScopeException(d.f(new StringBuilder("Scope '"), this.id, "' is closed"));
        }
        Object orNull = null;
        ParametersHolder parametersHolder = function0 != null ? (ParametersHolder) function0.invoke() : null;
        Koin koin = this._koin;
        if (parametersHolder != null) {
            Logger logger = koin.getLogger();
            Level level = Level.DEBUG;
            if (logger.isAt(level)) {
                logger.display(level, "| >> parameters " + parametersHolder + ' ');
            }
            KoinPlatformTools.INSTANCE.m6249synchronized(this, new qn.a(this, parametersHolder));
        }
        Object objResolveInstance$koin_core = koin.getInstanceRegistry().resolveInstance$koin_core(qualifier, kClass, this.scopeQualifier, new InstanceContext(koin.getLogger(), this, parametersHolder));
        if (objResolveInstance$koin_core == null) {
            Logger logger2 = koin.getLogger();
            String str2 = "|- ? t:'" + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' look in injected parameters";
            Level level2 = Level.DEBUG;
            if (logger2.isAt(level2)) {
                logger2.display(level2, str2);
            }
            ParametersHolder parametersHolderFirstOrNull = this._parameterStack.firstOrNull();
            objResolveInstance$koin_core = parametersHolderFirstOrNull != null ? parametersHolderFirstOrNull.getOrNull(kClass) : null;
            if (objResolveInstance$koin_core == null) {
                Logger logger3 = koin.getLogger();
                String str3 = "|- ? t:'" + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' look at scope source";
                if (logger3.isAt(level2)) {
                    logger3.display(level2, str3);
                }
                Object obj = this._source;
                if (obj == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(obj.getClass()), kClass) || qualifier != null || (objResolveInstance$koin_core = this._source) == null) {
                    objResolveInstance$koin_core = null;
                }
                if (objResolveInstance$koin_core == null) {
                    Logger logger4 = koin.getLogger();
                    String str4 = "|- ? t:'" + KClassExtKt.getFullName(kClass) + "' - q:'" + qualifier + "' look in other scopes";
                    if (logger4.isAt(level2)) {
                        logger4.display(level2, str4);
                    }
                    Iterator<Scope> it = this.f92469e.iterator();
                    while (it.hasNext() && (orNull = it.next().getOrNull(kClass, qualifier, function0)) == null) {
                    }
                    objResolveInstance$koin_core = orNull;
                    if (objResolveInstance$koin_core == null) {
                        KoinPlatformTools.INSTANCE.m6249synchronized(this, new c(this));
                        Logger logger5 = koin.getLogger();
                        Level level3 = Level.DEBUG;
                        if (logger5.isAt(level3)) {
                            logger5.display(level3, "|- << parameters");
                        }
                        if (qualifier != null) {
                            str = " & qualifier:'" + qualifier + '\'';
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        throw new NoBeanDefFoundException("No definition found for class:'" + KClassExtKt.getFullName(kClass) + "' q:'" + str + "'. Check your definitions!");
                    }
                }
            }
        }
        if (parametersHolder != null) {
            Logger logger6 = koin.getLogger();
            Level level4 = Level.DEBUG;
            if (logger6.isAt(level4)) {
                logger6.display(level4, "| << parameters");
            }
            KoinPlatformTools.INSTANCE.m6249synchronized(this, new b(this));
        }
        return objResolveInstance$koin_core;
    }

    public final void close() {
        KoinPlatformTools.INSTANCE.m6249synchronized(this, new a());
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @NotNull
    /* JADX INFO: renamed from: component4$koin_core, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    @NotNull
    public final Scope copy(@NotNull Qualifier scopeQualifier, @NotNull String id, boolean isRoot, @NotNull Koin _koin) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        return new Scope(scopeQualifier, id, isRoot, _koin);
    }

    public final void create$koin_core(@NotNull List<Scope> links) {
        Intrinsics.checkNotNullParameter(links, "links");
        this.f92469e.addAll(links);
    }

    public final /* synthetic */ <T> void declare(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride) {
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m6249synchronized(this, new AnonymousClass1(instance, qualifier, secondaryTypes, allowOverride));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) other;
        return Intrinsics.areEqual(this.scopeQualifier, scope.scopeQualifier) && Intrinsics.areEqual(this.id, scope.id) && this.isRoot == scope.isRoot && Intrinsics.areEqual(this._koin, scope._koin);
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    public final /* synthetic */ <T> List<T> getAll() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    /* JADX INFO: renamed from: getClosed, reason: from getter */
    public final boolean getF92473i() {
        return this.f92473i;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Koin getKoin() {
        return this._koin;
    }

    @NotNull
    public final Logger getLogger() {
        return this._koin.getLogger();
    }

    public final /* synthetic */ <T> T getOrNull(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    @NotNull
    public final <T> T getProperty(@NotNull String key, @NotNull T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (T) this._koin.getProperty(key, defaultValue);
    }

    @Nullable
    public final <T> T getPropertyOrNull(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this._koin.getProperty(key);
    }

    @NotNull
    public final Scope getScope(@NotNull String scopeID) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        return getKoin().getScope(scopeID);
    }

    @NotNull
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    @Deprecated(message = "No need to use getSource(). You can an use get() directly.", replaceWith = @ReplaceWith(expression = "get()", imports = {}))
    public final /* synthetic */ <T> T getSource() {
        T t10 = (T) get_source();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t10;
    }

    @NotNull
    public final Koin get_koin() {
        return this._koin;
    }

    @NotNull
    public final ArrayDeque<ParametersHolder> get_parameterStack() {
        return this._parameterStack;
    }

    @Nullable
    public final Object get_source() {
        return this._source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iC = n1.c(this.id, this.scopeQualifier.hashCode() * 31, 31);
        boolean z10 = this.isRoot;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return this._koin.hashCode() + ((iC + r3) * 31);
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new C07881(qualifier, parameters));
    }

    public final /* synthetic */ <T> Lazy<T> injectOrNull(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new C07891(qualifier, parameters));
    }

    public final boolean isNotClosed() {
        return !getF92473i();
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final void linkTo(@NotNull Scope... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (this.isRoot) {
            throw new IllegalStateException("Can't add scope link to a root scope".toString());
        }
        g.addAll(this.f92469e, scopes);
    }

    public final void registerCallback(@NotNull ScopeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f92471g.add(callback);
    }

    public final void set_source(@Nullable Object obj) {
        this._source = obj;
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("['"), this.id, "']");
    }

    public final void unlink(@NotNull Scope... scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (this.isRoot) {
            throw new IllegalStateException("Can't remove scope link to a root scope".toString());
        }
        g.removeAll(this.f92469e, scopes);
    }

    public Scope(@NotNull Qualifier scopeQualifier, @NotNull String id, boolean z10, @NotNull Koin _koin) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.scopeQualifier = scopeQualifier;
        this.id = id;
        this.isRoot = z10;
        this._koin = _koin;
        this.f92469e = new ArrayList<>();
        this.f92471g = new ArrayList<>();
        this._parameterStack = new ArrayDeque<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return scope.get(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Scope scope, KClass kClass, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        return scope.getOrNull(kClass, qualifier, function0);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    public final <T> T get(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        String str;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Koin koin = this._koin;
        Logger logger = koin.getLogger();
        Level level = Level.DEBUG;
        if (!logger.isAt(level)) {
            return (T) a(clazz, qualifier, parameters);
        }
        if (qualifier != null) {
            str = " with qualifier '" + qualifier + '\'';
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        koin.getLogger().display(level, "|- '" + KClassExtKt.getFullName(clazz) + '\'' + str + " ...");
        KoinPlatformTimeTools koinPlatformTimeTools = KoinPlatformTimeTools.INSTANCE;
        long timeInNanoSeconds = koinPlatformTimeTools.getTimeInNanoSeconds();
        T t10 = (T) a(clazz, qualifier, parameters);
        double timeInNanoSeconds2 = ((double) (koinPlatformTimeTools.getTimeInNanoSeconds() - timeInNanoSeconds)) / 1000000.0d;
        koin.getLogger().display(level, "|- '" + KClassExtKt.getFullName(clazz) + "' in " + timeInNanoSeconds2 + " ms");
        return t10;
    }

    @NotNull
    public final <T> List<T> getAll(@NotNull KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Koin koin = this._koin;
        List<T> all$koin_core = koin.getInstanceRegistry().getAll$koin_core(clazz, new InstanceContext(koin.getLogger(), this, null, 4, null));
        ArrayList<Scope> arrayList = this.f92469e;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            g.addAll(arrayList2, ((Scope) it.next()).getAll(clazz));
        }
        return CollectionsKt___CollectionsKt.plus((Collection) all$koin_core, (Iterable) arrayList2);
    }

    @Nullable
    public final <T> T getOrNull(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        Koin koin = this._koin;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            return (T) get(clazz, qualifier, parameters);
        } catch (ClosedScopeException unused) {
            Logger logger = koin.getLogger();
            String str = "* Scope closed - no instance found for " + KClassExtKt.getFullName(clazz) + " on scope " + this;
            Level level = Level.DEBUG;
            if (!logger.isAt(level)) {
                return null;
            }
            logger.display(level, str);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            Logger logger2 = koin.getLogger();
            String str2 = "* No instance found for " + KClassExtKt.getFullName(clazz) + " on scope " + this;
            Level level2 = Level.DEBUG;
            if (!logger2.isAt(level2)) {
                return null;
            }
            logger2.display(level2, str2);
            return null;
        }
    }

    @NotNull
    public final <T> T getProperty(@NotNull String key) throws MissingPropertyException {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this._koin.getProperty(key);
        if (t10 != null) {
            return t10;
        }
        throw new MissingPropertyException(h0.b("Property '", key, "' not found"));
    }

    @PublishedApi
    public static /* synthetic */ void get_koin$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void get_parameterStack$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void get_source$annotations() {
    }
}
