package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int f460p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    private final Intent f461q0;

    public class a implements Parcelable.Creator<ActivityResult> {
        @Override // android.os.Parcelable.Creator
        public final ActivityResult createFromParcel(@NonNull Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(int i10, @Nullable Intent intent) {
        this.f460p0 = i10;
        this.f461q0 = intent;
    }

    @NonNull
    public static String resultCodeToString(int i10) {
        if (i10 != -1) {
            return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Intent getData() {
        return this.f461q0;
    }

    public int getResultCode() {
        return this.f460p0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + resultCodeToString(this.f460p0) + ", data=" + this.f461q0 + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f460p0);
        parcel.writeInt(this.f461q0 == null ? 0 : 1);
        Intent intent = this.f461q0;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.f460p0 = parcel.readInt();
        this.f461q0 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
