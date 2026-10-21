package com.bbva.ethermobilesdk.securesharing.verifier;

import android.content.Context;
import android.content.pm.PermissionInfo;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.securesharing.extension.ContextKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SignatureVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/verifier/SignatureVerifier;", "", "Landroid/content/Context;", "context", "", "packageName", "", "verify", "<init>", "()V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class SignatureVerifier {

    @NotNull
    public static final SignatureVerifier INSTANCE = new SignatureVerifier();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f29985a = "com.bbva.sl.ar.android.storage.pss.permission.SHARE_DATA_PERMISSION";

    public final void verify(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PermissionInfo[] permissionInfoArr = context.getPackageManager().getPackageInfo(packageName, 4096).permissions;
            if (permissionInfoArr == null) {
                ExceptionKt.throwError$default("The application [" + packageName + "] has not declared the required permission", null, 2, null);
                throw new KotlinNothingValueException();
            }
            Intrinsics.checkNotNullExpressionValue(permissionInfoArr, "packageInfo.permissions");
            int length = permissionInfoArr.length;
            int i10 = 0;
            while (i10 < length) {
                PermissionInfo permissionInfo = permissionInfoArr[i10];
                i10++;
                if (Intrinsics.areEqual(permissionInfo.name, f29985a)) {
                    if (ContextKt.verifyAppSignature(context, permissionInfo.packageName, ContextKt.hashedSignature$default(context, null, 1, null))) {
                        return;
                    }
                }
            }
            throw q.d("The signature permission have to be declared", null, 2, null);
        } catch (Exception unused) {
            throw q.d("Could not find permission info", null, 2, null);
        }
    }
}
