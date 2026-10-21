package com.bbva.gp2.android.trustdevice.sdk.export.request;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreRegisterRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Country;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "Builder", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Country {

    @Nullable
    private String id;

    @Nullable
    private String name;

    /* JADX INFO: compiled from: PreRegisterRequest.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Country$Builder;", "", "()V", "id", "", "name", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/gp2/android/trustdevice/sdk/export/request/Country;", "sdk-bbva-payments-trustdevice_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @Nullable
        private String id;

        @Nullable
        private String name;

        @NotNull
        public final Country build() {
            return new Country(this.id, this.name);
        }

        @NotNull
        public final Builder id(@NotNull String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            return this;
        }
    }

    public Country(@Nullable String str, @Nullable String str2) {
        this.id = str;
        this.name = str2;
    }
}
