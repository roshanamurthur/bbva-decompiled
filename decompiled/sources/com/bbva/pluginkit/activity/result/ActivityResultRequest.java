package com.bbva.pluginkit.activity.result;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0002! BM\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R#\u0010\u001d\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/bbva/pluginkit/activity/result/ActivityResultRequest;", "", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "extras", "", "c", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "d", "getAction", "action", "Ljava/lang/Class;", "Landroid/app/Activity;", "e", "Ljava/lang/Class;", "getTarget", "()Ljava/lang/Class;", "target", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", "Companion", "Builder", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class ActivityResultRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Uri uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bundle extras;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String action;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Class<? extends Activity> target;

    /* JADX INFO: compiled from: ActivityResultRequest.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR.\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/bbva/pluginkit/activity/result/ActivityResultRequest$Builder;", "", "Lcom/bbva/pluginkit/activity/result/ActivityResultRequest;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "uri", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "extras", "", "c", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "d", "getAction", "setAction", "action", "Ljava/lang/Class;", "Landroid/app/Activity;", "e", "Ljava/lang/Class;", "getTarget", "()Ljava/lang/Class;", "setTarget", "(Ljava/lang/Class;)V", "target", "<init>", "()V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Uri uri;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Bundle extras;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String type;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String action;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Class<? extends Activity> target;

        @NotNull
        public final ActivityResultRequest build() {
            return new ActivityResultRequest(this, null);
        }

        @Nullable
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Bundle getExtras() {
            return this.extras;
        }

        @Nullable
        public final Class<? extends Activity> getTarget() {
            return this.target;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final Uri getUri() {
            return this.uri;
        }

        public final void setAction(@Nullable String str) {
            this.action = str;
        }

        public final void setExtras(@Nullable Bundle bundle) {
            this.extras = bundle;
        }

        public final void setTarget(@Nullable Class<? extends Activity> cls) {
            this.target = cls;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setUri(@Nullable Uri uri) {
            this.uri = uri;
        }
    }

    /* JADX INFO: compiled from: ActivityResultRequest.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lcom/bbva/pluginkit/activity/result/ActivityResultRequest$Companion;", "", "()V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/pluginkit/activity/result/ActivityResultRequest;", "block", "Lkotlin/Function1;", "Lcom/bbva/pluginkit/activity/result/ActivityResultRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActivityResultRequest build(@NotNull Function1<? super Builder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public ActivityResultRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final Bundle getExtras() {
        return this.extras;
    }

    @Nullable
    public final Class<? extends Activity> getTarget() {
        return this.target;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Uri getUri() {
        return this.uri;
    }

    public ActivityResultRequest(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable String str, @Nullable String str2, @Nullable Class<? extends Activity> cls) {
        this.uri = uri;
        this.extras = bundle;
        this.type = str;
        this.action = str2;
        this.target = cls;
    }

    public /* synthetic */ ActivityResultRequest(Uri uri, Bundle bundle, String str, String str2, Class cls, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uri, (i10 & 2) != 0 ? null : bundle, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : cls);
    }

    public ActivityResultRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder.getUri(), builder.getExtras(), builder.getType(), builder.getAction(), builder.getTarget());
    }
}
