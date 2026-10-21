package com.bbva.glomohybrid.login.model.ui;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginHeaderImage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;", "", "()V", "Empty", "Resource", "Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage$Empty;", "Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage$Resource;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LoginHeaderImage {

    /* JADX INFO: compiled from: LoginHeaderImage.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage$Empty;", "Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Empty extends LoginHeaderImage {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        public Empty() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 57814776;
        }

        @NotNull
        public String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: compiled from: LoginHeaderImage.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage$Resource;", "Lcom/bbva/glomohybrid/login/model/ui/LoginHeaderImage;", "", "component1", "url", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Resource extends LoginHeaderImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String url;

        public Resource(@Nullable String str) {
            super(null);
            this.url = str;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = resource.url;
            }
            return resource.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Resource copy(@Nullable String url) {
            return new Resource(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Resource) && Intrinsics.areEqual(this.url, ((Resource) other).url);
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Resource(url="), this.url, ")");
        }
    }

    public LoginHeaderImage() {
    }

    public /* synthetic */ LoginHeaderImage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
