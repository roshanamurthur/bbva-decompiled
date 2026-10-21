package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SuggestionsAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends ResourceCursorAdapter implements View.OnClickListener {
    public static final /* synthetic */ int K0 = 0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final SearchView f1648s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SearchableInfo f1649t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Context f1650u0;
    public final WeakHashMap<String, Drawable.ConstantState> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f1651w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f1652x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ColorStateList f1653y0;

    /* JADX INFO: compiled from: SuggestionsAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f1654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f1655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f1656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f1657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f1658e;

        public a(View view) {
            this.f1654a = (TextView) view.findViewById(R.id.text1);
            this.f1655b = (TextView) view.findViewById(R.id.text2);
            this.f1656c = (ImageView) view.findViewById(R.id.icon1);
            this.f1657d = (ImageView) view.findViewById(R.id.icon2);
            this.f1658e = (ImageView) view.findViewById(androidx.appcompat.R.id.edit_query);
        }
    }

    public p1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1652x0 = 1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.f1648s0 = searchView;
        this.f1649t0 = searchableInfo;
        this.f1651w0 = searchView.getSuggestionCommitIconResId();
        this.f1650u0 = context;
        this.v0 = weakHashMap;
    }

    public static String e(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Drawable b(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1650u0.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        int i10;
        Drawable drawableC;
        CharSequence charSequenceE;
        a aVar = (a) view.getTag();
        int i11 = this.J0;
        int i12 = i11 != -1 ? cursor.getInt(i11) : 0;
        TextView textView = aVar.f1654a;
        if (textView != null) {
            String strE = e(cursor, this.E0);
            textView.setText(strE);
            if (TextUtils.isEmpty(strE)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context2 = this.f1650u0;
        TextView textView2 = aVar.f1655b;
        if (textView2 != null) {
            String strE2 = e(cursor, this.G0);
            if (strE2 != null) {
                if (this.f1653y0 == null) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(androidx.appcompat.R.attr.textColorSearchUrl, typedValue, true);
                    this.f1653y0 = context2.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strE2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1653y0, null), 0, strE2.length(), 33);
                charSequenceE = spannableString;
            } else {
                charSequenceE = e(cursor, this.F0);
            }
            if (TextUtils.isEmpty(charSequenceE)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceE);
            if (TextUtils.isEmpty(charSequenceE)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = aVar.f1656c;
        if (imageView != null) {
            int i13 = this.H0;
            if (i13 == -1) {
                drawableC = null;
            } else {
                drawableC = c(cursor.getString(i13));
                if (drawableC == null) {
                    ComponentName searchActivity = this.f1649t0.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.v0;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = weakHashMap.get(strFlattenToShortString);
                        drawableC = constantState == null ? null : constantState.newDrawable(context2.getResources());
                    } else {
                        PackageManager packageManager = context2.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbC = o1.c("Invalid icon resource ", iconResource, " for ");
                                    sbC.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbC.toString());
                                    drawableC = null;
                                } else {
                                    drawableC = drawable;
                                }
                            } else {
                                drawableC = null;
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            Log.w("SuggestionsAdapter", e5.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableC == null ? null : drawableC.getConstantState());
                    }
                    if (drawableC == null) {
                        drawableC = context2.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableC);
            if (drawableC == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableC.setVisible(false, false);
                drawableC.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f1657d;
        if (imageView2 == null) {
            i10 = 1;
        } else {
            int i14 = this.I0;
            Drawable drawableC2 = i14 == -1 ? null : c(cursor.getString(i14));
            imageView2.setImageDrawable(drawableC2);
            if (drawableC2 == null) {
                imageView2.setVisibility(8);
                i10 = 1;
            } else {
                imageView2.setVisibility(0);
                drawableC2.setVisible(false, false);
                i10 = 1;
                drawableC2.setVisible(true, false);
            }
        }
        int i15 = this.f1652x0;
        ImageView imageView3 = aVar.f1658e;
        if (i15 != 2 && (i15 != i10 || (i12 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    public final Drawable c(String str) {
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.v0;
        Context context = this.f1650u0;
        Drawable drawableB = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i10 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i10;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = ContextCompat.getDrawable(context, i10);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableB = b(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                            drawableB = drawableCreateFromStream;
                        } catch (Throwable th2) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused5) {
                                uri.toString();
                            }
                            throw th2;
                        }
                    }
                } catch (FileNotFoundException e5) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e5.getMessage());
                    if (drawableB != null) {
                        weakHashMap.put(str, drawableB.getConstantState());
                    }
                    return drawableB;
                }
                if (drawableB != null) {
                    weakHashMap.put(str, drawableB.getConstantState());
                }
            }
        }
        return drawableB;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.a.InterfaceC0075a
    public final void changeCursor(Cursor cursor) {
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.E0 = cursor.getColumnIndex("suggest_text_1");
                this.F0 = cursor.getColumnIndex("suggest_text_2");
                this.G0 = cursor.getColumnIndex("suggest_text_2_url");
                this.H0 = cursor.getColumnIndex("suggest_icon_1");
                this.I0 = cursor.getColumnIndex("suggest_icon_2");
                this.J0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.a.InterfaceC0075a
    public final CharSequence convertToString(Cursor cursor) {
        String strE;
        String strE2;
        if (cursor == null) {
            return null;
        }
        String strE3 = e(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strE3 != null) {
            return strE3;
        }
        SearchableInfo searchableInfo = this.f1649t0;
        if (searchableInfo.shouldRewriteQueryFromData() && (strE2 = e(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strE2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strE = e(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strE;
    }

    public final Cursor d(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1650u0.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewNewDropDownView = newDropDownView(this.f1650u0, getCursor(), viewGroup);
            if (viewNewDropDownView != null) {
                ((a) viewNewDropDownView.getTag()).f1654a.setText(e5.toString());
            }
            return viewNewDropDownView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View viewNewView = newView(this.f1650u0, getCursor(), viewGroup);
            ((a) viewNewView.getTag()).f1654a.setText(e5.toString());
            return viewNewView;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new a(viewNewView));
        ((ImageView) viewNewView.findViewById(androidx.appcompat.R.id.edit_query)).setImageResource(this.f1651w0);
        return viewNewView;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = getCursor();
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = getCursor();
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1648s0.onQueryRefine((CharSequence) tag);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.a.InterfaceC0075a
    public final Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.f1648s0;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                Cursor cursorD = d(this.f1649t0, string);
                if (cursorD != null) {
                    cursorD.getCount();
                    return cursorD;
                }
            } catch (RuntimeException e5) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e5);
            }
        }
        return null;
    }
}
