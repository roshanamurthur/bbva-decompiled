package com.bbva.actionlauncher;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActionLauncherValues.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/actionlauncher/UriValue;", "", "()V", "App", "Uri", "Lcom/bbva/actionlauncher/UriValue$App;", "Lcom/bbva/actionlauncher/UriValue$Uri;", "actionlauncher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class UriValue {

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/actionlauncher/UriValue$App;", "Lcom/bbva/actionlauncher/UriValue;", "", "component1", "packageId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class App extends UriValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String packageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public App(@NotNull String packageId) {
            super(null);
            Intrinsics.checkNotNullParameter(packageId, "packageId");
            this.packageId = packageId;
        }

        public static /* synthetic */ App copy$default(App app, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = app.packageId;
            }
            return app.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPackageId() {
            return this.packageId;
        }

        @NotNull
        public final App copy(@NotNull String packageId) {
            Intrinsics.checkNotNullParameter(packageId, "packageId");
            return new App(packageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof App) && Intrinsics.areEqual(this.packageId, ((App) other).packageId);
        }

        @NotNull
        public final String getPackageId() {
            return this.packageId;
        }

        public int hashCode() {
            return this.packageId.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("App(packageId="), this.packageId, ")");
        }
    }

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/actionlauncher/UriValue$Uri;", "Lcom/bbva/actionlauncher/UriValue;", "", "component1", "uri", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Uri extends UriValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uri(@NotNull String uri) {
            super(null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
        }

        public static /* synthetic */ Uri copy$default(Uri uri, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = uri.uri;
            }
            return uri.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        @NotNull
        public final Uri copy(@NotNull String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Uri(uri);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Uri) && Intrinsics.areEqual(this.uri, ((Uri) other).uri);
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Uri(uri="), this.uri, ")");
        }
    }

    public UriValue() {
    }

    public /* synthetic */ UriValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
