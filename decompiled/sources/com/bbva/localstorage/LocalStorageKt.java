package com.bbva.localstorage;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.localstorage.delegate.Delegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: LocalStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u0001H\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086\b¢\u0006\u0002\u0010\b*¤\u0001\u0010\t\"O\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n2O\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n¨\u0006\u000e"}, d2 = {"pref", "Lcom/bbva/localstorage/delegate/Delegate;", ExifInterface.GPS_DIRECTION_TRUE, "default", "key", "", "secure", "", "(Ljava/lang/Object;Ljava/lang/String;Z)Lcom/bbva/localstorage/delegate/Delegate;", "DelegateCreator", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "", "local-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LocalStorageKt {
    public static final /* synthetic */ <T> Delegate<T> pref(T t10, String str, boolean z10) {
        LocalStorage localStorage = LocalStorage.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Delegate<T> delegate = (Delegate<T>) localStorage.get(Reflection.getOrCreateKotlinClass(Object.class), str, t10, z10);
        Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type com.bbva.localstorage.delegate.Delegate<T of com.bbva.localstorage.LocalStorageKt.pref>");
        return delegate;
    }

    public static /* synthetic */ Delegate pref$default(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        LocalStorage localStorage = LocalStorage.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Delegate<?> delegate = localStorage.get(Reflection.getOrCreateKotlinClass(Object.class), str, obj, z10);
        Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type com.bbva.localstorage.delegate.Delegate<T of com.bbva.localstorage.LocalStorageKt.pref>");
        return delegate;
    }
}
