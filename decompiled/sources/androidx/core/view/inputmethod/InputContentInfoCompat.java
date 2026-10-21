package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class InputContentInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20399a;

    public interface c {
        @Nullable
        Uri a();

        @Nullable
        Object b();

        @NonNull
        Uri c();

        void d();

        void e();

        @NonNull
        ClipDescription getDescription();
    }

    public InputContentInfoCompat(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f20399a = new a(uri, clipDescription, uri2);
        } else {
            this.f20399a = new b(uri, clipDescription, uri2);
        }
    }

    @Nullable
    public static InputContentInfoCompat wrap(@Nullable Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new InputContentInfoCompat(new a(obj));
        }
        return null;
    }

    @NonNull
    public Uri getContentUri() {
        return this.f20399a.c();
    }

    @NonNull
    public ClipDescription getDescription() {
        return this.f20399a.getDescription();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.f20399a.a();
    }

    public void releasePermission() {
        this.f20399a.e();
    }

    public void requestPermission() {
        this.f20399a.d();
    }

    @Nullable
    public Object unwrap() {
        return this.f20399a.b();
    }

    @RequiresApi(25)
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final InputContentInfo f20400a;

        public a(@NonNull Object obj) {
            this.f20400a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @Nullable
        public final Uri a() {
            return this.f20400a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @NonNull
        public final Object b() {
            return this.f20400a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @NonNull
        public final Uri c() {
            return this.f20400a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        public final void d() {
            this.f20400a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        public final void e() {
            this.f20400a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @NonNull
        public final ClipDescription getDescription() {
            return this.f20400a.getDescription();
        }

        public a(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f20400a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(@NonNull a aVar) {
        this.f20399a = aVar;
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Uri f20401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final ClipDescription f20402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Uri f20403c;

        public b(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f20401a = uri;
            this.f20402b = clipDescription;
            this.f20403c = uri2;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @Nullable
        public final Uri a() {
            return this.f20403c;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @Nullable
        public final Object b() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @NonNull
        public final Uri c() {
            return this.f20401a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        @NonNull
        public final ClipDescription getDescription() {
            return this.f20402b;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        public final void d() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.c
        public final void e() {
        }
    }
}
