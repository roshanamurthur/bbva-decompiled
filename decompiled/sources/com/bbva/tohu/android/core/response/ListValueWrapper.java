package com.bbva.tohu.android.core.response;

import android.os.Parcel;
import android.os.Parcelable;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ListValueWrapper implements Parcelable {
    public static final Parcelable.Creator<ListValueWrapper> CREATOR = new Parcelable.Creator<ListValueWrapper>() { // from class: com.bbva.tohu.android.core.response.ListValueWrapper.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ListValueWrapper createFromParcel(Parcel parcel) {
            return new ListValueWrapper(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ListValueWrapper[] newArray(int i10) {
            return new ListValueWrapper[i10];
        }
    };
    private List<String> value;

    public ListValueWrapper(List<String> list) {
        this.value = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getValue() {
        return this.value;
    }

    public void setValue(List<String> list) {
        this.value = list;
    }

    public String toString() {
        return a.c(new StringBuilder("ListValueWrapper{value="), this.value, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.value);
    }

    public ListValueWrapper(Parcel parcel) {
        this.value = parcel.createStringArrayList();
    }
}
