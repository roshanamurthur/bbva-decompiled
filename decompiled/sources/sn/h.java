package sn;

import java.lang.annotation.Annotation;
import retrofit2.SkipCallbackExecutor;

/* JADX INFO: compiled from: SkipCallbackExecutorImpl.java */
/* JADX INFO: loaded from: classes13.dex */
public final class h implements SkipCallbackExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f93338a = new h();

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return androidx.datastore.preferences.protobuf.e.e(SkipCallbackExecutor.class, new StringBuilder("@"), "()");
    }
}
