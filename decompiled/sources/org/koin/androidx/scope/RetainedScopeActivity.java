package org.koin.androidx.scope;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: RetainedScopeActivity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lorg/koin/androidx/scope/RetainedScopeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/android/scope/AndroidScopeComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lorg/koin/core/scope/Scope;", "p0", "Lkotlin/Lazy;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "", "contentLayoutId", "<init>", "(I)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class RetainedScopeActivity extends AppCompatActivity implements AndroidScopeComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy scope;

    public RetainedScopeActivity() {
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getScope() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public /* synthetic */ RetainedScopeActivity(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public RetainedScopeActivity(@LayoutRes int i10) {
        super(i10);
        this.scope = ComponentActivityExtKt.activityRetainedScope(this);
    }
}
