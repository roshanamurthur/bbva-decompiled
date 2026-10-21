package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentHostCallback<E> extends FragmentContainer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final Activity f21521p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final Context f21522q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final Handler f21523r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f21524s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final s f21525t0;

    public FragmentHostCallback(@NonNull Context context, @NonNull Handler handler, int i10) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i10);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Handler getHandler() {
        return this.f21523r0;
    }

    @Override // androidx.fragment.app.FragmentContainer
    @Nullable
    public View onFindViewById(int i10) {
        return null;
    }

    @Nullable
    public abstract E onGetHost();

    @NonNull
    public LayoutInflater onGetLayoutInflater() {
        return LayoutInflater.from(this.f21522q0);
    }

    public int onGetWindowAnimations() {
        return this.f21524s0;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    public boolean onShouldSaveFragmentState(@NonNull Fragment fragment) {
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(@NonNull String str) {
        return false;
    }

    public void onStartActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        onStartActivityFromFragment(fragment, intent, i10, null);
    }

    @Deprecated
    public void onStartIntentSenderFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.startIntentSenderForResult(this.f21521p0, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public FragmentHostCallback(@Nullable Activity activity, @NonNull Context context, @NonNull Handler handler, int i10) {
        this.f21525t0 = new s();
        this.f21521p0 = activity;
        this.f21522q0 = (Context) Preconditions.checkNotNull(context, "context == null");
        this.f21523r0 = (Handler) Preconditions.checkNotNull(handler, "handler == null");
        this.f21524s0 = i10;
    }

    public void onStartActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, @Nullable Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.f21522q0, intent, bundle);
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    @Deprecated
    public void onRequestPermissionsFromFragment(@NonNull Fragment fragment, @NonNull String[] strArr, int i10) {
    }

    public void onDump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }
}
