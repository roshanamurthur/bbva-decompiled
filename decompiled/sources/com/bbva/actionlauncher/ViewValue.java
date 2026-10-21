package com.bbva.actionlauncher;

import ad.d;
import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActionLauncherValues.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/actionlauncher/ViewValue;", "", "()V", "File", "Uri", "Url", "Lcom/bbva/actionlauncher/ViewValue$File;", "Lcom/bbva/actionlauncher/ViewValue$Uri;", "Lcom/bbva/actionlauncher/ViewValue$Url;", "actionlauncher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ViewValue {

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/actionlauncher/ViewValue$File;", "Lcom/bbva/actionlauncher/ViewValue;", "", "component1", "component2", "", "component3", "mimeType", "base64", "flags", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "b", "getBase64", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFlags", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class File extends ViewValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String mimeType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String base64;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int flags;

        public /* synthetic */ File(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? 1 : i10);
        }

        public static /* synthetic */ File copy$default(File file, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = file.mimeType;
            }
            if ((i11 & 2) != 0) {
                str2 = file.base64;
            }
            if ((i11 & 4) != 0) {
                i10 = file.flags;
            }
            return file.copy(str, str2, i10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBase64() {
            return this.base64;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final File copy(@NotNull String mimeType, @NotNull String base64, int flags) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(base64, "base64");
            return new File(mimeType, base64, flags);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return Intrinsics.areEqual(this.mimeType, file.mimeType) && Intrinsics.areEqual(this.base64, file.base64) && this.flags == file.flags;
        }

        @NotNull
        public final String getBase64() {
            return this.base64;
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            return n1.c(this.base64, this.mimeType.hashCode() * 31, 31) + this.flags;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("File(mimeType=");
            sb2.append(this.mimeType);
            sb2.append(", base64=");
            sb2.append(this.base64);
            sb2.append(", flags=");
            return a.c(sb2, this.flags, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public File(@NotNull String mimeType, @NotNull String base64, int i10) {
            super(null);
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(base64, "base64");
            this.mimeType = mimeType;
            this.base64 = base64;
            this.flags = i10;
        }
    }

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/actionlauncher/ViewValue$Uri;", "Lcom/bbva/actionlauncher/ViewValue;", "", "component1", "component2", "", "component3", "mimetype", "uri", "flags", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getMimetype", "()Ljava/lang/String;", "b", "getUri", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFlags", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Uri extends ViewValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String mimetype;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String uri;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int flags;

        public /* synthetic */ Uri(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? 1 : i10);
        }

        public static /* synthetic */ Uri copy$default(Uri uri, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uri.mimetype;
            }
            if ((i11 & 2) != 0) {
                str2 = uri.uri;
            }
            if ((i11 & 4) != 0) {
                i10 = uri.flags;
            }
            return uri.copy(str, str2, i10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMimetype() {
            return this.mimetype;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final Uri copy(@NotNull String mimetype, @NotNull String uri, int flags) {
            Intrinsics.checkNotNullParameter(mimetype, "mimetype");
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Uri(mimetype, uri, flags);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uri)) {
                return false;
            }
            Uri uri = (Uri) other;
            return Intrinsics.areEqual(this.mimetype, uri.mimetype) && Intrinsics.areEqual(this.uri, uri.uri) && this.flags == uri.flags;
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getMimetype() {
            return this.mimetype;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return n1.c(this.uri, this.mimetype.hashCode() * 31, 31) + this.flags;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Uri(mimetype=");
            sb2.append(this.mimetype);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", flags=");
            return a.c(sb2, this.flags, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uri(@NotNull String mimetype, @NotNull String uri, int i10) {
            super(null);
            Intrinsics.checkNotNullParameter(mimetype, "mimetype");
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.mimetype = mimetype;
            this.uri = uri;
            this.flags = i10;
        }
    }

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/actionlauncher/ViewValue$Url;", "Lcom/bbva/actionlauncher/ViewValue;", "", "component1", "url", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Url extends ViewValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Url(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ Url copy$default(Url url, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = url.url;
            }
            return url.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Url copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Url(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Url) && Intrinsics.areEqual(this.url, ((Url) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Url(url="), this.url, ")");
        }
    }

    public ViewValue() {
    }

    public /* synthetic */ ViewValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
