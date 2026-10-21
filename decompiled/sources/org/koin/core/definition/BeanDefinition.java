package org.koin.core.definition;

import androidx.camera.core.processing.f;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: BeanDefinition.kt */
/* JADX INFO: loaded from: classes13.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bl\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012'\u0010 \u001a#\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u0017¢\u0006\u0002\b\u0018\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0012\b\u0002\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001c¢\u0006\u0004\bO\u0010PJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0012\u0010\n\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bJ$\u0010\u000e\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\r\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\bHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003J*\u0010\u0019\u001a#\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u0017¢\u0006\u0002\b\u0018HÆ\u0003J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\u0013\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001cHÆ\u0003J|\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\f\b\u0002\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2)\b\u0002\u0010 \u001a#\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010!\u001a\u00020\u001a2\u0012\b\u0002\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001cHÆ\u0001R\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'\"\u0004\b.\u0010/R8\u0010 \u001a#\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u0017¢\u0006\u0002\b\u00188\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010!\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R,\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010N\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bL\u0010M\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006Q"}, d2 = {"Lorg/koin/core/definition/BeanDefinition;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString", "other", "", "equals", "Lkotlin/reflect/KClass;", "clazz", "hasType", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "scopeDefinition", "is", "", GenerateActivationFormCommand.HASH_CODE, "component1", "component2", "component3", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "component4", "Lorg/koin/core/definition/Kind;", "component5", "", "component6", "scopeQualifier", "primaryType", "definition", "kind", "secondaryTypes", "copy", "a", "Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "b", "Lkotlin/reflect/KClass;", "getPrimaryType", "()Lkotlin/reflect/KClass;", "c", "getQualifier", "setQualifier", "(Lorg/koin/core/qualifier/Qualifier;)V", "d", "Lkotlin/jvm/functions/Function2;", "getDefinition", "()Lkotlin/jvm/functions/Function2;", "e", "Lorg/koin/core/definition/Kind;", "getKind", "()Lorg/koin/core/definition/Kind;", "f", "Ljava/util/List;", "getSecondaryTypes", "()Ljava/util/List;", "setSecondaryTypes", "(Ljava/util/List;)V", "Lorg/koin/core/definition/Callbacks;", "g", "Lorg/koin/core/definition/Callbacks;", "getCallbacks", "()Lorg/koin/core/definition/Callbacks;", "setCallbacks", "(Lorg/koin/core/definition/Callbacks;)V", "callbacks", "h", "Z", "get_createdAtStart", "()Z", "set_createdAtStart", "(Z)V", "get_createdAtStart$annotations", "()V", "_createdAtStart", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function2;Lorg/koin/core/definition/Kind;Ljava/util/List;)V", "koin-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBeanDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeanDefinition.kt\norg/koin/core/definition/BeanDefinition\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final /* data */ class BeanDefinition<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Qualifier scopeQualifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KClass<?> primaryType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Qualifier qualifier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<Scope, ParametersHolder, T> definition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Kind kind;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends KClass<?>> secondaryTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Callbacks<T> callbacks;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean _createdAtStart;

    /* JADX INFO: compiled from: BeanDefinition.kt */
    public static final class a extends Lambda implements Function1<KClass<?>, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f92332p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(KClass<?> kClass) {
            KClass<?> it = kClass;
            Intrinsics.checkNotNullParameter(it, "it");
            return KClassExtKt.getFullName(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeanDefinition(@NotNull Qualifier scopeQualifier, @NotNull KClass<?> primaryType, @Nullable Qualifier qualifier, @NotNull Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, @NotNull Kind kind, @NotNull List<? extends KClass<?>> secondaryTypes) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(primaryType, "primaryType");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        this.scopeQualifier = scopeQualifier;
        this.primaryType = primaryType;
        this.qualifier = qualifier;
        this.definition = definition;
        this.kind = kind;
        this.secondaryTypes = secondaryTypes;
        this.callbacks = new Callbacks<>(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeanDefinition copy$default(BeanDefinition beanDefinition, Qualifier qualifier, KClass kClass, Qualifier qualifier2, Function2 function2, Kind kind, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = beanDefinition.scopeQualifier;
        }
        if ((i10 & 2) != 0) {
            kClass = beanDefinition.primaryType;
        }
        KClass kClass2 = kClass;
        if ((i10 & 4) != 0) {
            qualifier2 = beanDefinition.qualifier;
        }
        Qualifier qualifier3 = qualifier2;
        if ((i10 & 8) != 0) {
            function2 = beanDefinition.definition;
        }
        Function2 function3 = function2;
        if ((i10 & 16) != 0) {
            kind = beanDefinition.kind;
        }
        Kind kind2 = kind;
        if ((i10 & 32) != 0) {
            list = beanDefinition.secondaryTypes;
        }
        return beanDefinition.copy(qualifier, kClass2, qualifier3, function3, kind2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    @NotNull
    public final KClass<?> component2() {
        return this.primaryType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    @NotNull
    public final Function2<Scope, ParametersHolder, T> component4() {
        return this.definition;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Kind getKind() {
        return this.kind;
    }

    @NotNull
    public final List<KClass<?>> component6() {
        return this.secondaryTypes;
    }

    @NotNull
    public final BeanDefinition<T> copy(@NotNull Qualifier scopeQualifier, @NotNull KClass<?> primaryType, @Nullable Qualifier qualifier, @NotNull Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, @NotNull Kind kind, @NotNull List<? extends KClass<?>> secondaryTypes) {
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(primaryType, "primaryType");
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(secondaryTypes, "secondaryTypes");
        return new BeanDefinition<>(scopeQualifier, primaryType, qualifier, definition, kind, secondaryTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        BeanDefinition beanDefinition = (BeanDefinition) other;
        return Intrinsics.areEqual(this.primaryType, beanDefinition.primaryType) && Intrinsics.areEqual(this.qualifier, beanDefinition.qualifier) && Intrinsics.areEqual(this.scopeQualifier, beanDefinition.scopeQualifier);
    }

    @NotNull
    public final Callbacks<T> getCallbacks() {
        return this.callbacks;
    }

    @NotNull
    public final Function2<Scope, ParametersHolder, T> getDefinition() {
        return this.definition;
    }

    @NotNull
    public final Kind getKind() {
        return this.kind;
    }

    @NotNull
    public final KClass<?> getPrimaryType() {
        return this.primaryType;
    }

    @Nullable
    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    @NotNull
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    @NotNull
    public final List<KClass<?>> getSecondaryTypes() {
        return this.secondaryTypes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public final boolean hasType(@NotNull KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return Intrinsics.areEqual(this.primaryType, clazz) || this.secondaryTypes.contains(clazz);
    }

    public int hashCode() {
        Qualifier qualifier = this.qualifier;
        return this.scopeQualifier.hashCode() + ((this.primaryType.hashCode() + ((qualifier != null ? qualifier.hashCode() : 0) * 31)) * 31);
    }

    public final boolean is(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @NotNull Qualifier scopeDefinition) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(scopeDefinition, "scopeDefinition");
        return hasType(clazz) && Intrinsics.areEqual(this.qualifier, qualifier) && Intrinsics.areEqual(this.scopeQualifier, scopeDefinition);
    }

    public final void setCallbacks(@NotNull Callbacks<T> callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "<set-?>");
        this.callbacks = callbacks;
    }

    public final void setQualifier(@Nullable Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    public final void setSecondaryTypes(@NotNull List<? extends KClass<?>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.secondaryTypes = list;
    }

    public final void set_createdAtStart(boolean z10) {
        this._createdAtStart = z10;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    @NotNull
    public String toString() {
        String str;
        String str2;
        String string = this.kind.toString();
        String str3 = "'" + KClassExtKt.getFullName(this.primaryType) + '\'';
        if (this.qualifier != null) {
            str = ",qualifier:" + this.qualifier;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Qualifier qualifier = this.scopeQualifier;
        if (Intrinsics.areEqual(qualifier, rootScopeQualifier)) {
            str2 = "";
        } else {
            str2 = ",scope:" + qualifier;
        }
        return Constant.BRACKET_OPEN + string + AbstractJsonLexerKt.COLON + str3 + str + str2 + (this.secondaryTypes.isEmpty() ^ true ? f.d(",binds:", CollectionsKt___CollectionsKt.joinToString$default(this.secondaryTypes, ",", null, null, 0, null, a.f92332p0, 30, null)) : "") + AbstractJsonLexerKt.END_LIST;
    }

    public /* synthetic */ BeanDefinition(Qualifier qualifier, KClass kClass, Qualifier qualifier2, Function2 function2, Kind kind, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier, kClass, (i10 & 4) != 0 ? null : qualifier2, function2, kind, (i10 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @PublishedApi
    public static /* synthetic */ void get_createdAtStart$annotations() {
    }
}
