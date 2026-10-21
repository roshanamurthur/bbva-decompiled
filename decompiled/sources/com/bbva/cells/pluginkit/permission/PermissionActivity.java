package com.bbva.cells.pluginkit.permission;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import bk.g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J-\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/bbva/cells/pluginkit/permission/PermissionActivity;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PermissionActivity extends Activity {

    @NotNull
    public static final String PERMISSIONS = "permissions";

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("permissions");
        if (stringArrayExtra != null) {
            ActivityCompat.requestPermissions(this, stringArrayExtra, 4726);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (grantResults.length == 0) {
            g.addAll(arrayList2, permissions);
        } else if (requestCode == 4726) {
            int length = permissions.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (grantResults[i10] == 0) {
                    arrayList.add(permissions[i10]);
                } else {
                    arrayList2.add(permissions[i10]);
                }
            }
        }
        PermissionManager.INSTANCE.onActivityResult(new PermissionReport(PermissionManagerKt.toPermissions(arrayList, this, true), PermissionManagerKt.toPermissions(arrayList2, this, false)));
        finish();
    }
}
