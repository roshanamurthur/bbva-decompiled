package com.veridas.misc;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/veridas/misc/Event;", ExifInterface.GPS_DIRECTION_TRUE, "", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "", "<set-?>", "b", "Z", "getHasBeenHandled", "()Z", "hasBeenHandled", "content", "<init>", "(Ljava/lang/Object;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f67266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean hasBeenHandled;

    public Event(T t10) {
        this.f67266a = t10;
    }

    @Nullable
    public final T getContentIfNotHandled() {
        if (this.hasBeenHandled) {
            return null;
        }
        this.hasBeenHandled = true;
        return this.f67266a;
    }

    public final boolean getHasBeenHandled() {
        return this.hasBeenHandled;
    }

    public final T peekContent() {
        return this.f67266a;
    }
}
