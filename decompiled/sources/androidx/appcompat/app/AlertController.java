package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final b P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatDialog f524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecycleListView f529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f534l;
    public int m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f547z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f535n = false;
    public int B = 0;
    public int I = -1;
    public final a Q = new a();

    public static class AlertParams {
        public ListAdapter mAdapter;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public Drawable mNegativeButtonIcon;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public Drawable mNeutralButtonIcon;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public Drawable mPositiveButtonIcon;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public int mViewSpacingTop;
        public int mIconId = 0;
        public int mIconAttrId = 0;
        public boolean mViewSpacingSpecified = false;
        public int mCheckedItem = -1;
        public boolean mRecycleOnMeasure = true;
        public boolean mCancelable = true;

        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void apply(AlertController alertController) {
            ListAdapter cVar;
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.f527e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i10 = this.mIconId;
                if (i10 != 0) {
                    alertController.d(i10);
                }
                int i11 = this.mIconAttrId;
                if (i11 != 0) {
                    alertController.getClass();
                    TypedValue typedValue = new TypedValue();
                    alertController.f523a.getTheme().resolveAttribute(i11, typedValue, true);
                    alertController.d(typedValue.resourceId);
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.f528f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null || this.mPositiveButtonIcon != null) {
                alertController.c(-1, charSequence3, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
            }
            CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null || this.mNegativeButtonIcon != null) {
                alertController.c(-2, charSequence4, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null || this.mNeutralButtonIcon != null) {
                alertController.c(-3, charSequence5, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                RecycleListView recycleListView = (RecycleListView) this.mInflater.inflate(alertController.K, (ViewGroup) null);
                if (this.mIsMultiChoice) {
                    cVar = this.mCursor == null ? new androidx.appcompat.app.b(this, this.mContext, alertController.L, this.mItems, recycleListView) : new androidx.appcompat.app.c(this, this.mContext, this.mCursor, recycleListView, alertController);
                } else {
                    int i12 = this.mIsSingleChoice ? alertController.M : alertController.N;
                    if (this.mCursor != null) {
                        cVar = new SimpleCursorAdapter(this.mContext, i12, this.mCursor, new String[]{this.mLabelColumn}, new int[]{R.id.text1});
                    } else {
                        cVar = this.mAdapter;
                        if (cVar == null) {
                            cVar = new c(this.mContext, i12, R.id.text1, this.mItems);
                        }
                    }
                }
                OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareListViewListener;
                if (onPrepareListViewListener != null) {
                    onPrepareListViewListener.onPrepareListView(recycleListView);
                }
                alertController.H = cVar;
                alertController.I = this.mCheckedItem;
                if (this.mOnClickListener != null) {
                    recycleListView.setOnItemClickListener(new d(this, alertController));
                } else if (this.mOnCheckboxClickListener != null) {
                    recycleListView.setOnItemClickListener(new e(this, recycleListView, alertController));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSelectedListener;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (this.mIsSingleChoice) {
                    recycleListView.setChoiceMode(1);
                } else if (this.mIsMultiChoice) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f529g = recycleListView;
            }
            View view2 = this.mView;
            if (view2 == null) {
                int i13 = this.mViewLayoutResId;
                if (i13 != 0) {
                    alertController.f530h = null;
                    alertController.f531i = i13;
                    alertController.f535n = false;
                    return;
                }
                return;
            }
            if (!this.mViewSpacingSpecified) {
                alertController.f530h = view2;
                alertController.f531i = 0;
                alertController.f535n = false;
                return;
            }
            int i14 = this.mViewSpacingLeft;
            int i15 = this.mViewSpacingTop;
            int i16 = this.mViewSpacingRight;
            int i17 = this.mViewSpacingBottom;
            alertController.f530h = view2;
            alertController.f531i = 0;
            alertController.f535n = true;
            alertController.f532j = i14;
            alertController.f533k = i15;
            alertController.f534l = i16;
            alertController.m = i17;
        }
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f548p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f549q0;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f548p0, getPaddingRight(), z11 ? getPaddingBottom() : this.f549q0);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.RecycleListView);
            this.f549q0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f548p0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f536o && (message3 = alertController.f538q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f540s || (message2 = alertController.f542u) == null) {
                messageObtain = (view != alertController.f544w || (message = alertController.f546y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.P.obtainMessage(1, alertController.f524b).sendToTarget();
        }
    }

    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f551a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f551a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class c extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f523a = context;
        this.f524b = appCompatDialog;
        this.f525c = window;
        b bVar = new b();
        bVar.f551a = new WeakReference<>(appCompatDialog);
        this.P = bVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.R.styleable.AlertDialog, androidx.appcompat.R.attr.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listLayout, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listItemLayout, 0);
        this.O = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AlertDialog_showTitle, true);
        this.f526d = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static ViewGroup b(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.P.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f545x = charSequence;
            this.f546y = message;
            this.f547z = drawable;
        } else if (i10 == -2) {
            this.f541t = charSequence;
            this.f542u = message;
            this.f543v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f537p = charSequence;
            this.f538q = message;
            this.f539r = drawable;
        }
    }

    public final void d(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }
}
