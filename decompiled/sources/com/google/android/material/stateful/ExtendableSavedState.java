package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;

/* JADX INFO: loaded from: classes10.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    @NonNull
    public final SimpleArrayMap<String, Bundle> extendableStates;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new SimpleArrayMap<>();
    }

    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.extendableStates.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.extendableStates.keyAt(i11);
            bundleArr[i11] = this.extendableStates.valueAt(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NonNull
        public final ExtendableSavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final Object[] newArray(int i10) {
            return new ExtendableSavedState[i10];
        }

        @Override // android.os.Parcelable.Creator
        @Nullable
        public final Object createFromParcel(@NonNull Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }
    }

    public ExtendableSavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new SimpleArrayMap<>(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.extendableStates.put(strArr[i11], bundleArr[i11]);
        }
    }
}
