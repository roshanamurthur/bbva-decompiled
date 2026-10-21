import{z as e,a8 as a,ar as t,aa as r,ac as i,aE as s,as as c,at as n,a as l,aF as o,ak as h,h as u}from"./952f98a9.js";const d=new t;var p=e`@charset "UTF-8";
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.slot-input ::slotted(input) {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 15) * 1em);
}

.back {
  position: absolute;
  display: flex;
  align-items: center;
  width: 100%;
  height: 100%;
  top: 0;
  left: 0;
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 15) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 15) * 1em);
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${a(i.typeSmall)}));
}
:host([focused]) .back, :host([filled]) .back {
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(r.spacer)}))) / 15) * 1em);
}
.back-amount {
  flex: auto;
  opacity: 0;
}
:host([focused]) .back-amount, :host([filled]) .back-amount {
  flex: none;
  max-width: calc(100% - rem(48px));
}
.back-currency {
  order: 1;
}
.back-currency::before {
  content: " ";
}
:host([focused]) .back-currency, :host([filled]) .back-currency {
  order: -1;
}
:host([focused]) .back-currency::before, :host([filled]) .back-currency::before {
  content: "";
}
:host([focused]) .back-currency.right, :host([filled]) .back-currency.right {
  order: 1;
}
:host([focused]) .back-currency.hide-currency, :host([filled]) .back-currency.hide-currency {
  opacity: 0;
}
:host([focused]) .back-currency:not(.right)::after, :host([focused]) .back-currency.right::before, :host([filled]) .back-currency:not(.right)::after, :host([filled]) .back-currency.right::before {
  content: " ";
}
${d.mediaRules()}`;const g={dark:e`
    ${s.dark}
  `,light:e`
    ${s.light}
  `};class b extends(c(n(l(o)))){static get is(){return"bbva-form-amount"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._checkTrailingDecimal=this._checkTrailingDecimal.bind(this),this.addEventListener("blur",this._checkTrailingDecimal)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("blur",this._checkTrailingDecimal)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._currencyBlock=this.shadowRoot.querySelector(".back-currency")}updated(e){super.updated&&super.updated(e),e.has("language")&&(this.allowedPattern=`[0-9${this._separator}${this._groupChar}]`),e.has("value")&&this.formatValue(this.value),(e.has("localCurrency")||e.has("currencyCode"))&&this._setCurrencyWidth()}static get styles(){return[super.styles,p,g.dark,g.light,h("bbva-form-amount-shared-styles")]}get amount(){return this.value?Number(this.value.replace(new RegExp(`\\${this._groupChar}`,"g"),"").replace(new RegExp(`\\${this._separator}`),".")):0}set amount(e){Number.isFinite(e)&&(this.value=String(e).replace(/\./g,this._separator))}get _isRightAligned(){return this._alignRight}get labelBlock(){return u`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.label}</span>
    `}get inputLabel(){return`${this.label} (${this._currency})`}get field(){return u`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.backAmount} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get backAmount(){return u`
      <span class="back" aria-hidden="true">
        <span
          class="back-currency ${this._isRightAligned?"right":""} ${this.placeholder&&!this.value?"hide-currency":""}"
          >${this._currency}</span
        >
        <span class="back-amount">${this.value}</span>
      </span>
    `}_setCurrencyWidth(){const a=this._isRightAligned?0:this._currencyBlock.offsetWidth,t=e`
      ${a/16}rem
    `;this._formElement.style.setProperty("margin-left",t)}_formatNumber(e,a){return a?e.replace(/\D/g,"").replace(/\B(?=(\d{3})+(?!\d))/g,this._groupChar):e.replace(/\D/g,"")}_formatCurrency(e,a){let t;if(e.indexOf(a)>=0){const r=e.indexOf(a);let i=e.substring(0,r),s=e.substring(r);i=this._formatNumber(i,!0),s=this._formatNumber(s,!1),s=s.substring(0,this.decimalDigits),t=this.decimalDigits?i+a+s:i}else t=this._formatNumber(e,!0);return t}formatValue(e){if(""===e||null==e)return void this._fireChange(e,this.amount);const a=String(e),t=this._formElement,r=a.length;let i=t.selectionStart;const s=this._formatCurrency(a,this._separator);t.value=s,a===s&&this._fireChange(s,this.amount),this.value=t.value;i=s.length-r+i,t.setSelectionRange(i,i)}_checkTrailingDecimal(){this.value&&this.value.endsWith(this._separator)&&(this.value=this.value.replace(this._separator,""))}_fireChange(e,a){this.dispatchEvent(new CustomEvent("form-amount-input-change",{detail:{value:e,amount:a},bubbles:!0,composed:!0}))}}export{b as B,g as b};
