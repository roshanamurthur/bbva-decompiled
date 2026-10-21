package io.card.payment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.nulabinc.zxcvbn.Guess;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import io.card.payment.ui.ActivityHelper;
import io.card.payment.ui.Appearance;
import io.card.payment.ui.ViewUtil;

/* JADX INFO: loaded from: classes7.dex */
public final class DataEntryActivity extends Activity implements TextWatcher {
    public static final /* synthetic */ int P0 = 0;
    public k E0;
    public EditText F0;
    public k G0;
    public ImageView H0;
    public Button I0;
    public Button J0;
    public CreditCard K0;
    public boolean L0;
    public String M0;
    public boolean N0;
    public int O0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69754p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f69755q0 = 100;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f69756r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public EditText f69757s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public io.card.payment.b f69758t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public EditText f69759u0;
    public k v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public EditText f69760w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public k f69761x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public EditText f69762y0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i10 = DataEntryActivity.P0;
            DataEntryActivity.this.c();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DataEntryActivity.this.onBackPressed();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        EditText editText = this.f69757s0;
        if (editText == null || editable != editText.getText()) {
            EditText editText2 = this.f69759u0;
            if (editText2 == null || editable != editText2.getText()) {
                EditText editText3 = this.f69760w0;
                if (editText3 == null || editable != editText3.getText()) {
                    EditText editText4 = this.f69762y0;
                    if (editText4 == null || editable != editText4.getText()) {
                        EditText editText5 = this.F0;
                        if (editText5 != null && editable == editText5.getText()) {
                            if (!this.G0.a() || this.G0.isValid()) {
                                d(this.F0);
                            } else {
                                this.F0.setTextColor(Appearance.TEXT_COLOR_ERROR);
                            }
                        }
                    } else if (!this.E0.a() || this.E0.isValid()) {
                        d(this.f69762y0);
                    } else {
                        this.f69762y0.setTextColor(Appearance.TEXT_COLOR_ERROR);
                    }
                } else if (!this.f69761x0.a()) {
                    d(this.f69760w0);
                } else if (this.f69761x0.isValid()) {
                    d(this.f69760w0);
                    b();
                } else {
                    this.f69760w0.setTextColor(Appearance.TEXT_COLOR_ERROR);
                }
            } else if (!this.v0.a()) {
                d(this.f69759u0);
            } else if (this.v0.isValid()) {
                d(this.f69759u0);
                b();
            } else {
                this.f69759u0.setTextColor(Appearance.TEXT_COLOR_ERROR);
            }
        } else {
            if (!this.f69758t0.a()) {
                d(this.f69757s0);
            } else if (this.f69758t0.isValid()) {
                d(this.f69757s0);
                b();
            } else {
                this.f69757s0.setTextColor(Appearance.TEXT_COLOR_ERROR);
            }
            if (this.f69760w0 != null) {
                CardType cardTypeFromCardNumber = CardType.fromCardNumber(this.f69758t0.f69767p0.toString());
                d dVar = (d) this.f69761x0;
                int iCvvLength = cardTypeFromCardNumber.cvvLength();
                dVar.f69772p0 = iCvvLength;
                this.f69760w0.setHint(iCvvLength == 4 ? "1234" : "123");
            }
        }
        e();
    }

    public final void b() {
        int i10 = 100;
        while (true) {
            int i11 = i10 + 1;
            EditText editText = (EditText) findViewById(i10);
            if (editText == null) {
                return;
            }
            if (editText.getText().length() == 0 && editText.requestFocus()) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public final void c() {
        if (this.K0 == null) {
            this.K0 = new CreditCard();
        }
        if (this.f69759u0 != null) {
            CreditCard creditCard = this.K0;
            c cVar = (c) this.v0;
            creditCard.expiryMonth = cVar.f69769p0;
            creditCard.expiryYear = cVar.f69770q0;
        }
        String str = this.f69758t0.f69767p0;
        CreditCard creditCard2 = this.K0;
        CreditCard creditCard3 = new CreditCard(str, creditCard2.expiryMonth, creditCard2.expiryYear, this.f69761x0.getValue(), this.E0.getValue(), this.G0.getValue());
        Intent intent = new Intent();
        intent.putExtra(CardIOActivity.EXTRA_SCAN_RESULT, creditCard3);
        if (getIntent().hasExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE)) {
            intent.putExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE, getIntent().getByteArrayExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE));
        }
        setResult(CardIOActivity.RESULT_CARD_INFO, intent);
        finish();
    }

    public final void d(EditText editText) {
        if (this.N0) {
            editText.setTextColor(this.O0);
        } else {
            editText.setTextColor(-12303292);
        }
    }

    public final void e() {
        this.I0.setEnabled(this.f69758t0.isValid() && this.v0.isValid() && this.f69761x0.isValid() && this.E0.isValid() && this.G0.isValid());
        this.I0.isEnabled();
        if (this.L0 && this.f69758t0.isValid() && this.v0.isValid() && this.f69761x0.isValid() && this.E0.isValid() && this.G0.isValid()) {
            c();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(CardIOActivity.RESULT_ENTRY_CANCELED);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null) {
            onBackPressed();
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, false);
        this.N0 = booleanExtra;
        ActivityHelper.setActivityTheme(this, booleanExtra);
        this.O0 = new TextView(this).getTextColors().getDefaultColor();
        this.M0 = ActivityHelper.holoSupported() ? "12dip" : "2dip";
        LocalizedStrings.setLanguage(getIntent());
        int iTypedDimensionValueToPixelsInt = ViewUtil.typedDimensionValueToPixelsInt("4dip", this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        if (!this.N0) {
            relativeLayout.setBackgroundColor(Appearance.DEFAULT_BACKGROUND_COLOR);
        }
        ScrollView scrollView = new ScrollView(this);
        int i10 = this.f69754p0;
        this.f69754p0 = i10 + 1;
        scrollView.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        relativeLayout.addView(scrollView, layoutParams);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout, -1, -1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        this.K0 = (CreditCard) getIntent().getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
        this.L0 = getIntent().getBooleanExtra("debug_autoAcceptResult", false);
        CreditCard creditCard = this.K0;
        if (creditCard != null) {
            String str = creditCard.cardNumber;
            io.card.payment.b bVar = new io.card.payment.b();
            bVar.f69767p0 = str;
            this.f69758t0 = bVar;
            this.H0 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            this.H0.setPadding(0, 0, 0, iTypedDimensionValueToPixelsInt);
            layoutParams3.weight = 1.0f;
            this.H0.setImageBitmap(CardIOActivity.M0);
            linearLayout2.addView(this.H0, layoutParams3);
            ViewUtil.setMargins(this.H0, null, null, null, "8dip");
        } else {
            TextView textView = new TextView(this);
            this.f69756r0 = textView;
            textView.setTextSize(24.0f);
            if (!this.N0) {
                this.f69756r0.setTextColor(Appearance.PAY_BLUE_COLOR);
            }
            linearLayout2.addView(this.f69756r0);
            ViewUtil.setPadding(this.f69756r0, null, null, null, "8dip");
            ViewUtil.setDimensions(this.f69756r0, -2, -2);
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            ViewUtil.setPadding(linearLayout3, null, "4dip", null, "4dip");
            TextView textView2 = new TextView(this);
            ViewUtil.setPadding(textView2, this.M0, null, null, null);
            textView2.setText(LocalizedStrings.getString(StringKey.ENTRY_CARD_NUMBER));
            if (!this.N0) {
                textView2.setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            linearLayout3.addView(textView2, -2, -2);
            EditText editText = new EditText(this);
            this.f69757s0 = editText;
            int i11 = this.f69755q0;
            this.f69755q0 = i11 + 1;
            editText.setId(i11);
            this.f69757s0.setMaxLines(1);
            this.f69757s0.setImeOptions(6);
            this.f69757s0.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.f69757s0.setInputType(3);
            this.f69757s0.setHint("1234 5678 1234 5678");
            if (!this.N0) {
                this.f69757s0.setHintTextColor(-3355444);
            }
            io.card.payment.b bVar2 = new io.card.payment.b();
            this.f69758t0 = bVar2;
            this.f69757s0.addTextChangedListener(bVar2);
            this.f69757s0.addTextChangedListener(this);
            this.f69757s0.setFilters(new InputFilter[]{new DigitsKeyListener(), this.f69758t0});
            linearLayout3.addView(this.f69757s0, -1, -2);
            linearLayout2.addView(linearLayout3, -1, -1);
        }
        LinearLayout linearLayout4 = new LinearLayout(this);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        ViewUtil.setPadding(linearLayout4, null, "4dip", null, "4dip");
        linearLayout4.setOrientation(0);
        boolean booleanExtra2 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, false);
        boolean booleanExtra3 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_CVV, false);
        boolean booleanExtra4 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, false);
        if (booleanExtra2) {
            LinearLayout linearLayout5 = new LinearLayout(this);
            ViewGroup.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            linearLayout5.setOrientation(1);
            TextView textView3 = new TextView(this);
            if (!this.N0) {
                textView3.setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            textView3.setText(LocalizedStrings.getString(StringKey.ENTRY_EXPIRES));
            ViewUtil.setPadding(textView3, this.M0, null, null, null);
            linearLayout5.addView(textView3, -2, -2);
            EditText editText2 = new EditText(this);
            this.f69759u0 = editText2;
            int i12 = this.f69755q0;
            this.f69755q0 = i12 + 1;
            editText2.setId(i12);
            this.f69759u0.setMaxLines(1);
            this.f69759u0.setImeOptions(6);
            this.f69759u0.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.f69759u0.setInputType(3);
            this.f69759u0.setHint(LocalizedStrings.getString(StringKey.EXPIRES_PLACEHOLDER));
            if (!this.N0) {
                this.f69759u0.setHintTextColor(-3355444);
            }
            CreditCard creditCard2 = this.K0;
            if (creditCard2 != null) {
                int i13 = creditCard2.expiryMonth;
                int i14 = creditCard2.expiryYear;
                c cVar = new c();
                cVar.f69769p0 = i13;
                cVar.f69770q0 = i14;
                cVar.f69771r0 = i13 > 0 && i14 > 0;
                if (i14 < 2000) {
                    cVar.f69770q0 = i14 + Guess.REFERENCE_YEAR;
                }
                this.v0 = cVar;
            } else {
                this.v0 = new c();
            }
            if (this.v0.a()) {
                this.f69759u0.setText(this.v0.getValue());
            }
            this.f69759u0.addTextChangedListener(this.v0);
            this.f69759u0.addTextChangedListener(this);
            this.f69759u0.setFilters(new InputFilter[]{new DateKeyListener(), this.v0});
            linearLayout5.addView(this.f69759u0, -1, -2);
            linearLayout4.addView(linearLayout5, layoutParams5);
            ViewUtil.setMargins(linearLayout5, null, null, (booleanExtra3 || booleanExtra4) ? "4dip" : null, null);
        } else {
            this.v0 = new io.card.payment.a();
        }
        if (booleanExtra3) {
            LinearLayout linearLayout6 = new LinearLayout(this);
            ViewGroup.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            linearLayout6.setOrientation(1);
            TextView textView4 = new TextView(this);
            if (!this.N0) {
                textView4.setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            ViewUtil.setPadding(textView4, this.M0, null, null, null);
            textView4.setText(LocalizedStrings.getString(StringKey.ENTRY_CVV));
            linearLayout6.addView(textView4, -2, -2);
            EditText editText3 = new EditText(this);
            this.f69760w0 = editText3;
            int i15 = this.f69755q0;
            this.f69755q0 = i15 + 1;
            editText3.setId(i15);
            this.f69760w0.setMaxLines(1);
            this.f69760w0.setImeOptions(6);
            this.f69760w0.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.f69760w0.setInputType(3);
            this.f69760w0.setHint("123");
            if (!this.N0) {
                this.f69760w0.setHintTextColor(-3355444);
            }
            int iCvvLength = this.K0 != null ? CardType.fromCardNumber(this.f69758t0.f69767p0).cvvLength() : 4;
            d dVar = new d();
            dVar.f69772p0 = iCvvLength;
            this.f69761x0 = dVar;
            this.f69760w0.setFilters(new InputFilter[]{new DigitsKeyListener(), this.f69761x0});
            this.f69760w0.addTextChangedListener(this.f69761x0);
            this.f69760w0.addTextChangedListener(this);
            linearLayout6.addView(this.f69760w0, -1, -2);
            linearLayout4.addView(linearLayout6, layoutParams6);
            ViewUtil.setMargins(linearLayout6, booleanExtra2 ? "4dip" : null, null, booleanExtra4 ? "4dip" : null, null);
        } else {
            this.f69761x0 = new io.card.payment.a();
        }
        if (booleanExtra4) {
            LinearLayout linearLayout7 = new LinearLayout(this);
            ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            linearLayout7.setOrientation(1);
            TextView textView5 = new TextView(this);
            if (!this.N0) {
                textView5.setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            ViewUtil.setPadding(textView5, this.M0, null, null, null);
            textView5.setText(LocalizedStrings.getString(StringKey.ENTRY_POSTAL_CODE));
            linearLayout7.addView(textView5, -2, -2);
            boolean booleanExtra5 = getIntent().getBooleanExtra(CardIOActivity.EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY, false);
            EditText editText4 = new EditText(this);
            this.f69762y0 = editText4;
            int i16 = this.f69755q0;
            this.f69755q0 = i16 + 1;
            editText4.setId(i16);
            this.f69762y0.setMaxLines(1);
            this.f69762y0.setImeOptions(6);
            this.f69762y0.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            if (booleanExtra5) {
                this.f69762y0.setInputType(3);
            } else {
                this.f69762y0.setInputType(1);
            }
            if (!this.N0) {
                this.f69762y0.setHintTextColor(-3355444);
            }
            f fVar = new f(20);
            this.E0 = fVar;
            this.f69762y0.addTextChangedListener(fVar);
            this.f69762y0.addTextChangedListener(this);
            linearLayout7.addView(this.f69762y0, -1, -2);
            linearLayout4.addView(linearLayout7, layoutParams7);
            ViewUtil.setMargins(linearLayout7, (booleanExtra2 || booleanExtra3) ? "4dip" : null, null, null, null);
        } else {
            this.E0 = new io.card.payment.a();
        }
        linearLayout2.addView(linearLayout4, layoutParams4);
        if (getIntent().getBooleanExtra(CardIOActivity.EXTRA_REQUIRE_CARDHOLDER_NAME, false)) {
            LinearLayout linearLayout8 = new LinearLayout(this);
            ViewUtil.setPadding(linearLayout8, null, "4dip", null, null);
            linearLayout8.setOrientation(1);
            TextView textView6 = new TextView(this);
            if (!this.N0) {
                textView6.setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            ViewUtil.setPadding(textView6, this.M0, null, null, null);
            textView6.setText(LocalizedStrings.getString(StringKey.ENTRY_CARDHOLDER_NAME));
            linearLayout8.addView(textView6, -2, -2);
            EditText editText5 = new EditText(this);
            this.F0 = editText5;
            int i17 = this.f69755q0;
            this.f69755q0 = i17 + 1;
            editText5.setId(i17);
            this.F0.setMaxLines(1);
            this.F0.setImeOptions(6);
            this.F0.setTextAppearance(getApplicationContext(), android.R.attr.textAppearanceLarge);
            this.F0.setInputType(1);
            if (!this.N0) {
                this.F0.setHintTextColor(-3355444);
            }
            f fVar2 = new f(175);
            this.G0 = fVar2;
            this.F0.addTextChangedListener(fVar2);
            this.F0.addTextChangedListener(this);
            linearLayout8.addView(this.F0, -1, -2);
            linearLayout2.addView(linearLayout8, -1, -2);
        } else {
            this.G0 = new io.card.payment.a();
        }
        linearLayout.addView(linearLayout2, layoutParams2);
        ViewUtil.setMargins(linearLayout2, "16dip", "20dip", "16dip", "20dip");
        LinearLayout linearLayout9 = new LinearLayout(this);
        int i18 = this.f69754p0;
        this.f69754p0 = i18 + 1;
        linearLayout9.setId(i18);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams8.addRule(12);
        linearLayout9.setPadding(0, iTypedDimensionValueToPixelsInt, 0, 0);
        linearLayout9.setBackgroundColor(0);
        layoutParams.addRule(2, linearLayout9.getId());
        this.I0 = new Button(this);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        this.I0.setText(LocalizedStrings.getString(StringKey.DONE));
        this.I0.setOnClickListener(new a());
        this.I0.setEnabled(false);
        linearLayout9.addView(this.I0, layoutParams9);
        ViewUtil.styleAsButton(this.I0, true, this, this.N0);
        ViewUtil.setPadding(this.I0, "5dip", null, "5dip", null);
        ViewUtil.setMargins(this.I0, "8dip", "8dip", "8dip", "8dip");
        if (!this.N0) {
            this.I0.setTextSize(16.0f);
        }
        this.J0 = new Button(this);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        this.J0.setText(LocalizedStrings.getString(StringKey.CANCEL));
        this.J0.setOnClickListener(new b());
        linearLayout9.addView(this.J0, layoutParams10);
        ViewUtil.styleAsButton(this.J0, false, this, this.N0);
        ViewUtil.setPadding(this.J0, "5dip", null, "5dip", null);
        ViewUtil.setMargins(this.J0, "4dip", "8dip", "8dip", "8dip");
        if (!this.N0) {
            this.J0.setTextSize(16.0f);
        }
        relativeLayout.addView(linearLayout9, layoutParams8);
        ActivityHelper.addActionBarIfSupported(this);
        setContentView(relativeLayout);
        Drawable drawable = getIntent().getBooleanExtra(CardIOActivity.EXTRA_USE_PAYPAL_ACTIONBAR_ICON, true) ? getResources().getDrawable(R.drawable.cio_ic_paypal_monogram) : null;
        if (booleanExtra2 && this.v0.isValid()) {
            afterTextChanged(this.f69759u0.getEditableText());
        }
        ActivityHelper.setupActionBarIfSupported(this, this.f69756r0, LocalizedStrings.getString(StringKey.MANUAL_ENTRY_TITLE), "card.io - ", drawable);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().setFlags(0, 1024);
        ActivityHelper.setFlagSecure(this);
        e();
        if (this.f69757s0 != null || this.f69759u0 == null || this.v0.isValid()) {
            b();
        } else {
            this.f69759u0.requestFocus();
        }
        if (this.f69757s0 == null && this.f69759u0 == null && this.f69760w0 == null && this.f69762y0 == null && this.F0 == null) {
            return;
        }
        getWindow().setSoftInputMode(5);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
