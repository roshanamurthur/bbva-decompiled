package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.TESTS})
public class MaterialStyledDatePickerDialog extends DatePickerDialog {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @StyleRes
    public static final int f44514r0 = R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final InsetDrawable f44515p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final Rect f44516q0;

    public MaterialStyledDatePickerDialog(@NonNull Context context) {
        this(context, 0);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f44515p0);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, this.f44516q0));
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context, int i10) {
        this(context, i10, null, -1, -1, -1);
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i10, int i11, int i12) {
        this(context, 0, onDateSetListener, i10, i11, i12);
    }

    public MaterialStyledDatePickerDialog(@NonNull Context context, int i10, @Nullable DatePickerDialog.OnDateSetListener onDateSetListener, int i11, int i12, int i13) {
        super(context, i10, onDateSetListener, i11, i12, i13);
        Context context2 = getContext();
        int iResolveOrThrow = MaterialAttributes.resolveOrThrow(getContext(), R.attr.colorSurface, getClass().getCanonicalName());
        int i14 = f44514r0;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, android.R.attr.datePickerStyle, i14);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(iResolveOrThrow));
        Rect dialogBackgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, android.R.attr.datePickerStyle, i14);
        this.f44516q0 = dialogBackgroundInsets;
        this.f44515p0 = MaterialDialogs.insetDrawable(materialShapeDrawable, dialogBackgroundInsets);
    }
}
