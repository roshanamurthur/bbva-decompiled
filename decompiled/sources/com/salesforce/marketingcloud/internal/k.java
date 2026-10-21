package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.registration.Registration;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/salesforce/marketingcloud/internal/k;", "", "<init>", "()V", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.internal.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lcom/salesforce/marketingcloud/internal/k$a;", "", "Lorg/json/JSONObject;", "json", "Lcom/salesforce/marketingcloud/registration/Registration;", "a", com.salesforce.marketingcloud.storage.db.k.f65031e, "b", "", "id", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int a(@NotNull Registration registration) {
            Intrinsics.checkNotNullParameter(registration, "registration");
            return registration.getId();
        }

        @JvmStatic
        @NotNull
        public final JSONObject b(@NotNull Registration registration) {
            Intrinsics.checkNotNullParameter(registration, "registration");
            return registration.toJson$sdk_release();
        }

        @JvmStatic
        @NotNull
        public final Registration a(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new Registration(json);
        }

        @JvmStatic
        public final void a(@NotNull Registration registration, int id) {
            Intrinsics.checkNotNullParameter(registration, "registration");
            registration.setId$sdk_release(id);
        }
    }

    @JvmStatic
    public static final int a(@NotNull Registration registration) {
        return INSTANCE.a(registration);
    }

    @JvmStatic
    @NotNull
    public static final JSONObject b(@NotNull Registration registration) {
        return INSTANCE.b(registration);
    }

    @JvmStatic
    @NotNull
    public static final Registration a(@NotNull JSONObject jSONObject) {
        return INSTANCE.a(jSONObject);
    }

    @JvmStatic
    public static final void a(@NotNull Registration registration, int i10) {
        INSTANCE.a(registration, i10);
    }
}
