package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AccessibilityRecordCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityRecord f20385a;

    @RequiresApi(15)
    public static class a {
        @DoNotInline
        public static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @DoNotInline
        public static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @DoNotInline
        public static void c(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollX(i10);
        }

        @DoNotInline
        public static void d(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollY(i10);
        }
    }

    @RequiresApi(16)
    public static class b {
        @DoNotInline
        public static void a(AccessibilityRecord accessibilityRecord, View view, int i10) {
            accessibilityRecord.setSource(view, i10);
        }
    }

    @Deprecated
    public AccessibilityRecordCompat(Object obj) {
        this.f20385a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityRecordCompat) {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain(accessibilityRecordCompat.f20385a));
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
        AccessibilityRecord accessibilityRecord = this.f20385a;
        if (accessibilityRecord == null) {
            return accessibilityRecordCompat.f20385a == null;
        }
        return accessibilityRecord.equals(accessibilityRecordCompat.f20385a);
    }

    @Deprecated
    public int getAddedCount() {
        return this.f20385a.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.f20385a.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.f20385a.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.f20385a.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.f20385a.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.f20385a.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.f20385a;
    }

    @Deprecated
    public int getItemCount() {
        return this.f20385a.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.f20385a);
    }

    @Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.f20385a);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.f20385a.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.f20385a.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.f20385a.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.f20385a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public AccessibilityNodeInfoCompat getSource() {
        return AccessibilityNodeInfoCompat.l(this.f20385a.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        return this.f20385a.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.f20385a.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.f20385a.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f20385a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.f20385a.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.f20385a.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.f20385a.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.f20385a.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.f20385a.isScrollable();
    }

    @Deprecated
    public void recycle() {
        this.f20385a.recycle();
    }

    @Deprecated
    public void setAddedCount(int i10) {
        this.f20385a.setAddedCount(i10);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        this.f20385a.setBeforeText(charSequence);
    }

    @Deprecated
    public void setChecked(boolean z10) {
        this.f20385a.setChecked(z10);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        this.f20385a.setClassName(charSequence);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        this.f20385a.setContentDescription(charSequence);
    }

    @Deprecated
    public void setCurrentItemIndex(int i10) {
        this.f20385a.setCurrentItemIndex(i10);
    }

    @Deprecated
    public void setEnabled(boolean z10) {
        this.f20385a.setEnabled(z10);
    }

    @Deprecated
    public void setFromIndex(int i10) {
        this.f20385a.setFromIndex(i10);
    }

    @Deprecated
    public void setFullScreen(boolean z10) {
        this.f20385a.setFullScreen(z10);
    }

    @Deprecated
    public void setItemCount(int i10) {
        this.f20385a.setItemCount(i10);
    }

    @Deprecated
    public void setMaxScrollX(int i10) {
        setMaxScrollX(this.f20385a, i10);
    }

    @Deprecated
    public void setMaxScrollY(int i10) {
        setMaxScrollY(this.f20385a, i10);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        this.f20385a.setParcelableData(parcelable);
    }

    @Deprecated
    public void setPassword(boolean z10) {
        this.f20385a.setPassword(z10);
    }

    @Deprecated
    public void setRemovedCount(int i10) {
        this.f20385a.setRemovedCount(i10);
    }

    @Deprecated
    public void setScrollX(int i10) {
        this.f20385a.setScrollX(i10);
    }

    @Deprecated
    public void setScrollY(int i10) {
        this.f20385a.setScrollY(i10);
    }

    @Deprecated
    public void setScrollable(boolean z10) {
        this.f20385a.setScrollable(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void setSource(View view) {
        this.f20385a.setSource(view);
    }

    @Deprecated
    public void setToIndex(int i10) {
        this.f20385a.setToIndex(i10);
    }

    public static int getMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord) {
        return a.a(accessibilityRecord);
    }

    public static int getMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord) {
        return a.b(accessibilityRecord);
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain() {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }

    public static void setMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        a.c(accessibilityRecord, i10);
    }

    public static void setMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord, int i10) {
        a.d(accessibilityRecord, i10);
    }

    @Deprecated
    public void setSource(View view, int i10) {
        setSource(this.f20385a, view, i10);
    }

    public static void setSource(@NonNull AccessibilityRecord accessibilityRecord, @Nullable View view, int i10) {
        b.a(accessibilityRecord, view, i10);
    }
}
