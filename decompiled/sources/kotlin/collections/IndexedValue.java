package kotlin.collections;

import androidx.camera.core.impl.v;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u001a"}, d2 = {"Lkotlin/collections/IndexedValue;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "component2", "()Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "value", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", "b", "Ljava/lang/Object;", "getValue", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final /* data */ class IndexedValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final T value;

    public IndexedValue(int i10, T t10) {
        this.index = i10;
        this.value = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexedValue copy$default(IndexedValue indexedValue, int i10, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = indexedValue.index;
        }
        if ((i11 & 2) != 0) {
            obj = indexedValue.value;
        }
        return indexedValue.copy(i10, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final IndexedValue<T> copy(int index, T value) {
        return new IndexedValue<>(index, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) other;
        return this.index == indexedValue.index && Intrinsics.areEqual(this.value, indexedValue.value);
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10 = this.index * 31;
        T t10 = this.value;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IndexedValue(index=");
        sb2.append(this.index);
        sb2.append(", value=");
        return v.d(sb2, this.value, RootService.CLOSE_BRACKET);
    }
}
