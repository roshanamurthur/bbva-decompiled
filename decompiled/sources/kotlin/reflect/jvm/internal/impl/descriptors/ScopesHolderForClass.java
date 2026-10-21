package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import uk.b;

/* JADX INFO: compiled from: ScopesHolderForClass.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassDescriptor f80227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<KotlinTypeRefiner, T> f80228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final KotlinTypeRefiner f80229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80226e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: ScopesHolderForClass.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T extends MemberScope> ScopesHolderForClass<T> create(@NotNull ClassDescriptor classDescriptor, @NotNull StorageManager storageManager, @NotNull KotlinTypeRefiner kotlinTypeRefinerForOwnerModule, @NotNull Function1<? super KotlinTypeRefiner, ? extends T> scopeFactory) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    /* JADX INFO: compiled from: ScopesHolderForClass.kt */
    public static final class a extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ScopesHolderForClass<T> f80231p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ KotlinTypeRefiner f80232q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScopesHolderForClass<T> scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
            super(0);
            this.f80231p0 = scopesHolderForClass;
            this.f80232q0 = kotlinTypeRefiner;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            return (T) this.f80231p0.f80228b.invoke(this.f80232q0);
        }
    }

    public ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this.f80227a = classDescriptor;
        this.f80228b = function1;
        this.f80229c = kotlinTypeRefiner;
        this.f80230d = storageManager.createLazyValue(new b(this));
    }

    @NotNull
    public final T getScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ClassDescriptor classDescriptor = this.f80227a;
        boolean zIsRefinementNeededForModule = kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(classDescriptor));
        NotNullLazyValue notNullLazyValue = this.f80230d;
        KProperty<Object>[] kPropertyArr = f80226e;
        if (!zIsRefinementNeededForModule) {
            return (T) StorageKt.getValue(notNullLazyValue, this, (KProperty<?>) kPropertyArr[0]);
        }
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) StorageKt.getValue(notNullLazyValue, this, (KProperty<?>) kPropertyArr[0]) : (T) kotlinTypeRefiner.getOrPutScopeForClass(classDescriptor, new a(this, kotlinTypeRefiner));
    }
}
