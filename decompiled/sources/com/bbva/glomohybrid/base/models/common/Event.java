package com.bbva.glomohybrid.base.models.common;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/models/common/Event;", ExifInterface.GPS_DIRECTION_TRUE, "", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekData", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "<set-?>", "b", "Z", "getWasHandled", "()Z", "wasHandled", "data", "<init>", "(Ljava/lang/Object;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public class Event<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f31470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean wasHandled;

    public Event(T t10) {
        this.f31470a = t10;
    }

    public boolean equals(@Nullable Object other) {
        Event event = other instanceof Event ? (Event) other : null;
        return Intrinsics.areEqual(event != null ? event.f31470a : null, this.f31470a);
    }

    @Nullable
    public final T getContentIfNotHandled() {
        if (this.wasHandled) {
            return null;
        }
        this.wasHandled = true;
        return this.f31470a;
    }

    public final boolean getWasHandled() {
        return this.wasHandled;
    }

    public int hashCode() {
        T t10 = this.f31470a;
        return ((t10 != null ? t10.hashCode() : 0) * 31) + (this.wasHandled ? 1231 : 1237);
    }

    public final T peekData() {
        return this.f31470a;
    }
}
