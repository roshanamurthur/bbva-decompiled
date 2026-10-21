package com.bbva.cellscore.web.data.component;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_TemplateDefinition extends C$AutoValue_TemplateDefinition {
    public static final Parcelable.Creator<AutoValue_TemplateDefinition> CREATOR = new a();

    public static class a implements Parcelable.Creator<AutoValue_TemplateDefinition> {
        @Override // android.os.Parcelable.Creator
        public final AutoValue_TemplateDefinition createFromParcel(Parcel parcel) {
            return new AutoValue_TemplateDefinition(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoValue_TemplateDefinition[] newArray(int i10) {
            return new AutoValue_TemplateDefinition[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27089p0);
    }
}
