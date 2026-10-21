package org.koin.androidx.fragment.android;

import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentTransaction;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ActivityExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b\u001a\u0016\u0010\n\u001a\u00020\u000b*\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"replace", "Landroidx/fragment/app/FragmentTransaction;", "F", "Landroidx/fragment/app/Fragment;", "containerViewId", "", "args", "Landroid/os/Bundle;", LogKeysKt.TAG, "", "setupKoinFragmentFactory", "", "Landroidx/fragment/app/FragmentActivity;", "scope", "Lorg/koin/core/scope/Scope;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityExt.kt\norg/koin/androidx/fragment/android/ActivityExtKt\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,50:1\n52#2,5:51\n133#3:56\n*S KotlinDebug\n*F\n+ 1 ActivityExt.kt\norg/koin/androidx/fragment/android/ActivityExtKt\n*L\n31#1:51,5\n31#1:56\n*E\n"})
public final class ActivityExtKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i10, Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(fragmentTransaction, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(i10, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "replace(containerViewId, F::class.java, args, tag)");
        return fragmentTransactionReplace;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i10, Bundle bundle, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        Intrinsics.checkNotNullParameter(fragmentTransaction, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentTransaction fragmentTransactionReplace = fragmentTransaction.replace(i10, Fragment.class, bundle, str);
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "replace(containerViewId, F::class.java, args, tag)");
        return fragmentTransactionReplace;
    }

    public static final void setupKoinFragmentFactory(@NotNull FragmentActivity fragmentActivity, @Nullable Scope scope) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        if (scope == null) {
            fragmentActivity.getSupportFragmentManager().setFragmentFactory((FragmentFactory) AndroidKoinScopeExtKt.getKoinScope(fragmentActivity).get(Reflection.getOrCreateKotlinClass(FragmentFactory.class), null, null));
        } else {
            fragmentActivity.getSupportFragmentManager().setFragmentFactory(new KoinFragmentFactory(scope));
        }
    }

    public static /* synthetic */ void setupKoinFragmentFactory$default(FragmentActivity fragmentActivity, Scope scope, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            scope = null;
        }
        setupKoinFragmentFactory(fragmentActivity, scope);
    }
}
