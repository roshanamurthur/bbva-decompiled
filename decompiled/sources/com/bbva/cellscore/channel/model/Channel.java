package com.bbva.cellscore.channel.model;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.cellscore.pubsub.PubSubMessage;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.Subject;

/* JADX INFO: loaded from: classes2.dex */
public class Channel<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f26953p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BundleAdapter<T> f26954q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ObjectAdapter<T> f26955r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Subject<PubSubMessage> f26956s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final T f26957t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public SaveExecutor<T> f26958u0;
    public RestoreExecutor<T> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f26959w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f26960x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f26961y0;

    public interface BundleAdapter<T> {
        T transform(Bundle bundle);
    }

    public interface ObjectAdapter<T> {
        Object transform(T t10);
    }

    public interface RestoreExecutor<T> {
        T onRestore(Bundle bundle);
    }

    public interface SaveExecutor<T> {
        void onSave(Bundle bundle, T t10);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BEHAVIOR;
        public static final Type REPLAY;
        public static final Type SUBJECT;

        static {
            Type type = new Type("SUBJECT", 0);
            SUBJECT = type;
            Type type2 = new Type("REPLAY", 1);
            REPLAY = type2;
            Type type3 = new Type("BEHAVIOR", 2);
            BEHAVIOR = type3;
            $VALUES = new Type[]{type, type2, type3};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26962a;

        static {
            int[] iArr = new int[Type.values().length];
            f26962a = iArr;
            try {
                iArr[Type.SUBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26962a[Type.REPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Channel(Channel channel, String str) {
        this.f26953p0 = str;
        this.f26954q0 = channel.f26954q0;
        this.f26955r0 = channel.f26955r0;
        this.f26956s0 = a(Type.REPLAY);
        this.f26957t0 = channel.f26957t0;
        this.f26958u0 = channel.f26958u0;
        this.v0 = channel.v0;
        this.f26959w0 = channel.f26959w0;
        this.f26960x0 = channel.f26960x0;
    }

    public final Subject<PubSubMessage> a(Type type) {
        int i10 = a.f26962a[type.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? BehaviorSubject.createDefault(new PubSubMessage(this.f26953p0, this.f26957t0)) : ReplaySubject.createWithSize(1);
        }
        return PublishSubject.create();
    }

    public Channel<T> cloneWithName(String str) {
        return new Channel<>(this, str);
    }

    public T getDefaultValue() {
        return this.f26957t0;
    }

    public String getFeatureFlagFilter() {
        return this.f26961y0;
    }

    public String getName() {
        return this.f26953p0;
    }

    public RestoreExecutor<T> getRestoreValue() {
        return this.v0;
    }

    public SaveExecutor getSaveValue() {
        return this.f26958u0;
    }

    public Subject<PubSubMessage> getSubject() {
        return this.f26956s0;
    }

    public boolean isAutoClean() {
        return this.f26959w0;
    }

    public boolean isSaveOnDestroy() {
        return this.f26960x0;
    }

    public void setAutoClean(boolean z10) {
        this.f26959w0 = z10;
    }

    public void setBundleAdapter(BundleAdapter<T> bundleAdapter) {
        this.f26954q0 = bundleAdapter;
    }

    public void setFeatureFlagFilter(String str) {
        this.f26961y0 = str;
    }

    public void setMapAdapter(ObjectAdapter<T> objectAdapter) {
        this.f26955r0 = objectAdapter;
    }

    public void setRestoreExecutor(RestoreExecutor<T> restoreExecutor) {
        this.v0 = restoreExecutor;
    }

    public void setSaveExecutor(SaveExecutor<T> saveExecutor) {
        this.f26958u0 = saveExecutor;
    }

    public void setSaveOnDestroy(boolean z10) {
        this.f26960x0 = z10;
    }

    public String toString() {
        return "Channel:" + this.f26953p0 + " autoClean:" + this.f26959w0;
    }

    @Nullable
    public T transformContentToNativeObject(Bundle bundle) {
        BundleAdapter<T> bundleAdapter = this.f26954q0;
        if (bundleAdapter == null) {
            return null;
        }
        return bundleAdapter.transform(bundle);
    }

    @NonNull
    public Object transformContentToWebObject(T t10) {
        ObjectAdapter<T> objectAdapter = this.f26955r0;
        return objectAdapter == null ? t10 : objectAdapter.transform(t10);
    }

    public Channel(String str) {
        this.f26953p0 = str;
        this.f26956s0 = a(Type.REPLAY);
    }

    public Channel(String str, String str2) {
        this(str);
        this.f26961y0 = str2;
    }

    public Channel(String str, Type type) {
        this.f26953p0 = str;
        this.f26956s0 = a(type);
    }

    public Channel(String str, BundleAdapter<T> bundleAdapter, ObjectAdapter<T> objectAdapter, Type type, T t10) {
        this.f26953p0 = str;
        this.f26954q0 = bundleAdapter;
        this.f26955r0 = objectAdapter;
        this.f26956s0 = a(type);
        this.f26957t0 = t10;
    }
}
