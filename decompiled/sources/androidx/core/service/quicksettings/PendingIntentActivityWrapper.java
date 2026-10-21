package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.PendingIntentCompat;

/* JADX INFO: loaded from: classes2.dex */
public class PendingIntentActivityWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Intent f20071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Bundle f20073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final PendingIntent f20074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20075g;

    public PendingIntentActivityWrapper(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        this(context, i10, intent, i11, null, z10);
    }

    @NonNull
    public Context getContext() {
        return this.f20069a;
    }

    public int getFlags() {
        return this.f20072d;
    }

    @NonNull
    public Intent getIntent() {
        return this.f20071c;
    }

    @NonNull
    public Bundle getOptions() {
        return this.f20073e;
    }

    @Nullable
    public PendingIntent getPendingIntent() {
        return this.f20074f;
    }

    public int getRequestCode() {
        return this.f20070b;
    }

    public boolean isMutable() {
        return this.f20075g;
    }

    public PendingIntentActivityWrapper(@NonNull Context context, int i10, @NonNull Intent intent, int i11, @Nullable Bundle bundle, boolean z10) {
        this.f20069a = context;
        this.f20070b = i10;
        this.f20071c = intent;
        this.f20072d = i11;
        this.f20073e = bundle;
        this.f20075g = z10;
        this.f20074f = bundle == null ? PendingIntentCompat.getActivity(context, i10, intent, i11, z10) : PendingIntentCompat.getActivity(context, i10, intent, i11, bundle, z10);
    }
}
