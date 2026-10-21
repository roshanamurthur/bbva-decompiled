package com.bbva.glomohybrid.base.router;

import ad.d;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/router/IntentExtra;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "Parcel", "StringExtra", "Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "Lcom/bbva/glomohybrid/base/router/IntentExtra$StringExtra;", "Base_release"}, k = 1, mv = {1, 9, 0})
public abstract class IntentExtra {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: compiled from: Route.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/base/router/IntentExtra$Parcel;", "Lcom/bbva/glomohybrid/base/router/IntentExtra;", "", "component1", "Landroid/os/Parcelable;", "component2", "key", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "c", "Landroid/os/Parcelable;", "getValue", "()Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;Landroid/os/Parcelable;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Parcel extends IntentExtra {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Parcelable value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parcel(@NotNull String key, @NotNull Parcelable value) {
            super(key, null);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        public static /* synthetic */ Parcel copy$default(Parcel parcel, String str, Parcelable parcelable, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = parcel.key;
            }
            if ((i10 & 2) != 0) {
                parcelable = parcel.value;
            }
            return parcel.copy(str, parcelable);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Parcelable getValue() {
            return this.value;
        }

        @NotNull
        public final Parcel copy(@NotNull String key, @NotNull Parcelable value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Parcel(key, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parcel)) {
                return false;
            }
            Parcel parcel = (Parcel) other;
            return Intrinsics.areEqual(this.key, parcel.key) && Intrinsics.areEqual(this.value, parcel.value);
        }

        @Override // com.bbva.glomohybrid.base.router.IntentExtra
        @NotNull
        public String getKey() {
            return this.key;
        }

        @NotNull
        public final Parcelable getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Parcel(key=" + this.key + ", value=" + this.value + ")";
        }
    }

    /* JADX INFO: compiled from: Route.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/base/router/IntentExtra$StringExtra;", "Lcom/bbva/glomohybrid/base/router/IntentExtra;", "", "component1", "component2", "key", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "c", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class StringExtra extends IntentExtra {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringExtra(@NotNull String key, @Nullable String str) {
            super(key, null);
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.value = str;
        }

        public static /* synthetic */ StringExtra copy$default(StringExtra stringExtra, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = stringExtra.key;
            }
            if ((i10 & 2) != 0) {
                str2 = stringExtra.value;
            }
            return stringExtra.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final StringExtra copy(@NotNull String key, @Nullable String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new StringExtra(key, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringExtra)) {
                return false;
            }
            StringExtra stringExtra = (StringExtra) other;
            return Intrinsics.areEqual(this.key, stringExtra.key) && Intrinsics.areEqual(this.value, stringExtra.value);
        }

        @Override // com.bbva.glomohybrid.base.router.IntentExtra
        @NotNull
        public String getKey() {
            return this.key;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            String str = this.value;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("StringExtra(key=");
            sb2.append(this.key);
            sb2.append(", value=");
            return d.f(sb2, this.value, ")");
        }
    }

    public IntentExtra(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.key = str;
    }

    @NotNull
    public String getKey() {
        return this.key;
    }
}
