package com.bbva.component.dm.settings.domain.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/SmartAssistanceCredentials;", "", "", "component1", "androidValue", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAndroidValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SmartAssistanceCredentials {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String androidValue;

    public SmartAssistanceCredentials(@Nullable String str) {
        this.androidValue = str;
    }

    public static /* synthetic */ SmartAssistanceCredentials copy$default(SmartAssistanceCredentials smartAssistanceCredentials, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = smartAssistanceCredentials.androidValue;
        }
        return smartAssistanceCredentials.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAndroidValue() {
        return this.androidValue;
    }

    @NotNull
    public final SmartAssistanceCredentials copy(@Nullable String androidValue) {
        return new SmartAssistanceCredentials(androidValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SmartAssistanceCredentials) && Intrinsics.areEqual(this.androidValue, ((SmartAssistanceCredentials) other).androidValue);
    }

    @Nullable
    public final String getAndroidValue() {
        return this.androidValue;
    }

    public int hashCode() {
        String str = this.androidValue;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("SmartAssistanceCredentials(androidValue="), this.androidValue, ")");
    }
}
