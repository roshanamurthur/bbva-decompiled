package org.koin.androidx.scope;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ScopeFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lorg/koin/androidx/scope/ScopeFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/android/scope/AndroidScopeComponent;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lorg/koin/core/scope/Scope;", "p0", "Lkotlin/Lazy;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "", "contentLayoutId", "<init>", "(I)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScopeFragment extends Fragment implements AndroidScopeComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy scope;

    public ScopeFragment() {
        this(0, 1, null);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return (Scope) this.scope.getValue();
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    public void onCloseScope() {
        AndroidScopeComponent.DefaultImpls.onCloseScope(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getScope() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public /* synthetic */ ScopeFragment(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public ScopeFragment(@LayoutRes int i10) {
        super(i10);
        this.scope = FragmentExtKt.fragmentScope(this);
    }
}
