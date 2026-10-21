package com.noknok.android.uaf.framework.service;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.noknok.android.client.utils.ViewWrapper;
import com.noknok.android.mfac.uaf.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class ArrayAdapterItem extends ArrayAdapter<SelectAuthenticatorActivity.Choice> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<SelectAuthenticatorActivity.Choice> f63560c;

    public ArrayAdapterItem(Context context, int i10, ArrayList<SelectAuthenticatorActivity.Choice> arrayList) {
        super(context, i10, arrayList);
        this.f63559b = i10;
        this.f63558a = context;
        this.f63560c = arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @NonNull
    public View getView(int i10, View view, @NonNull ViewGroup viewGroup) {
        if (view == null) {
            view = ((Activity) this.f63558a).getLayoutInflater().inflate(this.f63559b, viewGroup, false);
            new ViewWrapper(view).onShow();
        }
        SelectAuthenticatorActivity.Choice choice = this.f63560c.get(i10);
        ImageView imageView = (ImageView) view.findViewById(R.id.item_icon);
        byte[] bArrDecode = Base64.decode(choice.getIcon().substring(22), 0);
        imageView.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
        ((TextView) view.findViewById(R.id.item_title)).setText(choice.getTitle());
        ((TextView) view.findViewById(R.id.item_description)).setText(choice.getDescription());
        return view;
    }
}
