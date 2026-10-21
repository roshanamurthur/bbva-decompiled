package com.bbva.component.dm.customer.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassificationModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/Classification;", "Landroid/os/Parcelable;", "classificationId", "", "name", "segments", "", "Lcom/bbva/component/dm/customer/domain/model/Segment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getClassificationId", "()Ljava/lang/String;", "getName", "getSegments", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Classification implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Classification> CREATOR = new Creator();

    @NotNull
    private final String classificationId;

    @NotNull
    private final String name;

    @NotNull
    private final List<Segment> segments;

    /* JADX INFO: compiled from: ClassificationModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Classification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Classification createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Segment.CREATOR.createFromParcel(parcel));
            }
            return new Classification(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Classification[] newArray(int i10) {
            return new Classification[i10];
        }
    }

    public Classification(@NotNull String classificationId, @NotNull String name, @NotNull List<Segment> segments) {
        Intrinsics.checkNotNullParameter(classificationId, "classificationId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.classificationId = classificationId;
        this.name = name;
        this.segments = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Classification copy$default(Classification classification, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = classification.classificationId;
        }
        if ((i10 & 2) != 0) {
            str2 = classification.name;
        }
        if ((i10 & 4) != 0) {
            list = classification.segments;
        }
        return classification.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClassificationId() {
        return this.classificationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Segment> component3() {
        return this.segments;
    }

    @NotNull
    public final Classification copy(@NotNull String classificationId, @NotNull String name, @NotNull List<Segment> segments) {
        Intrinsics.checkNotNullParameter(classificationId, "classificationId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new Classification(classificationId, name, segments);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Classification)) {
            return false;
        }
        Classification classification = (Classification) other;
        return Intrinsics.areEqual(this.classificationId, classification.classificationId) && Intrinsics.areEqual(this.name, classification.name) && Intrinsics.areEqual(this.segments, classification.segments);
    }

    @NotNull
    public final String getClassificationId() {
        return this.classificationId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<Segment> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        return this.segments.hashCode() + n1.c(this.name, this.classificationId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.classificationId;
        String str2 = this.name;
        return a.c(androidx.constraintlayout.core.parser.a.c("Classification(classificationId=", str, ", name=", str2, ", segments="), this.segments, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.classificationId);
        parcel.writeString(this.name);
        List<Segment> list = this.segments;
        parcel.writeInt(list.size());
        Iterator<Segment> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}
