package de;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetDialog f68175p0;

    public d(BottomSheetDialog bottomSheetDialog) {
        this.f68175p0 = bottomSheetDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BottomSheetDialog bottomSheetDialog = this.f68175p0;
        if (bottomSheetDialog.E0 && bottomSheetDialog.isShowing()) {
            if (!bottomSheetDialog.G0) {
                TypedArray typedArrayObtainStyledAttributes = bottomSheetDialog.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                bottomSheetDialog.F0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                bottomSheetDialog.G0 = true;
            }
            if (bottomSheetDialog.F0) {
                bottomSheetDialog.cancel();
            }
        }
    }
}
