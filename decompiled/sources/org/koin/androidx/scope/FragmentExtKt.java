package org.koin.androidx.scope;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: FragmentExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0001\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b*\u00020\u0002\u001a\f\u0010\f\u001a\u0004\u0018\u00010\u0006*\u00020\u0002\u001a\u001e\u0010\r\u001a\u0002H\u000e\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u0001*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0004\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000f"}, d2 = {"scopeActivity", "Lorg/koin/androidx/scope/ScopeActivity;", "Landroidx/fragment/app/Fragment;", "getScopeActivity", "(Landroidx/fragment/app/Fragment;)Lorg/koin/androidx/scope/ScopeActivity;", "createFragmentScope", "Lorg/koin/core/scope/Scope;", "createScope", "source", "", "fragmentScope", "Lkotlin/Lazy;", "getScopeOrNull", "requireScopeActivity", ExifInterface.GPS_DIRECTION_TRUE, "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentExt.kt\norg/koin/androidx/scope/FragmentExtKt\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n*L\n1#1,57:1\n28#2:58\n46#2,2:59\n29#2:61\n*S KotlinDebug\n*F\n+ 1 FragmentExt.kt\norg/koin/androidx/scope/FragmentExtKt\n*L\n42#1:58\n42#1:59,2\n42#1:61\n*E\n"})
public final class FragmentExtKt {

    /* JADX INFO: compiled from: FragmentExt.kt */
    public static final class a extends Lambda implements Function0<Scope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f92141p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f92141p0 = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return FragmentExtKt.createFragmentScope(this.f92141p0);
        }
    }

    @NotNull
    public static final Scope createFragmentScope(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        if (!(fragment instanceof AndroidScopeComponent)) {
            throw new IllegalStateException("Fragment should implement AndroidScopeComponent".toString());
        }
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
        if (scopeOrNull == null) {
            scopeOrNull = ComponentActivityExtKt.createScopeForCurrentLifecycle(fragment, fragment);
        }
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        Scope scopeOrNull2 = ComponentActivityExtKt.getScopeOrNull(fragmentActivityRequireActivity);
        if (scopeOrNull2 != null) {
            scopeOrNull.linkTo(scopeOrNull2);
        } else {
            Logger logger = scopeOrNull.getLogger();
            String strC = androidx.collection.a.c("Fragment '", fragment, "' can't be linked to parent activity scope");
            Level level = Level.DEBUG;
            if (logger.isAt(level)) {
                logger.display(level, strC);
            }
        }
        return scopeOrNull;
    }

    @Deprecated(message = "Unused Internal API")
    @NotNull
    public static final Scope createScope(@NotNull Fragment fragment, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return ComponentCallbackExtKt.getKoin(fragment).createScope(KoinScopeComponentKt.getScopeId(fragment), KoinScopeComponentKt.getScopeName(fragment), obj);
    }

    public static /* synthetic */ Scope createScope$default(Fragment fragment, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return createScope(fragment, obj);
    }

    @NotNull
    public static final Lazy<Scope> fragmentScope(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return LazyKt__LazyJVMKt.lazy(new a(fragment));
    }

    @Nullable
    public static final ScopeActivity getScopeActivity(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity instanceof ScopeActivity) {
            return (ScopeActivity) activity;
        }
        return null;
    }

    @Nullable
    public static final Scope getScopeOrNull(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
    }

    public static final /* synthetic */ <T extends ScopeActivity> T requireScopeActivity(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        T t10 = (T) activity;
        if (t10 != null) {
            return t10;
        }
        StringBuilder sb2 = new StringBuilder("can't get ScopeActivity for class ");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(Reflection.getOrCreateKotlinClass(ScopeActivity.class));
        throw new IllegalStateException(sb2.toString().toString());
    }
}
