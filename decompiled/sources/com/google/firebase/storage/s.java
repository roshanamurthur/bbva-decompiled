package com.google.firebase.storage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f49187p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f49188q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f49189r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f49190s0;

    public /* synthetic */ s(Object obj, Object obj2, int i10, Object obj3) {
        this.f49187p0 = i10;
        this.f49188q0 = obj;
        this.f49189r0 = obj2;
        this.f49190s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f49187p0;
        Object obj = this.f49190s0;
        Object obj2 = this.f49189r0;
        Object obj3 = this.f49188q0;
        switch (i10) {
            case 0:
                ((t) obj3).f49195e.a(obj2, (StorageTask.ProvideError) obj);
                break;
            default:
                String tag = (String) obj3;
                String format = (String) obj2;
                Object[] arg = (Object[]) obj;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(format, "$format");
                Intrinsics.checkNotNullParameter(arg, "$arg");
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(arg, arg.length);
                Intrinsics.checkNotNullExpressionValue(String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "format(...)");
                break;
        }
    }
}
