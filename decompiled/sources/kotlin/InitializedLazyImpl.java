package kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u000f\u0012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/InitializedLazyImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "isInitialized", "", "toString", "p0", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final T value;

    public InitializedLazyImpl(T t10) {
        this.value = t10;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return this.value;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return true;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
