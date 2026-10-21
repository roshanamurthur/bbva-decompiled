package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final AlertController f552u0;

    public static class Builder {
        private final AlertController.AlertParams P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.e(context, 0));
        }

        @NonNull
        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.P.mContext, this.mTheme);
            this.P.apply(alertDialog.f552u0);
            alertDialog.setCancelable(this.P.mCancelable);
            if (this.P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.P.mOnDismissListener);
            DialogInterface.OnKeyListener onKeyListener = this.P.mOnKeyListener;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.P.mContext;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z10) {
            this.P.mCancelable = z10;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mCursor = cursor;
            alertParams.mLabelColumn = str;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view) {
            this.P.mCustomTitleView = view;
            return this;
        }

        public Builder setIcon(@DrawableRes int i10) {
            this.P.mIconId = i10;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int i10) {
            TypedValue typedValue = new TypedValue();
            this.P.mContext.getTheme().resolveAttribute(i10, typedValue, true);
            this.P.mIconId = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z10) {
            this.P.mForceInverseBackground = z10;
            return this;
        }

        public Builder setItems(@ArrayRes int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i10);
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMessage(@StringRes int i10) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mMessage = alertParams.mContext.getText(i10);
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i10);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams2.mCheckedItems = zArr;
            alertParams2.mIsMultiChoice = true;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i10);
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.P.mNegativeButtonIcon = drawable;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i10);
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.P.mNeutralButtonIcon = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i10);
            this.P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.P.mPositiveButtonIcon = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder setRecycleOnMeasureEnabled(boolean z10) {
            this.P.mRecycleOnMeasure = z10;
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i10);
            AlertController.AlertParams alertParams2 = this.P;
            alertParams2.mOnClickListener = onClickListener;
            alertParams2.mCheckedItem = i11;
            alertParams2.mIsSingleChoice = true;
            return this;
        }

        public Builder setTitle(@StringRes int i10) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mTitle = alertParams.mContext.getText(i10);
            return this;
        }

        public Builder setView(int i10) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = null;
            alertParams.mViewLayoutResId = i10;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public AlertDialog show() {
            AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }

        public Builder(@NonNull Context context, @StyleRes int i10) {
            this.P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.e(context, i10)));
            this.mTheme = i10;
        }

        public Builder setIcon(@Nullable Drawable drawable) {
            this.P.mIcon = drawable;
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
            this.P.mMessage = charSequence;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.P.mTitle = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mNeutralButtonText = charSequence;
            alertParams.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mCursor = cursor;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i10;
            alertParams.mLabelColumn = str;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public Builder setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = true;
            alertParams.mViewSpacingLeft = i10;
            alertParams.mViewSpacingTop = i11;
            alertParams.mViewSpacingRight = i12;
            alertParams.mViewSpacingBottom = i13;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mCursor = cursor;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mIsCheckedColumn = str;
            alertParams.mLabelColumn = str2;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i10;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i10;
            alertParams.mIsSingleChoice = true;
            return this;
        }
    }

    public AlertDialog(@NonNull Context context) {
        this(context, 0);
    }

    public static int e(@NonNull Context context, @StyleRes int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i10) {
        AlertController alertController = this.f552u0;
        if (i10 == -3) {
            return alertController.f544w;
        }
        if (i10 == -2) {
            return alertController.f540s;
        }
        if (i10 == -1) {
            return alertController.f536o;
        }
        alertController.getClass();
        return null;
    }

    public ListView getListView() {
        return this.f552u0.f529g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        View viewFindViewById;
        int i11;
        int i12;
        int i13;
        ListAdapter listAdapter;
        View viewFindViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.f552u0;
        alertController.f524b.setContentView(alertController.J);
        int i14 = R.id.parentPanel;
        Window window = alertController.f525c;
        View viewFindViewById3 = window.findViewById(i14);
        int i15 = R.id.topPanel;
        View viewFindViewById4 = viewFindViewById3.findViewById(i15);
        int i16 = R.id.contentPanel;
        View viewFindViewById5 = viewFindViewById3.findViewById(i16);
        int i17 = R.id.buttonPanel;
        View viewFindViewById6 = viewFindViewById3.findViewById(i17);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(R.id.customPanel);
        View viewInflate = alertController.f530h;
        Context context = alertController.f523a;
        if (viewInflate == null) {
            viewInflate = alertController.f531i != 0 ? LayoutInflater.from(context).inflate(alertController.f531i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !AlertController.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f535n) {
                frameLayout.setPadding(alertController.f532j, alertController.f533k, alertController.f534l, alertController.m);
            }
            if (alertController.f529g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById7 = viewGroup.findViewById(i15);
        View viewFindViewById8 = viewGroup.findViewById(i16);
        View viewFindViewById9 = viewGroup.findViewById(i17);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById9, viewFindViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f528f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f529g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f529g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        alertController.f536o = button;
        AlertController.a aVar = alertController.Q;
        button.setOnClickListener(aVar);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.f537p);
        int i18 = alertController.f526d;
        if (zIsEmpty && alertController.f539r == null) {
            alertController.f536o.setVisibility(8);
            i10 = 0;
        } else {
            alertController.f536o.setText(alertController.f537p);
            Drawable drawable = alertController.f539r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i18, i18);
                alertController.f536o.setCompoundDrawables(alertController.f539r, null, null, null);
            }
            alertController.f536o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        alertController.f540s = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f541t) && alertController.f543v == null) {
            alertController.f540s.setVisibility(8);
        } else {
            alertController.f540s.setText(alertController.f541t);
            Drawable drawable2 = alertController.f543v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i18, i18);
                alertController.f540s.setCompoundDrawables(alertController.f543v, null, null, null);
            }
            alertController.f540s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        alertController.f544w = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f545x) && alertController.f547z == null) {
            alertController.f544w.setVisibility(8);
            viewFindViewById = null;
        } else {
            alertController.f544w.setText(alertController.f545x);
            Drawable drawable3 = alertController.f547z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i18, i18);
                viewFindViewById = null;
                alertController.f544w.setCompoundDrawables(alertController.f547z, null, null, null);
            } else {
                viewFindViewById = null;
            }
            alertController.f544w.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = alertController.f536o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = alertController.f540s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = alertController.f544w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 != 0) {
            i11 = 8;
        } else {
            i11 = 8;
            viewGroupB3.setVisibility(8);
        }
        if (alertController.G != null) {
            viewGroupB.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(i11);
            i12 = i11;
        } else {
            alertController.D = (ImageView) window.findViewById(android.R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f527e)) && alertController.O) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f527e);
                int i19 = alertController.B;
                if (i19 != 0) {
                    alertController.D.setImageResource(i19);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        i12 = 8;
                        alertController.D.setVisibility(8);
                    }
                }
                i12 = 8;
            } else {
                i12 = 8;
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                viewGroupB.setVisibility(8);
            }
        }
        boolean z11 = viewGroup.getVisibility() != i12;
        boolean z12 = (viewGroupB == null || viewGroupB.getVisibility() == i12) ? 0 : 1;
        boolean z13 = viewGroupB3.getVisibility() != i12;
        if (!z13 && (viewFindViewById2 = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z12 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f528f != null || alertController.f529g != null) {
                viewFindViewById = viewGroupB.findViewById(R.id.titleDividerNoCustom);
            }
            i13 = 0;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else {
            i13 = 0;
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f529g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.setHasDecor(z12, z13);
        }
        if (!z11) {
            View view = alertController.f529g;
            if (view == null) {
                view = alertController.A;
            }
            if (view != null) {
                int i20 = z13 ? 2 : i13;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                ViewCompat.setScrollIndicators(view, z12 | i20, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f529g;
        if (recycleListView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i21 = alertController.I;
        if (i21 > -1) {
            recycleListView2.setItemChecked(i21, true);
            recycleListView2.setSelection(i21);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f552u0.A;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f552u0.A;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    public void setButton(int i10, CharSequence charSequence, Message message) {
        this.f552u0.c(i10, charSequence, null, message, null);
    }

    public void setCustomTitle(View view) {
        this.f552u0.G = view;
    }

    public void setIcon(int i10) {
        this.f552u0.d(i10);
    }

    public void setIconAttribute(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.f552u0.d(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        AlertController alertController = this.f552u0;
        alertController.f528f = charSequence;
        TextView textView = alertController.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f552u0;
        alertController.f527e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(View view) {
        AlertController alertController = this.f552u0;
        alertController.f530h = view;
        alertController.f531i = 0;
        alertController.f535n = false;
    }

    public AlertDialog(@NonNull Context context, @StyleRes int i10) {
        super(context, e(context, i10));
        this.f552u0 = new AlertController(getContext(), this, getWindow());
    }

    public void setButton(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f552u0.c(i10, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        AlertController alertController = this.f552u0;
        alertController.C = drawable;
        alertController.B = 0;
        ImageView imageView = alertController.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                alertController.D.setImageDrawable(drawable);
            }
        }
    }

    public void setButton(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f552u0.c(i10, charSequence, onClickListener, null, drawable);
    }

    public AlertDialog(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    public void setView(View view, int i10, int i11, int i12, int i13) {
        AlertController alertController = this.f552u0;
        alertController.f530h = view;
        alertController.f531i = 0;
        alertController.f535n = true;
        alertController.f532j = i10;
        alertController.f533k = i11;
        alertController.f534l = i12;
        alertController.m = i13;
    }
}
