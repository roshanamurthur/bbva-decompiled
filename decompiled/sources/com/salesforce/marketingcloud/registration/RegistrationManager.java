package com.salesforce.marketingcloud.registration;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import com.salesforce.marketingcloud.MCKeep;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public interface RegistrationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64864a = com.salesforce.marketingcloud.g.a("RegistrationManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64865b = "Android";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64866c = 128;

    @MCKeep
    public interface Editor {
        @NonNull
        Editor addTag(@NonNull String str);

        @NonNull
        Editor addTags(@NonNull Iterable<String> iterable);

        @NonNull
        Editor addTags(@NonNull String... strArr);

        @NonNull
        Editor clearAttribute(@NonNull String str);

        @NonNull
        Editor clearAttributes(@NonNull Iterable<String> iterable);

        @NonNull
        Editor clearAttributes(@NonNull String... strArr);

        @NonNull
        Editor clearTags();

        boolean commit();

        @NonNull
        Editor removeTag(@NonNull String str);

        @NonNull
        Editor removeTags(@NonNull Iterable<String> iterable);

        @NonNull
        Editor removeTags(@NonNull String... strArr);

        @NonNull
        Editor setAttribute(@NonNull @Size(max = 128, min = 1) String str, @NonNull String str2);

        @NonNull
        Editor setContactKey(@NonNull @Size(min = 1) String str);

        @NonNull
        Editor setSignedString(@Nullable @Size(min = 1) String str);
    }

    @MCKeep
    public interface RegistrationEventListener {
        void onRegistrationReceived(@NonNull Registration registration);
    }

    @NonNull
    @MCKeep
    Editor edit();

    @NonNull
    @MCKeep
    Map<String, String> getAttributes();

    @Nullable
    @MCKeep
    String getContactKey();

    @NonNull
    @MCKeep
    String getDeviceId();

    @Nullable
    @MCKeep
    String getSignedString();

    @Nullable
    @MCKeep
    String getSystemToken();

    @NonNull
    @MCKeep
    Set<String> getTags();

    @MCKeep
    void registerForRegistrationEvents(@NonNull RegistrationEventListener registrationEventListener);

    @MCKeep
    void unregisterForRegistrationEvents(@NonNull RegistrationEventListener registrationEventListener);
}
