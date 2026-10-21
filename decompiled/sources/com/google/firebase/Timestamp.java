package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.noknok.android.client.utils.UIConfigTags;
import dk.e;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Timestamp.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001'B\u0019\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0016\u0012\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b!\u0010$B\u0011\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b!\u0010&J\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "Ljava/util/Date;", "toDate", "Ljava/time/Instant;", "toInstant", "other", "", "compareTo", "", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "", "p0", "J", "getSeconds", "()J", UIConfigTags.TAG_SECONDS, "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNanoseconds", "()I", "nanoseconds", "<init>", "(JI)V", "date", "(Ljava/util/Date;)V", "time", "(Ljava/time/Instant;)V", "Companion", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final long seconds;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int nanoseconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp[] newArray(int size) {
            return new Timestamp[size];
        }
    };

    /* JADX INFO: compiled from: Timestamp.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "Lcom/google/firebase/Timestamp;", "now", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Pair access$toPreciseTime(Companion companion, Date date) {
            companion.getClass();
            long j10 = 1000;
            long time = date.getTime() / j10;
            int time2 = (int) ((date.getTime() % j10) * ((long) DurationKt.NANOS_IN_MILLIS));
            return time2 < 0 ? TuplesKt.to(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : TuplesKt.to(Long.valueOf(time), Integer.valueOf(time2));
        }

        public static final void access$validateRange(Companion companion, long j10, int i10) {
            companion.getClass();
            if (i10 < 0 || i10 >= 1000000000) {
                throw new IllegalArgumentException(g0.c("Timestamp nanoseconds out of range: ", i10).toString());
            }
            if (-62135596800L > j10 || j10 >= 253402300800L) {
                throw new IllegalArgumentException(v.c("Timestamp seconds out of range: ", j10).toString());
            }
        }

        @JvmStatic
        @NotNull
        public final Timestamp now() {
            return new Timestamp(new Date());
        }
    }

    public Timestamp(long j10, int i10) {
        Companion.access$validateRange(INSTANCE, j10, i10);
        this.seconds = j10;
        this.nanoseconds = i10;
    }

    @JvmStatic
    @NotNull
    public static final Timestamp now() {
        return INSTANCE.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        return other == this || ((other instanceof Timestamp) && compareTo((Timestamp) other) == 0);
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j10 = this.seconds;
        return (((((int) j10) * 1369) + ((int) (j10 >> 32))) * 37) + this.nanoseconds;
    }

    @NotNull
    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / DurationKt.NANOS_IN_MILLIS)));
    }

    @RequiresApi(26)
    @NotNull
    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instantOfEpochSecond;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Timestamp(seconds=");
        sb2.append(this.seconds);
        sb2.append(", nanoseconds=");
        return androidx.activity.a.d(sb2, this.nanoseconds, RootService.CLOSE_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Timestamp other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return e.compareValuesBy(this, other, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.a
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public final Object get(@Nullable Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp.b
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public final Object get(@Nullable Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        });
    }

    public Timestamp(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Companion companion = INSTANCE;
        Pair pairAccess$toPreciseTime = Companion.access$toPreciseTime(companion, date);
        long jLongValue = ((Number) pairAccess$toPreciseTime.component1()).longValue();
        int iIntValue = ((Number) pairAccess$toPreciseTime.component2()).intValue();
        Companion.access$validateRange(companion, jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(26)
    public Timestamp(@NotNull Instant time) {
        this(time.getEpochSecond(), time.getNano());
        Intrinsics.checkNotNullParameter(time, "time");
    }
}
